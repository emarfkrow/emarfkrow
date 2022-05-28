package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * SYS_REQ_LOCK_STATUS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class SysReqLockStatusSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(SysReqLockStatusRegistForm.class);

    /** SYS_REQ_LOCK_STATUS登録フォームのリスト */
    @Valid
    private List<SysReqLockStatusRegistForm> sysReqLockStatusGrid;

    /**
     * @return SYS_REQ_LOCK_STATUS登録フォームのリスト
     */
    public List<SysReqLockStatusRegistForm> getSysReqLockStatusGrid() {
        return sysReqLockStatusGrid;
    }

    /**
     * @param p SYS_REQ_LOCK_STATUS登録フォームのリスト
     */
    public void setSysReqLockStatusGrid(final List<SysReqLockStatusRegistForm> p) {
        this.sysReqLockStatusGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
