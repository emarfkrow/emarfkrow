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
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.sql.Connections;
import jp.co.golorp.emarf.time.DateTimeUtil;
import jp.co.golorp.emarf.validation.FormValidator;
import jp.co.golorp.emarf.validation.IForm;

/**
 * WEBアクションの基底クラス
 *
 * @author golorp
 */
public abstract class BaseAction extends BaseProcess {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(BaseAction.class);

    /** アクション名（リクエストしたURIの末尾から拡張子を除去した文字列） */
    private String baseName;

    /**
     * @return アクション名（リクエストしたURIの末尾から拡張子を除去した文字列）
     */
    public String getBaseName() {
        return baseName;
    }

    /**
     * @param s アクション名（リクエストしたURIの末尾から拡張子を除去した文字列）
     */
    public void setBaseName(final String s) {
        this.baseName = s;
    }

    /** ユーザID */
    private String userId;

    /**
     * @return ユーザID
     */
    public String getId() {
        return userId;
    }

    /**
     * @param s ユーザID
     */
    public void setId(final String s) {
        this.userId = s;
    }

    /** {@link HttpSession} */
    private HttpSession session;

    /**
     * @return {@link HttpSession}
     */
    public HttpSession getSession() {
        return session;
    }

    /**
     * @param ses {@link HttpSession}
     */
    public void setSession(final HttpSession ses) {
        this.session = ses;
    }

    /** requestURI */
    private String requestURI;

    /**
     * @return requestURI
     */
    public String getRequestURI() {
        return requestURI;
    }

    /**
     * @param p セットする requestURI
     */
    public void setRequestURI(final String p) {
        this.requestURI = p;
    }

    /**
     * 事前処理・事後処理
     * @param postJson 送信値
     * @return 実行結果のマップ
     */
    public Map<String, Object> run(final Map<String, Object> postJson) {

        // 開始ログ
        Calendar begin = Calendar.getInstance();
        String logBaseName = "";
        if (this.baseName != null && this.getClass().getName().indexOf(this.baseName) < 0) {
            logBaseName = "[" + this.baseName + "]";
        }
        // 検索画面で件数が多いとログが大量になるためコメントアウト
        //        String logPostJson = "";
        //        if (postJson != null) {
        //            logPostJson = " " + postJson.toString();
        //        }
        LOG.info("  " + this.getClass().getName() + logBaseName + " run."/* + logPostJson*/);

        // アクションクラス名からフォームクラス名を取得して検査
        Class<?> actionClass = this.getClass();
        String actionPackageName = actionClass.getPackage().getName();
        String formPackageName = actionPackageName.replaceFirst("action", "form");
        String actionClassName = actionClass.getSimpleName();
        String formClassName = formPackageName + "." + actionClassName.replaceFirst("Action$", "Form");

        Map<String, String> errors = new HashMap<String, String>();
        IForm form = FormValidator.validate(errors, formClassName, postJson);

        // 相関チェック
        if (form != null) {
            form.validate(errors, this);
        }

        try {

            // finallyを効かすためにtry内でthrow
            if (errors.size() > 0) {
                throw new AppError(errors);
            }

            // アクションの主処理を実行
            Map<String, Object> map = this.running(DateTimeUtil.now(), this.userId, postJson);

            // コミット
            Connections.commit();

            // 主処理の実行結果を返す
            return map;

        } catch (OptLockError e) {

            // 排他エラーの場合も、ロールバックしてエラーを投げる
            Connections.rollback();
            throw e;

        } catch (AppError e) {

            // アプリケーションエラーの場合は、ロールバックしてエラーを投げる
            Connections.rollback();
            throw e;

        } catch (Exception e) {

            // 以外のエラーの場合は、ロールバックしてシステムエラーを投げる
            Connections.rollback();
            throw new SysError(e);

        } finally {

            // コネクションクローズ
            Connections.close();

            // 終了ログ
            Calendar end = Calendar.getInstance();
            long millis = end.getTimeInMillis() - begin.getTimeInMillis();
            LOG.info("  " + this.getClass().getName() + " end in " + millis + " millis.");
        }
    }

    /**
     * 主処理の抽象メソッド
     * @param now システム日時
     * @param id ユーザID
     * @param postJson 送信値
     * @return 実行結果のマップ
     */
    public abstract Map<String, Object> running(LocalDateTime now, String id, Map<String, Object> postJson);

}
