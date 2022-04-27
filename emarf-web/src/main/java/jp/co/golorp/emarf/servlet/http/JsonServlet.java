package jp.co.golorp.emarf.servlet.http;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.messageresolver.MessageResolver;

/**
 * Servlet implementation class JsonServlet
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
            response.getWriter().append("let Messages = " + new ObjectMapper().writeValueAsString(msgs));
            return;
        }

        // sqlファイルの探索開始パスを取得
        List<String> sqlPathes = ServletUtil.getPathes(request);

        // sqlファイル名の規定値を取得
        String baseName = ServletUtil.getBaseName(request);

        HttpSession session = request.getSession();
        Object loginKey = session.getAttribute("LOGIN_KEY");

        Map<String, Object> map = null;
        try {

            BaseAction action = ServletUtil.getAction(request);
            action.setPathes(sqlPathes);
            action.setBaseName(baseName);
            if (loginKey != null) {
                action.setId(session.getAttribute("LOGIN_KEY").toString());
            }

            Map<String, Object> postJson = ServletUtil.getPostJson(request);
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
