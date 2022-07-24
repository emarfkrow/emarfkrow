/*
Copyright 2022 golorp

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package jp.co.golorp.emarf.validation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
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
 * フォームバリデータ
 *
 * @author golorp
 */
public final class FormValidator {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(FormValidator.class);

    /** グリッド先頭文字のパターン */
    private static Pattern gridNamePattern = Pattern.compile("\\.[a-z]");

    /** ~に囲まれたパターン（正規表現部の名称変換用） */
    private static Pattern regexpPattern = Pattern.compile("\\~\\~(.+?)\\~\\~");

    /** プライベートコンストラクタ */
    private FormValidator() {
    }

    /**
     * フォームの検証
     * @param errors 「エラー項目名：エラーメッセージ」のマップ
     * @param formClassName フォームクラス名
     * @param postJson 送信値のマップ
     * @return 値を設定後のフォーム
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

                // 画面名.プロパティ名で項目名を取得してみる
                // Passmail.email
                if (itemMei == null) {
                    String[] s = itemName.replaceAll("Form", "").split("\\.");
                    itemMei = Messages.get(s[s.length - 2] + "." + s[s.length - 1]);
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
     * マップをインスタンス化
     * @param <T> 返却クラス
     * @param className クラス名
     * @param postJson 送信値のマップ
     * @return 指定クラスのインスタンス
     */
    public static <T> T toBean(final String className, final Map<String, Object> postJson) {
        return toBean(className, postJson, false);
    }

    /**
     * マップをインスタンス化（グリッドフォーム用）
     * @param <T> 返却クラス
     * @param className クラス名
     * @param postJson 送信値のマップ
     * @return 指定クラスのインスタンス
     */
    public static <T> T toGridForm(final String className, final Map<String, Object> postJson) {
        return toBean(className, postJson, true);
    }

    /**
     * マップをインスタンス化
     * @param <T> 返却クラス
     * @param className クラス名
     * @param postJson 送信値のマップ
     * @param isGrid グリッドフォームならtrue
     * @return 指定クラスのインスタンス
     */
    public static <T> T toBean(final String className, final Map<String, Object> postJson, final boolean isGrid) {

        // クラスを取得
        Class<?> clazz = forNameIf(className);
        if (clazz == null) {
            return null;
        }

        // インスタンス取得
        Object o = null;
        try {
            o = clazz.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new SysError(e);
        }

        // Formインスタンスのプロパティでループ
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {

            // セッターでなければスキップ
            String methodName = method.getName();
            if (!methodName.startsWith("set")) {
                continue;
            }

            String fieldName = null;
            Object value = null;

            Class<?>[] parameterTypes = method.getParameterTypes();
            Class<?>[] interfaces = parameterTypes[0].getInterfaces();
            if (interfaces.length > 0 && (interfaces[0] == IEntity.class || interfaces[0] == IForm.class) && !isGrid) {

                String nestName = parameterTypes[0].getName();
                value = toBean(nestName, postJson, false);

            } else {

                // fieldName（フィールド名か、兄弟モデルか、グリッドID）
                fieldName = StringUtil.toCamelCase(methodName.replaceFirst("^set", ""));

                // 送信値をfieldNameで取得してみる
                value = postJson.get(fieldName);

                // entityName付きでも取得してみる
                if (value == null) {
                    String entityName = clazz.getSimpleName().replaceAll("RegistForm$", "");
                    value = postJson.get(entityName + "." + fieldName);
                }

                // 他のエンティティで同名のfieldNameで取得してみる（兄弟モデルの主キー用）
                if (value == null) {
                    for (Entry<String, Object> e : postJson.entrySet()) {
                        String k = e.getKey();
                        Object v = e.getValue();
                        if (k.endsWith("." + fieldName)) {
                            value = v;
                            break;
                        }
                    }
                }

                // パスカルでも取得してみる（グリッド本体用）
                if (value == null) {
                    value = postJson.get(StringUtil.toPascalCase(fieldName));
                }

                // 最後の「s」を「Grid」にしたパスカルでも取得してみる（カスタムフォームのグリッド本体用）
                if (value == null) {
                    value = postJson.get(StringUtil.toPascalCase(fieldName).replaceAll("s$", "Grid"));
                }

                // アッパーでも取得してみる（グリッド行用）
                if (value == null) {
                    value = postJson.get(StringUtil.toUpperCase(fieldName));
                }

                // 数字の前の「_」を消して、アッパーでも取得してみる（グリッド行用）
                if (value == null) {
                    value = postJson.get(StringUtil.toUpperCase(fieldName).replaceAll("\\_([0-9]+)", "$1"));
                }

                // ケバブでも取得してみる（グリッド行用）
                if (value == null) {
                    value = postJson.get(StringUtil.toKebabCase(fieldName));
                }

                // アッパーケバブでも取得してみる（グリッド行用）
                if (value == null) {
                    value = postJson.get(StringUtil.toUpperKebabCase(fieldName));
                }
            }

            if (value != null) {
                // 送信値がある場合

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

        @SuppressWarnings("unchecked")
        T t = (T) o;
        return t;
    }

    /**
     * クラスを探索
     * @param className 対象クラス名
     * @return 探索結果のクラス
     */
    private static Class<?> forNameIf(final String className) {

        try {
            return Class.forName(className);
        } catch (ClassNotFoundException e) {
            LOG.trace(e.toString());
        }

        // modelパッケージのフォームクラスなら、baseパッケージまで掘ってみる
        try {
            return Class.forName(className.replaceFirst("\\.model\\.", ".model.base."));
        } catch (ClassNotFoundException e1) {
            LOG.trace(e1.toString());
        }

        // ***GridFormなら、***RegistFormにしてみる
        try {
            return Class.forName(className.replaceFirst("Grid", "Regist"));
        } catch (ClassNotFoundException e2) {
            LOG.trace(e2.toString());
        }

        // ***Gridなら、***RegistFormにしてみる
        try {
            return Class.forName(className.replaceFirst("Grid", "RegistForm"));
        } catch (ClassNotFoundException e3) {
            LOG.trace(e3.toString());
        }

        try { // ***sなら、***にしてみる（カスタムフォームのグリッド本体用）
            return Class.forName(className.replaceFirst("s$", ""));
        } catch (ClassNotFoundException e4) {
            LOG.trace(e4.toString());
        }

        return null;
    }

}
