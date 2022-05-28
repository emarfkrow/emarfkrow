package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * M_HHINMOK登録フォーム
 *
 * @author emarfkrow
 */
public class MHhinmokRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHhinmokRegistForm.class);

    /** HHINBAN */
    @jakarta.validation.constraints.Size(max = 20)
    private String hhinban;

    /**
     * @return HHINBAN
     */
    public String getHhinban() {
        return hhinban;
    }

    /**
     * @param p HHINBAN
     */
    public void setHhinban(final String p) {
        this.hhinban = p;
    }

    /** DLTFLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String dltflg;

    /**
     * @return DLTFLG
     */
    public String getDltflg() {
        return dltflg;
    }

    /**
     * @param p DLTFLG
     */
    public void setDltflg(final String p) {
        this.dltflg = p;
    }

    /** SETKBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String setkbn;

    /**
     * @return SETKBN
     */
    public String getSetkbn() {
        return setkbn;
    }

    /**
     * @param p SETKBN
     */
    public void setSetkbn(final String p) {
        this.setkbn = p;
    }

    /** HYOJUN-GENKA */
    @jakarta.validation.constraints.Size(max = 9)
    private String hyojunGenka;

    /**
     * @return HYOJUN-GENKA
     */
    public String getHyojunGenka() {
        return hyojunGenka;
    }

    /**
     * @param p HYOJUN-GENKA
     */
    public void setHyojunGenka(final String p) {
        this.hyojunGenka = p;
    }

    /** HYOJUN-BAIKA */
    @jakarta.validation.constraints.Size(max = 9)
    private String hyojunBaika;

    /**
     * @return HYOJUN-BAIKA
     */
    public String getHyojunBaika() {
        return hyojunBaika;
    }

    /**
     * @param p HYOJUN-BAIKA
     */
    public void setHyojunBaika(final String p) {
        this.hyojunBaika = p;
    }

    /** ZAIKOSU-H1 */
    @jakarta.validation.constraints.Size(max = 7)
    private String zaikosuH1;

    /**
     * @return ZAIKOSU-H1
     */
    public String getZaikosuH1() {
        return zaikosuH1;
    }

    /**
     * @param p ZAIKOSU-H1
     */
    public void setZaikosuH1(final String p) {
        this.zaikosuH1 = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
