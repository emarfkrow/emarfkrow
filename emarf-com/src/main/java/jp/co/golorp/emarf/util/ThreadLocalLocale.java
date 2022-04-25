package jp.co.golorp.emarf.util;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * スレッド内のロケール管理クラス
 *
 * @author fukuo
 *
 */
public final class ThreadLocalLocale extends ThreadLocal<Locale> {

    /**
     * logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(ThreadLocalLocale.class);

    @Override
    protected Locale initialValue() {
        LOG.debug("ThreadLocalLocale initialized.");
        return Locale.getDefault();
    }

    @Override
    public void remove() {
        super.remove();
        LOG.debug("ThreadLocalLocale removed.");
    }

}
