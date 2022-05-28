package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_CODE登録フォーム
 *
 * @author emarfkrow
 */
public class MstCodeRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstCodeRegistForm.class);

    /** CODE_NM */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 30)
    private String codeNm;

    /**
     * @return CODE_NM
     */
    public String getCodeNm() {
        return codeNm;
    }

    /**
     * @param p CODE_NM
     */
    public void setCodeNm(final String p) {
        this.codeNm = p;
    }

    /** CODE_MEI */
    @jakarta.validation.constraints.Size(max = 60)
    private String codeMei;

    /**
     * @return CODE_MEI
     */
    public String getCodeMei() {
        return codeMei;
    }

    /**
     * @param p CODE_MEI
     */
    public void setCodeMei(final String p) {
        this.codeMei = p;
    }

    /** MST_CODE_VALUE */
    @jakarta.validation.Valid
    private List<MstCodeValueRegistForm> mstCodeValueGrid;

    /**
     * @return MST_CODE_VALUE
     */
    public List<MstCodeValueRegistForm> getMstCodeValueGrid() {
        return mstCodeValueGrid;
    }

    /**
     * @param p
     */
    public void setMstCodeValueGrid(final List<MstCodeValueRegistForm> p) {
        this.mstCodeValueGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
