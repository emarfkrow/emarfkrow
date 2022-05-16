package com.example.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.MUser;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.sql.Queries;

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
            return null;
        }

        email = mUsers.get(0).getEmail();

        return null;
    }

}
