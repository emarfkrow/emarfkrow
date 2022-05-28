package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_PRE_STATUS_M一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdPreStatusMSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdPreStatusMRegistForm.class);

    /** PRD_PRE_STATUS_M登録フォームのリスト */
    @Valid
    private List<PrdPreStatusMRegistForm> prdPreStatusMGrid;

    /**
     * @return PRD_PRE_STATUS_M登録フォームのリスト
     */
    public List<PrdPreStatusMRegistForm> getPrdPreStatusMGrid() {
        return prdPreStatusMGrid;
    }

    /**
     * @param p PRD_PRE_STATUS_M登録フォームのリスト
     */
    public void setPrdPreStatusMGrid(final List<PrdPreStatusMRegistForm> p) {
        this.prdPreStatusMGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
