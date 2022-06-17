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

package jp.co.golorp.emarf.util;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * {@link ResourceBundle}管理クラス
 *
 * @author golorp
 */
public final class ResourceBundles {

    /** プラグイン実行時のsrcPathのリスト */
    private static List<String> srcPaths = new ArrayList<String>();

    /** プライベートコンストラクタ */
    private ResourceBundles() {
    }

    /**
     * srcPathのリストも含めてResourceBundleを取得
     * @param c 対象クラス
     * @return {@link ResourceBundle}
     */
    public static ResourceBundle getBundle(final Class<?> c) {
        try {
            return ResourceBundle.getBundle(c.getSimpleName());
        } catch (MissingResourceException e) {
            for (String srcPath : srcPaths) {
                File dicDir = Paths.get(srcPath).toFile();
                try {
                    URLClassLoader urlLoader = new URLClassLoader(new URL[] { dicDir.toURI().toURL() });
                    return ResourceBundle.getBundle(c.getSimpleName(), Locale.getDefault(), urlLoader);
                } catch (Exception e1) {
                }
            }
            return null;
        }
    }

    /**
     * @return srcPathのリスト
     */
    public static List<String> getSrcPaths() {
        return srcPaths;
    }

    /**
     * @param p セットする srcPaths
     */
    public static void setSrcPaths(final List<String> p) {
        ResourceBundles.srcPaths = p;
    }

}
