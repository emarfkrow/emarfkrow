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

        LoginFormBase loginForm = (LoginFormBase) this.getSession().getAttribute(LoginFilter.LOGIN_FORM);
        String requestURI = postJson.get("requestURI").toString();
        String errorId = loginForm.getAuthZ(requestURI);

        LOG.debug("    Authz requestURI: " + requestURI + ", errorIds: " + errorId);

        Map<String, Object> ret = new HashMap<String, Object>();
        if (errorId != null) {
            ret.put("AUTHZ", errorId);
        }

        return ret;
    }

}
