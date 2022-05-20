package com.example.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MUser;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.mail.MailInfo;
import jp.co.golorp.emarf.mail.Mailer;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.servlet.http.ServletUtil;
import jp.co.golorp.emarf.util.Messages;

/**
 * パスワードリセットメール送信
 * @author toshiyuki
 *
 */
public class PassmailAction extends BaseAction {

    /**
     * パスワードリセットメール送信処理
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        //        String email = postJson.get("email").toString();
        //
        //        String mUserSearchSql = this.loadSqlFile("MUserSearch");
        //        Map<String, Object> mUserSearchParam = new HashMap<String, Object>();
        //        mUserSearchParam.put("email", email);
        //        List<MUser> mUsers = Queries.select(mUserSearchSql, mUserSearchParam, MUser.class);
        //
        //        if (mUsers == null || mUsers.size() != 1) {
        //            throw new AppError("error.passmail");
        //        }
        //
        //        MUser mUser = mUsers.get(0);

        String userId = postJson.get("userId").toString();

        // 該当データなし
        MUser mUser = MUser.get(userId);
        if (mUser == null) {
            throw new AppError("error.passmail");
        }

        String ymdhmsS = jp.co.golorp.emarf.time.LocalDateTime.ymdhmsS();
        String hash = StringUtil.hash(userId + ymdhmsS);

        this.getSession().setAttribute(hash, userId);

        MailInfo mi = new MailInfo();
        mi.addTo(mUser.getEmail(), mUser.getUserSei() + mUser.getUserMei());
        mi.setSubject(Messages.get("Passmail.subject"));

        String text = Messages.get("Passmail.text");
        text += "\r\n\r\n" + ServletUtil.getServletUrl() + "/" + App.get("loginfilter.passreset.page") + "?hash="
                + hash;
        mi.addText(text);

        Mailer.send(mi);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.passmail"));
        return map;
    }

}
