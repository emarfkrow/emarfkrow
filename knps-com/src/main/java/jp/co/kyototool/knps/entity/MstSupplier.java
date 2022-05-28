package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SUPPLIER
 *
 * @author emarfkrow
 */
public class MstSupplier implements IEntity {

    /** SUP_CODE */
    private String supCode;

    /**
     * @return SUP_CODE
     */
    public String getSupCode() {
        return this.supCode;
    }

    /**
     * @param o SUP_CODE
     */
    public void setSupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supCode = String.valueOf(o.toString());
        } else {
            this.supCode = null;
        }
    }

    /** SUP_KBN */
    private java.math.BigDecimal supKbn;

    /**
     * @return SUP_KBN
     */
    public java.math.BigDecimal getSupKbn() {
        return this.supKbn;
    }

    /**
     * @param o SUP_KBN
     */
    public void setSupKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.supKbn = null;
        }
    }

    /** SUP_NAME */
    private String supName;

    /**
     * @return SUP_NAME
     */
    public String getSupName() {
        return this.supName;
    }

    /**
     * @param o SUP_NAME
     */
    public void setSupName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supName = String.valueOf(o.toString());
        } else {
            this.supName = null;
        }
    }

    /** SUP_RYAKU */
    private String supRyaku;

    /**
     * @return SUP_RYAKU
     */
    public String getSupRyaku() {
        return this.supRyaku;
    }

    /**
     * @param o SUP_RYAKU
     */
    public void setSupRyaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supRyaku = String.valueOf(o.toString());
        } else {
            this.supRyaku = null;
        }
    }

    /** ZIP_CODE */
    private String zipCode;

    /**
     * @return ZIP_CODE
     */
    public String getZipCode() {
        return this.zipCode;
    }

    /**
     * @param o ZIP_CODE
     */
    public void setZipCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zipCode = String.valueOf(o.toString());
        } else {
            this.zipCode = null;
        }
    }

    /** ADDRESS1 */
    private String address1;

    /**
     * @return ADDRESS1
     */
    public String getAddress1() {
        return this.address1;
    }

    /**
     * @param o ADDRESS1
     */
    public void setAddress1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.address1 = String.valueOf(o.toString());
        } else {
            this.address1 = null;
        }
    }

    /** ADDRESS2 */
    private String address2;

    /**
     * @return ADDRESS2
     */
    public String getAddress2() {
        return this.address2;
    }

    /**
     * @param o ADDRESS2
     */
    public void setAddress2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.address2 = String.valueOf(o.toString());
        } else {
            this.address2 = null;
        }
    }

    /** TEL_NO */
    private String telNo;

    /**
     * @return TEL_NO
     */
    public String getTelNo() {
        return this.telNo;
    }

    /**
     * @param o TEL_NO
     */
    public void setTelNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.telNo = String.valueOf(o.toString());
        } else {
            this.telNo = null;
        }
    }

    /** FAX_NO */
    private String faxNo;

    /**
     * @return FAX_NO
     */
    public String getFaxNo() {
        return this.faxNo;
    }

    /**
     * @param o FAX_NO
     */
    public void setFaxNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.faxNo = String.valueOf(o.toString());
        } else {
            this.faxNo = null;
        }
    }

    /** DIV_NAME */
    private String divName;

    /**
     * @return DIV_NAME
     */
    public String getDivName() {
        return this.divName;
    }

    /**
     * @param o DIV_NAME
     */
    public void setDivName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.divName = String.valueOf(o.toString());
        } else {
            this.divName = null;
        }
    }

    /** SUP_OPE_NAME */
    private String supOpeName;

    /**
     * @return SUP_OPE_NAME
     */
    public String getSupOpeName() {
        return this.supOpeName;
    }

    /**
     * @param o SUP_OPE_NAME
     */
    public void setSupOpeName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supOpeName = String.valueOf(o.toString());
        } else {
            this.supOpeName = null;
        }
    }

    /** SUP_OPE_MAIL_ADD */
    private String supOpeMailAdd;

    /**
     * @return SUP_OPE_MAIL_ADD
     */
    public String getSupOpeMailAdd() {
        return this.supOpeMailAdd;
    }

    /**
     * @param o SUP_OPE_MAIL_ADD
     */
    public void setSupOpeMailAdd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supOpeMailAdd = String.valueOf(o.toString());
        } else {
            this.supOpeMailAdd = null;
        }
    }

    /** SUP_PERIOD_DAY */
    private String supPeriodDay;

    /**
     * @return SUP_PERIOD_DAY
     */
    public String getSupPeriodDay() {
        return this.supPeriodDay;
    }

    /**
     * @param o SUP_PERIOD_DAY
     */
    public void setSupPeriodDay(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supPeriodDay = String.valueOf(o.toString());
        } else {
            this.supPeriodDay = null;
        }
    }

    /** PAY_DAY */
    private String payDay;

    /**
     * @return PAY_DAY
     */
    public String getPayDay() {
        return this.payDay;
    }

    /**
     * @param o PAY_DAY
     */
    public void setPayDay(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.payDay = String.valueOf(o.toString());
        } else {
            this.payDay = null;
        }
    }

    /** TAX_CODE */
    private String taxCode;

    /**
     * @return TAX_CODE
     */
    public String getTaxCode() {
        return this.taxCode;
    }

    /**
     * @param o TAX_CODE
     */
    public void setTaxCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.taxCode = String.valueOf(o.toString());
        } else {
            this.taxCode = null;
        }
    }

    /** TAX_CAL_CODE */
    private java.math.BigDecimal taxCalCode;

    /**
     * @return TAX_CAL_CODE
     */
    public java.math.BigDecimal getTaxCalCode() {
        return this.taxCalCode;
    }

    /**
     * @param o TAX_CAL_CODE
     */
    public void setTaxCalCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.taxCalCode = new java.math.BigDecimal(o.toString());
        } else {
            this.taxCalCode = null;
        }
    }

    /** TAX_DISP_CODE */
    private java.math.BigDecimal taxDispCode;

    /**
     * @return TAX_DISP_CODE
     */
    public java.math.BigDecimal getTaxDispCode() {
        return this.taxDispCode;
    }

    /**
     * @param o TAX_DISP_CODE
     */
    public void setTaxDispCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.taxDispCode = new java.math.BigDecimal(o.toString());
        } else {
            this.taxDispCode = null;
        }
    }

    /** FRACTION_KBN */
    private java.math.BigDecimal fractionKbn;

    /**
     * @return FRACTION_KBN
     */
    public java.math.BigDecimal getFractionKbn() {
        return this.fractionKbn;
    }

    /**
     * @param o FRACTION_KBN
     */
    public void setFractionKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fractionKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.fractionKbn = null;
        }
    }

    /** YOSHINGENDO */
    private java.math.BigDecimal yoshingendo;

    /**
     * @return YOSHINGENDO
     */
    public java.math.BigDecimal getYoshingendo() {
        return this.yoshingendo;
    }

    /**
     * @param o YOSHINGENDO
     */
    public void setYoshingendo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yoshingendo = new java.math.BigDecimal(o.toString());
        } else {
            this.yoshingendo = null;
        }
    }

    /** COMPANY_OPE_CODE */
    private String companyOpeCode;

    /**
     * @return COMPANY_OPE_CODE
     */
    public String getCompanyOpeCode() {
        return this.companyOpeCode;
    }

    /**
     * @param o COMPANY_OPE_CODE
     */
    public void setCompanyOpeCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.companyOpeCode = String.valueOf(o.toString());
        } else {
            this.companyOpeCode = null;
        }
    }

    /** ORDER_ACCEPT_KBN */
    private java.math.BigDecimal orderAcceptKbn;

    /**
     * @return ORDER_ACCEPT_KBN
     */
    public java.math.BigDecimal getOrderAcceptKbn() {
        return this.orderAcceptKbn;
    }

    /**
     * @param o ORDER_ACCEPT_KBN
     */
    public void setOrderAcceptKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderAcceptKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.orderAcceptKbn = null;
        }
    }

    /** LIST_OUTPUT_KBN */
    private java.math.BigDecimal listOutputKbn;

    /**
     * @return LIST_OUTPUT_KBN
     */
    public java.math.BigDecimal getListOutputKbn() {
        return this.listOutputKbn;
    }

    /**
     * @param o LIST_OUTPUT_KBN
     */
    public void setListOutputKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.listOutputKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.listOutputKbn = null;
        }
    }

    /** PCH_COST_RATE_CODE */
    private String pchCostRateCode;

    /**
     * @return PCH_COST_RATE_CODE
     */
    public String getPchCostRateCode() {
        return this.pchCostRateCode;
    }

    /**
     * @param o PCH_COST_RATE_CODE
     */
    public void setPchCostRateCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.pchCostRateCode = String.valueOf(o.toString());
        } else {
            this.pchCostRateCode = null;
        }
    }

    /** SEND_SUP_KBN */
    private java.math.BigDecimal sendSupKbn;

    /**
     * @return SEND_SUP_KBN
     */
    public java.math.BigDecimal getSendSupKbn() {
        return this.sendSupKbn;
    }

    /**
     * @param o SEND_SUP_KBN
     */
    public void setSendSupKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendSupKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.sendSupKbn = null;
        }
    }

    /** SEND_SUP_NAME */
    private String sendSupName;

    /**
     * @return SEND_SUP_NAME
     */
    public String getSendSupName() {
        return this.sendSupName;
    }

    /**
     * @param o SEND_SUP_NAME
     */
    public void setSendSupName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendSupName = String.valueOf(o.toString());
        } else {
            this.sendSupName = null;
        }
    }

    /** SEND_SUP_RYAKU */
    private String sendSupRyaku;

    /**
     * @return SEND_SUP_RYAKU
     */
    public String getSendSupRyaku() {
        return this.sendSupRyaku;
    }

    /**
     * @param o SEND_SUP_RYAKU
     */
    public void setSendSupRyaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendSupRyaku = String.valueOf(o.toString());
        } else {
            this.sendSupRyaku = null;
        }
    }

    /** SEND_ZIP_CODE */
    private String sendZipCode;

    /**
     * @return SEND_ZIP_CODE
     */
    public String getSendZipCode() {
        return this.sendZipCode;
    }

    /**
     * @param o SEND_ZIP_CODE
     */
    public void setSendZipCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendZipCode = String.valueOf(o.toString());
        } else {
            this.sendZipCode = null;
        }
    }

    /** SEND_ADDRESS1 */
    private String sendAddress1;

    /**
     * @return SEND_ADDRESS1
     */
    public String getSendAddress1() {
        return this.sendAddress1;
    }

    /**
     * @param o SEND_ADDRESS1
     */
    public void setSendAddress1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendAddress1 = String.valueOf(o.toString());
        } else {
            this.sendAddress1 = null;
        }
    }

    /** SEND_ADDRESS2 */
    private String sendAddress2;

    /**
     * @return SEND_ADDRESS2
     */
    public String getSendAddress2() {
        return this.sendAddress2;
    }

    /**
     * @param o SEND_ADDRESS2
     */
    public void setSendAddress2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendAddress2 = String.valueOf(o.toString());
        } else {
            this.sendAddress2 = null;
        }
    }

    /** SEND_TEL_NO */
    private String sendTelNo;

    /**
     * @return SEND_TEL_NO
     */
    public String getSendTelNo() {
        return this.sendTelNo;
    }

    /**
     * @param o SEND_TEL_NO
     */
    public void setSendTelNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendTelNo = String.valueOf(o.toString());
        } else {
            this.sendTelNo = null;
        }
    }

    /** SEND_FAX_NO */
    private String sendFaxNo;

    /**
     * @return SEND_FAX_NO
     */
    public String getSendFaxNo() {
        return this.sendFaxNo;
    }

    /**
     * @param o SEND_FAX_NO
     */
    public void setSendFaxNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendFaxNo = String.valueOf(o.toString());
        } else {
            this.sendFaxNo = null;
        }
    }

    /** SEND_INSPECT_LIST */
    private java.math.BigDecimal sendInspectList;

    /**
     * @return SEND_INSPECT_LIST
     */
    public java.math.BigDecimal getSendInspectList() {
        return this.sendInspectList;
    }

    /**
     * @param o SEND_INSPECT_LIST
     */
    public void setSendInspectList(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sendInspectList = new java.math.BigDecimal(o.toString());
        } else {
            this.sendInspectList = null;
        }
    }

    /** COMPANY_DIV_NAME */
    private String companyDivName;

    /**
     * @return COMPANY_DIV_NAME
     */
    public String getCompanyDivName() {
        return this.companyDivName;
    }

    /**
     * @param o COMPANY_DIV_NAME
     */
    public void setCompanyDivName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.companyDivName = String.valueOf(o.toString());
        } else {
            this.companyDivName = null;
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public java.math.BigDecimal getDeleteFlag() {
        return this.deleteFlag;
    }

    /**
     * @param o DELETE_FLAG
     */
    public void setDeleteFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.deleteFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.deleteFlag = null;
        }
    }

    /** NOHIN_YOBI_SUN */
    private String nohinYobiSun;

    /**
     * @return NOHIN_YOBI_SUN
     */
    public String getNohinYobiSun() {
        return this.nohinYobiSun;
    }

    /**
     * @param o NOHIN_YOBI_SUN
     */
    public void setNohinYobiSun(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nohinYobiSun = String.valueOf(o.toString());
        } else {
            this.nohinYobiSun = null;
        }
    }

    /** NOHIN_YOBI_MON */
    private String nohinYobiMon;

    /**
     * @return NOHIN_YOBI_MON
     */
    public String getNohinYobiMon() {
        return this.nohinYobiMon;
    }

    /**
     * @param o NOHIN_YOBI_MON
     */
    public void setNohinYobiMon(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nohinYobiMon = String.valueOf(o.toString());
        } else {
            this.nohinYobiMon = null;
        }
    }

    /** NOHIN_YOBI_TUE */
    private String nohinYobiTue;

    /**
     * @return NOHIN_YOBI_TUE
     */
    public String getNohinYobiTue() {
        return this.nohinYobiTue;
    }

    /**
     * @param o NOHIN_YOBI_TUE
     */
    public void setNohinYobiTue(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nohinYobiTue = String.valueOf(o.toString());
        } else {
            this.nohinYobiTue = null;
        }
    }

    /** NOHIN_YOBI_WED */
    private String nohinYobiWed;

    /**
     * @return NOHIN_YOBI_WED
     */
    public String getNohinYobiWed() {
        return this.nohinYobiWed;
    }

    /**
     * @param o NOHIN_YOBI_WED
     */
    public void setNohinYobiWed(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nohinYobiWed = String.valueOf(o.toString());
        } else {
            this.nohinYobiWed = null;
        }
    }

    /** NOHIN_YOBI_THU */
    private String nohinYobiThu;

    /**
     * @return NOHIN_YOBI_THU
     */
    public String getNohinYobiThu() {
        return this.nohinYobiThu;
    }

    /**
     * @param o NOHIN_YOBI_THU
     */
    public void setNohinYobiThu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nohinYobiThu = String.valueOf(o.toString());
        } else {
            this.nohinYobiThu = null;
        }
    }

    /** NOHIN_YOBI_FRI */
    private String nohinYobiFri;

    /**
     * @return NOHIN_YOBI_FRI
     */
    public String getNohinYobiFri() {
        return this.nohinYobiFri;
    }

    /**
     * @param o NOHIN_YOBI_FRI
     */
    public void setNohinYobiFri(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nohinYobiFri = String.valueOf(o.toString());
        } else {
            this.nohinYobiFri = null;
        }
    }

    /** NOHIN_YOBI_SAT */
    private String nohinYobiSat;

    /**
     * @return NOHIN_YOBI_SAT
     */
    public String getNohinYobiSat() {
        return this.nohinYobiSat;
    }

    /**
     * @param o NOHIN_YOBI_SAT
     */
    public void setNohinYobiSat(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nohinYobiSat = String.valueOf(o.toString());
        } else {
            this.nohinYobiSat = null;
        }
    }

    /** NOHIN_SEND_YOHI_KBN */
    private String nohinSendYohiKbn;

    /**
     * @return NOHIN_SEND_YOHI_KBN
     */
    public String getNohinSendYohiKbn() {
        return this.nohinSendYohiKbn;
    }

    /**
     * @param o NOHIN_SEND_YOHI_KBN
     */
    public void setNohinSendYohiKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nohinSendYohiKbn = String.valueOf(o.toString());
        } else {
            this.nohinSendYohiKbn = null;
        }
    }

    /** BUNKATSU_MAIL_F */
    private String bunkatsuMailF;

    /**
     * @return BUNKATSU_MAIL_F
     */
    public String getBunkatsuMailF() {
        return this.bunkatsuMailF;
    }

    /**
     * @param o BUNKATSU_MAIL_F
     */
    public void setBunkatsuMailF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.bunkatsuMailF = String.valueOf(o.toString());
        } else {
            this.bunkatsuMailF = null;
        }
    }

    /** CHUMON_MAIL_F */
    private String chumonMailF;

    /**
     * @return CHUMON_MAIL_F
     */
    public String getChumonMailF() {
        return this.chumonMailF;
    }

    /**
     * @param o CHUMON_MAIL_F
     */
    public void setChumonMailF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chumonMailF = String.valueOf(o.toString());
        } else {
            this.chumonMailF = null;
        }
    }

    /** CHUMON_MAIL_HM */
    private String chumonMailHm;

    /**
     * @return CHUMON_MAIL_HM
     */
    public String getChumonMailHm() {
        return this.chumonMailHm;
    }

    /**
     * @param o CHUMON_MAIL_HM
     */
    public void setChumonMailHm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chumonMailHm = String.valueOf(o.toString());
        } else {
            this.chumonMailHm = null;
        }
    }

    /** KENSHU_MAIL_F */
    private String kenshuMailF;

    /**
     * @return KENSHU_MAIL_F
     */
    public String getKenshuMailF() {
        return this.kenshuMailF;
    }

    /**
     * @param o KENSHU_MAIL_F
     */
    public void setKenshuMailF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kenshuMailF = String.valueOf(o.toString());
        } else {
            this.kenshuMailF = null;
        }
    }

    /** KENSHU_MAIL_HM */
    private String kenshuMailHm;

    /**
     * @return KENSHU_MAIL_HM
     */
    public String getKenshuMailHm() {
        return this.kenshuMailHm;
    }

    /**
     * @param o KENSHU_MAIL_HM
     */
    public void setKenshuMailHm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kenshuMailHm = String.valueOf(o.toString());
        } else {
            this.kenshuMailHm = null;
        }
    }

    /** MAIL_BCC_F */
    private String mailBccF;

    /**
     * @return MAIL_BCC_F
     */
    public String getMailBccF() {
        return this.mailBccF;
    }

    /**
     * @param o MAIL_BCC_F
     */
    public void setMailBccF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mailBccF = String.valueOf(o.toString());
        } else {
            this.mailBccF = null;
        }
    }

    /**
     * MST_SUPPLIER照会
     *
     * @param param1 SUP_CODE
     * @return MST_SUPPLIER
     */
    public static MstSupplier get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (sup_code) = TRIM (:sup_code)");

        String sql = "SELECT * FROM MST_SUPPLIER WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sup_code", param1);

        return Queries.get(sql, params, MstSupplier.class);
    }

    /**
     * MST_SUPPLIER追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SUP_CODEの採番処理
        numbering();

        // INV_STOCK_PROCESS_SUPPLYの登録
        if (this.invStockProcessSupplys != null) {
            for (InvStockProcessSupply invStockProcessSupply : this.invStockProcessSupplys) {
                invStockProcessSupply.setSupCode(this.getSupCode());
                invStockProcessSupply.insert(now, id);
            }
        }

        // MST_SUPPLIER_BKの登録
        if (this.mstSupplierBks != null) {
            for (MstSupplierBk mstSupplierBk : this.mstSupplierBks) {
                mstSupplierBk.setSupCode(this.getSupCode());
                mstSupplierBk.insert(now, id);
            }
        }

        // MST_SUPPLIERの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("sup_code -- :sup_code");
        nameList.add("sup_kbn -- :sup_kbn");
        nameList.add("sup_name -- :sup_name");
        nameList.add("sup_ryaku -- :sup_ryaku");
        nameList.add("zip_code -- :zip_code");
        nameList.add("address1 -- :address1");
        nameList.add("address2 -- :address2");
        nameList.add("tel_no -- :tel_no");
        nameList.add("fax_no -- :fax_no");
        nameList.add("div_name -- :div_name");
        nameList.add("sup_ope_name -- :sup_ope_name");
        nameList.add("sup_ope_mail_add -- :sup_ope_mail_add");
        nameList.add("sup_period_day -- :sup_period_day");
        nameList.add("pay_day -- :pay_day");
        nameList.add("tax_code -- :tax_code");
        nameList.add("tax_cal_code -- :tax_cal_code");
        nameList.add("tax_disp_code -- :tax_disp_code");
        nameList.add("fraction_kbn -- :fraction_kbn");
        nameList.add("yoshingendo -- :yoshingendo");
        nameList.add("company_ope_code -- :company_ope_code");
        nameList.add("order_accept_kbn -- :order_accept_kbn");
        nameList.add("list_output_kbn -- :list_output_kbn");
        nameList.add("pch_cost_rate_code -- :pch_cost_rate_code");
        nameList.add("send_sup_kbn -- :send_sup_kbn");
        nameList.add("send_sup_name -- :send_sup_name");
        nameList.add("send_sup_ryaku -- :send_sup_ryaku");
        nameList.add("send_zip_code -- :send_zip_code");
        nameList.add("send_address1 -- :send_address1");
        nameList.add("send_address2 -- :send_address2");
        nameList.add("send_tel_no -- :send_tel_no");
        nameList.add("send_fax_no -- :send_fax_no");
        nameList.add("send_inspect_list -- :send_inspect_list");
        nameList.add("company_div_name -- :company_div_name");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        nameList.add("nohin_yobi_sun -- :nohin_yobi_sun");
        nameList.add("nohin_yobi_mon -- :nohin_yobi_mon");
        nameList.add("nohin_yobi_tue -- :nohin_yobi_tue");
        nameList.add("nohin_yobi_wed -- :nohin_yobi_wed");
        nameList.add("nohin_yobi_thu -- :nohin_yobi_thu");
        nameList.add("nohin_yobi_fri -- :nohin_yobi_fri");
        nameList.add("nohin_yobi_sat -- :nohin_yobi_sat");
        nameList.add("nohin_send_yohi_kbn -- :nohin_send_yohi_kbn");
        nameList.add("bunkatsu_mail_f -- :bunkatsu_mail_f");
        nameList.add("chumon_mail_f -- :chumon_mail_f");
        nameList.add("chumon_mail_hm -- :chumon_mail_hm");
        nameList.add("kenshu_mail_f -- :kenshu_mail_f");
        nameList.add("kenshu_mail_hm -- :kenshu_mail_hm");
        nameList.add("mail_bcc_f -- :mail_bcc_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SUPPLIER(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sup_code");
        valueList.add(":sup_kbn");
        valueList.add(":sup_name");
        valueList.add(":sup_ryaku");
        valueList.add(":zip_code");
        valueList.add(":address1");
        valueList.add(":address2");
        valueList.add(":tel_no");
        valueList.add(":fax_no");
        valueList.add(":div_name");
        valueList.add(":sup_ope_name");
        valueList.add(":sup_ope_mail_add");
        valueList.add(":sup_period_day");
        valueList.add(":pay_day");
        valueList.add(":tax_code");
        valueList.add(":tax_cal_code");
        valueList.add(":tax_disp_code");
        valueList.add(":fraction_kbn");
        valueList.add(":yoshingendo");
        valueList.add(":company_ope_code");
        valueList.add(":order_accept_kbn");
        valueList.add(":list_output_kbn");
        valueList.add(":pch_cost_rate_code");
        valueList.add(":send_sup_kbn");
        valueList.add(":send_sup_name");
        valueList.add(":send_sup_ryaku");
        valueList.add(":send_zip_code");
        valueList.add(":send_address1");
        valueList.add(":send_address2");
        valueList.add(":send_tel_no");
        valueList.add(":send_fax_no");
        valueList.add(":send_inspect_list");
        valueList.add(":company_div_name");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        valueList.add(":nohin_yobi_sun");
        valueList.add(":nohin_yobi_mon");
        valueList.add(":nohin_yobi_tue");
        valueList.add(":nohin_yobi_wed");
        valueList.add(":nohin_yobi_thu");
        valueList.add(":nohin_yobi_fri");
        valueList.add(":nohin_yobi_sat");
        valueList.add(":nohin_send_yohi_kbn");
        valueList.add(":bunkatsu_mail_f");
        valueList.add(":chumon_mail_f");
        valueList.add(":chumon_mail_hm");
        valueList.add(":kenshu_mail_f");
        valueList.add(":kenshu_mail_hm");
        valueList.add(":mail_bcc_f");
        return String.join("\r\n    , ", valueList);
    }

    /** SUP_CODEの採番処理 */
    private void numbering() {

        if (this.supCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.SUP_CODE) IS NULL THEN 0 ELSE MAX(e.SUP_CODE) * 1 END + 1, 6, '0') AS SUP_CODE FROM MST_SUPPLIER e WHERE e.SUP_CODE < '999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SUP_CODE");

        this.setSupCode(o);
    }

    /**
     * MST_SUPPLIER更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_STOCK_PROCESS_SUPPLYの登録
        if (this.invStockProcessSupplys != null) {
            for (InvStockProcessSupply invStockProcessSupply : this.invStockProcessSupplys) {
                invStockProcessSupply.setSupCode(this.supCode);
                try {
                    invStockProcessSupply.insert(now, id);
                } catch (Exception e) {
                    invStockProcessSupply.update(now, id);
                }
            }
            this.invStockProcessSupplys = null;
            this.referInvStockProcessSupplys();
            if (this.invStockProcessSupplys != null) {
                for (InvStockProcessSupply invStockProcessSupply : this.invStockProcessSupplys) {
                    if (!invStockProcessSupply.getTimeStampChange().equals(now)) {
                        invStockProcessSupply.delete();
                    }
                }
            }
        }

        // MST_SUPPLIER_BKの登録
        if (this.mstSupplierBks != null) {
            for (MstSupplierBk mstSupplierBk : this.mstSupplierBks) {
                mstSupplierBk.setSupCode(this.supCode);
                try {
                    mstSupplierBk.insert(now, id);
                } catch (Exception e) {
                    mstSupplierBk.update(now, id);
                }
            }
            this.mstSupplierBks = null;
            this.referMstSupplierBks();
            if (this.mstSupplierBks != null) {
                for (MstSupplierBk mstSupplierBk : this.mstSupplierBks) {
                    if (!mstSupplierBk.getTimeStampChange().equals(now)) {
                        mstSupplierBk.delete();
                    }
                }
            }
        }

        // MST_SUPPLIERの登録
        String sql = "UPDATE MST_SUPPLIER\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("sup_code = :sup_code");
        setList.add("sup_kbn = :sup_kbn");
        setList.add("sup_name = :sup_name");
        setList.add("sup_ryaku = :sup_ryaku");
        setList.add("zip_code = :zip_code");
        setList.add("address1 = :address1");
        setList.add("address2 = :address2");
        setList.add("tel_no = :tel_no");
        setList.add("fax_no = :fax_no");
        setList.add("div_name = :div_name");
        setList.add("sup_ope_name = :sup_ope_name");
        setList.add("sup_ope_mail_add = :sup_ope_mail_add");
        setList.add("sup_period_day = :sup_period_day");
        setList.add("pay_day = :pay_day");
        setList.add("tax_code = :tax_code");
        setList.add("tax_cal_code = :tax_cal_code");
        setList.add("tax_disp_code = :tax_disp_code");
        setList.add("fraction_kbn = :fraction_kbn");
        setList.add("yoshingendo = :yoshingendo");
        setList.add("company_ope_code = :company_ope_code");
        setList.add("order_accept_kbn = :order_accept_kbn");
        setList.add("list_output_kbn = :list_output_kbn");
        setList.add("pch_cost_rate_code = :pch_cost_rate_code");
        setList.add("send_sup_kbn = :send_sup_kbn");
        setList.add("send_sup_name = :send_sup_name");
        setList.add("send_sup_ryaku = :send_sup_ryaku");
        setList.add("send_zip_code = :send_zip_code");
        setList.add("send_address1 = :send_address1");
        setList.add("send_address2 = :send_address2");
        setList.add("send_tel_no = :send_tel_no");
        setList.add("send_fax_no = :send_fax_no");
        setList.add("send_inspect_list = :send_inspect_list");
        setList.add("company_div_name = :company_div_name");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        setList.add("nohin_yobi_sun = :nohin_yobi_sun");
        setList.add("nohin_yobi_mon = :nohin_yobi_mon");
        setList.add("nohin_yobi_tue = :nohin_yobi_tue");
        setList.add("nohin_yobi_wed = :nohin_yobi_wed");
        setList.add("nohin_yobi_thu = :nohin_yobi_thu");
        setList.add("nohin_yobi_fri = :nohin_yobi_fri");
        setList.add("nohin_yobi_sat = :nohin_yobi_sat");
        setList.add("nohin_send_yohi_kbn = :nohin_send_yohi_kbn");
        setList.add("bunkatsu_mail_f = :bunkatsu_mail_f");
        setList.add("chumon_mail_f = :chumon_mail_f");
        setList.add("chumon_mail_hm = :chumon_mail_hm");
        setList.add("kenshu_mail_f = :kenshu_mail_f");
        setList.add("kenshu_mail_hm = :kenshu_mail_hm");
        setList.add("mail_bcc_f = :mail_bcc_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SUPPLIER削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_STOCK_PROCESS_SUPPLYの削除
        if (this.invStockProcessSupplys != null) {
            for (InvStockProcessSupply invStockProcessSupply : this.invStockProcessSupplys) {
                invStockProcessSupply.delete();
            }
        }

        // MST_SUPPLIER_BKの削除
        if (this.mstSupplierBks != null) {
            for (MstSupplierBk mstSupplierBk : this.mstSupplierBks) {
                mstSupplierBk.delete();
            }
        }

        // MST_SUPPLIERの削除
        String sql = "DELETE FROM MST_SUPPLIER WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (sup_code) = TRIM (:sup_code)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SUP_CODE", this.supCode);
        params.put("SUP_KBN", this.supKbn);
        params.put("SUP_NAME", this.supName);
        params.put("SUP_RYAKU", this.supRyaku);
        params.put("ZIP_CODE", this.zipCode);
        params.put("ADDRESS1", this.address1);
        params.put("ADDRESS2", this.address2);
        params.put("TEL_NO", this.telNo);
        params.put("FAX_NO", this.faxNo);
        params.put("DIV_NAME", this.divName);
        params.put("SUP_OPE_NAME", this.supOpeName);
        params.put("SUP_OPE_MAIL_ADD", this.supOpeMailAdd);
        params.put("SUP_PERIOD_DAY", this.supPeriodDay);
        params.put("PAY_DAY", this.payDay);
        params.put("TAX_CODE", this.taxCode);
        params.put("TAX_CAL_CODE", this.taxCalCode);
        params.put("TAX_DISP_CODE", this.taxDispCode);
        params.put("FRACTION_KBN", this.fractionKbn);
        params.put("YOSHINGENDO", this.yoshingendo);
        params.put("COMPANY_OPE_CODE", this.companyOpeCode);
        params.put("ORDER_ACCEPT_KBN", this.orderAcceptKbn);
        params.put("LIST_OUTPUT_KBN", this.listOutputKbn);
        params.put("PCH_COST_RATE_CODE", this.pchCostRateCode);
        params.put("SEND_SUP_KBN", this.sendSupKbn);
        params.put("SEND_SUP_NAME", this.sendSupName);
        params.put("SEND_SUP_RYAKU", this.sendSupRyaku);
        params.put("SEND_ZIP_CODE", this.sendZipCode);
        params.put("SEND_ADDRESS1", this.sendAddress1);
        params.put("SEND_ADDRESS2", this.sendAddress2);
        params.put("SEND_TEL_NO", this.sendTelNo);
        params.put("SEND_FAX_NO", this.sendFaxNo);
        params.put("SEND_INSPECT_LIST", this.sendInspectList);
        params.put("COMPANY_DIV_NAME", this.companyDivName);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("NOHIN_YOBI_SUN", this.nohinYobiSun);
        params.put("NOHIN_YOBI_MON", this.nohinYobiMon);
        params.put("NOHIN_YOBI_TUE", this.nohinYobiTue);
        params.put("NOHIN_YOBI_WED", this.nohinYobiWed);
        params.put("NOHIN_YOBI_THU", this.nohinYobiThu);
        params.put("NOHIN_YOBI_FRI", this.nohinYobiFri);
        params.put("NOHIN_YOBI_SAT", this.nohinYobiSat);
        params.put("NOHIN_SEND_YOHI_KBN", this.nohinSendYohiKbn);
        params.put("BUNKATSU_MAIL_F", this.bunkatsuMailF);
        params.put("CHUMON_MAIL_F", this.chumonMailF);
        params.put("CHUMON_MAIL_HM", this.chumonMailHm);
        params.put("KENSHU_MAIL_F", this.kenshuMailF);
        params.put("KENSHU_MAIL_HM", this.kenshuMailHm);
        params.put("MAIL_BCC_F", this.mailBccF);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * INV_STOCK_PROCESS_SUPPLYのリスト
     */
    private List<InvStockProcessSupply> invStockProcessSupplys;

    /**
     * @return INV_STOCK_PROCESS_SUPPLYのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("InvStockProcessSupplys")
    public List<InvStockProcessSupply> getInvStockProcessSupplys() {
        return this.invStockProcessSupplys;
    }

    /**
     * @param list INV_STOCK_PROCESS_SUPPLYのリスト
     */
    public void setInvStockProcessSupplys(final List<InvStockProcessSupply> list) {
        this.invStockProcessSupplys = list;
    }

    /**
     * @param invStockProcessSupply
     */
    public void addInvStockProcessSupplys(final InvStockProcessSupply invStockProcessSupply) {
        if (this.invStockProcessSupplys == null) {
            this.invStockProcessSupplys = new ArrayList<InvStockProcessSupply>();
        }
        this.invStockProcessSupplys.add(invStockProcessSupply);
    }

    /**
     * @return INV_STOCK_PROCESS_SUPPLYのリスト
     */
    public List<InvStockProcessSupply> referInvStockProcessSupplys() {
        if (this.invStockProcessSupplys == null) {
            this.invStockProcessSupplys = MstSupplier.referInvStockProcessSupplys(this.supCode);
        }
        return this.invStockProcessSupplys;
    }

    /**
     * @param param1 supCode
     * @return List<InvStockProcessSupply>
     */
    public static List<InvStockProcessSupply> referInvStockProcessSupplys(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sup_code = :sup_code");

        String sql = "SELECT * FROM INV_STOCK_PROCESS_SUPPLY WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sup_code", param1);

        return Queries.select(sql, params, InvStockProcessSupply.class);
    }

    /**
     * MST_SUPPLIER_BKのリスト
     */
    private List<MstSupplierBk> mstSupplierBks;

    /**
     * @return MST_SUPPLIER_BKのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstSupplierBks")
    public List<MstSupplierBk> getMstSupplierBks() {
        return this.mstSupplierBks;
    }

    /**
     * @param list MST_SUPPLIER_BKのリスト
     */
    public void setMstSupplierBks(final List<MstSupplierBk> list) {
        this.mstSupplierBks = list;
    }

    /**
     * @param mstSupplierBk
     */
    public void addMstSupplierBks(final MstSupplierBk mstSupplierBk) {
        if (this.mstSupplierBks == null) {
            this.mstSupplierBks = new ArrayList<MstSupplierBk>();
        }
        this.mstSupplierBks.add(mstSupplierBk);
    }

    /**
     * @return MST_SUPPLIER_BKのリスト
     */
    public List<MstSupplierBk> referMstSupplierBks() {
        if (this.mstSupplierBks == null) {
            this.mstSupplierBks = MstSupplier.referMstSupplierBks(this.supCode);
        }
        return this.mstSupplierBks;
    }

    /**
     * @param param1 supCode
     * @return List<MstSupplierBk>
     */
    public static List<MstSupplierBk> referMstSupplierBks(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sup_code = :sup_code");

        String sql = "SELECT * FROM MST_SUPPLIER_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sup_code", param1);

        return Queries.select(sql, params, MstSupplierBk.class);
    }
}
