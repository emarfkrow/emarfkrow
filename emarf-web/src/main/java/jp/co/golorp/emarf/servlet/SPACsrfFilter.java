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
import java.security.SecureRandom;
import java.util.Base64;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * CSRF対策フィルタ
 */
@WebFilter("/*")
public class SPACsrfFilter implements Filter {

    /***/
    private static final String CSRF_TOKEN_NAME = "X-CSRF-TOKEN";

    /***/
    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        HttpSession ses = req.getSession(true);

        String method = req.getMethod();
        String reqUri = req.getRequestURI();

        boolean posted = !method.matches("(?i)^get$")
                && !reqUri.matches("(?i).+\\.json$")
                && !reqUri.matches("(?i).+authz\\.ajax");

        if (posted) {
            String headerToken = req.getHeader(CSRF_TOKEN_NAME);
            String serverToken = (String) ses.getAttribute(CSRF_TOKEN_NAME);
            if (headerToken == null || serverToken == null || !headerToken.equals(serverToken)) {
                res.sendError(HttpServletResponse.SC_FORBIDDEN, "CSRF token invalid or missing.");
                return;
            }
        }

        if (posted || reqUri.matches("(?i).+\\.html$")) {
            String csrfToken = generateToken();
            ses.setAttribute(CSRF_TOKEN_NAME, csrfToken);
            Cookie cookie = new Cookie(CSRF_TOKEN_NAME, csrfToken);
            cookie.setPath("/");
            cookie.setMaxAge(86400); // 1日
            cookie.setHttpOnly(false); // JavaScriptからのアクセス不可
            cookie.setSecure(true); // HTTPS通信のみ送信
            cookie.setAttribute("SameSite", "Strict"); // CSRF対策 (Lax, Strict, None)
            res.addCookie(cookie);
        }

        chain.doFilter(request, response);
    }

    /**
     * @return String CSRFトークン
     */
    private String generateToken() {
        SecureRandom random = new SecureRandom();
        byte[] bytes = new byte[32];
        random.nextBytes(bytes);
        return Base64.getUrlEncoder().withoutPadding().encodeToString(bytes);
    }
}
