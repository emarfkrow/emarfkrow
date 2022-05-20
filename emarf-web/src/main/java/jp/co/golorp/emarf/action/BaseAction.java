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
import jp.co.golorp.emarf.validation.FormValidator;
import jp.co.golorp.emarf.validation.IForm;

/**
 * @author toshiyuki
 *
 */
public abstract class BaseAction extends BaseProcess {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(BaseAction.class);

    /**
     * デフォルトのSQLファイル名（リクエストしたURIの末尾から拡張子を除去した文字列）
     */
    private String baseName;

    /**
     * @return String
     */
    public String getBaseName() {
        return baseName;
    }

    /**
     * @param s
     */
    public void setBaseName(final String s) {
        this.baseName = s;
    }

    /**
     *
     */
    private String userId;

    /**
     * @return id
     */
    public String getId() {
        return userId;
    }

    /**
     * @param s
     */
    public void setId(final String s) {
        this.userId = s;
    }

    /** HttpSession */
    private HttpSession session;

    /**
     * @return HttpSession
     */
    public HttpSession getSession() {
        return session;
    }

    /**
     * @param ses
     */
    public void setSession(final HttpSession ses) {
        this.session = ses;
    }

    /**
     * @param postJson
     * @return Map
     * @throws Exception
     */
    public Map<String, Object> run(final Map<String, Object> postJson) {

        // 開始ログ
        Calendar begin = Calendar.getInstance();
        LOG.info("<<<run>>> " + this.getClass().getName());

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
            Map<String, Object> map = this.running(jp.co.golorp.emarf.time.LocalDateTime.now(), this.userId, postJson);

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
            LOG.info("<<<end>>> " + this.getClass().getName() + " in " + millis + " millis.");
        }
    }

    /**
     * @param now
     * @param id
     * @param postJson
     * @return Map
     */
    public abstract Map<String, Object> running(LocalDateTime now, String id, Map<String, Object> postJson);

}
