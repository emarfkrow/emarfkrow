package jp.co.golorp.emarf.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.servlet.http.ServletUtil;
import jp.co.golorp.emarf.util.Messages;

/**
 * 認証フィルタ
 */
@WebFilter("/*")
public class LoginFilter implements Filter {

    /** ロガー */
    private static final Logger LOG = LoggerFactory.getLogger(LoginFilter.class);

    /** ログイン画面 */
    private static final String LOGIN_PAGE = App.get("loginfilter.login.page");

    /** ログイン処理URI */
    private static final String LOGIN_URI = App.get("loginfilter.login.uri");

    /** ログアウト処理URI */
    private static final String LOGOUT_URI = App.get("loginfilter.logout.uri");

    /** 認証除外URIの正規表現 */
    private static final String EXCLUDE_REGEXP = App.get("loginfilter.exclude.regexp");

    /** パスワードリセットメール送信画面 */
    private static final String PASSMAIL_PAGE = App.get("loginfilter.passmail.page");

    /** パスワードリセットメール送信処理URI */
    private static final String PASSMAIL_URI = App.get("loginfilter.passmail.uri");

    /** アクションクラスパッケージ */
    private static final String ACTION_PACKAGE = App.get("package.action");

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

        if (!requestURI.matches(LoginFilter.EXCLUDE_REGEXP)
                && !requestURI.equals(contextPath + LoginFilter.PASSMAIL_PAGE)) {
            // ログインチェック除外URLでなく、
            // パスワードリセットメール送信画面でもない場合

            HttpSession ses = req.getSession();

            if (requestURI.equals(contextPath + LoginFilter.LOGIN_PAGE)) {
                // ログイン画面の場合は、セッション破棄のみ

                ses.invalidate();

            } else if (requestURI.equals(contextPath + LoginFilter.PASSMAIL_URI)) {
                // パスワードリセットメール送信処理の場合は、送信処理後にリダイレクト

                Map<String, Object> postJson = ServletUtil.suckParameterMap(req);

                Class<?> c = null;
                try {
                    c = Class.forName(ACTION_PACKAGE + ".PassmailAction");
                } catch (ClassNotFoundException e) {
                    throw new SysError(e);
                }

                Map<String, Object> map = null;
                try {
                    BaseAction action = (BaseAction) c.newInstance();
                    map = action.run(postJson);

                } catch (AppError e) {

                    map = new HashMap<String, Object>();
                    if (e.getErrors() != null && !e.getErrors().isEmpty()) {
                        map.put("ERROR", Messages.get("error"));
                        map.put("errors", e.getErrors());
                    } else {
                        map.put("ERROR", e.getMessage());
                    }

                } catch (Exception e) {

                    LOG.error(e.getMessage(), e);
                    map = new HashMap<String, Object>();
                    map.put("FATAL", Messages.get("fatal"));
                }

                // Actionクラスの実行結果をJSONで返却
                ServletUtil.sendJson(res, map);

                return;

            } else if (requestURI.equals(contextPath + LoginFilter.LOGIN_URI)) {
                // ログイン処理の場合は、ログイン処理後にリダイレクト

                Map<String, Object> postJson = ServletUtil.suckParameterMap(req);

                Class<?> c = null;
                try {
                    c = Class.forName(ACTION_PACKAGE + ".LoginAction");
                } catch (ClassNotFoundException e) {
                    throw new SysError(e);
                }

                Map<String, Object> map = null;
                try {

                    BaseAction action = (BaseAction) c.newInstance();
                    map = action.run(postJson);

                } catch (AppError e) {

                    res.sendRedirect(contextPath + LoginFilter.LOGIN_PAGE + "?ERROR=error.login");
                    return;

                } catch (Exception e) {

                    LOG.error(e.getMessage(), e);
                    throw new SysError(e);
                }

                ses.setAttribute("AUTHN_KEY", map.get("AUTHN_KEY"));
                ses.setAttribute("AUTHN_NAME", map.get("AUTHN_NAME"));
                ses.setAttribute("AUTHN_INFO", map.get("AUTHN_INFO"));
                ses.setAttribute("AUTHZ_INFO", map.get("AUTHZ_INFO"));

                String orgRequestURI = StringUtil.sanitize(request.getParameter("requestURI"));
                if (!StringUtil.isNullOrBlank(orgRequestURI)) {
                    res.sendRedirect(orgRequestURI);
                } else {
                    res.sendRedirect(contextPath);
                }

                return;

            } else if (requestURI.equals(contextPath + LoginFilter.LOGOUT_URI)) {
                // ログアウト処理の場合は、セッション破棄後に、ログイン画面へリダイレクト

                ses.invalidate();
                res.sendRedirect(contextPath + LoginFilter.LOGIN_PAGE + "?INFO=info.logout");
                return;

            } else if (ses.getAttribute("AUTHN_KEY") == null) {
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
