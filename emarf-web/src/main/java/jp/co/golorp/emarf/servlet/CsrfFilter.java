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
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * CSRF対策フィルタ
 */
@WebFilter("/*")
public class CsrfFilter implements Filter {

    /***/
    private static final String CSRF_HEADER_NAME = "X-CSRF-TOKEN";
    /***/
    private static final String CSRF_PARAM_NAME = "_csrf";
    /***/
    private static final String CSRF_TOKEN_NAME = "csrfToken";

    /***/
    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) request;
        HttpServletResponse httpResponse = (HttpServletResponse) response;
        HttpSession session = httpRequest.getSession(true);

        String method = httpRequest.getMethod();
        if (method.matches("(?i)^(POST|PUT|DELETE)$") && !httpRequest.getRequestURI().endsWith("Authz.ajax")
                && !httpRequest.getRequestURI().endsWith(".json")) {
            String requestToken = httpRequest.getHeader(CSRF_HEADER_NAME);
            if (requestToken == null) {
                requestToken = httpRequest.getParameter(CSRF_PARAM_NAME);
            }
            String sessionToken = (String) session.getAttribute(CSRF_TOKEN_NAME);
            if (sessionToken != null && !sessionToken.equals(requestToken)) {
                httpResponse.sendError(HttpServletResponse.SC_FORBIDDEN, "CSRF token invalid or missing.");
                return;
            }
        }

        if (httpRequest.getRequestURI().endsWith(".html") || (httpRequest.getRequestURI().endsWith(".ajax")
                && !httpRequest.getRequestURI().endsWith("Authz.ajax"))) {
            String sessionToken = generateToken();
            session.setAttribute(CSRF_TOKEN_NAME, sessionToken);
            httpRequest.setAttribute(CSRF_PARAM_NAME, sessionToken);
            httpResponse.setHeader(CSRF_HEADER_NAME, sessionToken);
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
