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
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.generator.BeanGenerator;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.servlet.http.ServletUtil;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.util.ResourceBundles;

/**
 * 認証・認可フィルタ
 *
 * @author golorp
 */
//@WebFilter("/*")
public class LoginFilter implements Filter {

    /** 認証されたキー */
    public static final String AUTHN_KEY = "AUTHN_KEY";

    /** 認証された名称のキー */
    public static final String AUTHN_MEI = "AUTHN_MEI";

    /** 認証情報のキー */
    public static final String AUTHN_INFO = "AUTHN_INFO";

    /** 認可情報のキー */
    public static final String AUTHZ_INFO = "AUTHZ_INFO";

    /** ログインフォームのキー */
    public static final String LOGIN_FORM = "LOGIN_FORM";

    /** BeanGenerator.properties */
    private static final ResourceBundle BUNDLE = ResourceBundles.getBundle(BeanGenerator.class);

    /** ロガー */
    private static final Logger LOG = LoggerFactory.getLogger(LoginFilter.class);

    /** 認証処理使用有無 */
    private static final String AUTHN = App.get("loginfilter.authn");

    /** ログイン画面 */
    private static final String LOGIN_PAGE = App.get("loginfilter.login.page");

    /** ログイン処理URI */
    private static final String LOGIN_URI = App.get("loginfilter.login.uri");

    /** ログアウト処理URI */
    private static final String LOGOUT_URI = App.get("loginfilter.logout.uri");

    /** 認証除外URIの正規表現 */
    private static final Pattern EXCLUDE_PATTERN = createExcludePattern();

    /** パスワードリセットメール送信画面 */
    private static final String PASSMAIL_PAGE = App.get("loginfilter.passmail.page");

    /** パスワードリセットメール送信処理URI */
    private static final String PASSMAIL_URI = App.get("loginfilter.passmail.uri");

    /** パスワードリセット画面 */
    private static final String PASSRESET_PAGE = App.get("loginfilter.passreset.page");

    /** パスワードリセット処理URI */
    private static final String PASSRESET_URI = App.get("loginfilter.passreset.uri");

    /***/
    private static final String PKG_A;

    static {
        if (BUNDLE == null) {
            PKG_A = "com.example.action";
        } else {
            PKG_A = BUNDLE.getString("java.package.action");
        }
    }

    /**
     * 認証・認可処理
     * @param request {@link ServletRequest}
     * @param response {@link ServletResponse}
     * @param chain {@link FilterChain}
     */
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        res.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
        res.setHeader("Pragma", "no-cache");
        res.setDateHeader("Expires", 0);

        String requestedURI = ServletUtil.safeRequestURI(request);
        String contextPath = req.getContextPath() + "/";

        if (AUTHN == null || (!AUTHN.equalsIgnoreCase("true") && !AUTHN.equalsIgnoreCase("false"))) {
            throw new SysError("loginfilter.authn is not configured at App.properties.");
        }

        if (AUTHN.equalsIgnoreCase("false")) { // 認証なし
            LOG.trace("skip authentication.");
            HttpSession ses = req.getSession(false);
            if (ses == null) {
                ses = req.getSession();
            }
            Map<String, String> authzMap = new HashMap<String, String>();
            authzMap.put("authz", "false");
            ses.setAttribute(LoginFilter.AUTHN_KEY, "-1");
            ses.setAttribute(LoginFilter.AUTHN_MEI, "anonymous");
            ses.removeAttribute(LoginFilter.AUTHN_INFO);
            ses.setAttribute(LoginFilter.AUTHZ_INFO, authzMap);
            ses.removeAttribute(LoginFilter.LOGIN_FORM);
        } else if (AUTHN.equalsIgnoreCase("true")) {

            if (requestedURI.equals(contextPath + LoginFilter.LOGIN_PAGE)) { // ログイン画面の場合
                LOG.trace("show login page.");
            } else if (requestedURI.equals(contextPath + LoginFilter.PASSMAIL_URI)) { // パスワードリセットメール送信処理の場合
                if (!"POST".equalsIgnoreCase(req.getMethod())) {
                    res.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
                    return;
                }
                execPassmail(req, res);
                return;
            } else if (requestedURI.equals(contextPath + LoginFilter.PASSRESET_URI)) { // パスワードリセット処理の場合
                if (!"POST".equalsIgnoreCase(req.getMethod())) {
                    res.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
                    return;
                }
                execPassreset(req, res);
                return;
            } else if (requestedURI.equals(contextPath + LoginFilter.LOGIN_URI)) { // ログイン処理の場合は、ログイン処理後にリダイレクト
                if (!"POST".equalsIgnoreCase(req.getMethod())) {
                    res.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
                    return;
                }
                Map<String, Object> postJson = ServletUtil.suckParameterMap(req);
                Class<?> c = null;
                try {
                    c = Class.forName(PKG_A + ".LoginAction");
                } catch (ClassNotFoundException e) {
                    throw new SysError(e);
                }
                Map<String, Object> map = null;
                try {
                    if (c != null) {
                        BaseAction action = (BaseAction) c.getDeclaredConstructor().newInstance();
                        map = action.run(postJson);
                    }
                } catch (AppError e) {
                    LOG.error("Login failed.");
                    res.sendRedirect(contextPath + LoginFilter.LOGIN_PAGE + "?ERROR=error.login");
                    return;
                } catch (Exception e) {
                    LOG.error(e.getMessage(), e);
                    throw new SysError(e);
                }
                Object authnKey = map == null ? null : map.get(AUTHN_KEY);
                if (authnKey == null || StringUtil.isNullOrWhiteSpace(authnKey.toString())
                        || "-1".equals(authnKey.toString())) {
                    throw new SysError("Invalid login result");
                }
                Object authzInfo = map.get(AUTHZ_INFO);
                if (!(authzInfo instanceof Map)) {
                    throw new SysError("Invalid login authorization result");
                }

                HttpSession ses = req.getSession();
                req.changeSessionId();
                ses.setAttribute(LoginFilter.AUTHN_KEY, map.get(LoginFilter.AUTHN_KEY));
                ses.setAttribute(LoginFilter.AUTHN_MEI, map.get(LoginFilter.AUTHN_MEI));
                ses.setAttribute(LoginFilter.AUTHN_INFO, map.get(LoginFilter.AUTHN_INFO));
                ses.setAttribute(LoginFilter.AUTHZ_INFO, map.get(LoginFilter.AUTHZ_INFO));
                ses.setAttribute(LoginFilter.LOGIN_FORM, map.get(LoginFilter.LOGIN_FORM));

                // CSRFトークン再生成・Cookie更新
                String csrfToken = SPACsrfFilter.getCsrfToken();
                ses.setAttribute("X-CSRF-TOKEN", csrfToken);
                SPACsrfFilter.setCookie(req, res, csrfToken);

                String safeURI = null;
                if (req.getParameter("redirectURI") != null) {
                    String redirectURI = req.getParameter("redirectURI");
                    safeURI = ServletUtil.safeRedirectURI(request, redirectURI);
                }

                if (!StringUtil.isNullOrWhiteSpace(safeURI)) {
                    res.sendRedirect(safeURI);
                } else {
                    res.sendRedirect(contextPath);
                }

                return;

            } else if (requestedURI.equals(contextPath + LoginFilter.LOGOUT_URI)) { // ログアウト処理の場合は、セッション破棄後に、ログイン画面へリダイレクト

                if (!"POST".equalsIgnoreCase(req.getMethod())) {
                    res.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
                    return;
                }

                HttpSession ses = req.getSession(false);
                if (ses != null) {
                    ses.invalidate();
                }
                SPACsrfFilter.clearCookie(req, res);
                res.sendRedirect(contextPath + LoginFilter.LOGIN_PAGE + "?INFO=info.logout");
                return;

            } else if (!EXCLUDE_PATTERN.matcher(requestedURI).matches() // １．ログインチェック除外URLでない
                    && !requestedURI.equals(contextPath + LoginFilter.PASSMAIL_PAGE) // ２．パスワードリセットメール送信画面でない
                    && !requestedURI.equals(contextPath + LoginFilter.PASSRESET_PAGE)) { // ３．パスワードリセット画面でない

                // 認証用オブジェクトがセッションにない場合は、セッション破棄してログイン画面へリダイレクト
                HttpSession ses = req.getSession(false);
                if (!isAuthenticated(ses)) {
                    if (ses != null) {
                        ses.invalidate();
                    }
                    SPACsrfFilter.clearCookie(req, res);
                    String redirectURI = URLEncoder.encode(requestedURI, StandardCharsets.UTF_8);
                    res.sendRedirect(contextPath + LoginFilter.LOGIN_PAGE + "?redirectURI=" + redirectURI);
                    return;
                }
            }
        }

        chain.doFilter(request, response);
    }

    /**
     * @param ses
     * @return boolean
     */
    private boolean isAuthenticated(final HttpSession ses) {

        if (ses == null) {
            return false;
        }

        Object authnKey = ses.getAttribute(AUTHN_KEY);
        if (authnKey == null || StringUtil.isNullOrWhiteSpace(authnKey.toString())) {
            return false;
        }

        return !"-1".equals(authnKey.toString());
    }

    /**
     * パスワードリセットメール送信
     * @param req {@link HttpServletRequest}
     * @param res {@link HttpServletResponse}
     */
    private void execPassmail(final HttpServletRequest req, final HttpServletResponse res) {
        execAjaxAction(req, res, "PassmailAction");
    }

    /**
     * パスワードリセット
     * @param req {@link HttpServletRequest}
     * @param res {@link HttpServletResponse}
     */
    private void execPassreset(final HttpServletRequest req, final HttpServletResponse res) {
        execAjaxAction(req, res, "PassresetAction");
    }

    /**
     * ajaxアクション実行
     * @param req {@link HttpServletRequest}
     * @param res {@link HttpServletResponse}
     * @param actionName アクション名
     */
    private void execAjaxAction(final HttpServletRequest req, final HttpServletResponse res, final String actionName) {

        Map<String, Object> postJson = ServletUtil.suckParameterMap(req);

        Class<?> c = null;
        try {
            c = Class.forName(PKG_A + "." + actionName);
        } catch (ClassNotFoundException e) {
            throw new SysError(e);
        }

        Map<String, Object> map = null;

        try {

            BaseAction action = (BaseAction) c.getDeclaredConstructor().newInstance();
            action.setSession(req.getSession());
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
    }

    /**
     * @return Pattern
     */
    private static Pattern createExcludePattern() {

        String regexp = App.get("loginfilter.exclude.regexp");

        if (StringUtil.isNullOrWhiteSpace(regexp)) {
            throw new SysError("loginfilter.exclude.regexp is not configured.");
        }

        try {
            return Pattern.compile(regexp);
        } catch (PatternSyntaxException e) {
            throw new SysError("Invalid loginfilter.exclude.regexp.");
        }
    }
}
