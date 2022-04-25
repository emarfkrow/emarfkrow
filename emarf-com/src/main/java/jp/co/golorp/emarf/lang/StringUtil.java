package jp.co.golorp.emarf.lang;

import java.util.ArrayList;
import java.util.List;

/**
 * 文字列操作クラス
 *
 * @author toshiyuki
 *
 */
public final class StringUtil {

    private StringUtil() {
    }

    /**
     * スネークケースに変換
     * <dl>
     * <dt>snake_case</dt>
     * <dd>snake_case</dd>
     * <dt>UPPER_CASE</dt>
     * <dd>upper_case（小文字化するだけ）</dd>
     * <dt>camelCase</dt>
     * <dd>camel_case（小文字か数字直後の大文字の前に「_」を挿入してから小文字化）</dd>
     * <dt>PascalCase</dt>
     * <dd>pascal_case（小文字か数字直後の大文字の前に「_」を挿入してから小文字化）</dd>
     * </dl>
     *
     * @param s
     * @return snakeCase
     */
    public static String toSnakeCase(final String s) {

        if (s == null) {
            return null;
        }

        // 一旦、数字か小文字の直後の大文字の前に「_」を挿入
        // password→password、EMAIL→EMAIL、sampleY_1→sample_Y_1、MUser→MUser）
        String snake = s.replaceAll("([0-9a-z])([A-Z])", "$1_$2");

        // 大文字の次に小文字がある場合は大文字の前に「_」を挿入
        // password→password、EMAIL→EMAIL、sampleY_1→sample_Y_1、MUser→M_User）
        snake = snake.replaceAll("([A-Z][a-z])", "_$1").replaceAll("^_", "").replaceAll("__", "_");

        return snake.toLowerCase();
    }

    /**
     * @param s
     * @return upperCase
     */
    public static String toUpperCase(final String s) {
        return toSnakeCase(s).toUpperCase();
    }

    /**
     * @param s
     * @return camelCase
     */
    public static String toCamelCase(final String s) {

        if (s == null) {
            return null;
        }

        // 一旦スネークケースにしてから"_"で分割
        String forceSnake = toSnakeCase(s);
        String[] snakes = forceSnake.split("_");

        StringBuilder camel = new StringBuilder();
        for (String snake : snakes) {

            if (camel.toString().equals("")) {

                // 一つ目は全て小文字
                camel.append(snake.toLowerCase());

            } else {

                // 二つ目以降は１文字目を大文字、２文字目以降は小文字
                camel.append(snake.substring(0, 1).toUpperCase());
                if (snake.length() > 1) {
                    camel.append(snake.substring(1).toLowerCase());
                }
            }
        }

        return camel.toString();
    }

    /**
     * @param s
     * @return PascalCase
     */
    public static String toPascalCase(final String s) {

        if (s == null) {
            return null;
        }

        String camelCase = toCamelCase(s);
        return camelCase.substring(0, 1).toUpperCase() + camelCase.substring(1);
    }

    // /**
    // * @param cs
    // * @param list
    // * @return csでjoinした文字列
    // */
    // public static String join(final CharSequence cs, final List<String> list) {
    // return String.join(cs, list.toArray(new String[list.size()]));
    // }

    /**
     * @param s s
     * @return 「,」で分解した文字列
     */
    public static String[] split(final String s) {

        if (!s.trim().isEmpty()) {
            return s.split(",\\s*");
        }

        return null;
    }

    /**
     * @param o
     * @return boolean
     */
    public static boolean isNullOrBlank(final Object o) {
        return o == null || o.toString().trim().equals("");
    }

    /**
     * String.join拡張
     *
     * @param delimiter
     * @param list
     * @return String
     */
    public static String join(final String delimiter, final List<String> list) {
        List<String> elements = new ArrayList<String>();
        for (String s : list) {
            if (s.length() > 0) {
                elements.add(s);
            }
        }
        return String.join(delimiter, elements);
    }

    /**
     * @param suffixs
     * @param s
     * @return boolean
     */
    public static boolean endsWith(final String[] suffixs, final String s) {
        for (String suffix : suffixs) {
            if (s.toLowerCase().endsWith(suffix.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

}
