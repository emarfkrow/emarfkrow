package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * バーコードマスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MBarcdRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MBarcdRegistForm.class);

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

    /** 品名 */
    @jakarta.validation.constraints.Size(max = 10)
    private String hinmei;

    /**
     * @return 品名
     */
    public String getHinmei() {
        return hinmei;
    }

    /**
     * @param p 品名
     */
    public void setHinmei(final String p) {
        this.hinmei = p;
    }

    /** バーコード */
    @jakarta.validation.constraints.Size(max = 13)
    private String barcode;

    /**
     * @return バーコード
     */
    public String getBarcode() {
        return barcode;
    }

    /**
     * @param p バーコード
     */
    public void setBarcode(final String p) {
        this.barcode = p;
    }

    /** 自由項目１ */
    @jakarta.validation.constraints.Size(max = 15)
    private String free1;

    /**
     * @return 自由項目１
     */
    public String getFree1() {
        return free1;
    }

    /**
     * @param p 自由項目１
     */
    public void setFree1(final String p) {
        this.free1 = p;
    }

    /** 自由項目２ */
    @jakarta.validation.constraints.Size(max = 10)
    private String free2;

    /**
     * @return 自由項目２
     */
    public String getFree2() {
        return free2;
    }

    /**
     * @param p 自由項目２
     */
    public void setFree2(final String p) {
        this.free2 = p;
    }

    /** 自由項目３ */
    @jakarta.validation.constraints.Size(max = 10)
    private String free3;

    /**
     * @return 自由項目３
     */
    public String getFree3() {
        return free3;
    }

    /**
     * @param p 自由項目３
     */
    public void setFree3(final String p) {
        this.free3 = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 22)
    private String fller;

    /**
     * @return 予備領域
     */
    public String getFller() {
        return fller;
    }

    /**
     * @param p 予備領域
     */
    public void setFller(final String p) {
        this.fller = p;
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

    /** 販売品目マスタ */
    @jakarta.validation.Valid
    private MHhinmokRegistForm mHhinmokRegistForm;

    /**
     * @return MHhinmokRegistForm
     */
    public MHhinmokRegistForm getMHhinmokRegistForm() {
        return mHhinmokRegistForm;
    }

    /**
     * @param p
     */
    public void setMHhinmokRegistForm(final MHhinmokRegistForm p) {
        this.mHhinmokRegistForm = p;
    }

    /** 日産単価マスタ */
    @jakarta.validation.Valid
    private MNtankaRegistForm mNtankaRegistForm;

    /**
     * @return MNtankaRegistForm
     */
    public MNtankaRegistForm getMNtankaRegistForm() {
        return mNtankaRegistForm;
    }

    /**
     * @param p
     */
    public void setMNtankaRegistForm(final MNtankaRegistForm p) {
        this.mNtankaRegistForm = p;
    }

    /** 製品原価マスタ */
    @jakarta.validation.Valid
    private MSgenkaRegistForm mSgenkaRegistForm;

    /**
     * @return MSgenkaRegistForm
     */
    public MSgenkaRegistForm getMSgenkaRegistForm() {
        return mSgenkaRegistForm;
    }

    /**
     * @param p
     */
    public void setMSgenkaRegistForm(final MSgenkaRegistForm p) {
        this.mSgenkaRegistForm = p;
    }

    /** ＳＫ品番マスタ */
    @jakarta.validation.Valid
    private MSkhinRegistForm mSkhinRegistForm;

    /**
     * @return MSkhinRegistForm
     */
    public MSkhinRegistForm getMSkhinRegistForm() {
        return mSkhinRegistForm;
    }

    /**
     * @param p
     */
    public void setMSkhinRegistForm(final MSkhinRegistForm p) {
        this.mSkhinRegistForm = p;
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

    /** 包装材構成マスタ */
    @jakarta.validation.Valid
    private List<MHososetRegistForm> mHososetGrid;

    /**
     * @return 包装材構成マスタ
     */
    public List<MHososetRegistForm> getMHososetGrid() {
        return mHososetGrid;
    }

    /**
     * @param p
     */
    public void setMHososetGrid(final List<MHososetRegistForm> p) {
        this.mHososetGrid = p;
    }

    /** 部品構成マスタ */
    @jakarta.validation.Valid
    private List<MPkoseRegistForm> mPkoseGrid;

    /**
     * @return 部品構成マスタ
     */
    public List<MPkoseRegistForm> getMPkoseGrid() {
        return mPkoseGrid;
    }

    /**
     * @param p
     */
    public void setMPkoseGrid(final List<MPkoseRegistForm> p) {
        this.mPkoseGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
