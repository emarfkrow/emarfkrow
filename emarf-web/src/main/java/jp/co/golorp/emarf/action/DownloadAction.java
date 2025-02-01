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

package jp.co.golorp.emarf.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.sql.Queries;
import jp.co.golorp.emarf.util.MapList;
import jp.co.golorp.emarf.util.Messages;

/**
 * ファイルダウンロードの汎用アクション
 *
 * @author golorp
 */
public class DownloadAction extends BaseAction {

    /**
     * ファイルパスとファイル名を返す
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        String sql = this.loadSqlFile(this.getBaseName());

        MapList list = Queries.select(sql, postJson, null, null);

        Map<String, Object> map = new HashMap<String, Object>();

        if (list == null) {
            map.put("INFO", Messages.get("info.nodata"));
        } else {
            Map<String, Object> row = list.get(0);
            String name = postJson.get("name").toString();
            //            String filePathColumnName = StringUtil.toUpperCase(name);
            //            String fileMeiColumnName = StringUtil.toUpperCase(name + App.get("context.upload.mei.suffix"));
            //            map.put("filePath", row.get(filePathColumnName));
            //            map.put("fileMei", row.get(fileMeiColumnName));
            String fileColumnName = StringUtil.toUpperCase(name);
            String fileInfo = row.get(fileColumnName).toString();
            String[] fileInfos = fileInfo.split("\\|");
            map.put("fileMei", fileInfos[0]);
            map.put("filePath", fileInfos[1]);
        }

        return map;
    }

}
