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

package jp.co.golorp.emarf.servlet;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

import jp.co.golorp.emarf.util.Locales;

/**
 * Locale判定フィルタ
 *
 * @author golorp
 */
@WebFilter("/*")
public class LocaleFilter implements Filter {

    @Override
    public void init(final FilterConfig fConfig) throws ServletException {
    }

    /**
     * {@link ThreadLocal}にLocaleを設定
     * @param request {@link ServletRequest}
     * @param response {@link ServletResponse}
     * @param chain {@link FilterChain}
     */
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {

        // messageのi18n対応
        //        Locale locale = Locales.get();
        //        if (!locale.getLanguage().equals(request.getLocale().getLanguage())) {
        Locales.set(request.getLocale());
        //        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

}
