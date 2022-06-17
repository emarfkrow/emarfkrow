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

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * ロケール管理クラス
 *
 * @author golorp
 */
public final class Locales {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Locales.class);

    /** ThreadLocalの{@link Locale} */
    private static ThreadLocalLocale threadLocalLocale = new ThreadLocalLocale();

    /** プライベートコンストラクタ */
    private Locales() {
    }

    /**
     * @return ThreadLocalの{@link Locale}
     */
    public static Locale get() {
        Locale locale = threadLocalLocale.get();
        LOG.trace("locale get.    [" + locale + "]");
        return locale;
    }

    /**
     * {@link Locale}をThreadLocalに設定
     * @param locale {@link Locale}
     */
    public static void set(final Locale locale) {
        LOG.trace("locale get.    [" + locale + "]");
        threadLocalLocale.set(locale);
    }

    /**
     * ThreadLocalの{@link Locale}をクリア
     */
    public static void remove() {
        Locale locale = threadLocalLocale.get();
        LOG.trace("locale remove. [" + locale + "]");
        threadLocalLocale.remove();
    }

}
