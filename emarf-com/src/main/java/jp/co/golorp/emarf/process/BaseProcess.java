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

package jp.co.golorp.emarf.process;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.mail.MailInfo;
import jp.co.golorp.emarf.mail.Mailer;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.sql.Queries;
import jp.co.golorp.emarf.util.MapList;
import jp.co.golorp.emarf.util.Messages;

/**
 * バッチジョブとウェブアクションの基底クラス
 *
 * @author golorp
 */
public class BaseProcess {

    /** 処理のパス構成 */
    private List<String> pathes = new ArrayList<String>();

    /** エラーメール送信先 */
    private String errorMailToCsv = App.get("errorMailToCsv");

    /**
     * @return 処理のパス構成
     */
    public List<String> getPathes() {
        return pathes;
    }

    /**
     * @param p 処理のパス構成
     */
    public void setPathes(final List<String> p) {
        this.pathes = p;
    }

    /**
     * @param sqlName SQLファイル名
     * @return SQL本文
     */
    public String loadSqlFile(final String sqlName) {
        return Queries.loadSqlFile(this.getPathes(), this.getClass(), sqlName);
    }

    /**
     * マスタチェック処理
     * @param errors 維持するエラーリスト
     * @param sqlName マスタチェック用SQLファイル名
     * @param itemName 主キー名
     * @param itemValue 主キー値
     * @param itemMei 項目名
     */
    public void masterCheck(final Map<String, String> errors, final String sqlName, final String itemName,
            final String itemValue, final String itemMei) {

        if (!StringUtil.isNullOrBlank(itemValue)) {

            String namedSql = this.loadSqlFile(sqlName);

            Map<String, Object> params = new HashMap<String, Object>();
            params.put(itemName, itemValue);

            MapList mapList = Queries.select(namedSql, params, null, null);

            if (mapList == null) {
                String processName = this.getClass().getSimpleName();
                String formName = processName.replaceFirst("Action$", "Form");
                errors.put(formName + "." + itemName, Messages.get("error.notexist", itemMei));
            }
        }
    }

    /**
     * @param e システムエラー
     */
    protected void sendErrorMail(final Throwable e) {

        if (!StringUtil.isNullOrBlank(errorMailToCsv)) {

            MailInfo mi = new MailInfo();

            String[] errorMailTos = errorMailToCsv.split(",");
            for (String errorMailTo : errorMailTos) {
                mi.addTo(errorMailTo, "");
            }

            mi.setSubject(e.getMessage());

            StringBuilder sb = new StringBuilder();
            for (StackTraceElement s : e.getStackTrace()) {
                sb.append(s.toString() + "\n");
            }
            mi.addText(sb.toString());

            Mailer.send(mi);
        }
    }

}
