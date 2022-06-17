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
 * ロケール管理用スレッドローカル
 *
 * @author golorp
 */
public final class ThreadLocalLocale extends ThreadLocal<Locale> {

    /** logger */
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
