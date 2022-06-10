package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 契約単価マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MKtankaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MKtankaRegistForm.class);

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

    /** 社外品番 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String shagaiHinban;

    /**
     * @return 社外品番
     */
    public String getShagaiHinban() {
        return shagaiHinban;
    }

    /**
     * @param p 社外品番
     */
    public void setShagaiHinban(final String p) {
        this.shagaiHinban = p;
    }

    /** 契約単価開始日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String kkaisibi;

    /**
     * @return 契約単価開始日
     */
    public String getKkaisibi() {
        return kkaisibi;
    }

    /**
     * @param p 契約単価開始日
     */
    public void setKkaisibi(final String p) {
        this.kkaisibi = p;
    }

    /** 契約単価終了日 */
    @jakarta.validation.constraints.Size(max = 8)
    private String kshuryobi;

    /**
     * @return 契約単価終了日
     */
    public String getKshuryobi() {
        return kshuryobi;
    }

    /**
     * @param p 契約単価終了日
     */
    public void setKshuryobi(final String p) {
        this.kshuryobi = p;
    }

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

    /** 契約単価 */
    @jakarta.validation.constraints.Size(max = 7)
    private String keiyakuTanka;

    /**
     * @return 契約単価
     */
    public String getKeiyakuTanka() {
        return keiyakuTanka;
    }

    /**
     * @param p 契約単価
     */
    public void setKeiyakuTanka(final String p) {
        this.keiyakuTanka = p;
    }

    /** 商品区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String shohinkbn;

    /**
     * @return 商品区分
     */
    public String getShohinkbn() {
        return shohinkbn;
    }

    /**
     * @param p 商品区分
     */
    public void setShohinkbn(final String p) {
        this.shohinkbn = p;
    }

    /** 価格体系区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String kakakukbn;

    /**
     * @return 価格体系区分
     */
    public String getKakakukbn() {
        return kakakukbn;
    }

    /**
     * @param p 価格体系区分
     */
    public void setKakakukbn(final String p) {
        this.kakakukbn = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
