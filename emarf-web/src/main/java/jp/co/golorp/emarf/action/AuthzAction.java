package jp.co.golorp.emarf.action;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.form.base.LoginFormBase;
import jp.co.golorp.emarf.lang.StringUtil;
import jp.co.golorp.emarf.servlet.LoginFilter;
import jp.co.golorp.emarf.util.Messages;

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

        LoginFormBase loginForm = (LoginFormBase) this.getSession().getAttribute(LoginFilter.LOGIN_FORM);
        String errorId = loginForm.getAuthzIds().get(requestURI);
        if (errorId == null) {
            errorId = loginForm.getAuthZ(requestURI);
            loginForm.getAuthzIds().put(requestURI, errorId);
            if (!StringUtil.isNullOrWhiteSpace(errorId)) {
                LOG.warn("    Authz requestURI: " + requestURI + ", errorId: " + errorId);
            }
        }

        Map<String, Object> ret = new HashMap<String, Object>();
        if (errorId != null) {
            ret.put("AUTHZ", Messages.get(errorId));
        }

        return ret;
    }

}
