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

import java.io.File;
import java.io.IOException;
import java.util.Map;

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
 * テキストファイル出力
 */
public final class TextUtil {

    /** */
    private TextUtil() {
    }

    /**
     * @param sql
     * @param filePath
     */
    public static void csvOut(final String sql, final String filePath) {
        csvOut(sql, null, filePath);
    }

    /**
     * @param sql
     * @param params
     * @param filePath
     */
    public static void csvOut(final String sql, final Map<String, Object> params, final String filePath) {

        Builder builder = CsvSchema.builder();

        out(sql, params, filePath, builder);
    }

    /**
     * @param sql
     * @param filePath
     */
    public static void tsvOut(final String sql, final String filePath) {
        tsvOut(sql, null, filePath);
    }

    /**
     * @param sql
     * @param params
     * @param filePath
     */
    public static void tsvOut(final String sql, final Map<String, Object> params, final String filePath) {

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
    public static void fixOut(final String sql, final String filePath) {
        fixOut(sql, null, filePath);
    }

    /**
     * @param sql
     * @param params
     * @param filePath
     */
    public static void fixOut(final String sql, final Map<String, Object> params, final String filePath) {

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

}
