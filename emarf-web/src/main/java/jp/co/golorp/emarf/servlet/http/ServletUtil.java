package jp.co.golorp.emarf.servlet.http;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.properties.App;

public final class ServletUtil {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(ServletUtil.class);

    private ServletUtil() {
    }

    /**
     * @param request
     * @return BaseAction
     */
    public static BaseAction getAction(final HttpServletRequest request) {
        String servletPath = request.getServletPath();
        String[] servletPathes = servletPath.split("/");
        String lastPath = servletPathes[servletPathes.length - 1];
        String actionName = lastPath.replaceFirst(".[a-z]+$", "") + "Action";
        servletPathes[servletPathes.length - 1] = actionName;
        String className = App.get("package.action") + String.join(".", servletPathes);
        try {
            Class<?> c = Class.forName(className);
            return (BaseAction) c.newInstance();
        } catch (Exception e) {
            if (actionName.endsWith("SearchAction")) {
                className = "jp.co.golorp.emarf.action.SearchAction";
                try {
                    Class<?> c = Class.forName(className);
                    return (BaseAction) c.newInstance();
                } catch (Exception e1) {
                    throw new SysError(e);
                }
            } else {
                throw new SysError(e);
            }
        }
    }

    /**
     * @param request
     * @return List<String>
     */
    public static List<String> getPathes(final HttpServletRequest request) {
        List<String> sqlPathes = new ArrayList<String>();
        String servletPath = request.getServletPath();
        String[] servletPathes = servletPath.split("/");
        for (int i = 0; i < servletPathes.length - 1; i++) {
            String s = servletPathes[i];
            if (s.trim().length() == 0) {
                continue;
            }
            sqlPathes.add(s);
        }
        return sqlPathes;
    }

    /**
     * @param request
     * @return String
     */
    public static String getBaseName(final HttpServletRequest request) {
        String servletPath = request.getServletPath();
        String[] servletPathes = servletPath.split("/");
        String lastPath = servletPathes[servletPathes.length - 1];
        return lastPath.replaceFirst(".[a-z]+$", "");
    }

    /**
     * @param request
     * @return Map
     */
    public static Map<String, Object> getPostJson(final HttpServletRequest request) {
        try {
            String s = request.getReader().readLine();
            LOG.debug("RequestJson: " + s);
            return new ObjectMapper().readValue(s, new TypeReference<Map<String, Object>>() {
            });
        } catch (Exception e) {
            throw new SysError(e);
        }
    }

    /**
     * @param request
     * @return Map
     */
    public static Map<String, Object> getPostedJson(final HttpServletRequest request) {
        String requestURI = request.getRequestURI();
        String ajaxRequestURI = requestURI.replaceFirst("\\.[a-z]+$", ".ajax");
        HttpSession session = request.getSession();
        Object o = session.getAttribute(ajaxRequestURI);
        @SuppressWarnings("unchecked")
        Map<String, Object> postJson = (Map<String, Object>) o;
        return postJson;
    }

    /**
     * @param response
     * @param map
     */
    public static void sendJson(final HttpServletResponse response, final Map<String, Object> map) {
        try {
            String s = new ObjectMapper().writeValueAsString(map);
            LOG.debug("ResponseJson: " + s);
            response.getWriter().append(s);
        } catch (Exception e) {
            throw new SysError(e);
        }
    }

    /**
     * @param map
     * @return Map
     */
    public static Map<String, Object> toSimpleMap(final Map<String, Object> map) {
        try {
            String s = new ObjectMapper().writeValueAsString(map);
            return new ObjectMapper().readValue(s, new TypeReference<Map<String, Object>>() {
            });
        } catch (Exception e) {
            throw new SysError(e);
        }
    }

    /**
     * @param response
     * @param tempFilePath
     */
    public static void respond(final HttpServletResponse response, final String tempFilePath) {

        if (tempFilePath.endsWith(".pdf")) {
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "inline;");
        } else {
            String downloadFileMei = new File(tempFilePath).getName();
            try {
                downloadFileMei = URLEncoder.encode(downloadFileMei, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                throw new SysError(e);
            }
            response.addHeader("Content-Type", "application/octet-stream");
            response.addHeader("Content-Disposition", "attachment; filename*=UTF-8''" + downloadFileMei);
        }

        try {
            Files.copy(new File(tempFilePath).toPath(), response.getOutputStream());
            response.getOutputStream().close();
        } catch (IOException e) {
            throw new SysError(e);
        }
    }

    /**
     * @param response
     * @param tempFilePath
     */
    public static void respondDelete(final HttpServletResponse response, final String tempFilePath) {

        ServletUtil.respond(response, tempFilePath);

        // ファイル削除
        if (App.get("xlsxutil.delete.responded").equals("1")) {
            new File(tempFilePath).delete();
        }
    }

}
