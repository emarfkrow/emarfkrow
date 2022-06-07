package jp.co.golorp.emarf.lang;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.codec.binary.Hex;

import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.properties.App;

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
        snake = snake.replaceAll("([A-Z][a-z])", "_$1").replaceAll("^_", "").replaceAll("__", "_").replaceAll("-", "_");

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

    /**
     * @param s
     * @return kebab-case
     */
    public static String toKebabCase(final String s) {

        if (s == null) {
            return null;
        }

        String forceSnake = toSnakeCase(s);
        return forceSnake.replaceAll("_", "-");
    }

    /**
     * @param s
     * @return KEBAB-CASE
     */
    public static String toUpperKebabCase(final String s) {

        if (s == null) {
            return null;
        }

        String kebab = toKebabCase(s);
        return kebab.toUpperCase();
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
            if (endWithIgnoreCase(suffix, s)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param suffixs
     * @param s
     * @return boolean
     */
    public static boolean endsWith(final Map<String, String> suffixs, final String s) {
        for (String suffix : suffixs.keySet()) {
            if (endWithIgnoreCase(suffix, s)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param suffix
     * @param s
     * @return boolean
     */
    public static boolean endWithIgnoreCase(final String suffix, final String s) {
        return s.matches("(?i).+" + suffix + "$");
    }

    /**
     * @param s
     * @return String
     */
    public static String sanitize(final String s) {
        String sanitized = s.replaceAll("<", "＜").replaceAll(">", "＞");
        return sanitized;
    }

    /**
     * @param s
     * @return String
     */
    public static String[] sanitize(final String[] s) {
        List<String> sanitizeds = new ArrayList<String>();
        if (s != null && s.length > 0) {
            for (String e : s) {
                sanitizeds.add(sanitize(e));
            }
        }
        return sanitizeds.toArray(new String[sanitizeds.size()]);
    }

    //    /** 秘密鍵（16文字） */
    //    private static byte[] secretKey;
    //
    //    /** 暗号化方式 */
    //    private static String algorithm;
    //
    //    /**
    //     * 文字列を16文字の秘密鍵でAES暗号化してBase64した文字列で返す
    //     *
    //     * @param string
    //     *            対象文字列
    //     * @return 暗号化文字列
    //     */
    //    public static String encrypt(final String string) {
    //
    //        if (string == null) {
    //            return null;
    //        }
    //
    //        byte[] input = string.getBytes();
    //
    //        byte[] encryped = cipher(Cipher.ENCRYPT_MODE, input);
    //
    //        byte[] encoded = Base64.encodeBase64(encryped, false);
    //
    //        String ret = new String(encoded);
    //
    //        LOG.debug("Encrypt [" + string + "] to [" + ret + "].");
    //
    //        return ret;
    //    }
    //
    //    /**
    //     * Base64されたAES暗号化文字列を元の文字列に復元する
    //     *
    //     * @param encryped
    //     *            暗号化文字列
    //     * @return 複合化文字列
    //     */
    //    public static String decrypt(final String encryped) {
    //
    //        if (encryped == null) {
    //            return null;
    //        }
    //
    //        byte[] input = Base64.decodeBase64(encryped);
    //
    //        byte[] decrypted = cipher(Cipher.DECRYPT_MODE, input);
    //
    //        String ret = new String(decrypted);
    //
    //        LOG.debug("Decrypt [" + encryped + "] to [" + ret + "].");
    //
    //        return ret;
    //    }
    //
    //    /**
    //     * 暗号化・複合化の共通部分
    //     *
    //     * @param opmode
    //     *            opmode
    //     * @param input
    //     *            input
    //     * @return byte[]
    //     */
    //    private static byte[] cipher(final int opmode, final byte[] input) {
    //
    //        if (secretKey == null) {
    //            secretKey = App.get("loginfilter.encrypt.secret_key").getBytes();
    //        }
    //
    //        if (algorithm == null) {
    //            algorithm = App.get("loginfilter.encrypt.algorithm");
    //        }
    //
    //        Cipher cipher = null;
    //        try {
    //            cipher = Cipher.getInstance(algorithm);
    //        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
    //            throw new SysError(e);
    //        }
    //
    //        try {
    //            cipher.init(opmode, new SecretKeySpec(secretKey, algorithm));
    //        } catch (InvalidKeyException e) {
    //            throw new SysError(e);
    //        }
    //
    //        byte[] bytes = null;
    //        try {
    //            LOG.trace(String.valueOf(input));
    //            bytes = cipher.doFinal(input);
    //        } catch (IllegalBlockSizeException | BadPaddingException e) {
    //            throw new SysError(e);
    //        }
    //
    //        return bytes;
    //    }

    /** ハッシュアルゴリズム */
    private static MessageDigest md;

    /**
     * @param s
     * @return SHA3-512ハッシュ文字列
     */
    public static String hash(final String s) {

        if (md == null) {
            String algorithm = App.get("loginfilter.hash");
            try {
                md = MessageDigest.getInstance(algorithm);
            } catch (NoSuchAlgorithmException e) {
                throw new SysError(e);
            }
        }

        byte[] bytes = md.digest(s.getBytes());

        return Hex.encodeHexString(bytes);
    }

}
