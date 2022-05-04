package jp.co.golorp.emarf.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import jp.co.golorp.emarf.properties.App;

/**
 * 文字コード設定フィルタ
 */
@WebFilter("/*")
public class EncodingFilter implements Filter {

    /**
     * 文字コード
     */
    public static final String CHARSET = App.get("response.contenttype.charset");

    @Override
    public void init(final FilterConfig filterConfig) throws ServletException {

    }

    /**
     * @param request
     * @param response
     * @param chain
     */
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {
        request.setCharacterEncoding(CHARSET);
        response.setCharacterEncoding(CHARSET);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
