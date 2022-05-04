package jp.co.golorp.emarf.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import jp.co.golorp.emarf.util.Locales;

/**
 * Locale判定フィルタ
 */
@WebFilter("/*")
public class LocaleFilter implements Filter {

    /**
     * @param fConfig
     * @see Filter#init(FilterConfig)
     */
    public void init(final FilterConfig fConfig) throws ServletException {

    }

    /**
     * @param request
     * @param response
     * @param chain
     */
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {

        // messageのi18n対応
        Locales.set(request.getLocale());

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
