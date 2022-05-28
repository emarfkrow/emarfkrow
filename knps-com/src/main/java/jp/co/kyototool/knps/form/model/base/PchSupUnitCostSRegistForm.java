package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_SUP_UNIT_COST一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PchSupUnitCostSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchSupUnitCostRegistForm.class);

    /** PCH_SUP_UNIT_COST登録フォームのリスト */
    @Valid
    private List<PchSupUnitCostRegistForm> pchSupUnitCostGrid;

    /**
     * @return PCH_SUP_UNIT_COST登録フォームのリスト
     */
    public List<PchSupUnitCostRegistForm> getPchSupUnitCostGrid() {
        return pchSupUnitCostGrid;
    }

    /**
     * @param p PCH_SUP_UNIT_COST登録フォームのリスト
     */
    public void setPchSupUnitCostGrid(final List<PchSupUnitCostRegistForm> p) {
        this.pchSupUnitCostGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
