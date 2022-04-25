package jp.co.golorp.emarf.servlet.http;

import java.io.IOException;
import java.util.HashMap;
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
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;

/**
 * Servlet implementation class AjaxServlet
 */
@WebServlet("*.ajax")
public final class AjaxServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

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

        // sqlファイルの探索開始パスを取得
        List<String> sqlPathes = ServletUtil.getSqlPathes(request);

        // sqlファイル名の規定値を取得
        String baseName = ServletUtil.getSqlBaseName(request);

        Map<String, Object> map = null;
        try {

            BaseAction action = ServletUtil.getAction(request);
            action.setSqlPathes(sqlPathes);
            action.setBaseName(baseName);
            action.setId(request.getSession().getAttribute("LOGIN_KEY").toString());

            request.getSession().removeAttribute(request.getRequestURI());
            Map<String, Object> postJson = ServletUtil.getPostJson(request);
            map = action.run(postJson);
            request.getSession().setAttribute(request.getRequestURI(), postJson);

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
