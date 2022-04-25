package jp.co.golorp.emarf.validation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.util.Messages;

/**
 * @author toshiyuki
 *
 */
public final class FormValidator {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(FormValidator.class);

    //
    /** グリッド先頭文字のパターン */
    private static Pattern gridNamePattern = Pattern.compile("\\.[a-z]");

    /** ~に囲まれたパターン（正規表現部の名称変換用） */
    private static Pattern regexpPattern = Pattern.compile("\\~(.+?)\\~");

    private FormValidator() {
    }

    /**
     * @param errors
     * @param formClassName
     * @param postJson
     * @return form
     */
    public static IForm validate(final Map<String, String> errors, final String formClassName,
            final Map<String, Object> postJson) {

        IForm form = toBean(formClassName, postJson);

        if (form == null) {
            return null;
        }

        // バリデーションを実行
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();
        Set<ConstraintViolation<IForm>> results = validator.validate(form);

        for (ConstraintViolation<IForm> result : results) {

            // Formクラス名（一覧画面：MUserSRegistForm、詳細画面：MUserRegistForm）
            String formName = result.getRootBean().getClass().getSimpleName();

            // プロパティ名（一覧画面：mUserGrid[0].userMei、詳細画面：userMei）
            String propertyName = result.getPropertyPath().toString();

            // グリッドの場合は先頭文字を大文字化（MUserGrid[0].userMei）
            Matcher gridNameMatcher = gridNamePattern.matcher(propertyName);
            if (gridNameMatcher.find()) {
                propertyName = propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
            }

            // エラー項目物理名
            String itemId = formName + "." + propertyName;

            // エラー未取得の項目の場合
            if (!errors.containsKey(itemId)) {

                // Validatorのメッセージを取得
                String message = result.getMessage();

                // 添え字抜きで項目名を取得してみる
                // TEntityRegistForm.TEntity2RegistForm.hidukeYmd
                String itemName = itemId.replaceFirst("\\[\\d+\\]", "");
                String itemMei = Messages.get(itemName);

                // モデル名.プロパティ名で項目名を取得してみる
                // TEntity2.hidukeYmd
                if (itemMei == null) {
                    String[] s = itemName.replaceAll("S?(Refer|Regist)Form", "").split("\\.");
                    itemMei = Messages.get(s[s.length - 2] + "." + s[s.length - 1]);
                }

                // フォーム名なしで項目名を取得してみる
                // hidukeYmd
                if (itemMei == null) {
                    itemMei = Messages.get(itemName.replaceFirst(".+(Refer|Regist)Form\\.", ""));
                }

                // {0}をエラー項目論理名で置換
                if (itemMei != null) {
                    message = message.replaceAll("\\{0\\}", itemMei);
                }

                // 正規表現文字列を名称変換
                Matcher regexpMatcher = regexpPattern.matcher(message);
                while (regexpMatcher.find()) {
                    String reName = Messages.get(regexpMatcher.group(1));
                    if (reName != null && reName.length() > 0) {
                        message = message.replace(regexpMatcher.group(), reName);
                    }
                }

                errors.put(itemId, message);
            }
        }

        return form;
    }

    /**
     * @param <T>
     * @param className
     * @param postJson
     * @return IForm
     */
    public static <T> T toBean(final String className, final Map<String, Object> postJson) {
        return toBean(className, postJson, false);
    }

    /**
     * @param <T>
     * @param className
     * @param postJson
     * @return IForm
     */
    public static <T> T toGridForm(final String className, final Map<String, Object> postJson) {
        return toBean(className, postJson, true);
    }

    /**
     * @param <T>
     * @param className
     * @param postJson
     * @param isGrid
     * @return IForm
     */
    public static <T> T toBean(final String className, final Map<String, Object> postJson, final boolean isGrid) {

        Class<?> clazz = null;
        try {
            // 一旦、指定通りに取得してみる
            clazz = Class.forName(className);
        } catch (ClassNotFoundException e) {
            LOG.trace(e.toString());
            try { // フォームクラスでmodelパッケージならbaseパッケージまで掘って取得してみる
                clazz = Class.forName(className.replaceFirst("\\.model\\.", ".model.base."));
            } catch (ClassNotFoundException e1) {
                LOG.trace(e1.toString());
                try { // ***GridFormを***RegistFormにして探してみる
                    clazz = Class.forName(className.replaceFirst("Grid", "Regist"));
                } catch (ClassNotFoundException e2) {
                    LOG.trace(e2.toString());
                    try { // ***Gridを***RegistFormにして探してみる
                        clazz = Class.forName(className.replaceFirst("Grid", "RegistForm"));
                    } catch (ClassNotFoundException e3) {
                        LOG.trace(e3.toString());
                        try { // ***sを***にして探してみる（エンティティ用）
                            clazz = Class.forName(className.replaceFirst("s$", ""));
                        } catch (ClassNotFoundException e4) {
                            LOG.trace(e4.toString());
                        }
                    }
                }
            }
        }

        if (clazz == null) {
            return null;
        }

        // インスタンス取得
        Object o = null;
        try {
            o = clazz.newInstance();
        } catch (Exception e) {
            throw new SysError(e);
        }

        String entityName = clazz.getSimpleName().replaceAll("RegistForm$", "");

        boolean isValued = false;

        // Formインスタンスのプロパティでループ
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {

            // プロパティ名を取得
            String methodName = method.getName();

            // セッターでなければスキップ
            if (!methodName.startsWith("set")) {
                continue;
            }

            String fieldName = null;
            Object value = null;

            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] interfaces = parameterTypes[0].getInterfaces();
            if (interfaces.length > 0 && (interfaces[0] == IEntity.class || interfaces[0] == IForm.class) && !isGrid) {

                String nestName = parameterTypes[0].getName();
                value = toBean(nestName, postJson);

            } else {

                // fieldName（フィールド名か、兄弟モデルか、グリッドID）
                fieldName = StringUtil.toCamelCase(methodName.replaceFirst("^set", ""));

                // 送信値をfieldNameで取得してみる
                value = postJson.get(fieldName);

                if (value == null) { // entityName付きでも取得してみる
                    value = postJson.get(entityName + "." + fieldName);
                }
                if (value == null) { // パスカルでも取得してみる（グリッド用）
                    value = postJson.get(StringUtil.toPascalCase(fieldName));
                }
                if (value == null) { // アッパーでも取得してみる（グリッド行用）
                    value = postJson.get(StringUtil.toUpperCase(fieldName));
                }
                if (value == null) { // 最後の「s」を「Grid」にしたパスカルでも取得してみる（エンティティ用）
                    value = postJson.get(StringUtil.toPascalCase(fieldName).replaceAll("s$", "Grid"));
                }
            }

            if (value != null) {
                // 送信値がある場合

                isValued = true;

                if (value instanceof List) {
                    // 送信値がListの場合

                    List<?> list = (List<?>) value;
                    if (list.size() > 0 && list.get(0) instanceof Map) {
                        // 送信値の一つ目がMapの場合（何らかのクラスであるという事）

                        String packageName = clazz.getPackage().getName();
                        String gridId = StringUtil.toPascalCase(fieldName);
                        String gridClassName = packageName + "." + gridId;

                        List<T> formList = new ArrayList<T>();

                        @SuppressWarnings("unchecked")
                        List<Map<String, Object>> gridData = (List<Map<String, Object>>) list;
                        for (Map<String, Object> gridRow : gridData) {
                            @SuppressWarnings("unchecked")
                            T t = (T) toGridForm(gridClassName, gridRow);
                            formList.add(t);
                        }

                        value = formList;
                    }

                    try {
                        method.invoke(o, value);
                    } catch (Exception e) {
                        throw new SysError(e);
                    }
                } else if (value instanceof IEntity || value instanceof IForm) {
                    try {
                        method.invoke(o, value);
                    } catch (Exception e) {
                        throw new SysError(e);
                    }
                } else {
                    try {
                        method.invoke(o, value.toString());
                    } catch (Exception e) {
                        throw new SysError(e);
                    }
                }
            }
        }

        // 一つも値がなかった場合はnullを返す
        if (!isValued) {
            return null;
        }

        @SuppressWarnings("unchecked")
        T t = (T) o;

        return t;
    }

}
