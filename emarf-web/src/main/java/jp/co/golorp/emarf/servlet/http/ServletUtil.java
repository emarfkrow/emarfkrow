package jp.co.golorp.emarf.servlet.http;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.time.LocalDateTime;

public final class ServletUtil {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(ServletUtil.class);

    /** アップロードファイル名称のサフィックス */
    private static String uploadMeiSuffix = App.get("context.upload.mei.suffix");

    /** servletUrl */
    private static String servletUrl;

    /**
     * @return servletUrl
     */
    public static String getServletUrl() {
        return servletUrl;
    }

    /**
     * @param s
     */
    public static void setServletUrl(final String s) {
        servletUrl = s;
    }

    private ServletUtil() {
    }

    /**
     * @param request
     * @return BaseAction
     */
    public static BaseAction getAction(final HttpServletRequest request) {

        // サーブレットパスを文字列配列に取得
        String servletPath = request.getServletPath();
        String[] servletPathes = servletPath.split("/");

        // 最後のパスの拡張子部分を「Action」に置換
        String lastPath = servletPathes[servletPathes.length - 1];
        String actionName = lastPath.replaceFirst(".[a-z]+$", "") + "Action";
        servletPathes[servletPathes.length - 1] = actionName;

        String pkg = App.get("package.action");
        BaseAction a = null;

        try {

            // リクエストに則って取ってみる
            a = (BaseAction) (Class.forName(pkg + String.join(".", servletPathes))).newInstance();

        } catch (Exception e) {

            try {

                // モデルパッケージからも取ってみる
                a = (BaseAction) (Class.forName(pkg + ".model." + actionName)).newInstance();

            } catch (Exception e1) {

                // モデルのベースパッケージからも取ってみる

                try {

                    a = (BaseAction) (Class.forName(pkg + ".model.base." + actionName)).newInstance();

                } catch (Exception e2) {

                    if (actionName.endsWith("SearchAction")) {

                        try {
                            a = (BaseAction) (Class.forName("jp.co.golorp.emarf.action.SearchAction")).newInstance();
                        } catch (Exception e3) {
                            throw new SysError(e);
                        }

                    } else if (actionName.endsWith("GetAction")) {

                        try {
                            a = (BaseAction) (Class.forName("jp.co.golorp.emarf.action.GetAction")).newInstance();
                        } catch (Exception e3) {
                            throw new SysError(e);
                        }

                    } else if (actionName.endsWith("DownloadAction")) {

                        try {
                            a = (BaseAction) (Class.forName("jp.co.golorp.emarf.action.DownloadAction")).newInstance();
                        } catch (Exception e3) {
                            throw new SysError(e);
                        }

                    } else {

                        throw new SysError(e);
                    }
                }
            }
        }

        // sqlファイルの探索開始パスを取得
        List<String> pathes = ServletUtil.getPathes(request);
        a.setPathes(pathes);

        // sqlファイル名の規定値を取得
        String baseName = ServletUtil.getBaseName(request);
        a.setBaseName(baseName);

        HttpSession ses = request.getSession();
        a.setSession(ses);

        if (ses.getAttribute("AUTHN_KEY") != null) {
            a.setId(ses.getAttribute("AUTHN_KEY").toString());
        }

        return a;
    }

    /**
     * @param request
     * @return List<String>
     */
    public static List<String> getPathes(final HttpServletRequest request) {

        String servletPath = request.getServletPath();
        String[] servletPathes = servletPath.split("/");

        List<String> sqlPathes = new ArrayList<String>();
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

        Collection<Part> parts = null;
        try {
            parts = request.getParts();
        } catch (Exception e) {
            LOG.trace(e.getMessage());
        }

        Map<String, Object> map = new HashMap<String, Object>();
        ObjectMapper mapper = new ObjectMapper();

        if (parts != null) {
            // 「enctype="multipart/form-data"」の場合

            // multipartでループ
            for (Part part : parts) {

                String partName = StringUtil.sanitize(part.getName());

                if (part.getSubmittedFileName() != null) {
                    // アップロードファイルの場合

                    String fileName = StringUtil.sanitize(part.getSubmittedFileName());
                    if (!fileName.equals("")) {
                        // アップロードファイル名がある場合

                        // アップロードフォルダに保管
                        String uploadDir = App.get("context.upload.dir");
                        String ext = fileName.replaceFirst("^.+\\.", "");
                        String saveName = partName + "." + LocalDateTime.ymdhmsS() + "." + ext;
                        String uploadPath = uploadDir + File.separator + saveName;
                        try {
                            part.write(uploadPath);
                        } catch (IOException e) {
                            throw new SysError(e);
                        }

                        // ファイル名と保管パスを返す
                        map.put(partName + uploadMeiSuffix, fileName);
                        map.put(partName, uploadPath);
                    }

                } else {

                    // 送信値を読み取り
                    String v = "";
                    try (BufferedReader br = new BufferedReader(new InputStreamReader(part.getInputStream()))) {
                        String s;
                        while ((s = br.readLine()) != null) {
                            v += StringUtil.sanitize(s);
                        }
                    } catch (IOException e) {
                        throw new SysError(e);
                    }

                    if (partName.matches("^.+Grid$")) {

                        try {
                            Map<String, Object> gridValue = mapper.readValue("{\"" + partName + "\":" + v + "}",
                                    new TypeReference<Map<String, Object>>() {
                                    });
                            map.putAll(gridValue);
                        } catch (Exception e) {
                            throw new SysError(e);
                        }

                    } else if (map.containsKey(partName)) {
                        // 二つ目以降の場合

                        Object orgValue = map.get(partName);
                        if (orgValue instanceof List) {
                            // 三つ目以降の場合

                            @SuppressWarnings("unchecked")
                            List<Object> newList = (List<Object>) orgValue;
                            newList.add(v);

                        } else {
                            // 二つ目の場合

                            List<Object> newList = new ArrayList<Object>();
                            newList.add(orgValue);
                            newList.add(v);
                            map.put(partName, newList);
                        }

                    } else {
                        // 一つ目の場合
                        map.put(partName, v);
                    }
                }
            }

        } else if (request.getParameterMap().size() > 0) {
            // form送信の場合

            map = suckParameterMap(request);

        } else {
            // ajax送信の場合

            try {
                String s = StringUtil.sanitize(request.getReader().readLine());
                map = mapper.readValue(s, new TypeReference<Map<String, Object>>() {
                });
            } catch (Exception e) {
                throw new SysError(e);
            }
        }

        try {
            LOG.debug("RequestJson: " + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map));
        } catch (JsonProcessingException e) {
            throw new SysError(e);
        }

        return map;
    }

    /**
     * @param request
     * @return サニタイズ済みのMap
     */
    public static Map<String, Object> suckParameterMap(final HttpServletRequest request) {

        Map<String, Object> map = null;

        for (Entry<String, String[]> e : request.getParameterMap().entrySet()) {
            String k = StringUtil.sanitize(e.getKey());
            String[] v = StringUtil.sanitize(e.getValue());

            if (map == null) {
                map = new LinkedHashMap<String, Object>();
            }

            if (v.length > 1) {
                map.put(k, v);
            } else if (v.length == 1) {
                map.put(k, v[0]);
            } else {
                map.put(k, "");
            }
        }

        return map;
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
            ObjectMapper mapper = new ObjectMapper();
            String s = mapper.writeValueAsString(map);
            LOG.trace("ResponseJson: " + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map));
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
     * @param filePath
     * @param fileMei
     */
    public static void respond(final HttpServletResponse response, final String filePath, final String fileMei) {

        if (filePath.endsWith(".pdf")) {
            response.setContentType("application/pdf");
            response.setHeader("Content-Disposition", "inline;");
        } else {
            String downloadFileMei = fileMei;
            if (downloadFileMei == null) {
                downloadFileMei = new File(filePath).getName();
            }
            try {
                downloadFileMei = URLEncoder.encode(downloadFileMei, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e) {
                throw new SysError(e);
            }
            response.addHeader("Content-Type", "application/octet-stream");
            response.addHeader("Content-Disposition", "attachment; filename*=UTF-8''" + downloadFileMei);
        }

        try {
            Files.copy(new File(filePath).toPath(), response.getOutputStream());
            response.getOutputStream().close();
        } catch (IOException e) {
            throw new SysError(e);
        }
    }

    /**
     * @param response
     * @param filePath
     */
    public static void respondDelete(final HttpServletResponse response, final String filePath) {
        respondDelete(response, filePath, null);
    }

    /**
     * @param response
     * @param filePath
     * @param fileMei
     */
    public static void respondDelete(final HttpServletResponse response, final String filePath, final String fileMei) {

        ServletUtil.respond(response, filePath, fileMei);

        // ファイル削除
        if (App.get("xlsxutil.delete.responded").equals("1")) {
            new File(filePath).delete();
        }
    }

}
