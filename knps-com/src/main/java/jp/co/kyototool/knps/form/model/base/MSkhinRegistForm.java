package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ＳＫ品番マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MSkhinRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSkhinRegistForm.class);

    /** 販売品番 */
    @jakarta.validation.constraints.Size(max = 20)
    private String hhinban;

    /**
     * @return 販売品番
     */
    public String getHhinban() {
        return hhinban;
    }

    /**
     * @param p 販売品番
     */
    public void setHhinban(final String p) {
        this.hhinban = p;
    }

    /** ＳＫ区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String skkbn;

    /**
     * @return ＳＫ区分
     */
    public String getSkkbn() {
        return skkbn;
    }

    /**
     * @param p ＳＫ区分
     */
    public void setSkkbn(final String p) {
        this.skkbn = p;
    }

    /** バーコードマスタ */
    @jakarta.validation.Valid
    private MBarcdRegistForm mBarcdRegistForm;

    /**
     * @return MBarcdRegistForm
     */
    public MBarcdRegistForm getMBarcdRegistForm() {
        return mBarcdRegistForm;
    }

    /**
     * @param p
     */
    public void setMBarcdRegistForm(final MBarcdRegistForm p) {
        this.mBarcdRegistForm = p;
    }

    /** 原価マスタ */
    @jakarta.validation.Valid
    private MGenkaRegistForm mGenkaRegistForm;

    /**
     * @return MGenkaRegistForm
     */
    public MGenkaRegistForm getMGenkaRegistForm() {
        return mGenkaRegistForm;
    }

    /**
     * @param p
     */
    public void setMGenkaRegistForm(final MGenkaRegistForm p) {
        this.mGenkaRegistForm = p;
    }

    /** 単価マスタ */
    @jakarta.validation.Valid
    private MTankaRegistForm mTankaRegistForm;

    /**
     * @return MTankaRegistForm
     */
    public MTankaRegistForm getMTankaRegistForm() {
        return mTankaRegistForm;
    }

    /**
     * @param p
     */
    public void setMTankaRegistForm(final MTankaRegistForm p) {
        this.mTankaRegistForm = p;
    }

    /** WEB在庫管理マスタ */
    @jakarta.validation.Valid
    private MWebkanRegistForm mWebkanRegistForm;

    /**
     * @return MWebkanRegistForm
     */
    public MWebkanRegistForm getMWebkanRegistForm() {
        return mWebkanRegistForm;
    }

    /**
     * @param p
     */
    public void setMWebkanRegistForm(final MWebkanRegistForm p) {
        this.mWebkanRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
