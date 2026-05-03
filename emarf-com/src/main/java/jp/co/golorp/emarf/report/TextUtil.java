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

import org.apache.poi.ss.formula.functions.T;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import com.fasterxml.jackson.dataformat.csv.CsvSchema.Builder;

import jp.co.golorp.emarf.exception.NoDataError;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.io.FileUtil;
import jp.co.golorp.emarf.sql.Queries;
import jp.co.golorp.emarf.util.MapList;

/**
 * テキストファイル入出力
 */
public final class TextUtil {

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
     * @param now
     * @param jobId
     * @param filePath
     * @param isTitle
     * @param c
     */
    public static void in(final LocalDateTime now, final String jobId, final String filePath, final boolean isTitle,
            final Class<?> c) {

        boolean titled = isTitle;

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

                String[] values = null;
                if (line.split("\",\"").length > 1) {
                    values = line.replaceAll("^\"|\"$", "").split("\",\"");
                } else if (line.split("\t").length > 1) {
                    values = line.split("\t");
                } else {
                    values = line.split(",");
                }

                try {
                    T t = null;

                    if (titles.length == 0) {

                        t = (T) c.getDeclaredConstructor(String[].class).newInstance((Object) values);

                    } else {

                        Map<String, Object> map = new HashMap<>();
                        for (int i = 0; i < titles.length; i++) {
                            map.put(titles[i], values[i]);
                        }
                        t = (T) c.getDeclaredConstructor(Map.class).newInstance((Object) map);
                    }

                    c.getMethod("insert", LocalDateTime.class, String.class).invoke(t, now, jobId);

                } catch (Exception e) {
                    Files.write(Paths.get(filePath + ".err"), Collections.singletonList(line),
                            StandardOpenOption.CREATE, StandardOpenOption.APPEND);
                }
            }

        } catch (IOException e) {
            throw new SysError(e);
        }
    }

}
