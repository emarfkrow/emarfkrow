package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 部品マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MPhinmokRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MPhinmokRegistForm.class);

    /** 部品品番 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String phinban;

    /**
     * @return 部品品番
     */
    public String getPhinban() {
        return phinban;
    }

    /**
     * @param p 部品品番
     */
    public void setPhinban(final String p) {
        this.phinban = p;
    }

    /** 部品名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String phinmei;

    /**
     * @return 部品名
     */
    public String getPhinmei() {
        return phinmei;
    }

    /**
     * @param p 部品名
     */
    public void setPhinmei(final String p) {
        this.phinmei = p;
    }

    /** 部品名カナ */
    @jakarta.validation.constraints.Size(max = 20)
    private String phinmeik;

    /**
     * @return 部品名カナ
     */
    public String getPhinmeik() {
        return phinmeik;
    }

    /**
     * @param p 部品名カナ
     */
    public void setPhinmeik(final String p) {
        this.phinmeik = p;
    }

    /** 生産品番 */
    @jakarta.validation.constraints.Size(max = 25)
    private String hinban;

    /**
     * @return 生産品番
     */
    public String getHinban() {
        return hinban;
    }

    /**
     * @param p 生産品番
     */
    public void setHinban(final String p) {
        this.hinban = p;
    }

    /** 部品価格 */
    @jakarta.validation.constraints.Size(max = 7)
    private String pKakaku;

    /**
     * @return 部品価格
     */
    public String getPKakaku() {
        return pKakaku;
    }

    /**
     * @param p 部品価格
     */
    public void setPKakaku(final String p) {
        this.pKakaku = p;
    }

    /** 部品原価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String pGenka;

    /**
     * @return 部品原価
     */
    public String getPGenka() {
        return pGenka;
    }

    /**
     * @param p 部品原価
     */
    public void setPGenka(final String p) {
        this.pGenka = p;
    }

    /** 部品区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String pKbn;

    /**
     * @return 部品区分
     */
    public String getPKbn() {
        return pKbn;
    }

    /**
     * @param p 部品区分
     */
    public void setPKbn(final String p) {
        this.pKbn = p;
    }

    /** 期首残高 */
    @jakarta.validation.constraints.Size(max = 7)
    private String kishuzan;

    /**
     * @return 期首残高
     */
    public String getKishuzan() {
        return kishuzan;
    }

    /**
     * @param p 期首残高
     */
    public void setKishuzan(final String p) {
        this.kishuzan = p;
    }

    /** 基準在庫 */
    @jakarta.validation.constraints.Size(max = 7)
    private String kijyunzaiko;

    /**
     * @return 基準在庫
     */
    public String getKijyunzaiko() {
        return kijyunzaiko;
    }

    /**
     * @param p 基準在庫
     */
    public void setKijyunzaiko(final String p) {
        this.kijyunzaiko = p;
    }

    /** 発注点 */
    @jakarta.validation.constraints.Size(max = 7)
    private String hachuten;

    /**
     * @return 発注点
     */
    public String getHachuten() {
        return hachuten;
    }

    /**
     * @param p 発注点
     */
    public void setHachuten(final String p) {
        this.hachuten = p;
    }

    /** 登録区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String tourokukbn;

    /**
     * @return 登録区分
     */
    public String getTourokukbn() {
        return tourokukbn;
    }

    /**
     * @param p 登録区分
     */
    public void setTourokukbn(final String p) {
        this.tourokukbn = p;
    }

    /** 伝票提出区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String denpyotkbn;

    /**
     * @return 伝票提出区分
     */
    public String getDenpyotkbn() {
        return denpyotkbn;
    }

    /**
     * @param p 伝票提出区分
     */
    public void setDenpyotkbn(final String p) {
        this.denpyotkbn = p;
    }

    /** 受注禁止区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String jukinkbn;

    /**
     * @return 受注禁止区分
     */
    public String getJukinkbn() {
        return jukinkbn;
    }

    /**
     * @param p 受注禁止区分
     */
    public void setJukinkbn(final String p) {
        this.jukinkbn = p;
    }

    /** 削除区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String dltflg;

    /**
     * @return 削除区分
     */
    public String getDltflg() {
        return dltflg;
    }

    /**
     * @param p 削除区分
     */
    public void setDltflg(final String p) {
        this.dltflg = p;
    }

    /** 更新日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String upddate;

    /**
     * @return 更新日
     */
    public String getUpddate() {
        return upddate;
    }

    /**
     * @param p 更新日
     */
    public void setUpddate(final String p) {
        this.upddate = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
