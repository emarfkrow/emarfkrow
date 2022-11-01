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

package jp.co.golorp.emarf.properties;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.lang.StringUtil;

/**
 * アプリケーションプロパティファイル
 *
 * @author golorp
 */
public final class App {

    /** ロガー */
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    /** リソースバンドル（規定値用） */
    private static final ResourceBundle BUNDLE_BASE = ResourceBundle.getBundle(App.class.getSimpleName() + "_base");

    /** リソースバンドル */
    private static final ResourceBundle BUNDLE = ResourceBundle.getBundle(App.class.getSimpleName());

    /** プライベートコンストラクタ */
    private App() {
    }

    /**
     * @param key プロパティキー
     * @return キーに合致する値を取得。なくてもエラーにしない。
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
     * @param key プロパティキー
     * @return キーに合致する値を","でsplitして取得。なくてもエラーにしない。
     */
    public static String[] gets(final String key) {
        String value = App.get(key);
        if (value != null) {
            return StringUtil.split(value);
        }
        return null;
    }

    /**
     * @param key プロパティキー
     * @return キーに合致する値を","でsplitしてSetとして取得。なくてもエラーにしない。
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
     * @param key プロパティキー
     * @return キーに合致する値を","でsplitしてから、":"でもsplitしてLinkedHashMapとして取得。なくてもエラーにしない。
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

    /**
     * @param prefix 接頭辞
     * @return キーに前方一致する値を取得。なくてもエラーにしない。
     */
    public static List<String> getStartWith(final String prefix) {

        List<String> list = new ArrayList<String>();

        for (String key : BUNDLE.keySet()) {
            if (key.startsWith(prefix)) {
                list.add(App.get(key));
            }
        }

        return list;
    }

}
