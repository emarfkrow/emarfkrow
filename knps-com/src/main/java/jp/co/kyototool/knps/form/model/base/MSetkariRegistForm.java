package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 仮セット構成マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MSetkariRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSetkariRegistForm.class);

    /** セット品番 */
    @jakarta.validation.constraints.Size(max = 20)
    private String setHinban;

    /**
     * @return セット品番
     */
    public String getSetHinban() {
        return setHinban;
    }

    /**
     * @param p セット品番
     */
    public void setSetHinban(final String p) {
        this.setHinban = p;
    }

    /** セット子品番 */
    @jakarta.validation.constraints.Size(max = 20)
    private String setKhinban;

    /**
     * @return セット子品番
     */
    public String getSetKhinban() {
        return setKhinban;
    }

    /**
     * @param p セット子品番
     */
    public void setSetKhinban(final String p) {
        this.setKhinban = p;
    }

    /** 得意先コード */
    @jakarta.validation.constraints.Size(max = 8)
    private String tokucd;

    /**
     * @return 得意先コード
     */
    public String getTokucd() {
        return tokucd;
    }

    /**
     * @param p 得意先コード
     */
    public void setTokucd(final String p) {
        this.tokucd = p;
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

    /** 子品名 */
    @jakarta.validation.constraints.Size(max = 10)
    private String koHinmei;

    /**
     * @return 子品名
     */
    public String getKoHinmei() {
        return koHinmei;
    }

    /**
     * @param p 子品名
     */
    public void setKoHinmei(final String p) {
        this.koHinmei = p;
    }

    /** セット区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String setkbn;

    /**
     * @return セット区分
     */
    public String getSetkbn() {
        return setkbn;
    }

    /**
     * @param p セット区分
     */
    public void setSetkbn(final String p) {
        this.setkbn = p;
    }

    /** セット員数 */
    @jakarta.validation.constraints.Size(max = 3)
    private String setinzu;

    /**
     * @return セット員数
     */
    public String getSetinzu() {
        return setinzu;
    }

    /**
     * @param p セット員数
     */
    public void setSetinzu(final String p) {
        this.setinzu = p;
    }

    /** 子単価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String koTanka;

    /**
     * @return 子単価
     */
    public String getKoTanka() {
        return koTanka;
    }

    /**
     * @param p 子単価
     */
    public void setKoTanka(final String p) {
        this.koTanka = p;
    }

    /** 無償支給区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String mushokbn;

    /**
     * @return 無償支給区分
     */
    public String getMushokbn() {
        return mushokbn;
    }

    /**
     * @param p 無償支給区分
     */
    public void setMushokbn(final String p) {
        this.mushokbn = p;
    }

    /** 略得意先名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String rtokumei;

    /**
     * @return 略得意先名
     */
    public String getRtokumei() {
        return rtokumei;
    }

    /**
     * @param p 略得意先名
     */
    public void setRtokumei(final String p) {
        this.rtokumei = p;
    }

    /** セット構成マスタ */
    @jakarta.validation.Valid
    private MSetkoseRegistForm mSetkoseRegistForm;

    /**
     * @return MSetkoseRegistForm
     */
    public MSetkoseRegistForm getMSetkoseRegistForm() {
        return mSetkoseRegistForm;
    }

    /**
     * @param p
     */
    public void setMSetkoseRegistForm(final MSetkoseRegistForm p) {
        this.mSetkoseRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
