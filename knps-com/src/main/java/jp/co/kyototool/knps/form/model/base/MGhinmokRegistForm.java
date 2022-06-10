package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 原価用品目マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MGhinmokRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MGhinmokRegistForm.class);

    /** 品番 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 25)
    private String hinban;

    /**
     * @return 品番
     */
    public String getHinban() {
        return hinban;
    }

    /**
     * @param p 品番
     */
    public void setHinban(final String p) {
        this.hinban = p;
    }

    /** 品目コード */
    @jakarta.validation.constraints.Size(max = 20)
    private String hincd;

    /**
     * @return 品目コード
     */
    public String getHincd() {
        return hincd;
    }

    /**
     * @param p 品目コード
     */
    public void setHincd(final String p) {
        this.hincd = p;
    }

    /** 品目合計単価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hingenka;

    /**
     * @return 品目合計単価
     */
    public String getHingenka() {
        return hingenka;
    }

    /**
     * @param p 品目合計単価
     */
    public void setHingenka(final String p) {
        this.hingenka = p;
    }

    /** データ連携日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String renkeibi;

    /**
     * @return データ連携日
     */
    public String getRenkeibi() {
        return renkeibi;
    }

    /**
     * @param p データ連携日
     */
    public void setRenkeibi(final String p) {
        this.renkeibi = p;
    }

    /** 処理済フラグ */
    @jakarta.validation.constraints.Size(max = 1)
    private String shoriflg;

    /**
     * @return 処理済フラグ
     */
    public String getShoriflg() {
        return shoriflg;
    }

    /**
     * @param p 処理済フラグ
     */
    public void setShoriflg(final String p) {
        this.shoriflg = p;
    }

    /** PRD_ORDERPOINT_STATUS */
    @jakarta.validation.Valid
    private PrdOrderpointStatusRegistForm prdOrderpointStatusRegistForm;

    /**
     * @return PrdOrderpointStatusRegistForm
     */
    public PrdOrderpointStatusRegistForm getPrdOrderpointStatusRegistForm() {
        return prdOrderpointStatusRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdOrderpointStatusRegistForm(final PrdOrderpointStatusRegistForm p) {
        this.prdOrderpointStatusRegistForm = p;
    }

    /** PRD_ORDERPOINT_SUMMARY */
    @jakarta.validation.Valid
    private PrdOrderpointSummaryRegistForm prdOrderpointSummaryRegistForm;

    /**
     * @return PrdOrderpointSummaryRegistForm
     */
    public PrdOrderpointSummaryRegistForm getPrdOrderpointSummaryRegistForm() {
        return prdOrderpointSummaryRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdOrderpointSummaryRegistForm(final PrdOrderpointSummaryRegistForm p) {
        this.prdOrderpointSummaryRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
