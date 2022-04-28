package jp.co.golorp.emarf.util;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ロケール管理クラス
 *
 * @author toshiyuki
 *
 */
public final class Locales {

    /**
     * logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(Locales.class);

    /**
     * ThreadLocalConnection
     */
    private static ThreadLocalLocale threadLocalLocale = new ThreadLocalLocale();

    /**
     * プライベートコンストラクタ
     */
    private Locales() {
    }

    /**
     * @return Locale
     */
    public static Locale get() {
        Locale locale = threadLocalLocale.get();
        LOG.trace("locale get.    [" + locale + "]");
        return locale;
    }

    /**
     * @param locale
     */
    public static void set(final Locale locale) {
        LOG.trace("locale get.    [" + locale + "]");
        threadLocalLocale.set(locale);
    }

    /**
     *
     */
    public static void remove() {
        Locale locale = threadLocalLocale.get();
        LOG.trace("locale remove. [" + locale + "]");
        threadLocalLocale.remove();
    }

}
