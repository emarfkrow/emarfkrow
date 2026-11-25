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
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.SecureRandom;
import java.util.Base64;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * CSRF対策フィルタ
 */
//@WebFilter("/*")
public class SPACsrfFilter implements Filter {

    /***/
    private static final String CSRF_TOKEN_NAME = "X-CSRF-TOKEN";

    /***/
    private static final SecureRandom RANDOM = new SecureRandom();

    /***/
    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        String method = req.getMethod();
        boolean isCheck = "POST".equalsIgnoreCase(method) || "PUT".equalsIgnoreCase(method)
                || "PATCH".equalsIgnoreCase(method) || "DELETE".equalsIgnoreCase(method);

        HttpSession ses = req.getSession(false);
        if (ses == null) {
            if (isCheck) {
                res.sendError(HttpServletResponse.SC_FORBIDDEN);
                return;
            }
            ses = req.getSession(true);
        }

        String csrfToken = null;
        synchronized (ses) {
            Object token = ses.getAttribute(CSRF_TOKEN_NAME);
            if (token instanceof String && !((String) token).isEmpty()) {
                csrfToken = (String) token;
            } else {
                csrfToken = getCsrfToken();
                ses.setAttribute(CSRF_TOKEN_NAME, csrfToken);
            }
        }

        if (isCheck) {
            String headerToken = req.getHeader(CSRF_TOKEN_NAME);
            if (headerToken == null) {

                if (req.getQueryString() != null && !req.getQueryString().isEmpty()) {
                    for (String param : req.getQueryString().split("&")) {
                        int i = param.indexOf("=");
                        String rawKey = (i > 0) ? param.substring(0, i) : param;
                        if (!rawKey.isEmpty()) {
                            try {
                                String k = URLDecoder.decode(rawKey, StandardCharsets.UTF_8);
                                if (CSRF_TOKEN_NAME.equals(k)) {
                                    res.sendError(HttpServletResponse.SC_FORBIDDEN);
                                    return;
                                }
                            } catch (IllegalArgumentException e) {
                                res.sendError(HttpServletResponse.SC_BAD_REQUEST);
                                return;
                            }
                        }
                    }
                }

                String[] paramTokens = req.getParameterValues(CSRF_TOKEN_NAME);
                if (paramTokens == null || paramTokens.length != 1 || !isValidToken(csrfToken, paramTokens[0])) {
                    res.sendError(HttpServletResponse.SC_FORBIDDEN, "CSRF token invalid or missing.");
                    return;
                }

            } else if (req.getParameterValues(CSRF_TOKEN_NAME) != null) {
                res.sendError(HttpServletResponse.SC_FORBIDDEN, "CSRF token invalid or missing.");
                return;
            } else if (!isValidToken(csrfToken, headerToken)) {
                res.sendError(HttpServletResponse.SC_FORBIDDEN, "CSRF token invalid or missing.");
                return;
            }
        }

        setCookie(req, res, csrfToken);

        chain.doFilter(request, response);
    }

    /**
     * @param expected
     * @param actual
     * @return boolean
     */
    private static boolean isValidToken(final String expected, final String actual) {

        if (expected == null || actual == null || expected.length() != 43 || actual.length() != 43) {
            return false;
        }

        try {
            byte[] expectedBytes = Base64.getUrlDecoder().decode(expected);
            byte[] actualBytes = Base64.getUrlDecoder().decode(actual);

            if (expectedBytes.length != 32 || actualBytes.length != 32) {
                return false;
            }

            if (!Base64.getUrlEncoder().withoutPadding().encodeToString(expectedBytes).equals(expected)
                    || !Base64.getUrlEncoder().withoutPadding().encodeToString(actualBytes).equals(actual)) {
                return false;
            }

            return MessageDigest.isEqual(expectedBytes, actualBytes);

        } catch (IllegalArgumentException e) {
            return false;
        }
    }

    /**
     * @param req
     * @param res
     * @param csrfToken
     */
    public static final void setCookie(final HttpServletRequest req, final HttpServletResponse res,
            final String csrfToken) {
        Cookie cookie = new Cookie(CSRF_TOKEN_NAME, csrfToken);
        cookie.setPath(req.getContextPath().isEmpty() ? "/" : req.getContextPath());
        cookie.setMaxAge(86400); // 1日
        cookie.setHttpOnly(false); // JavaScriptからのアクセス許可
        cookie.setSecure(true); // HTTPS通信のみ送信
        cookie.setAttribute("SameSite", "Strict"); // CSRF対策 (Lax, Strict, None)
        res.addCookie(cookie);
    }

    /**
     * @param req
     * @param res
     */
    public static final void clearCookie(final HttpServletRequest req, final HttpServletResponse res) {
        Cookie cookie = new Cookie(CSRF_TOKEN_NAME, "");
        cookie.setPath(req.getContextPath().isEmpty() ? "/" : req.getContextPath());
        cookie.setMaxAge(0);
        cookie.setHttpOnly(false);
        cookie.setSecure(true);
        cookie.setAttribute("SameSite", "Strict");
        res.addCookie(cookie);
    }

    /**
     * @return String
     */
    public static final String getCsrfToken() {
        byte[] bytes = new byte[32];
        RANDOM.nextBytes(bytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }

}
