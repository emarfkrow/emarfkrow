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
import java.nio.charset.Charset;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.StandardCharsets;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

import jp.co.golorp.emarf.properties.App;

/**
 * 文字コード設定フィルタ
 *
 * @author golorp
 */
@WebFilter("/*")
public class EncodingFilter implements Filter {

    /** 文字コード */
    public static final String ENCODING;

    static {
        String appEncoding = App.get("characterEncoding");
        if (appEncoding != null && !appEncoding.trim().isEmpty()) {
            String encoding = appEncoding.trim();
            try {
                if (!Charset.isSupported(encoding)) {
                    throw new IllegalStateException("Unsupported character encoding: " + encoding);
                }
            } catch (IllegalCharsetNameException e) {
                throw new IllegalStateException("Invalid character encoding: " + encoding, e);
            }
            ENCODING = encoding;
        } else {
            ENCODING = StandardCharsets.UTF_8.name(); // デフォルト値を安全に設定
        }
    }

    /**
     * 送受信に文字コードを設定
     *
     * @param request {@link ServletRequest}
     * @param response {@link ServletResponse}
     * @param chain {@link FilterChain}
     */
    @Override
    public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain)
            throws IOException, ServletException {

        request.setCharacterEncoding(ENCODING);
        response.setCharacterEncoding(ENCODING);

        chain.doFilter(request, response);
    }

}
