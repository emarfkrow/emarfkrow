package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SUPPLIER_BK
 *
 * @author emarfkrow
 */
public class MstSupplierBk implements IEntity {

    /** YY */
    private String yy;

    /**
     * @return YY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YY")
    public String getYy() {
        return this.yy;
    }

    /**
     * @param o YY
     */
    public void setYy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yy = String.valueOf(o.toString());
        } else {
            this.yy = null;
        }
    }

    /** SUP_CODE */
    private String supCode;

    /**
     * @return SUP_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_CODE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_KBN")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_NAME")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_RYAKU")
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
    @com.fasterxml.jackson.annotation.JsonProperty("ZIP_CODE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("ADDRESS1")
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
    @com.fasterxml.jackson.annotation.JsonProperty("ADDRESS2")
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
    @com.fasterxml.jackson.annotation.JsonProperty("TEL_NO")
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
    @com.fasterxml.jackson.annotation.JsonProperty("FAX_NO")
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
    @com.fasterxml.jackson.annotation.JsonProperty("DIV_NAME")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_OPE_NAME")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_OPE_MAIL_ADD")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_PERIOD_DAY")
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
    @com.fasterxml.jackson.annotation.JsonProperty("PAY_DAY")
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
    @com.fasterxml.jackson.annotation.JsonProperty("TAX_CODE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("TAX_CAL_CODE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("TAX_DISP_CODE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("FRACTION_KBN")
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
    @com.fasterxml.jackson.annotation.JsonProperty("YOSHINGENDO")
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
    @com.fasterxml.jackson.annotation.JsonProperty("COMPANY_OPE_CODE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("ORDER_ACCEPT_KBN")
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
    @com.fasterxml.jackson.annotation.JsonProperty("LIST_OUTPUT_KBN")
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
    @com.fasterxml.jackson.annotation.JsonProperty("PCH_COST_RATE_CODE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SEND_SUP_KBN")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SEND_SUP_NAME")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SEND_SUP_RYAKU")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SEND_ZIP_CODE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SEND_ADDRESS1")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SEND_ADDRESS2")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SEND_TEL_NO")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SEND_FAX_NO")
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
    @com.fasterxml.jackson.annotation.JsonProperty("SEND_INSPECT_LIST")
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
    @com.fasterxml.jackson.annotation.JsonProperty("COMPANY_DIV_NAME")
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_FLAG")
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
    @com.fasterxml.jackson.annotation.JsonProperty("NOHIN_YOBI_SUN")
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
    @com.fasterxml.jackson.annotation.JsonProperty("NOHIN_YOBI_MON")
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
    @com.fasterxml.jackson.annotation.JsonProperty("NOHIN_YOBI_TUE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("NOHIN_YOBI_WED")
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
    @com.fasterxml.jackson.annotation.JsonProperty("NOHIN_YOBI_THU")
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
    @com.fasterxml.jackson.annotation.JsonProperty("NOHIN_YOBI_FRI")
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
    @com.fasterxml.jackson.annotation.JsonProperty("NOHIN_YOBI_SAT")
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
    @com.fasterxml.jackson.annotation.JsonProperty("NOHIN_SEND_YOHI_KBN")
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
    @com.fasterxml.jackson.annotation.JsonProperty("BUNKATSU_MAIL_F")
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
    @com.fasterxml.jackson.annotation.JsonProperty("CHUMON_MAIL_F")
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
    @com.fasterxml.jackson.annotation.JsonProperty("CHUMON_MAIL_HM")
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
    @com.fasterxml.jackson.annotation.JsonProperty("KENSHU_MAIL_F")
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
    @com.fasterxml.jackson.annotation.JsonProperty("KENSHU_MAIL_HM")
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
    @com.fasterxml.jackson.annotation.JsonProperty("MAIL_BCC_F")
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
     * MST_SUPPLIER_BK照会
     *
     * @param param1 SUP_CODE
     * @param param2 YY
     * @return MST_SUPPLIER_BK
     */
    public static MstSupplierBk get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SUP_CODE\") = TRIM (:sup_code)");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");

        String sql = "SELECT * FROM MST_SUPPLIER_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sup_code", param1);
        params.put("yy", param2);

        return Queries.get(sql, params, MstSupplierBk.class);
    }

    /**
     * MST_SUPPLIER_BK追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // YYの採番処理
        numbering();

        // MST_SUPPLIER_BKの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YY\" -- :yy");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"SUP_KBN\" -- :sup_kbn");
        nameList.add("\"SUP_NAME\" -- :sup_name");
        nameList.add("\"SUP_RYAKU\" -- :sup_ryaku");
        nameList.add("\"ZIP_CODE\" -- :zip_code");
        nameList.add("\"ADDRESS1\" -- :address1");
        nameList.add("\"ADDRESS2\" -- :address2");
        nameList.add("\"TEL_NO\" -- :tel_no");
        nameList.add("\"FAX_NO\" -- :fax_no");
        nameList.add("\"DIV_NAME\" -- :div_name");
        nameList.add("\"SUP_OPE_NAME\" -- :sup_ope_name");
        nameList.add("\"SUP_OPE_MAIL_ADD\" -- :sup_ope_mail_add");
        nameList.add("\"SUP_PERIOD_DAY\" -- :sup_period_day");
        nameList.add("\"PAY_DAY\" -- :pay_day");
        nameList.add("\"TAX_CODE\" -- :tax_code");
        nameList.add("\"TAX_CAL_CODE\" -- :tax_cal_code");
        nameList.add("\"TAX_DISP_CODE\" -- :tax_disp_code");
        nameList.add("\"FRACTION_KBN\" -- :fraction_kbn");
        nameList.add("\"YOSHINGENDO\" -- :yoshingendo");
        nameList.add("\"COMPANY_OPE_CODE\" -- :company_ope_code");
        nameList.add("\"ORDER_ACCEPT_KBN\" -- :order_accept_kbn");
        nameList.add("\"LIST_OUTPUT_KBN\" -- :list_output_kbn");
        nameList.add("\"PCH_COST_RATE_CODE\" -- :pch_cost_rate_code");
        nameList.add("\"SEND_SUP_KBN\" -- :send_sup_kbn");
        nameList.add("\"SEND_SUP_NAME\" -- :send_sup_name");
        nameList.add("\"SEND_SUP_RYAKU\" -- :send_sup_ryaku");
        nameList.add("\"SEND_ZIP_CODE\" -- :send_zip_code");
        nameList.add("\"SEND_ADDRESS1\" -- :send_address1");
        nameList.add("\"SEND_ADDRESS2\" -- :send_address2");
        nameList.add("\"SEND_TEL_NO\" -- :send_tel_no");
        nameList.add("\"SEND_FAX_NO\" -- :send_fax_no");
        nameList.add("\"SEND_INSPECT_LIST\" -- :send_inspect_list");
        nameList.add("\"COMPANY_DIV_NAME\" -- :company_div_name");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        nameList.add("\"NOHIN_YOBI_SUN\" -- :nohin_yobi_sun");
        nameList.add("\"NOHIN_YOBI_MON\" -- :nohin_yobi_mon");
        nameList.add("\"NOHIN_YOBI_TUE\" -- :nohin_yobi_tue");
        nameList.add("\"NOHIN_YOBI_WED\" -- :nohin_yobi_wed");
        nameList.add("\"NOHIN_YOBI_THU\" -- :nohin_yobi_thu");
        nameList.add("\"NOHIN_YOBI_FRI\" -- :nohin_yobi_fri");
        nameList.add("\"NOHIN_YOBI_SAT\" -- :nohin_yobi_sat");
        nameList.add("\"NOHIN_SEND_YOHI_KBN\" -- :nohin_send_yohi_kbn");
        nameList.add("\"BUNKATSU_MAIL_F\" -- :bunkatsu_mail_f");
        nameList.add("\"CHUMON_MAIL_F\" -- :chumon_mail_f");
        nameList.add("\"CHUMON_MAIL_HM\" -- :chumon_mail_hm");
        nameList.add("\"KENSHU_MAIL_F\" -- :kenshu_mail_f");
        nameList.add("\"KENSHU_MAIL_HM\" -- :kenshu_mail_hm");
        nameList.add("\"MAIL_BCC_F\" -- :mail_bcc_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SUPPLIER_BK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
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

    /** YYの採番処理 */
    private void numbering() {

        if (this.yy != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"YY\") IS NULL THEN 0 ELSE MAX(e.\"YY\") * 1 END + 1, 4, '0') AS \"YY\" FROM MST_SUPPLIER_BK e WHERE e.\"YY\" < '9999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"SUP_CODE\" = :sup_code");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("sup_code", this.supCode);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("YY");

        this.setYy(o);
    }

    /**
     * MST_SUPPLIER_BK更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_SUPPLIER_BKの登録
        String sql = "UPDATE MST_SUPPLIER_BK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YY\" = :yy");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"SUP_KBN\" = :sup_kbn");
        setList.add("\"SUP_NAME\" = :sup_name");
        setList.add("\"SUP_RYAKU\" = :sup_ryaku");
        setList.add("\"ZIP_CODE\" = :zip_code");
        setList.add("\"ADDRESS1\" = :address1");
        setList.add("\"ADDRESS2\" = :address2");
        setList.add("\"TEL_NO\" = :tel_no");
        setList.add("\"FAX_NO\" = :fax_no");
        setList.add("\"DIV_NAME\" = :div_name");
        setList.add("\"SUP_OPE_NAME\" = :sup_ope_name");
        setList.add("\"SUP_OPE_MAIL_ADD\" = :sup_ope_mail_add");
        setList.add("\"SUP_PERIOD_DAY\" = :sup_period_day");
        setList.add("\"PAY_DAY\" = :pay_day");
        setList.add("\"TAX_CODE\" = :tax_code");
        setList.add("\"TAX_CAL_CODE\" = :tax_cal_code");
        setList.add("\"TAX_DISP_CODE\" = :tax_disp_code");
        setList.add("\"FRACTION_KBN\" = :fraction_kbn");
        setList.add("\"YOSHINGENDO\" = :yoshingendo");
        setList.add("\"COMPANY_OPE_CODE\" = :company_ope_code");
        setList.add("\"ORDER_ACCEPT_KBN\" = :order_accept_kbn");
        setList.add("\"LIST_OUTPUT_KBN\" = :list_output_kbn");
        setList.add("\"PCH_COST_RATE_CODE\" = :pch_cost_rate_code");
        setList.add("\"SEND_SUP_KBN\" = :send_sup_kbn");
        setList.add("\"SEND_SUP_NAME\" = :send_sup_name");
        setList.add("\"SEND_SUP_RYAKU\" = :send_sup_ryaku");
        setList.add("\"SEND_ZIP_CODE\" = :send_zip_code");
        setList.add("\"SEND_ADDRESS1\" = :send_address1");
        setList.add("\"SEND_ADDRESS2\" = :send_address2");
        setList.add("\"SEND_TEL_NO\" = :send_tel_no");
        setList.add("\"SEND_FAX_NO\" = :send_fax_no");
        setList.add("\"SEND_INSPECT_LIST\" = :send_inspect_list");
        setList.add("\"COMPANY_DIV_NAME\" = :company_div_name");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        setList.add("\"NOHIN_YOBI_SUN\" = :nohin_yobi_sun");
        setList.add("\"NOHIN_YOBI_MON\" = :nohin_yobi_mon");
        setList.add("\"NOHIN_YOBI_TUE\" = :nohin_yobi_tue");
        setList.add("\"NOHIN_YOBI_WED\" = :nohin_yobi_wed");
        setList.add("\"NOHIN_YOBI_THU\" = :nohin_yobi_thu");
        setList.add("\"NOHIN_YOBI_FRI\" = :nohin_yobi_fri");
        setList.add("\"NOHIN_YOBI_SAT\" = :nohin_yobi_sat");
        setList.add("\"NOHIN_SEND_YOHI_KBN\" = :nohin_send_yohi_kbn");
        setList.add("\"BUNKATSU_MAIL_F\" = :bunkatsu_mail_f");
        setList.add("\"CHUMON_MAIL_F\" = :chumon_mail_f");
        setList.add("\"CHUMON_MAIL_HM\" = :chumon_mail_hm");
        setList.add("\"KENSHU_MAIL_F\" = :kenshu_mail_f");
        setList.add("\"KENSHU_MAIL_HM\" = :kenshu_mail_hm");
        setList.add("\"MAIL_BCC_F\" = :mail_bcc_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SUPPLIER_BK削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_SUPPLIER_BKの削除
        String sql = "DELETE FROM MST_SUPPLIER_BK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SUP_CODE\") = TRIM (:sup_code)");
        whereList.add("TRIM (\"YY\") = TRIM (:yy)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", this.yy);
        params.put("sup_code", this.supCode);
        params.put("sup_kbn", this.supKbn);
        params.put("sup_name", this.supName);
        params.put("sup_ryaku", this.supRyaku);
        params.put("zip_code", this.zipCode);
        params.put("address1", this.address1);
        params.put("address2", this.address2);
        params.put("tel_no", this.telNo);
        params.put("fax_no", this.faxNo);
        params.put("div_name", this.divName);
        params.put("sup_ope_name", this.supOpeName);
        params.put("sup_ope_mail_add", this.supOpeMailAdd);
        params.put("sup_period_day", this.supPeriodDay);
        params.put("pay_day", this.payDay);
        params.put("tax_code", this.taxCode);
        params.put("tax_cal_code", this.taxCalCode);
        params.put("tax_disp_code", this.taxDispCode);
        params.put("fraction_kbn", this.fractionKbn);
        params.put("yoshingendo", this.yoshingendo);
        params.put("company_ope_code", this.companyOpeCode);
        params.put("order_accept_kbn", this.orderAcceptKbn);
        params.put("list_output_kbn", this.listOutputKbn);
        params.put("pch_cost_rate_code", this.pchCostRateCode);
        params.put("send_sup_kbn", this.sendSupKbn);
        params.put("send_sup_name", this.sendSupName);
        params.put("send_sup_ryaku", this.sendSupRyaku);
        params.put("send_zip_code", this.sendZipCode);
        params.put("send_address1", this.sendAddress1);
        params.put("send_address2", this.sendAddress2);
        params.put("send_tel_no", this.sendTelNo);
        params.put("send_fax_no", this.sendFaxNo);
        params.put("send_inspect_list", this.sendInspectList);
        params.put("company_div_name", this.companyDivName);
        params.put("delete_flag", this.deleteFlag);
        params.put("nohin_yobi_sun", this.nohinYobiSun);
        params.put("nohin_yobi_mon", this.nohinYobiMon);
        params.put("nohin_yobi_tue", this.nohinYobiTue);
        params.put("nohin_yobi_wed", this.nohinYobiWed);
        params.put("nohin_yobi_thu", this.nohinYobiThu);
        params.put("nohin_yobi_fri", this.nohinYobiFri);
        params.put("nohin_yobi_sat", this.nohinYobiSat);
        params.put("nohin_send_yohi_kbn", this.nohinSendYohiKbn);
        params.put("bunkatsu_mail_f", this.bunkatsuMailF);
        params.put("chumon_mail_f", this.chumonMailF);
        params.put("chumon_mail_hm", this.chumonMailHm);
        params.put("kenshu_mail_f", this.kenshuMailF);
        params.put("kenshu_mail_hm", this.kenshuMailHm);
        params.put("mail_bcc_f", this.mailBccF);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
