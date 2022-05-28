package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_OBSERVANCE_RATE_IN登録フォーム
 *
 * @author emarfkrow
 */
public class MfgObservanceRateInRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgObservanceRateInRegistForm.class);

    /** YYYY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yyyy;

    /**
     * @return YYYY
     */
    public String getYyyy() {
        return yyyy;
    }

    /**
     * @param p YYYY
     */
    public void setYyyy(final String p) {
        this.yyyy = p;
    }

    /** MM */
    @jakarta.validation.constraints.Size(max = 2)
    private String mm;

    /**
     * @return MM
     */
    public String getMm() {
        return mm;
    }

    /**
     * @param p MM
     */
    public void setMm(final String p) {
        this.mm = p;
    }

    /** WC_CODE */
    @jakarta.validation.constraints.Size(max = 3)
    private String wcCode;

    /**
     * @return WC_CODE
     */
    public String getWcCode() {
        return wcCode;
    }

    /**
     * @param p WC_CODE
     */
    public void setWcCode(final String p) {
        this.wcCode = p;
    }

    /** OBSERVANCE_RATE */
    @jakarta.validation.constraints.Size(max = 5)
    private String observanceRate;

    /**
     * @return OBSERVANCE_RATE
     */
    public String getObservanceRate() {
        return observanceRate;
    }

    /**
     * @param p OBSERVANCE_RATE
     */
    public void setObservanceRate(final String p) {
        this.observanceRate = p;
    }

    /** LATE_M5OVER */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateM5over;

    /**
     * @return LATE_M5OVER
     */
    public String getLateM5over() {
        return lateM5over;
    }

    /**
     * @param p LATE_M5OVER
     */
    public void setLateM5over(final String p) {
        this.lateM5over = p;
    }

    /** LATE_M5 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateM5;

    /**
     * @return LATE_M5
     */
    public String getLateM5() {
        return lateM5;
    }

    /**
     * @param p LATE_M5
     */
    public void setLateM5(final String p) {
        this.lateM5 = p;
    }

    /** LATE_M4 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateM4;

    /**
     * @return LATE_M4
     */
    public String getLateM4() {
        return lateM4;
    }

    /**
     * @param p LATE_M4
     */
    public void setLateM4(final String p) {
        this.lateM4 = p;
    }

    /** LATE_M3 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateM3;

    /**
     * @return LATE_M3
     */
    public String getLateM3() {
        return lateM3;
    }

    /**
     * @param p LATE_M3
     */
    public void setLateM3(final String p) {
        this.lateM3 = p;
    }

    /** LATE_M2 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateM2;

    /**
     * @return LATE_M2
     */
    public String getLateM2() {
        return lateM2;
    }

    /**
     * @param p LATE_M2
     */
    public void setLateM2(final String p) {
        this.lateM2 = p;
    }

    /** LATE_M1 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateM1;

    /**
     * @return LATE_M1
     */
    public String getLateM1() {
        return lateM1;
    }

    /**
     * @param p LATE_M1
     */
    public void setLateM1(final String p) {
        this.lateM1 = p;
    }

    /** LATE_0 */
    @jakarta.validation.constraints.Size(max = 4)
    private String late0;

    /**
     * @return LATE_0
     */
    public String getLate0() {
        return late0;
    }

    /**
     * @param p LATE_0
     */
    public void setLate0(final String p) {
        this.late0 = p;
    }

    /** LATE_P1 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP1;

    /**
     * @return LATE_P1
     */
    public String getLateP1() {
        return lateP1;
    }

    /**
     * @param p LATE_P1
     */
    public void setLateP1(final String p) {
        this.lateP1 = p;
    }

    /** LATE_P2 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP2;

    /**
     * @return LATE_P2
     */
    public String getLateP2() {
        return lateP2;
    }

    /**
     * @param p LATE_P2
     */
    public void setLateP2(final String p) {
        this.lateP2 = p;
    }

    /** LATE_P3 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP3;

    /**
     * @return LATE_P3
     */
    public String getLateP3() {
        return lateP3;
    }

    /**
     * @param p LATE_P3
     */
    public void setLateP3(final String p) {
        this.lateP3 = p;
    }

    /** LATE_P4 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP4;

    /**
     * @return LATE_P4
     */
    public String getLateP4() {
        return lateP4;
    }

    /**
     * @param p LATE_P4
     */
    public void setLateP4(final String p) {
        this.lateP4 = p;
    }

    /** LATE_P5 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP5;

    /**
     * @return LATE_P5
     */
    public String getLateP5() {
        return lateP5;
    }

    /**
     * @param p LATE_P5
     */
    public void setLateP5(final String p) {
        this.lateP5 = p;
    }

    /** LATE_P6 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP6;

    /**
     * @return LATE_P6
     */
    public String getLateP6() {
        return lateP6;
    }

    /**
     * @param p LATE_P6
     */
    public void setLateP6(final String p) {
        this.lateP6 = p;
    }

    /** LATE_P7 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP7;

    /**
     * @return LATE_P7
     */
    public String getLateP7() {
        return lateP7;
    }

    /**
     * @param p LATE_P7
     */
    public void setLateP7(final String p) {
        this.lateP7 = p;
    }

    /** LATE_P8 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP8;

    /**
     * @return LATE_P8
     */
    public String getLateP8() {
        return lateP8;
    }

    /**
     * @param p LATE_P8
     */
    public void setLateP8(final String p) {
        this.lateP8 = p;
    }

    /** LATE_P9 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP9;

    /**
     * @return LATE_P9
     */
    public String getLateP9() {
        return lateP9;
    }

    /**
     * @param p LATE_P9
     */
    public void setLateP9(final String p) {
        this.lateP9 = p;
    }

    /** LATE_P10 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP10;

    /**
     * @return LATE_P10
     */
    public String getLateP10() {
        return lateP10;
    }

    /**
     * @param p LATE_P10
     */
    public void setLateP10(final String p) {
        this.lateP10 = p;
    }

    /** LATE_P11 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP11;

    /**
     * @return LATE_P11
     */
    public String getLateP11() {
        return lateP11;
    }

    /**
     * @param p LATE_P11
     */
    public void setLateP11(final String p) {
        this.lateP11 = p;
    }

    /** LATE_P12 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP12;

    /**
     * @return LATE_P12
     */
    public String getLateP12() {
        return lateP12;
    }

    /**
     * @param p LATE_P12
     */
    public void setLateP12(final String p) {
        this.lateP12 = p;
    }

    /** LATE_P13 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP13;

    /**
     * @return LATE_P13
     */
    public String getLateP13() {
        return lateP13;
    }

    /**
     * @param p LATE_P13
     */
    public void setLateP13(final String p) {
        this.lateP13 = p;
    }

    /** LATE_P14 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP14;

    /**
     * @return LATE_P14
     */
    public String getLateP14() {
        return lateP14;
    }

    /**
     * @param p LATE_P14
     */
    public void setLateP14(final String p) {
        this.lateP14 = p;
    }

    /** LATE_P15 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP15;

    /**
     * @return LATE_P15
     */
    public String getLateP15() {
        return lateP15;
    }

    /**
     * @param p LATE_P15
     */
    public void setLateP15(final String p) {
        this.lateP15 = p;
    }

    /** LATE_P16 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP16;

    /**
     * @return LATE_P16
     */
    public String getLateP16() {
        return lateP16;
    }

    /**
     * @param p LATE_P16
     */
    public void setLateP16(final String p) {
        this.lateP16 = p;
    }

    /** LATE_P17 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP17;

    /**
     * @return LATE_P17
     */
    public String getLateP17() {
        return lateP17;
    }

    /**
     * @param p LATE_P17
     */
    public void setLateP17(final String p) {
        this.lateP17 = p;
    }

    /** LATE_P18 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP18;

    /**
     * @return LATE_P18
     */
    public String getLateP18() {
        return lateP18;
    }

    /**
     * @param p LATE_P18
     */
    public void setLateP18(final String p) {
        this.lateP18 = p;
    }

    /** LATE_P19 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP19;

    /**
     * @return LATE_P19
     */
    public String getLateP19() {
        return lateP19;
    }

    /**
     * @param p LATE_P19
     */
    public void setLateP19(final String p) {
        this.lateP19 = p;
    }

    /** LATE_P20 */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP20;

    /**
     * @return LATE_P20
     */
    public String getLateP20() {
        return lateP20;
    }

    /**
     * @param p LATE_P20
     */
    public void setLateP20(final String p) {
        this.lateP20 = p;
    }

    /** LATE_P20OVER */
    @jakarta.validation.constraints.Size(max = 4)
    private String lateP20over;

    /**
     * @return LATE_P20OVER
     */
    public String getLateP20over() {
        return lateP20over;
    }

    /**
     * @param p LATE_P20OVER
     */
    public void setLateP20over(final String p) {
        this.lateP20over = p;
    }

    /** MFG_OBSERVANCE_RATE_OUT */
    @jakarta.validation.Valid
    private MfgObservanceRateOutRegistForm mfgObservanceRateOutRegistForm;

    /**
     * @return MfgObservanceRateOutRegistForm
     */
    public MfgObservanceRateOutRegistForm getMfgObservanceRateOutRegistForm() {
        return mfgObservanceRateOutRegistForm;
    }

    /**
     * @param p
     */
    public void setMfgObservanceRateOutRegistForm(final MfgObservanceRateOutRegistForm p) {
        this.mfgObservanceRateOutRegistForm = p;
    }

    /** PRD_MONTH_TIME_SCH */
    @jakarta.validation.Valid
    private PrdMonthTimeSchRegistForm prdMonthTimeSchRegistForm;

    /**
     * @return PrdMonthTimeSchRegistForm
     */
    public PrdMonthTimeSchRegistForm getPrdMonthTimeSchRegistForm() {
        return prdMonthTimeSchRegistForm;
    }

    /**
     * @param p
     */
    public void setPrdMonthTimeSchRegistForm(final PrdMonthTimeSchRegistForm p) {
        this.prdMonthTimeSchRegistForm = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
