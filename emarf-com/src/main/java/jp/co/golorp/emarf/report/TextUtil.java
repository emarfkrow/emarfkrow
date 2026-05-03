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
package jp.co.golorp.emarf.report;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;

import io.github.classgraph.ClassGraph;
import io.github.classgraph.ClassInfo;
import io.github.classgraph.ScanResult;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.exception.NoDataError;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.sql.Queries;
import jp.co.golorp.emarf.util.MapList;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * テキストファイル入出力
 */
public final class TextUtil {

    /**
     * logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(TextUtil.class);

    /** */
    private TextUtil() {
    }

    /**
     * @param sql
     * @param filePath
     */
    public static void csv(final String sql, final String filePath) {
        csv(sql, null, filePath);
    }

    /**
     * @param sql
     * @param params
     * @param filePath
     */
    public static void csv(final String sql, final Map<String, Object> params, final String filePath) {

        Builder builder = CsvSchema.builder();

        out(sql, params, filePath, builder);
    }

    /**
     * @param sql
     * @param filePath
     */
    public static void tsv(final String sql, final String filePath) {
        tsv(sql, null, filePath);
    }

    /**
     * @param sql
     * @param params
     * @param filePath
     */
    public static void tsv(final String sql, final Map<String, Object> params, final String filePath) {

        Builder builder = CsvSchema.builder();
        builder.setColumnSeparator('\t');

        out(sql, params, filePath, builder);
    }

    /**
     * @param sql
     * @param params
     * @param csvPath
     * @param builder
     */
    private static void out(final String sql, final Map<String, Object> params, final String csvPath,
            final Builder builder) {

        MapList list = Queries.select(sql, params, null, null);

        if (list == null || list.size() == 0) {
            throw new NoDataError("info.nodata");
        }

        CsvMapper mapper = new CsvMapper();
        mapper.configure(JsonGenerator.Feature.IGNORE_UNKNOWN, true);

        Map<String, Object> m = list.get(0);
        for (String key : m.keySet()) {
            if (!key.equals("id")) {
                builder.addColumn(key);
            }
        }

        CsvSchema schema = builder.build().withHeader();

        try {
            File file = new File(csvPath);
            mapper.writer(schema).writeValue(file, list);
        } catch (IOException e) {
            throw new SysError(e);
        }
    }

    /**
     * @param sql
     * @param filePath
     */
    public static void fix(final String sql, final String filePath) {
        fix(sql, null, filePath);
    }

    /**
     * @param sql
     * @param params
     * @param filePath
     */
    public static void fix(final String sql, final Map<String, Object> params, final String filePath) {

        MapList list = Queries.select(sql, params, null, null);

        if (list == null || list.size() == 0) {
            throw new NoDataError("info.nodata");
        }

        StringBuilder sb = new StringBuilder();
        for (Map<String, Object> m : list) {
            for (String key : m.keySet()) {
                if (!key.equals("id")) {
                    sb.append(m.get(key));
                }
            }
            sb.append("\n");
        }

        FileUtil.writeFile(filePath, sb.toString());
    }

    /**
     * 入力チェックなしのCSV取り込み
     * @param now
     * @param jobId
     * @param filePath
     * @param isTitle
     * @param c
     */
    public static void walkIn(final LocalDateTime now, final String jobId, final String filePath, final boolean isTitle,
            final Class<?> c) {
        in(now, jobId, filePath, isTitle, c, false);
    }

    /**
     * 入力チェックありのCSV取り込み
     * @param now
     * @param jobId
     * @param filePath
     * @param isTitle
     * @param c
     */
    public static void checkIn(final LocalDateTime now, final String jobId, final String filePath,
            final boolean isTitle, final Class<?> c) {
        in(now, jobId, filePath, isTitle, c, true);
    }

    /**
     * @param now
     * @param jobId
     * @param filePath
     * @param isTitle
     * @param c
     * @param isCheckIn
     */
    private static void in(final LocalDateTime now, final String jobId, final String filePath, final boolean isTitle,
            final Class<?> c, final boolean isCheckIn) {

        boolean titled = isTitle;

        String formClassName = null;

        int j = 0;
        String[] titles = null;
        try (BufferedReader br = Files.newBufferedReader(Paths.get(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {

                if (titled) {
                    titled = false;

                    if (line.split("\",\"").length > 1) {
                        titles = line.replaceAll("^\"|\"$", "").split("\",\"");
                    } else if (line.split("\t").length > 1) {
                        titles = line.split("\t");
                    } else {
                        titles = line.split(",");
                    }

                    continue;
                }

                ++j;

                String[] values = null;
                if (line.split("\",\"").length > 1) {
                    values = line.replaceAll("^\"|\"$", "").split("\",\"");
                } else if (line.split("\t").length > 1) {
                    values = line.split("\t");
                } else {
                    values = line.split(",");
                }

                try {

                    Object o = null;

                    if (titles.length == 0) {

                        o = c.getDeclaredConstructor(String[].class).newInstance((Object) values);

                    } else {

                        Map<String, Object> map = new HashMap<>();
                        for (int i = 0; i < titles.length; i++) {
                            map.put(titles[i], values[i]);
                        }

                        //入力チェック
                        if (isCheckIn) {
                            if (formClassName == null) {
                                try (ScanResult scanResult = new ClassGraph()
                                        .acceptPackages(Messages.get("java.package.form")).scan()) {
                                    for (ClassInfo classInfo : scanResult.getAllClasses()) {
                                        if (classInfo.getSimpleName().equals(c.getSimpleName() + "RegistForm")) {
                                            formClassName = classInfo.getName();
                                            break;
                                        }
                                    }
                                }
                            }
                            Map<String, String> errors = new HashMap<String, String>();
                            FormValidator.validate(errors, formClassName, map);
                            if (errors.size() > 0) {
                                throw new AppError(errors);
                            }
                        }

                        o = c.getDeclaredConstructor(Map.class).newInstance((Object) map);
                    }

                    c.getMethod("insert", LocalDateTime.class, String.class).invoke(o, now, jobId);

                } catch (AppError e) {
                    e.getErrors();
                    for (String key : e.getErrors().keySet()) {
                        LOG.error(key + "[" + j + "]: " + e.getErrors().get(key));
                    }
                    Files.write(Paths.get(filePath + ".err"), Collections.singletonList(line),
                            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                } catch (Exception e) {
                    LOG.error(e.getMessage(), e);
                    Files.write(Paths.get(filePath + ".err"), Collections.singletonList(line),
                            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                }
            }

        } catch (IOException e) {
            throw new SysError(e);
        }
    }

}
