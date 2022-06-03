package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 販売カレンダー登録フォーム
 *
 * @author emarfkrow
 */
public class MHcalendRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHcalendRegistForm.class);

    /** 年月 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 6)
    private String yymm;

    /**
     * @return 年月
     */
    public String getYymm() {
        return yymm;
    }

    /**
     * @param p 年月
     */
    public void setYymm(final String p) {
        this.yymm = p;
    }

    /** カレンダ区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String calendkbn;

    /**
     * @return カレンダ区分
     */
    public String getCalendkbn() {
        return calendkbn;
    }

    /**
     * @param p カレンダ区分
     */
    public void setCalendkbn(final String p) {
        this.calendkbn = p;
    }

    /** 稼働日数 */
    @jakarta.validation.constraints.Size(max = 2)
    private String kadonitusu;

    /**
     * @return 稼働日数
     */
    public String getKadonitusu() {
        return kadonitusu;
    }

    /**
     * @param p 稼働日数
     */
    public void setKadonitusu(final String p) {
        this.kadonitusu = p;
    }

    /** 日 */
    @jakarta.validation.constraints.Size(max = 2)
    private String dd;

    /**
     * @return 日
     */
    public String getDd() {
        return dd;
    }

    /**
     * @param p 日
     */
    public void setDd(final String p) {
        this.dd = p;
    }

    /** 曜日 */
    @jakarta.validation.constraints.Size(max = 2)
    private String youbi;

    /**
     * @return 曜日
     */
    public String getYoubi() {
        return youbi;
    }

    /**
     * @param p 曜日
     */
    public void setYoubi(final String p) {
        this.youbi = p;
    }

    /** 稼働区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String kadoukbn;

    /**
     * @return 稼働区分
     */
    public String getKadoukbn() {
        return kadoukbn;
    }

    /**
     * @param p 稼働区分
     */
    public void setKadoukbn(final String p) {
        this.kadoukbn = p;
    }

    /** 稼働日累計 */
    @jakarta.validation.constraints.Size(max = 4)
    private String kadourui;

    /**
     * @return 稼働日累計
     */
    public String getKadourui() {
        return kadourui;
    }

    /**
     * @param p 稼働日累計
     */
    public void setKadourui(final String p) {
        this.kadourui = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 12)
    private String filler;

    /**
     * @return 予備領域
     */
    public String getFiller() {
        return filler;
    }

    /**
     * @param p 予備領域
     */
    public void setFiller(final String p) {
        this.filler = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
