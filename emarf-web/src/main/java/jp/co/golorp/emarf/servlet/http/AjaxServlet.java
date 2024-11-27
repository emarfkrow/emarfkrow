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
import java.util.HashMap;
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;

/**
 * ajaxアクセスサーブレット
 *
 * @author golorp
 */
@WebServlet("*.ajax")
@MultipartConfig
public final class AjaxServlet extends HttpServlet {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(AjaxServlet.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjaxServlet() {
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

            HttpSession ses = request.getSession();
            String requestURI = request.getRequestURI();

            // エクセルダウンロードの検索条件退避用
            //ses.removeAttribute(requestURL);

            Map<String, Object> postJson = ServletUtil.getPostJson(request);
            BaseAction action = ServletUtil.getAction(request);
            map = action.run(postJson);

            // エクセルダウンロードの検索条件退避用
            ses.setAttribute(requestURI, postJson);

        } catch (OptLockError e) {

            map = new HashMap<String, Object>();
            map.put("ERROR", e.getMessage());

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
        ServletUtil.sendJson(response, map);
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
