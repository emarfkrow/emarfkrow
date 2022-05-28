package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * SYS_CLOSE_STATUS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class SysCloseStatusSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(SysCloseStatusRegistForm.class);

    /** SYS_CLOSE_STATUS登録フォームのリスト */
    @Valid
    private List<SysCloseStatusRegistForm> sysCloseStatusGrid;

    /**
     * @return SYS_CLOSE_STATUS登録フォームのリスト
     */
    public List<SysCloseStatusRegistForm> getSysCloseStatusGrid() {
        return sysCloseStatusGrid;
    }

    /**
     * @param p SYS_CLOSE_STATUS登録フォームのリスト
     */
    public void setSysCloseStatusGrid(final List<SysCloseStatusRegistForm> p) {
        this.sysCloseStatusGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
