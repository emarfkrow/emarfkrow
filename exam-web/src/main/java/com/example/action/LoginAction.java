package com.example.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

import com.example.entity.MNinka;
import com.example.entity.MShozoku;
import com.example.entity.MUser;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.sql.Queries;

public class LoginAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        //        MUser mUser = Queries.get(this.loadSqlFile("MUserSearch"), postJson, MUser.class);
        //        if (mUser == null) {
        //            throw new AppError("error.login");
        //        }
        MUser mUser = MUser.get(postJson.get("email"));

        if (mUser == null) {
            throw new AppError("error.login");
        }

        String password = postJson.get("password").toString();
        if (!password.equals(mUser.getPassword())) {
            throw new AppError("error.login");
        }

        Map<String, String> authzInfo = new HashedMap<String, String>();

        List<MShozoku> mShozokus = Queries.select(this.loadSqlFile("MShozokuSearch"), new HashedMap<String, Object>() {
            {
                put("userId", mUser.getUserId());
            }
        }, MShozoku.class);
        for (MShozoku mShozoku : mShozokus) {

            List<MNinka> mNinkas = Queries.select(this.loadSqlFile("MNinkaSearch"), new HashedMap<String, Object>() {
                {
                    put("bushoId", mShozoku.getBushoId());
                    put("shokuiId", mShozoku.getShokuiId());
                }
            }, MNinka.class);
            for (MNinka mNinka : mNinkas) {
                if (!authzInfo.containsKey(mNinka.getGamenNm())) {
                    authzInfo.put(mNinka.getGamenNm(), mNinka.getKengenKb());
                } else {
                    String orgKengenKb = authzInfo.get(mNinka.getGamenNm());
                    if (Integer.valueOf(orgKengenKb) < Integer.valueOf(mNinka.getKengenKb())) {
                        authzInfo.put(mNinka.getGamenNm(), mNinka.getKengenKb());
                    }
                }
            }
        }

        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("AUTHN_KEY", mUser.getUserId());

        ObjectMapper mapper = new ObjectMapper();
        ret.put("AUTHN_INFO", mapper.convertValue(mUser, Map.class));
        ret.put("AUTHZ_INFO", mapper.convertValue(authzInfo, Map.class));
        return ret;
    }

}
