package jp.co.golorp.emarf.servlet;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.util.Messages;

/**
 * Servlet Filter implementation class LoginFilter
 */
@WebFilter("/*")
public class LoginFilter implements Filter {

    /** ログインページ */
    private static final String LOGIN_PAGE = App.get("loginfilter.login.page");

    /** ログインURI */
    private static final String LOGIN_URI = App.get("loginfilter.login.uri");

    /** ログアウトURI */
    private static final String LOGOUT_URI = App.get("loginfilter.logout.uri");

    /** 認証除外URIの正規表現 */
    private static final String EXCLUDE_REGEXP = App.get("loginfilter.exclude.regexp");

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

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String requestURI = req.getRequestURI();

        String contextPath = req.getContextPath() + "/";

        if (!requestURI.matches(LoginFilter.EXCLUDE_REGEXP)) {

            HttpSession ses = req.getSession();

            if (requestURI.equals(contextPath + LoginFilter.LOGIN_PAGE)) {
                // ログイン画面の場合は、セッション破棄のみ

                ses.invalidate();

            } else if (requestURI.equals(contextPath + LoginFilter.LOGIN_URI)) {
                // ログイン処理の場合は、ログイン処理後にリダイレクト

                // ログイン処理

                Map<String, Object> postJson = new HashMap<String, Object>();
                for (Entry<String, String[]> e : request.getParameterMap().entrySet()) {
                    String k = e.getKey();
                    String[] vs = e.getValue();
                    postJson.put(k, String.join(",", vs));
                }

                // Actionクラスのインスタンスを実行
                String actionPackage = App.get("package.action");
                String className = actionPackage + ".LoginAction";
                Class<?> c = null;
                try {
                    c = Class.forName(className);
                } catch (ClassNotFoundException e) {
                    throw new SysError(e);
                }

                Map<String, Object> map = null;
                try {
                    BaseAction action = (BaseAction) c.newInstance();
                    map = action.run(postJson);
                } catch (AppError e) {
                    String msg = "?ERROR="
                            + URLEncoder.encode(Messages.get("error.login"), StandardCharsets.UTF_8.name());
                    res.sendRedirect(contextPath + LoginFilter.LOGIN_PAGE + msg);
                    return;
                } catch (Exception e) {
                    throw new SysError(e);
                }

                ses.setAttribute("LOGIN_KEY", map.get("LOGIN_KEY"));
                ses.setAttribute("LOGIN_INFO", map.get("LOGIN_INFO"));

                String orgRequestURI = request.getParameter("requestURI");
                if (!StringUtil.isNullOrBlank(orgRequestURI)) {
                    res.sendRedirect(orgRequestURI);
                } else {
                    res.sendRedirect(contextPath);
                }

                return;

            } else if (requestURI.equals(contextPath + LoginFilter.LOGOUT_URI)) {
                // ログアウト処理の場合は、セッション破棄後に、ログイン画面へリダイレクト

                ses.invalidate();

                String msg = "?INFO=" + URLEncoder.encode(Messages.get("info.logout"), StandardCharsets.UTF_8.name());
                res.sendRedirect(contextPath + LoginFilter.LOGIN_PAGE + msg);

                return;

            } else if (ses.getAttribute("LOGIN_KEY") == null) {
                // 認証用オブジェクトがセッションにない場合は、セッション破棄してログイン画面へリダイレクト

                ses.invalidate();

                res.sendRedirect(contextPath + LoginFilter.LOGIN_PAGE + "?requestURI=" + requestURI);

                return;
            }
        }

        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }

}
