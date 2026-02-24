package jp.co.golorp.emarf.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.form.base.LoginFormBase;
import jp.co.golorp.emarf.servlet.LoginFilter;

/**
 * 認可アクション
 * @author toshiyuki
 *
 */
public class AuthzAction extends BaseAction {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(AuthzAction.class);

    /**
     * 認可処理
     */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        String requestURI = postJson.get("requestURI").toString();
        String tableName = requestURI.replaceFirst("\\?anew$", "")
                .replaceFirst("S\\.html$", "").replaceFirst("\\.html$", "")
                .replaceFirst("\\.xlsx$", "").replaceFirst("\\.ajax$", "")
                .replaceFirst("Get$", "").replaceFirst("Search$", "")
                .replaceFirst("S?Regist$", "").replaceFirst("S?Delete$", "")
                .replaceFirst("S?Permit$", "").replaceFirst("S?Forbid$", "");

        LoginFormBase loginForm = (LoginFormBase) this.getSession().getAttribute(LoginFilter.LOGIN_FORM);
        Map<String, Integer> authZ = loginForm.getTablesAuthZ().get(tableName);
        if (authZ == null) {
            authZ = loginForm.getTableAuthZ(tableName);
            loginForm.getTablesAuthZ().put(tableName, authZ);
        }

        String suffix = requestURI.replaceFirst("^" + tableName, "");
        String errorId = null;
        if (requestURI.matches(".+\\.xlsx\\?.+$") && (authZ.get("output") == null || authZ.get("output") != 1)) {
            errorId = "error.authz.output";

        } else if (suffix.matches("^Get.+$") || suffix.matches("^\\.html$")) {

            if (authZ.get("view") == null || authZ.get("view") != 1) {
                errorId = "error.authz.view";
            }

        } else if (suffix.matches("^Search.+$") && (authZ.get("seek") == null || authZ.get("seek") != 1)) {
            errorId = "error.authz.seek";

        } else if (suffix.matches("^\\.html\\?anew$") || suffix.matches("^\\.ajax\\?anew$")) {

            if (authZ.get("anew") == null || authZ.get("anew") != 1) {
                errorId = "error.authz.anew";
            }

        } else if (suffix.matches("^S?Regist.+$") && (authZ.get("edit") == null || authZ.get("edit") != 1)) {
            errorId = "error.authz.edit";

        } else if (suffix.matches("^S?Delete.+$") && (authZ.get("delete") == null || authZ.get("delete") != 1)) {
            errorId = "error.authz.delete";

        } else if (suffix.matches("^S?Permit.+$") && (authZ.get("permit") == null || authZ.get("permit") != 1)) {
            errorId = "error.authz.permit";

        } else if (suffix.matches("^S?Forbid.+$") && (authZ.get("forbid") == null || authZ.get("forbid") != 1)) {
            errorId = "error.authz.forbid";
        }

        Map<String, Object> ret = new HashMap<String, Object>();
        if (errorId != null) {
            LOG.debug("    Authz requestURI: " + requestURI + ", errorId: " + errorId);
            ret.put("AUTHZ", errorId);
        }

        return ret;
    }

}
