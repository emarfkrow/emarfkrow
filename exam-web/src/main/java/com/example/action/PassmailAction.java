package com.example.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.MUser;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.mail.MailInfo;
import jp.co.golorp.emarf.mail.Mailer;
import jp.co.golorp.emarf.sql.Queries;
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

        String email = postJson.get("email").toString();

        String mUserSearchSql = this.loadSqlFile("MUserSearch");
        Map<String, Object> mUserSearchParam = new HashMap<String, Object>();
        mUserSearchParam.put("email", email);
        List<MUser> mUsers = Queries.select(mUserSearchSql, mUserSearchParam, MUser.class);

        if (mUsers == null || mUsers.size() != 1) {
            throw new AppError("error.passmail");
        }

        MUser mUser = mUsers.get(0);

        MailInfo mi = new MailInfo();
        mi.addTo(mUser.getEmail(), mUser.getUserSei() + mUser.getUserMei());
        mi.setSubject(Messages.get("Passmail.subject"));
        mi.addText(Messages.get("Passmail.text"));

        Mailer.send(mi);

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.passmail"));
        return map;
    }

}
