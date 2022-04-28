package jp.co.golorp.emarf.servlet.http;

import java.io.IOException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
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
 * Servlet implementation class FormServlet
 */
@WebServlet("*.form")
@MultipartConfig()
public final class FormServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(AjaxServlet.class);

    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServlet() {
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
        String baseName = ServletUtil.getBaseName(request);

        Map<String, Object> map = null;
        try {

            BaseAction action = ServletUtil.getAction(request);
            action.setPathes(pathes);
            action.setBaseName(baseName);
            action.setId(request.getSession().getAttribute("LOGIN_KEY").toString());

            Map<String, Object> postJson = ServletUtil.getPostJson(request);
            map = action.run(postJson);

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
            String referer = request.getHeader("referer").replaceAll("\\?.+$", "");
            String msg = "?FATAL=" + URLEncoder.encode(Messages.get("fatal"), StandardCharsets.UTF_8.name());
            response.sendRedirect(referer + msg);
            return;
        }

        String referer = request.getHeader("referer").replaceAll("\\?.+$", "");
        String msg = "";
        if (map.get("INFO") != null) {
            msg = "?INFO=" + URLEncoder.encode(map.get("INFO").toString(), StandardCharsets.UTF_8.name());
        }
        response.sendRedirect(referer + msg);
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
