package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_SUPPLY_SCH一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PchSupplySchSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchSupplySchRegistForm.class);

    /** PCH_SUPPLY_SCH登録フォームのリスト */
    @Valid
    private List<PchSupplySchRegistForm> pchSupplySchGrid;

    /**
     * @return PCH_SUPPLY_SCH登録フォームのリスト
     */
    public List<PchSupplySchRegistForm> getPchSupplySchGrid() {
        return pchSupplySchGrid;
    }

    /**
     * @param p PCH_SUPPLY_SCH登録フォームのリスト
     */
    public void setPchSupplySchGrid(final List<PchSupplySchRegistForm> p) {
        this.pchSupplySchGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
