package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MFG_OBSERVANCE_RATE_OUT
 *
 * @author emarfkrow
 */
public class MfgObservanceRateOut implements IEntity {

    /** YYYY */
    private String yyyy;

    /**
     * @return YYYY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YYYY")
    public String getYyyy() {
        return this.yyyy;
    }

    /**
     * @param o YYYY
     */
    public void setYyyy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yyyy = String.valueOf(o.toString());
        } else {
            this.yyyy = null;
        }
    }

    /** MM */
    private String mm;

    /**
     * @return MM
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MM")
    public String getMm() {
        return this.mm;
    }

    /**
     * @param o MM
     */
    public void setMm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mm = String.valueOf(o.toString());
        } else {
            this.mm = null;
        }
    }

    /** WC_CODE */
    private String wcCode;

    /**
     * @return WC_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("WC_CODE")
    public String getWcCode() {
        return this.wcCode;
    }

    /**
     * @param o WC_CODE
     */
    public void setWcCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.wcCode = String.valueOf(o.toString());
        } else {
            this.wcCode = null;
        }
    }

    /** OBSERVANCE_RATE */
    private java.math.BigDecimal observanceRate;

    /**
     * @return OBSERVANCE_RATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OBSERVANCE_RATE")
    public java.math.BigDecimal getObservanceRate() {
        return this.observanceRate;
    }

    /**
     * @param o OBSERVANCE_RATE
     */
    public void setObservanceRate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.observanceRate = new java.math.BigDecimal(o.toString());
        } else {
            this.observanceRate = null;
        }
    }

    /** LATE_M5OVER */
    private java.math.BigDecimal lateM5Over;

    /**
     * @return LATE_M5OVER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_M5OVER")
    public java.math.BigDecimal getLateM5Over() {
        return this.lateM5Over;
    }

    /**
     * @param o LATE_M5OVER
     */
    public void setLateM5Over(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateM5Over = new java.math.BigDecimal(o.toString());
        } else {
            this.lateM5Over = null;
        }
    }

    /** LATE_M5 */
    private java.math.BigDecimal lateM5;

    /**
     * @return LATE_M5
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_M5")
    public java.math.BigDecimal getLateM5() {
        return this.lateM5;
    }

    /**
     * @param o LATE_M5
     */
    public void setLateM5(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateM5 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateM5 = null;
        }
    }

    /** LATE_M4 */
    private java.math.BigDecimal lateM4;

    /**
     * @return LATE_M4
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_M4")
    public java.math.BigDecimal getLateM4() {
        return this.lateM4;
    }

    /**
     * @param o LATE_M4
     */
    public void setLateM4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateM4 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateM4 = null;
        }
    }

    /** LATE_M3 */
    private java.math.BigDecimal lateM3;

    /**
     * @return LATE_M3
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_M3")
    public java.math.BigDecimal getLateM3() {
        return this.lateM3;
    }

    /**
     * @param o LATE_M3
     */
    public void setLateM3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateM3 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateM3 = null;
        }
    }

    /** LATE_M2 */
    private java.math.BigDecimal lateM2;

    /**
     * @return LATE_M2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_M2")
    public java.math.BigDecimal getLateM2() {
        return this.lateM2;
    }

    /**
     * @param o LATE_M2
     */
    public void setLateM2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateM2 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateM2 = null;
        }
    }

    /** LATE_M1 */
    private java.math.BigDecimal lateM1;

    /**
     * @return LATE_M1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_M1")
    public java.math.BigDecimal getLateM1() {
        return this.lateM1;
    }

    /**
     * @param o LATE_M1
     */
    public void setLateM1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateM1 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateM1 = null;
        }
    }

    /** LATE_0 */
    private java.math.BigDecimal late0;

    /**
     * @return LATE_0
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_0")
    public java.math.BigDecimal getLate0() {
        return this.late0;
    }

    /**
     * @param o LATE_0
     */
    public void setLate0(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.late0 = new java.math.BigDecimal(o.toString());
        } else {
            this.late0 = null;
        }
    }

    /** LATE_P1 */
    private java.math.BigDecimal lateP1;

    /**
     * @return LATE_P1
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P1")
    public java.math.BigDecimal getLateP1() {
        return this.lateP1;
    }

    /**
     * @param o LATE_P1
     */
    public void setLateP1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP1 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP1 = null;
        }
    }

    /** LATE_P2 */
    private java.math.BigDecimal lateP2;

    /**
     * @return LATE_P2
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P2")
    public java.math.BigDecimal getLateP2() {
        return this.lateP2;
    }

    /**
     * @param o LATE_P2
     */
    public void setLateP2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP2 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP2 = null;
        }
    }

    /** LATE_P3 */
    private java.math.BigDecimal lateP3;

    /**
     * @return LATE_P3
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P3")
    public java.math.BigDecimal getLateP3() {
        return this.lateP3;
    }

    /**
     * @param o LATE_P3
     */
    public void setLateP3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP3 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP3 = null;
        }
    }

    /** LATE_P4 */
    private java.math.BigDecimal lateP4;

    /**
     * @return LATE_P4
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P4")
    public java.math.BigDecimal getLateP4() {
        return this.lateP4;
    }

    /**
     * @param o LATE_P4
     */
    public void setLateP4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP4 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP4 = null;
        }
    }

    /** LATE_P5 */
    private java.math.BigDecimal lateP5;

    /**
     * @return LATE_P5
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P5")
    public java.math.BigDecimal getLateP5() {
        return this.lateP5;
    }

    /**
     * @param o LATE_P5
     */
    public void setLateP5(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP5 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP5 = null;
        }
    }

    /** LATE_P6 */
    private java.math.BigDecimal lateP6;

    /**
     * @return LATE_P6
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P6")
    public java.math.BigDecimal getLateP6() {
        return this.lateP6;
    }

    /**
     * @param o LATE_P6
     */
    public void setLateP6(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP6 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP6 = null;
        }
    }

    /** LATE_P7 */
    private java.math.BigDecimal lateP7;

    /**
     * @return LATE_P7
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P7")
    public java.math.BigDecimal getLateP7() {
        return this.lateP7;
    }

    /**
     * @param o LATE_P7
     */
    public void setLateP7(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP7 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP7 = null;
        }
    }

    /** LATE_P8 */
    private java.math.BigDecimal lateP8;

    /**
     * @return LATE_P8
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P8")
    public java.math.BigDecimal getLateP8() {
        return this.lateP8;
    }

    /**
     * @param o LATE_P8
     */
    public void setLateP8(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP8 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP8 = null;
        }
    }

    /** LATE_P9 */
    private java.math.BigDecimal lateP9;

    /**
     * @return LATE_P9
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P9")
    public java.math.BigDecimal getLateP9() {
        return this.lateP9;
    }

    /**
     * @param o LATE_P9
     */
    public void setLateP9(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP9 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP9 = null;
        }
    }

    /** LATE_P10 */
    private java.math.BigDecimal lateP10;

    /**
     * @return LATE_P10
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P10")
    public java.math.BigDecimal getLateP10() {
        return this.lateP10;
    }

    /**
     * @param o LATE_P10
     */
    public void setLateP10(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP10 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP10 = null;
        }
    }

    /** LATE_P11 */
    private java.math.BigDecimal lateP11;

    /**
     * @return LATE_P11
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P11")
    public java.math.BigDecimal getLateP11() {
        return this.lateP11;
    }

    /**
     * @param o LATE_P11
     */
    public void setLateP11(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP11 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP11 = null;
        }
    }

    /** LATE_P12 */
    private java.math.BigDecimal lateP12;

    /**
     * @return LATE_P12
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P12")
    public java.math.BigDecimal getLateP12() {
        return this.lateP12;
    }

    /**
     * @param o LATE_P12
     */
    public void setLateP12(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP12 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP12 = null;
        }
    }

    /** LATE_P13 */
    private java.math.BigDecimal lateP13;

    /**
     * @return LATE_P13
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P13")
    public java.math.BigDecimal getLateP13() {
        return this.lateP13;
    }

    /**
     * @param o LATE_P13
     */
    public void setLateP13(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP13 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP13 = null;
        }
    }

    /** LATE_P14 */
    private java.math.BigDecimal lateP14;

    /**
     * @return LATE_P14
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P14")
    public java.math.BigDecimal getLateP14() {
        return this.lateP14;
    }

    /**
     * @param o LATE_P14
     */
    public void setLateP14(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP14 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP14 = null;
        }
    }

    /** LATE_P15 */
    private java.math.BigDecimal lateP15;

    /**
     * @return LATE_P15
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P15")
    public java.math.BigDecimal getLateP15() {
        return this.lateP15;
    }

    /**
     * @param o LATE_P15
     */
    public void setLateP15(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP15 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP15 = null;
        }
    }

    /** LATE_P16 */
    private java.math.BigDecimal lateP16;

    /**
     * @return LATE_P16
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P16")
    public java.math.BigDecimal getLateP16() {
        return this.lateP16;
    }

    /**
     * @param o LATE_P16
     */
    public void setLateP16(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP16 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP16 = null;
        }
    }

    /** LATE_P17 */
    private java.math.BigDecimal lateP17;

    /**
     * @return LATE_P17
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P17")
    public java.math.BigDecimal getLateP17() {
        return this.lateP17;
    }

    /**
     * @param o LATE_P17
     */
    public void setLateP17(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP17 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP17 = null;
        }
    }

    /** LATE_P18 */
    private java.math.BigDecimal lateP18;

    /**
     * @return LATE_P18
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P18")
    public java.math.BigDecimal getLateP18() {
        return this.lateP18;
    }

    /**
     * @param o LATE_P18
     */
    public void setLateP18(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP18 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP18 = null;
        }
    }

    /** LATE_P19 */
    private java.math.BigDecimal lateP19;

    /**
     * @return LATE_P19
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P19")
    public java.math.BigDecimal getLateP19() {
        return this.lateP19;
    }

    /**
     * @param o LATE_P19
     */
    public void setLateP19(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP19 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP19 = null;
        }
    }

    /** LATE_P20 */
    private java.math.BigDecimal lateP20;

    /**
     * @return LATE_P20
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P20")
    public java.math.BigDecimal getLateP20() {
        return this.lateP20;
    }

    /**
     * @param o LATE_P20
     */
    public void setLateP20(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP20 = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP20 = null;
        }
    }

    /** LATE_P20OVER */
    private java.math.BigDecimal lateP20Over;

    /**
     * @return LATE_P20OVER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("LATE_P20OVER")
    public java.math.BigDecimal getLateP20Over() {
        return this.lateP20Over;
    }

    /**
     * @param o LATE_P20OVER
     */
    public void setLateP20Over(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lateP20Over = new java.math.BigDecimal(o.toString());
        } else {
            this.lateP20Over = null;
        }
    }

    /** TIME_STAMP_CREATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampCreate;

    /**
     * @return TIME_STAMP_CREATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CREATE")
    public java.time.LocalDateTime getTimeStampCreate() {
        return this.timeStampCreate;
    }

    /**
     * @param o TIME_STAMP_CREATE
     */
    public void setTimeStampCreate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampCreate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampCreate = null;
        }
    }

    /** TIME_STAMP_CHANGE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampChange;

    /**
     * @return TIME_STAMP_CHANGE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CHANGE")
    public java.time.LocalDateTime getTimeStampChange() {
        return this.timeStampChange;
    }

    /**
     * @param o TIME_STAMP_CHANGE
     */
    public void setTimeStampChange(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampChange = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampChange = null;
        }
    }

    /** USER_ID_CREATE */
    private String userIdCreate;

    /**
     * @return USER_ID_CREATE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CREATE")
    public String getUserIdCreate() {
        return this.userIdCreate;
    }

    /**
     * @param o USER_ID_CREATE
     */
    public void setUserIdCreate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdCreate = String.valueOf(o.toString());
        } else {
            this.userIdCreate = null;
        }
    }

    /** USER_ID_CHANGE */
    private String userIdChange;

    /**
     * @return USER_ID_CHANGE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CHANGE")
    public String getUserIdChange() {
        return this.userIdChange;
    }

    /**
     * @param o USER_ID_CHANGE
     */
    public void setUserIdChange(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdChange = String.valueOf(o.toString());
        } else {
            this.userIdChange = null;
        }
    }

    /**
     * MFG_OBSERVANCE_RATE_OUT照会
     *
     * @param param1 YYYY
     * @param param2 MM
     * @param param3 WC_CODE
     * @return MFG_OBSERVANCE_RATE_OUT
     */
    public static MfgObservanceRateOut get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("TRIM (\"WC_CODE\") = TRIM (:wc_code)");

        String sql = "SELECT * FROM MFG_OBSERVANCE_RATE_OUT WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);
        params.put("wc_code", param3);

        return Queries.get(sql, params, MfgObservanceRateOut.class);
    }

    /**
     * MFG_OBSERVANCE_RATE_OUT追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // WC_CODEの採番処理
        numbering();

        // PRD_MONTH_TIME_SCHの登録
        if (this.prdMonthTimeSch != null) {
            this.prdMonthTimeSch.setYyyy(this.getYyyy());
            this.prdMonthTimeSch.setMm(this.getMm());
            this.prdMonthTimeSch.setWcCode(this.getWcCode());
            this.prdMonthTimeSch.insert(now, id);
        }

        // MFG_OBSERVANCE_RATE_OUTの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YYYY\" -- :yyyy");
        nameList.add("\"MM\" -- :mm");
        nameList.add("\"WC_CODE\" -- :wc_code");
        nameList.add("\"OBSERVANCE_RATE\" -- :observance_rate");
        nameList.add("\"LATE_M5OVER\" -- :late_m5_over");
        nameList.add("\"LATE_M5\" -- :late_m5");
        nameList.add("\"LATE_M4\" -- :late_m4");
        nameList.add("\"LATE_M3\" -- :late_m3");
        nameList.add("\"LATE_M2\" -- :late_m2");
        nameList.add("\"LATE_M1\" -- :late_m1");
        nameList.add("\"LATE_0\" -- :late_0");
        nameList.add("\"LATE_P1\" -- :late_p1");
        nameList.add("\"LATE_P2\" -- :late_p2");
        nameList.add("\"LATE_P3\" -- :late_p3");
        nameList.add("\"LATE_P4\" -- :late_p4");
        nameList.add("\"LATE_P5\" -- :late_p5");
        nameList.add("\"LATE_P6\" -- :late_p6");
        nameList.add("\"LATE_P7\" -- :late_p7");
        nameList.add("\"LATE_P8\" -- :late_p8");
        nameList.add("\"LATE_P9\" -- :late_p9");
        nameList.add("\"LATE_P10\" -- :late_p10");
        nameList.add("\"LATE_P11\" -- :late_p11");
        nameList.add("\"LATE_P12\" -- :late_p12");
        nameList.add("\"LATE_P13\" -- :late_p13");
        nameList.add("\"LATE_P14\" -- :late_p14");
        nameList.add("\"LATE_P15\" -- :late_p15");
        nameList.add("\"LATE_P16\" -- :late_p16");
        nameList.add("\"LATE_P17\" -- :late_p17");
        nameList.add("\"LATE_P18\" -- :late_p18");
        nameList.add("\"LATE_P19\" -- :late_p19");
        nameList.add("\"LATE_P20\" -- :late_p20");
        nameList.add("\"LATE_P20OVER\" -- :late_p20_over");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MFG_OBSERVANCE_RATE_OUT(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":wc_code");
        valueList.add(":observance_rate");
        valueList.add(":late_m5_over");
        valueList.add(":late_m5");
        valueList.add(":late_m4");
        valueList.add(":late_m3");
        valueList.add(":late_m2");
        valueList.add(":late_m1");
        valueList.add(":late_0");
        valueList.add(":late_p1");
        valueList.add(":late_p2");
        valueList.add(":late_p3");
        valueList.add(":late_p4");
        valueList.add(":late_p5");
        valueList.add(":late_p6");
        valueList.add(":late_p7");
        valueList.add(":late_p8");
        valueList.add(":late_p9");
        valueList.add(":late_p10");
        valueList.add(":late_p11");
        valueList.add(":late_p12");
        valueList.add(":late_p13");
        valueList.add(":late_p14");
        valueList.add(":late_p15");
        valueList.add(":late_p16");
        valueList.add(":late_p17");
        valueList.add(":late_p18");
        valueList.add(":late_p19");
        valueList.add(":late_p20");
        valueList.add(":late_p20_over");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** WC_CODEの採番処理 */
    private void numbering() {

        if (this.wcCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"WC_CODE\") IS NULL THEN 0 ELSE MAX(e.\"WC_CODE\") * 1 END + 1, 3, '0') AS \"WC_CODE\" FROM MFG_OBSERVANCE_RATE_OUT e WHERE e.\"WC_CODE\" < '999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"YYYY\" = :yyyy");
        whereList.add("e.\"MM\" = :mm");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("WC_CODE");

        this.setWcCode(o);
    }

    /**
     * MFG_OBSERVANCE_RATE_OUT更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_MONTH_TIME_SCHの登録
        if (this.prdMonthTimeSch != null) {
            prdMonthTimeSch.setYyyy(this.getYyyy());
            prdMonthTimeSch.setMm(this.getMm());
            prdMonthTimeSch.setWcCode(this.getWcCode());
            try {
                prdMonthTimeSch.insert(now, id);
            } catch (Exception e) {
                prdMonthTimeSch.update(now, id);
            }
        }

        // MFG_OBSERVANCE_RATE_OUTの登録
        String sql = "UPDATE MFG_OBSERVANCE_RATE_OUT\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YYYY\" = :yyyy");
        setList.add("\"MM\" = :mm");
        setList.add("\"WC_CODE\" = :wc_code");
        setList.add("\"OBSERVANCE_RATE\" = :observance_rate");
        setList.add("\"LATE_M5OVER\" = :late_m5_over");
        setList.add("\"LATE_M5\" = :late_m5");
        setList.add("\"LATE_M4\" = :late_m4");
        setList.add("\"LATE_M3\" = :late_m3");
        setList.add("\"LATE_M2\" = :late_m2");
        setList.add("\"LATE_M1\" = :late_m1");
        setList.add("\"LATE_0\" = :late_0");
        setList.add("\"LATE_P1\" = :late_p1");
        setList.add("\"LATE_P2\" = :late_p2");
        setList.add("\"LATE_P3\" = :late_p3");
        setList.add("\"LATE_P4\" = :late_p4");
        setList.add("\"LATE_P5\" = :late_p5");
        setList.add("\"LATE_P6\" = :late_p6");
        setList.add("\"LATE_P7\" = :late_p7");
        setList.add("\"LATE_P8\" = :late_p8");
        setList.add("\"LATE_P9\" = :late_p9");
        setList.add("\"LATE_P10\" = :late_p10");
        setList.add("\"LATE_P11\" = :late_p11");
        setList.add("\"LATE_P12\" = :late_p12");
        setList.add("\"LATE_P13\" = :late_p13");
        setList.add("\"LATE_P14\" = :late_p14");
        setList.add("\"LATE_P15\" = :late_p15");
        setList.add("\"LATE_P16\" = :late_p16");
        setList.add("\"LATE_P17\" = :late_p17");
        setList.add("\"LATE_P18\" = :late_p18");
        setList.add("\"LATE_P19\" = :late_p19");
        setList.add("\"LATE_P20\" = :late_p20");
        setList.add("\"LATE_P20OVER\" = :late_p20_over");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MFG_OBSERVANCE_RATE_OUT削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_MONTH_TIME_SCHの削除
        if (this.prdMonthTimeSch != null) {
            this.prdMonthTimeSch.delete();
        }

        // MFG_OBSERVANCE_RATE_OUTの削除
        String sql = "DELETE FROM MFG_OBSERVANCE_RATE_OUT WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("TRIM (\"WC_CODE\") = TRIM (:wc_code)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("wc_code", this.wcCode);
        params.put("observance_rate", this.observanceRate);
        params.put("late_m5_over", this.lateM5Over);
        params.put("late_m5", this.lateM5);
        params.put("late_m4", this.lateM4);
        params.put("late_m3", this.lateM3);
        params.put("late_m2", this.lateM2);
        params.put("late_m1", this.lateM1);
        params.put("late_0", this.late0);
        params.put("late_p1", this.lateP1);
        params.put("late_p2", this.lateP2);
        params.put("late_p3", this.lateP3);
        params.put("late_p4", this.lateP4);
        params.put("late_p5", this.lateP5);
        params.put("late_p6", this.lateP6);
        params.put("late_p7", this.lateP7);
        params.put("late_p8", this.lateP8);
        params.put("late_p9", this.lateP9);
        params.put("late_p10", this.lateP10);
        params.put("late_p11", this.lateP11);
        params.put("late_p12", this.lateP12);
        params.put("late_p13", this.lateP13);
        params.put("late_p14", this.lateP14);
        params.put("late_p15", this.lateP15);
        params.put("late_p16", this.lateP16);
        params.put("late_p17", this.lateP17);
        params.put("late_p18", this.lateP18);
        params.put("late_p19", this.lateP19);
        params.put("late_p20", this.lateP20);
        params.put("late_p20_over", this.lateP20Over);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_MONTH_TIME_SCH
     */
    private PrdMonthTimeSch prdMonthTimeSch;

    /**
     * @return PRD_MONTH_TIME_SCH
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdMonthTimeSch")
    public PrdMonthTimeSch getPrdMonthTimeSch() {
        return this.prdMonthTimeSch;
    }

    /**
     * @param p PRD_MONTH_TIME_SCH
     */
    public void setPrdMonthTimeSch(final PrdMonthTimeSch p) {
        this.prdMonthTimeSch = p;
    }

    /**
     * @return PRD_MONTH_TIME_SCH
     */
    public PrdMonthTimeSch referPrdMonthTimeSch() {
        if (this.prdMonthTimeSch == null) {
            try {
                this.prdMonthTimeSch = PrdMonthTimeSch.get(this.yyyy, this.mm, this.wcCode);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdMonthTimeSch;
    }
}
