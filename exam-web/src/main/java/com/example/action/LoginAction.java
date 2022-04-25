package com.example.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.sql.Queries;
import jp.co.golorp.emarf.util.MapList;

public class LoginAction extends BaseAction {

    /**
     *
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        String sql = this.loadSqlFile("MUserSearch");
        MapList m = Queries.select(sql, postJson);

        if (m == null || m.size() > 1) {
            throw new AppError("error.login");
        }

        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("LOGIN_KEY", m.get(0).get("USER_ID"));
        ret.put("LOGIN_INFO", m.get(0));
        return ret;
    }

}
