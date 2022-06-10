package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ネットインカム登録フォーム
 *
 * @author emarfkrow
 */
public class MNetincRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MNetincRegistForm.class);

    /** 本社コード */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 8)
    private String honshacd;

    /**
     * @return 本社コード
     */
    public String getHonshacd() {
        return honshacd;
    }

    /**
     * @param p 本社コード
     */
    public void setHonshacd(final String p) {
        this.honshacd = p;
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

    /** 値引率 */
    @jakarta.validation.constraints.Size(max = 2)
    private String nebikiritu;

    /**
     * @return 値引率
     */
    public String getNebikiritu() {
        return nebikiritu;
    }

    /**
     * @param p 値引率
     */
    public void setNebikiritu(final String p) {
        this.nebikiritu = p;
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

    /** 契約単価マスタ */
    @jakarta.validation.Valid
    private List<MKtankaRegistForm> mKtankaGrid;

    /**
     * @return 契約単価マスタ
     */
    public List<MKtankaRegistForm> getMKtankaGrid() {
        return mKtankaGrid;
    }

    /**
     * @param p
     */
    public void setMKtankaGrid(final List<MKtankaRegistForm> p) {
        this.mKtankaGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
