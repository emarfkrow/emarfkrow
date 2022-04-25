package jp.co.golorp.emarf.properties;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.lang.StringUtil;

/**
 * アプリケーションプロパティファイル
 *
 * @author toshiyuki
 *
 */
public final class App {

    /** ロガー */
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    /** リソースバンドル */
    private static final ResourceBundle BUNDLE_BASE = ResourceBundle.getBundle(App.class.getSimpleName() + "_base");

    /** リソースバンドル */
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle(App.class.getSimpleName());

    /**
     * コンストラクタ
     */
    private App() {
    }

    /**
     * キーに合致する値を取得。なくてもエラーにしない。
     *
     * @param key プロパティキー
     * @return プロパティ値
     */
    public static String get(final String key) {
        if (key != null) {
            if (BUNDLE.containsKey(key)) {
                return BUNDLE.getString(key);
            }
            if (BUNDLE_BASE.containsKey(key)) {
                return BUNDLE_BASE.getString(key);
            }
        }
        LOG.trace("key is not exist. [" + key + "]");
        return null;
    }

    /**
     * キーに合致する値を","でsplitして取得。なくてもエラーにしない。
     *
     * @param key プロパティキー
     * @return 配列化したプロパティ値
     */
    public static String[] gets(final String key) {
        String value = App.get(key);
        if (value != null) {
            return StringUtil.split(value);
        }
        return null;
    }

    /**
     * キーに合致する値を","でsplitして{@link AppSet}として取得。なくてもエラーにしない。
     *
     * @param key プロパティキー
     * @return {@link AppSet}化したプロパティ値
     */
    public static Set<String> getSet(final String key) {

        Set<String> ret = new LinkedHashSet<String>();

        String[] values = App.gets(key);
        if (values != null) {
            for (String value : values) {
                ret.add(value);
            }
        }

        return ret;
    }

    /**
     * キーに合致する値を","でsplitしてから、":"でもsplitしてキー＆値化し、LinkedHashMapとして取得。なくてもエラーにしない。
     *
     * @param key プロパティキー
     * @return LinkedHashMap化したプロパティ値
     */
    public static Map<String, String> getMap(final String key) {

        Map<String, String> ret = new LinkedHashMap<String, String>();

        String[] values = App.gets(key);
        if (values != null) {
            for (String value : values) {
                String[] properties = value.split("\\s*:\\s*");
                if (properties.length == 1) {
                    ret.put(properties[0], null);
                } else {
                    ret.put(properties[0], properties[1]);
                }
            }
        }

        return ret;
    }

}
