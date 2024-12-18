package jp.co.golorp.emarf.action.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.form.LoginForm;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.mail.MailInfo;
import jp.co.golorp.emarf.mail.Mailer;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.servlet.http.ServletUtil;
import jp.co.golorp.emarf.time.DateTimeUtil;
import jp.co.golorp.emarf.util.Messages;

/**
 * パスワードリセットメール送信
 * @author toshiyuki
 *
 */
public abstract class PassmailActionBase extends BaseAction {

    /**
     * パスワードリセットメール送信処理
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        String userId = postJson.get("userId").toString();

        LoginForm loginForm = getLoginForm(userId);

        // 該当データなし
        if (loginForm.getEmail() == null) {
            throw new AppError("error.passmail");
        }

        String address = loginForm.getEmail();
        String personal = loginForm.getAuthnMei();

        String ymdhmsS = DateTimeUtil.ymdhmsS();
        String hash = StringUtil.hash(userId + ymdhmsS);
        this.getSession().setAttribute(hash, userId);

        MailInfo mi = new MailInfo();
        mi.addTo(address, personal);
        mi.setSubject(Messages.get("Passmail.subject"));

        String text = Messages.get("Passmail.text");
        text += "\r\n";
        text += "\r\n";
        text += ServletUtil.getServletUrl() + "/" + App.get("loginfilter.passreset.page") + "?hash=" + hash;
        mi.addText(text);

        Mailer.send(mi);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.passmail"));
        return map;
    }

    /**
     * @param userId
     * @return LoginForm
     */
    protected abstract LoginForm getLoginForm(String userId);

}
