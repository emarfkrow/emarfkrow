package com.example.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.MNinka;
import com.example.entity.MShozoku;
import com.example.entity.MUser;
import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.sql.Queries;

/**
 * ログイン
 * @author toshiyuki
 *
 */
public class LoginAction extends BaseAction {

    /** パスワードのハッシュアルゴリズム */
    private static final String HASH = App.get("loginfilter.hash");

    /**
     * ログイン処理
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        String userId = postJson.get("userId").toString();
        String passwd = postJson.get("passwd").toString();

        // 該当データなし
        MUser mUser = MUser.get(userId);
        if (mUser == null) {
            throw new AppError("error.login");
        }

        // パスワード不一致
        if (!StringUtil.isNullOrBlank(HASH)) {
            passwd = StringUtil.hash(passwd);
        }
        if (!passwd.equals(mUser.getPassword())) {
            throw new AppError("error.login");
        }

        // 権限情報取得
        Map<String, String> authzInfo = getAuthzInfos(mUser);

        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("AUTHN_KEY", mUser.getUserId());
        ret.put("AUTHN_NAME", mUser.getUserSei() + " " + mUser.getUserMei());
        ret.put("AUTHN_INFO", mapper.convertValue(mUser, Map.class));
        ret.put("AUTHZ_INFO", mapper.convertValue(authzInfo, Map.class));
        return ret;
    }

    /**
     * @param mUser ユーザエンティティ
     * @return 認可情報のマップ（画面ID：認可レベル）
     */
    private Map<String, String> getAuthzInfos(final MUser mUser) {

        Map<String, String> authzInfo = new HashMap<String, String>();

        // ユーザの所属情報を取得
        String mShozokuSearchSql = this.loadSqlFile("MShozokuSearch");
        Map<String, Object> mShozokuSearchParam = new HashMap<String, Object>();
        mShozokuSearchParam.put("userId", mUser.getUserId());
        List<MShozoku> mShozokus = Queries.select(mShozokuSearchSql, mShozokuSearchParam, MShozoku.class);

        // 所属情報に紐づく認可情報のうち最大の権限を取得
        if (mShozokus != null) {
            for (MShozoku mShozoku : mShozokus) {

                String mNinkaSearchSql = this.loadSqlFile("MNinkaSearch");
                Map<String, Object> mNinkaSearchParam = new HashMap<String, Object>();
                mNinkaSearchParam.put("bushoId", mShozoku.getBushoId());
                mNinkaSearchParam.put("shokuiId", mShozoku.getShokuiId());
                List<MNinka> mNinkas = Queries.select(mNinkaSearchSql, mNinkaSearchParam, MNinka.class);

                if (mNinkas != null) {
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
            }
        }

        return authzInfo;
    }

}
