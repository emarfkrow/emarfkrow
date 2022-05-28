package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_PROD_UNIT_COST一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PchProdUnitCostSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchProdUnitCostRegistForm.class);

    /** PCH_PROD_UNIT_COST登録フォームのリスト */
    @Valid
    private List<PchProdUnitCostRegistForm> pchProdUnitCostGrid;

    /**
     * @return PCH_PROD_UNIT_COST登録フォームのリスト
     */
    public List<PchProdUnitCostRegistForm> getPchProdUnitCostGrid() {
        return pchProdUnitCostGrid;
    }

    /**
     * @param p PCH_PROD_UNIT_COST登録フォームのリスト
     */
    public void setPchProdUnitCostGrid(final List<PchProdUnitCostRegistForm> p) {
        this.pchProdUnitCostGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
