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

import jp.co.golorp.emarf.servlet.http.ServletUtil;

/**
 * エクセル帳票の汎用アクション
 *
 * @author golorp
 */
public class XlsxAction extends BaseAction {

    /**
     * レイアウトファイル名とレイアウトデータを返す
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> xlsxMap = new HashMap<String, Object>();

        // レイアウトファイル名
        String layoutFileName = this.getBaseName() + ".xlsx";
        xlsxMap.put("layoutFileName", layoutFileName);

        // 追加シートマップを設定
        Map<String, Map<String, Object>> addSheetMap = new HashMap<String, Map<String, Object>>();
        addSheetMap.put(this.getBaseName(), ServletUtil.toSimpleMap(postJson));

        // レイアウトマップを設定
        Map<String, Map<String, Map<String, Object>>> layoutSheetMap = new HashMap<String, Map<String, Map<String, Object>>>();
        layoutSheetMap.put("layout", addSheetMap);

        xlsxMap.put("layoutSheetMap", layoutSheetMap);

        return xlsxMap;
    }

}
