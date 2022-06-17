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

package jp.co.golorp.emarf.servlet.http;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ServletContextTemplateResolver;

import jp.co.golorp.emarf.messageresolver.MessageResolver;
import jp.co.golorp.emarf.properties.App;
import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;

/**
 * htmlアクセスサーブレット
 *
 * @author golorp
 */
@WebServlet("*.html")
public final class HtmlServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * Thymeleaf
     */
    private TemplateEngine templateEngine;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public HtmlServlet() {
        super();
    }

    /**
     * @param config
     */
    public void init(final ServletConfig config) throws ServletException {
        super.init(config);

        // サーブレットコンテキスト取得
        ServletContext servletContext = config.getServletContext();

        // 公開ディレクトリ基準のTemplateResolverを取得
        ServletContextTemplateResolver templateResolver = new ServletContextTemplateResolver(servletContext);
        templateResolver.setPrefix(App.get("thymeleaf.prefix"));
        templateResolver.setSuffix(App.get("thymeleaf.suffix"));
        templateResolver.setTemplateMode(TemplateMode.HTML);
        templateResolver.setCacheable(false);

        // TemplateEngineを設定
        templateEngine = new TemplateEngine();
        templateEngine.setTemplateResolver(templateResolver);
        templateEngine.addDialect(new LayoutDialect());
        templateEngine.setMessageResolver(new MessageResolver());
    }

    /**
     * @param request
     * @param response
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        // テンプレート名のデフォルト値
        String template = App.get("thymeleaf.template.default");

        // リクエストURIが「*.html」ならテンプレート名を上書き
        String servletPath = request.getServletPath();
        if (servletPath.endsWith(App.get("thymeleaf.suffix"))) {
            template = servletPath.replaceFirst("\\.html$", "");
        }

        WebContext context = new WebContext(request, response, this.getServletContext(), request.getLocale());

        Writer writer = new OutputStreamWriter(response.getOutputStream(), StandardCharsets.UTF_8);

        templateEngine.process(template, context, writer);
    }

    /**
     * @param request
     * @param response
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

}
