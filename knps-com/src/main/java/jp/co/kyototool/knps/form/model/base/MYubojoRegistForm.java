package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 有力店ボーナス条件登録フォーム
 *
 * @author emarfkrow
 */
public class MYubojoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MYubojoRegistForm.class);

    /** 有力店資格区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String yuryokukbn;

    /**
     * @return 有力店資格区分
     */
    public String getYuryokukbn() {
        return yuryokukbn;
    }

    /**
     * @param p 有力店資格区分
     */
    public void setYuryokukbn(final String p) {
        this.yuryokukbn = p;
    }

    /** 有力店コード */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 8)
    private String yuryocd;

    /**
     * @return 有力店コード
     */
    public String getYuryocd() {
        return yuryocd;
    }

    /**
     * @param p 有力店コード
     */
    public void setYuryocd(final String p) {
        this.yuryocd = p;
    }

    /** 略有力店名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String ryuryokumei;

    /**
     * @return 略有力店名
     */
    public String getRyuryokumei() {
        return ryuryokumei;
    }

    /**
     * @param p 略有力店名
     */
    public void setRyuryokumei(final String p) {
        this.ryuryokumei = p;
    }

    /** 下限購入額 */
    @jakarta.validation.constraints.Size(max = 9)
    private String konyuMin;

    /**
     * @return 下限購入額
     */
    public String getKonyuMin() {
        return konyuMin;
    }

    /**
     * @param p 下限購入額
     */
    public void setKonyuMin(final String p) {
        this.konyuMin = p;
    }

    /** 上限購入額 */
    @jakarta.validation.constraints.Size(max = 9)
    private String konyuMax;

    /**
     * @return 上限購入額
     */
    public String getKonyuMax() {
        return konyuMax;
    }

    /**
     * @param p 上限購入額
     */
    public void setKonyuMax(final String p) {
        this.konyuMax = p;
    }

    /** 有ボ支払率 */
    @jakarta.validation.constraints.Size(max = 2)
    private String yuboritu;

    /**
     * @return 有ボ支払率
     */
    public String getYuboritu() {
        return yuboritu;
    }

    /**
     * @param p 有ボ支払率
     */
    public void setYuboritu(final String p) {
        this.yuboritu = p;
    }

    /** 更新日付 */
    @jakarta.validation.constraints.Size(max = 8)
    private String upddate;

    /**
     * @return 更新日付
     */
    public String getUpddate() {
        return upddate;
    }

    /**
     * @param p 更新日付
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
