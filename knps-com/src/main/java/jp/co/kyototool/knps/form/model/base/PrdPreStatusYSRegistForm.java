package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_PRE_STATUS_Y一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdPreStatusYSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdPreStatusYRegistForm.class);

    /** PRD_PRE_STATUS_Y登録フォームのリスト */
    @Valid
    private List<PrdPreStatusYRegistForm> prdPreStatusYGrid;

    /**
     * @return PRD_PRE_STATUS_Y登録フォームのリスト
     */
    public List<PrdPreStatusYRegistForm> getPrdPreStatusYGrid() {
        return prdPreStatusYGrid;
    }

    /**
     * @param p PRD_PRE_STATUS_Y登録フォームのリスト
     */
    public void setPrdPreStatusYGrid(final List<PrdPreStatusYRegistForm> p) {
        this.prdPreStatusYGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
