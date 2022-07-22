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
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.report.XlsxUtil;

/**
 * Servlet implementation class XlsxServlet
 *
 * @author golorp
 */
@WebServlet("*.xlsx")
public final class XlsxServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(XlsxServlet.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
    public XlsxServlet() {
        super();
    }

    /**
     * @param request
     * @param response
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(final HttpServletRequest request, final HttpServletResponse response)
            throws ServletException, IOException {

        Map<String, Object> map = null;

        try {

            Map<String, Object> postJson = ServletUtil.getPostedJson(request);
            BaseAction action = ServletUtil.getAction(request);
            map = action.run(postJson);

        } catch (Exception e) {

            LOG.error(e.getMessage(), e);
            String referer = request.getHeader("referer").replaceAll("\\?.+$", "");
            response.sendRedirect(referer + "?FATAL=fatal");
            return;
        }

        BaseAction xlsxAction = null;
        String servletPath = request.getServletPath();
        String[] servletPathes = servletPath.split("/");
        String lastPath = servletPathes[servletPathes.length - 1];
        String actionName = lastPath.replaceFirst(".[a-z]+$", "") + "XlsxAction";
        servletPathes[servletPathes.length - 1] = actionName;
        String className = App.get("package.action") + String.join(".", servletPathes);
        try {
            Class<?> c = Class.forName(className);
            xlsxAction = (BaseAction) c.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            className = "jp.co.golorp.emarf.action.XlsxAction";
            try {
                Class<?> c = Class.forName(className);
                xlsxAction = (BaseAction) c.getDeclaredConstructor().newInstance();
            } catch (Exception e1) {
                LOG.error(e.getMessage(), e);
                throw new SysError(e);
            }
        }

        // sqlファイルの探索開始パスを取得
        List<String> pathes = ServletUtil.getPathes(request);

        // sqlファイル名の規定値を取得
        String baseName = ServletUtil.getBaseName(request);

        xlsxAction.setPathes(pathes);
        xlsxAction.setBaseName(baseName);
        xlsxAction.setId(request.getSession().getAttribute("AUTHN_KEY").toString());
        Map<String, Object> xlsxMap = xlsxAction.run(map);

        String layoutFileName = (String) xlsxMap.get("layoutFileName");

        @SuppressWarnings("unchecked")
        Map<String, Map<String, Map<String, Object>>> layoutSheetMap = (Map<String, Map<String, Map<String, Object>>>) xlsxMap
                .get("layoutSheetMap");

        String baseMei = StringUtil.sanitize(request.getParameter("baseMei"));

        // 一時エクセルを作成して出力・削除
        String tempFilePath = XlsxUtil.getGeneratedPath(pathes, layoutFileName, layoutSheetMap, baseMei);
        ServletUtil.respondDelete(response, tempFilePath);
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
