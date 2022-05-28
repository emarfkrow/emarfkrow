package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_STORE_MAINTE_RETSU_HED登録フォーム
 *
 * @author emarfkrow
 */
public class PrdStoreMainteRetsuHedRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdStoreMainteRetsuHedRegistForm.class);

    /** RETSU_NO */
    @jakarta.validation.constraints.Size(max = 3)
    private String retsuNo;

    /**
     * @return RETSU_NO
     */
    public String getRetsuNo() {
        return retsuNo;
    }

    /**
     * @param p RETSU_NO
     */
    public void setRetsuNo(final String p) {
        this.retsuNo = p;
    }

    /** RETSU_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String retsuName;

    /**
     * @return RETSU_NAME
     */
    public String getRetsuName() {
        return retsuName;
    }

    /**
     * @param p RETSU_NAME
     */
    public void setRetsuName(final String p) {
        this.retsuName = p;
    }

    /** PRD_STORE_MAINTE_RETSU_DET */
    @jakarta.validation.Valid
    private List<PrdStoreMainteRetsuDetRegistForm> prdStoreMainteRetsuDetGrid;

    /**
     * @return PRD_STORE_MAINTE_RETSU_DET
     */
    public List<PrdStoreMainteRetsuDetRegistForm> getPrdStoreMainteRetsuDetGrid() {
        return prdStoreMainteRetsuDetGrid;
    }

    /**
     * @param p
     */
    public void setPrdStoreMainteRetsuDetGrid(final List<PrdStoreMainteRetsuDetRegistForm> p) {
        this.prdStoreMainteRetsuDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
