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

/**
 * Servlet implementation class AjaxServlet
 */
@WebServlet("*.link")
public final class LinkServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(LinkServlet.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
    public LinkServlet() {
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

        // sqlファイルの探索開始パスを取得
        List<String> pathes = ServletUtil.getPathes(request);

        // sqlファイル名の規定値を取得
        String baseName = ServletUtil.getBaseName(request).replace("Download", "Search");

        Map<String, Object> map = null;
        try {

            BaseAction action = ServletUtil.getAction(request);
            action.setPathes(pathes);
            action.setBaseName(baseName);
            action.setId(request.getSession().getAttribute("AUTHN_KEY").toString());

            Map<String, Object> postJson = ServletUtil.getPostJson(request);
            map = action.run(postJson);

        } catch (Exception e) {
            LOG.error(e.getMessage(), e);
            throw e;
        }

        ServletUtil.respond(response, map.get("filePath").toString(), map.get("fileMei").toString());
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
