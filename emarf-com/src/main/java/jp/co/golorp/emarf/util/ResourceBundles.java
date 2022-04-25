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

public final class ResourceBundles {

    /**
     * プラグイン実行時のsrcPathのリスト
     */
    private static List<String> srcPaths = new ArrayList<String>();

    private ResourceBundles() {
    }

    /**
     * @param c
     * @return ResourceBundle
     */
    public static ResourceBundle getBundle(final Class<?> c) {
        try {
            return ResourceBundle.getBundle(c.getSimpleName());
        } catch (MissingResourceException e) {
            for (String srcPath : srcPaths) {
                File dicDir = Paths.get(srcPath).toFile();
                try {
                    URLClassLoader urlLoader;
                    urlLoader = new URLClassLoader(new URL[] { dicDir.toURI().toURL() });
                    return ResourceBundle.getBundle(c.getSimpleName(), Locale.getDefault(), urlLoader);
                } catch (Exception e1) {
                }
            }
            return null;
        }
    }

    /**
     * @return srcPaths
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
