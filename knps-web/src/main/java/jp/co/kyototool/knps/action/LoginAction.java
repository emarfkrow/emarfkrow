package jp.co.kyototool.knps.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.properties.App;
import jp.co.golorp.emarf.sql.Queries;
import jp.co.kyototool.knps.entity.MstEmp;
import jp.co.kyototool.knps.entity.MstGamenPermission;

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
        MstEmp mstEmp = MstEmp.get(userId);
        if (mstEmp == null) {
            throw new AppError("error.login");
        }

        // パスワード不一致
        if (!StringUtil.isNullOrBlank(HASH)) {
            passwd = StringUtil.hash(passwd);
        }
        if (!passwd.equals(mstEmp.getPassword())) {
            throw new AppError("error.login");
        }

        // 権限情報取得
        Map<String, String> authzInfo = getAuthzInfos(mstEmp);

        ObjectMapper mapper = new ObjectMapper();

        Map<String, Object> ret = new HashMap<String, Object>();
        ret.put("AUTHN_KEY", userId);
        ret.put("AUTHN_NAME", mstEmp.getEmpName());
        ret.put("AUTHN_INFO", mapper.convertValue(mstEmp, Map.class));
        ret.put("AUTHZ_INFO", mapper.convertValue(authzInfo, Map.class));
        return ret;
    }

    private Map<String, String> getAuthzInfos(MstEmp mstEmp) {

        Map<String, String> authzInfo = new HashMap<String, String>();

        String sql = this.loadSqlFile("MstGamenPermissionSearch");
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("compCode", mstEmp.getCompCode());
        List<MstGamenPermission> mstGamenPermissions = Queries.select(sql, params, MstGamenPermission.class);

        for (MstGamenPermission mstGamenPermission : mstGamenPermissions) {
            String k = mstGamenPermission.getGamenId();
            String v = mstGamenPermission.getPermission().toString();
            authzInfo.put(k, v);
        }

        return authzInfo;
    }

}
