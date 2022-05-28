package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUPPLIER_BK登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupplierBkRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupplierBkRegistForm.class);

    /** YY */
    @jakarta.validation.constraints.Size(max = 4)
    private String yy;

    /**
     * @return YY
     */
    public String getYy() {
        return yy;
    }

    /**
     * @param p YY
     */
    public void setYy(final String p) {
        this.yy = p;
    }

    /** SUP_CODE */
    @jakarta.validation.constraints.Size(max = 6)
    private String supCode;

    /**
     * @return SUP_CODE
     */
    public String getSupCode() {
        return supCode;
    }

    /**
     * @param p SUP_CODE
     */
    public void setSupCode(final String p) {
        this.supCode = p;
    }

    /** SUP_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String supKbn;

    /**
     * @return SUP_KBN
     */
    public String getSupKbn() {
        return supKbn;
    }

    /**
     * @param p SUP_KBN
     */
    public void setSupKbn(final String p) {
        this.supKbn = p;
    }

    /** SUP_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String supName;

    /**
     * @return SUP_NAME
     */
    public String getSupName() {
        return supName;
    }

    /**
     * @param p SUP_NAME
     */
    public void setSupName(final String p) {
        this.supName = p;
    }

    /** SUP_RYAKU */
    @jakarta.validation.constraints.Size(max = 20)
    private String supRyaku;

    /**
     * @return SUP_RYAKU
     */
    public String getSupRyaku() {
        return supRyaku;
    }

    /**
     * @param p SUP_RYAKU
     */
    public void setSupRyaku(final String p) {
        this.supRyaku = p;
    }

    /** ZIP_CODE */
    @jakarta.validation.constraints.Size(max = 8)
    private String zipCode;

    /**
     * @return ZIP_CODE
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param p ZIP_CODE
     */
    public void setZipCode(final String p) {
        this.zipCode = p;
    }

    /** ADDRESS1 */
    @jakarta.validation.constraints.Size(max = 60)
    private String address1;

    /**
     * @return ADDRESS1
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * @param p ADDRESS1
     */
    public void setAddress1(final String p) {
        this.address1 = p;
    }

    /** ADDRESS2 */
    @jakarta.validation.constraints.Size(max = 60)
    private String address2;

    /**
     * @return ADDRESS2
     */
    public String getAddress2() {
        return address2;
    }

    /**
     * @param p ADDRESS2
     */
    public void setAddress2(final String p) {
        this.address2 = p;
    }

    /** TEL_NO */
    @jakarta.validation.constraints.Size(max = 14)
    private String telNo;

    /**
     * @return TEL_NO
     */
    public String getTelNo() {
        return telNo;
    }

    /**
     * @param p TEL_NO
     */
    public void setTelNo(final String p) {
        this.telNo = p;
    }

    /** FAX_NO */
    @jakarta.validation.constraints.Size(max = 14)
    private String faxNo;

    /**
     * @return FAX_NO
     */
    public String getFaxNo() {
        return faxNo;
    }

    /**
     * @param p FAX_NO
     */
    public void setFaxNo(final String p) {
        this.faxNo = p;
    }

    /** DIV_NAME */
    @jakarta.validation.constraints.Size(max = 30)
    private String divName;

    /**
     * @return DIV_NAME
     */
    public String getDivName() {
        return divName;
    }

    /**
     * @param p DIV_NAME
     */
    public void setDivName(final String p) {
        this.divName = p;
    }

    /** SUP_OPE_NAME */
    @jakarta.validation.constraints.Size(max = 30)
    private String supOpeName;

    /**
     * @return SUP_OPE_NAME
     */
    public String getSupOpeName() {
        return supOpeName;
    }

    /**
     * @param p SUP_OPE_NAME
     */
    public void setSupOpeName(final String p) {
        this.supOpeName = p;
    }

    /** SUP_OPE_MAIL_ADD */
    @jakarta.validation.constraints.Size(max = 30)
    private String supOpeMailAdd;

    /**
     * @return SUP_OPE_MAIL_ADD
     */
    public String getSupOpeMailAdd() {
        return supOpeMailAdd;
    }

    /**
     * @param p SUP_OPE_MAIL_ADD
     */
    public void setSupOpeMailAdd(final String p) {
        this.supOpeMailAdd = p;
    }

    /** SUP_PERIOD_DAY */
    @jakarta.validation.constraints.Size(max = 2)
    private String supPeriodDay;

    /**
     * @return SUP_PERIOD_DAY
     */
    public String getSupPeriodDay() {
        return supPeriodDay;
    }

    /**
     * @param p SUP_PERIOD_DAY
     */
    public void setSupPeriodDay(final String p) {
        this.supPeriodDay = p;
    }

    /** PAY_DAY */
    @jakarta.validation.constraints.Size(max = 2)
    private String payDay;

    /**
     * @return PAY_DAY
     */
    public String getPayDay() {
        return payDay;
    }

    /**
     * @param p PAY_DAY
     */
    public void setPayDay(final String p) {
        this.payDay = p;
    }

    /** TAX_CODE */
    @jakarta.validation.constraints.Size(max = 2)
    private String taxCode;

    /**
     * @return TAX_CODE
     */
    public String getTaxCode() {
        return taxCode;
    }

    /**
     * @param p TAX_CODE
     */
    public void setTaxCode(final String p) {
        this.taxCode = p;
    }

    /** TAX_CAL_CODE */
    @jakarta.validation.constraints.Size(max = 1)
    private String taxCalCode;

    /**
     * @return TAX_CAL_CODE
     */
    public String getTaxCalCode() {
        return taxCalCode;
    }

    /**
     * @param p TAX_CAL_CODE
     */
    public void setTaxCalCode(final String p) {
        this.taxCalCode = p;
    }

    /** TAX_DISP_CODE */
    @jakarta.validation.constraints.Size(max = 1)
    private String taxDispCode;

    /**
     * @return TAX_DISP_CODE
     */
    public String getTaxDispCode() {
        return taxDispCode;
    }

    /**
     * @param p TAX_DISP_CODE
     */
    public void setTaxDispCode(final String p) {
        this.taxDispCode = p;
    }

    /** FRACTION_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String fractionKbn;

    /**
     * @return FRACTION_KBN
     */
    public String getFractionKbn() {
        return fractionKbn;
    }

    /**
     * @param p FRACTION_KBN
     */
    public void setFractionKbn(final String p) {
        this.fractionKbn = p;
    }

    /** YOSHINGENDO */
    @jakarta.validation.constraints.Size(max = 11)
    private String yoshingendo;

    /**
     * @return YOSHINGENDO
     */
    public String getYoshingendo() {
        return yoshingendo;
    }

    /**
     * @param p YOSHINGENDO
     */
    public void setYoshingendo(final String p) {
        this.yoshingendo = p;
    }

    /** COMPANY_OPE_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String companyOpeCode;

    /**
     * @return COMPANY_OPE_CODE
     */
    public String getCompanyOpeCode() {
        return companyOpeCode;
    }

    /**
     * @param p COMPANY_OPE_CODE
     */
    public void setCompanyOpeCode(final String p) {
        this.companyOpeCode = p;
    }

    /** ORDER_ACCEPT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String orderAcceptKbn;

    /**
     * @return ORDER_ACCEPT_KBN
     */
    public String getOrderAcceptKbn() {
        return orderAcceptKbn;
    }

    /**
     * @param p ORDER_ACCEPT_KBN
     */
    public void setOrderAcceptKbn(final String p) {
        this.orderAcceptKbn = p;
    }

    /** LIST_OUTPUT_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String listOutputKbn;

    /**
     * @return LIST_OUTPUT_KBN
     */
    public String getListOutputKbn() {
        return listOutputKbn;
    }

    /**
     * @param p LIST_OUTPUT_KBN
     */
    public void setListOutputKbn(final String p) {
        this.listOutputKbn = p;
    }

    /** PCH_COST_RATE_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String pchCostRateCode;

    /**
     * @return PCH_COST_RATE_CODE
     */
    public String getPchCostRateCode() {
        return pchCostRateCode;
    }

    /**
     * @param p PCH_COST_RATE_CODE
     */
    public void setPchCostRateCode(final String p) {
        this.pchCostRateCode = p;
    }

    /** SEND_SUP_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String sendSupKbn;

    /**
     * @return SEND_SUP_KBN
     */
    public String getSendSupKbn() {
        return sendSupKbn;
    }

    /**
     * @param p SEND_SUP_KBN
     */
    public void setSendSupKbn(final String p) {
        this.sendSupKbn = p;
    }

    /** SEND_SUP_NAME */
    @jakarta.validation.constraints.Size(max = 60)
    private String sendSupName;

    /**
     * @return SEND_SUP_NAME
     */
    public String getSendSupName() {
        return sendSupName;
    }

    /**
     * @param p SEND_SUP_NAME
     */
    public void setSendSupName(final String p) {
        this.sendSupName = p;
    }

    /** SEND_SUP_RYAKU */
    @jakarta.validation.constraints.Size(max = 20)
    private String sendSupRyaku;

    /**
     * @return SEND_SUP_RYAKU
     */
    public String getSendSupRyaku() {
        return sendSupRyaku;
    }

    /**
     * @param p SEND_SUP_RYAKU
     */
    public void setSendSupRyaku(final String p) {
        this.sendSupRyaku = p;
    }

    /** SEND_ZIP_CODE */
    @jakarta.validation.constraints.Size(max = 8)
    private String sendZipCode;

    /**
     * @return SEND_ZIP_CODE
     */
    public String getSendZipCode() {
        return sendZipCode;
    }

    /**
     * @param p SEND_ZIP_CODE
     */
    public void setSendZipCode(final String p) {
        this.sendZipCode = p;
    }

    /** SEND_ADDRESS1 */
    @jakarta.validation.constraints.Size(max = 60)
    private String sendAddress1;

    /**
     * @return SEND_ADDRESS1
     */
    public String getSendAddress1() {
        return sendAddress1;
    }

    /**
     * @param p SEND_ADDRESS1
     */
    public void setSendAddress1(final String p) {
        this.sendAddress1 = p;
    }

    /** SEND_ADDRESS2 */
    @jakarta.validation.constraints.Size(max = 60)
    private String sendAddress2;

    /**
     * @return SEND_ADDRESS2
     */
    public String getSendAddress2() {
        return sendAddress2;
    }

    /**
     * @param p SEND_ADDRESS2
     */
    public void setSendAddress2(final String p) {
        this.sendAddress2 = p;
    }

    /** SEND_TEL_NO */
    @jakarta.validation.constraints.Size(max = 14)
    private String sendTelNo;

    /**
     * @return SEND_TEL_NO
     */
    public String getSendTelNo() {
        return sendTelNo;
    }

    /**
     * @param p SEND_TEL_NO
     */
    public void setSendTelNo(final String p) {
        this.sendTelNo = p;
    }

    /** SEND_FAX_NO */
    @jakarta.validation.constraints.Size(max = 14)
    private String sendFaxNo;

    /**
     * @return SEND_FAX_NO
     */
    public String getSendFaxNo() {
        return sendFaxNo;
    }

    /**
     * @param p SEND_FAX_NO
     */
    public void setSendFaxNo(final String p) {
        this.sendFaxNo = p;
    }

    /** SEND_INSPECT_LIST */
    @jakarta.validation.constraints.Size(max = 1)
    private String sendInspectList;

    /**
     * @return SEND_INSPECT_LIST
     */
    public String getSendInspectList() {
        return sendInspectList;
    }

    /**
     * @param p SEND_INSPECT_LIST
     */
    public void setSendInspectList(final String p) {
        this.sendInspectList = p;
    }

    /** COMPANY_DIV_NAME */
    @jakarta.validation.constraints.Size(max = 30)
    private String companyDivName;

    /**
     * @return COMPANY_DIV_NAME
     */
    public String getCompanyDivName() {
        return companyDivName;
    }

    /**
     * @param p COMPANY_DIV_NAME
     */
    public void setCompanyDivName(final String p) {
        this.companyDivName = p;
    }

    /** DELETE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param p DELETE_FLAG
     */
    public void setDeleteFlag(final String p) {
        this.deleteFlag = p;
    }

    /** NOHIN_YOBI_SUN */
    @jakarta.validation.constraints.Size(max = 1)
    private String nohinYobiSun;

    /**
     * @return NOHIN_YOBI_SUN
     */
    public String getNohinYobiSun() {
        return nohinYobiSun;
    }

    /**
     * @param p NOHIN_YOBI_SUN
     */
    public void setNohinYobiSun(final String p) {
        this.nohinYobiSun = p;
    }

    /** NOHIN_YOBI_MON */
    @jakarta.validation.constraints.Size(max = 1)
    private String nohinYobiMon;

    /**
     * @return NOHIN_YOBI_MON
     */
    public String getNohinYobiMon() {
        return nohinYobiMon;
    }

    /**
     * @param p NOHIN_YOBI_MON
     */
    public void setNohinYobiMon(final String p) {
        this.nohinYobiMon = p;
    }

    /** NOHIN_YOBI_TUE */
    @jakarta.validation.constraints.Size(max = 1)
    private String nohinYobiTue;

    /**
     * @return NOHIN_YOBI_TUE
     */
    public String getNohinYobiTue() {
        return nohinYobiTue;
    }

    /**
     * @param p NOHIN_YOBI_TUE
     */
    public void setNohinYobiTue(final String p) {
        this.nohinYobiTue = p;
    }

    /** NOHIN_YOBI_WED */
    @jakarta.validation.constraints.Size(max = 1)
    private String nohinYobiWed;

    /**
     * @return NOHIN_YOBI_WED
     */
    public String getNohinYobiWed() {
        return nohinYobiWed;
    }

    /**
     * @param p NOHIN_YOBI_WED
     */
    public void setNohinYobiWed(final String p) {
        this.nohinYobiWed = p;
    }

    /** NOHIN_YOBI_THU */
    @jakarta.validation.constraints.Size(max = 1)
    private String nohinYobiThu;

    /**
     * @return NOHIN_YOBI_THU
     */
    public String getNohinYobiThu() {
        return nohinYobiThu;
    }

    /**
     * @param p NOHIN_YOBI_THU
     */
    public void setNohinYobiThu(final String p) {
        this.nohinYobiThu = p;
    }

    /** NOHIN_YOBI_FRI */
    @jakarta.validation.constraints.Size(max = 1)
    private String nohinYobiFri;

    /**
     * @return NOHIN_YOBI_FRI
     */
    public String getNohinYobiFri() {
        return nohinYobiFri;
    }

    /**
     * @param p NOHIN_YOBI_FRI
     */
    public void setNohinYobiFri(final String p) {
        this.nohinYobiFri = p;
    }

    /** NOHIN_YOBI_SAT */
    @jakarta.validation.constraints.Size(max = 1)
    private String nohinYobiSat;

    /**
     * @return NOHIN_YOBI_SAT
     */
    public String getNohinYobiSat() {
        return nohinYobiSat;
    }

    /**
     * @param p NOHIN_YOBI_SAT
     */
    public void setNohinYobiSat(final String p) {
        this.nohinYobiSat = p;
    }

    /** NOHIN_SEND_YOHI_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String nohinSendYohiKbn;

    /**
     * @return NOHIN_SEND_YOHI_KBN
     */
    public String getNohinSendYohiKbn() {
        return nohinSendYohiKbn;
    }

    /**
     * @param p NOHIN_SEND_YOHI_KBN
     */
    public void setNohinSendYohiKbn(final String p) {
        this.nohinSendYohiKbn = p;
    }

    /** BUNKATSU_MAIL_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String bunkatsuMailF;

    /**
     * @return BUNKATSU_MAIL_F
     */
    public String getBunkatsuMailF() {
        return bunkatsuMailF;
    }

    /**
     * @param p BUNKATSU_MAIL_F
     */
    public void setBunkatsuMailF(final String p) {
        this.bunkatsuMailF = p;
    }

    /** CHUMON_MAIL_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String chumonMailF;

    /**
     * @return CHUMON_MAIL_F
     */
    public String getChumonMailF() {
        return chumonMailF;
    }

    /**
     * @param p CHUMON_MAIL_F
     */
    public void setChumonMailF(final String p) {
        this.chumonMailF = p;
    }

    /** CHUMON_MAIL_HM */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,2}:[0-9]{1,2})?")
    private String chumonMailHm;

    /**
     * @return CHUMON_MAIL_HM
     */
    public String getChumonMailHm() {
        return chumonMailHm;
    }

    /**
     * @param p CHUMON_MAIL_HM
     */
    public void setChumonMailHm(final String p) {
        this.chumonMailHm = p;
    }

    /** KENSHU_MAIL_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String kenshuMailF;

    /**
     * @return KENSHU_MAIL_F
     */
    public String getKenshuMailF() {
        return kenshuMailF;
    }

    /**
     * @param p KENSHU_MAIL_F
     */
    public void setKenshuMailF(final String p) {
        this.kenshuMailF = p;
    }

    /** KENSHU_MAIL_HM */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{1,2}:[0-9]{1,2})?")
    private String kenshuMailHm;

    /**
     * @return KENSHU_MAIL_HM
     */
    public String getKenshuMailHm() {
        return kenshuMailHm;
    }

    /**
     * @param p KENSHU_MAIL_HM
     */
    public void setKenshuMailHm(final String p) {
        this.kenshuMailHm = p;
    }

    /** MAIL_BCC_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String mailBccF;

    /**
     * @return MAIL_BCC_F
     */
    public String getMailBccF() {
        return mailBccF;
    }

    /**
     * @param p MAIL_BCC_F
     */
    public void setMailBccF(final String p) {
        this.mailBccF = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
