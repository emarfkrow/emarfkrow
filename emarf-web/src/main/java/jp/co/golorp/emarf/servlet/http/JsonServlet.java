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
import java.util.Map;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.messageresolver.MessageResolver;

/**
 * Servlet implementation class JsonServlet
 *
 * @author golorp
 */
@WebServlet("*.json")
public final class JsonServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(JsonServlet.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
    public JsonServlet() {
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

        // messages.jsonの場合はそのまま返却
        String[] servletPathes = request.getServletPath().split("/");
        if (servletPathes[servletPathes.length - 1].equals("messages.json")) {
            Map<String, String> msgs = MessageResolver.getMessages();
            ObjectMapper mapper = ServletUtil.getMapper();
            response.getWriter().append("let Messages = " + mapper.writeValueAsString(msgs));
            return;
        }

        Map<String, Object> map = null;

        try {

            Map<String, Object> postJson = ServletUtil.getPostJson(request);
            BaseAction action = ServletUtil.getAction(request);
            map = action.run(postJson);

        } catch (Exception e) {

            LOG.error(e.getMessage(), e);
            throw new SysError(e);
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
