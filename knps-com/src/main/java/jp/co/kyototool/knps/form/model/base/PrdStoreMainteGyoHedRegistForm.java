package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_STORE_MAINTE_GYO_HED登録フォーム
 *
 * @author emarfkrow
 */
public class PrdStoreMainteGyoHedRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdStoreMainteGyoHedRegistForm.class);

    /** GYO_NO */
    @jakarta.validation.constraints.Size(max = 3)
    private String gyoNo;

    /**
     * @return GYO_NO
     */
    public String getGyoNo() {
        return gyoNo;
    }

    /**
     * @param p GYO_NO
     */
    public void setGyoNo(final String p) {
        this.gyoNo = p;
    }

    /** GYO_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String gyoName;

    /**
     * @return GYO_NAME
     */
    public String getGyoName() {
        return gyoName;
    }

    /**
     * @param p GYO_NAME
     */
    public void setGyoName(final String p) {
        this.gyoName = p;
    }

    /** PRD_STORE_MAINTE_GYO_DET */
    @jakarta.validation.Valid
    private List<PrdStoreMainteGyoDetRegistForm> prdStoreMainteGyoDetGrid;

    /**
     * @return PRD_STORE_MAINTE_GYO_DET
     */
    public List<PrdStoreMainteGyoDetRegistForm> getPrdStoreMainteGyoDetGrid() {
        return prdStoreMainteGyoDetGrid;
    }

    /**
     * @param p
     */
    public void setPrdStoreMainteGyoDetGrid(final List<PrdStoreMainteGyoDetRegistForm> p) {
        this.prdStoreMainteGyoDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
