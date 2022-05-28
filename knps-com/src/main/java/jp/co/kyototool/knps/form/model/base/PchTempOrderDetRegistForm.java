package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_TEMP_ORDER_DET登録フォーム
 *
 * @author emarfkrow
 */
public class PchTempOrderDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchTempOrderDetRegistForm.class);

    /** TEMP_ORDER_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String tempOrderNo;

    /**
     * @return TEMP_ORDER_NO
     */
    public String getTempOrderNo() {
        return tempOrderNo;
    }

    /**
     * @param p TEMP_ORDER_NO
     */
    public void setTempOrderNo(final String p) {
        this.tempOrderNo = p;
    }

    /** TEMP_ORDER_SEQ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String tempOrderSeq;

    /**
     * @return TEMP_ORDER_SEQ
     */
    public String getTempOrderSeq() {
        return tempOrderSeq;
    }

    /**
     * @param p TEMP_ORDER_SEQ
     */
    public void setTempOrderSeq(final String p) {
        this.tempOrderSeq = p;
    }

    /** ORDER_NO */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 10)
    private String orderNo;

    /**
     * @return ORDER_NO
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * @param p ORDER_NO
     */
    public void setOrderNo(final String p) {
        this.orderNo = p;
    }

    /** KBN2 */
    @jakarta.validation.constraints.Size(max = 4)
    private String kbn2;

    /**
     * @return KBN2
     */
    public String getKbn2() {
        return kbn2;
    }

    /**
     * @param p KBN2
     */
    public void setKbn2(final String p) {
        this.kbn2 = p;
    }

    /** ITEM */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 80)
    private String item;

    /**
     * @return ITEM
     */
    public String getItem() {
        return item;
    }

    /**
     * @param p ITEM
     */
    public void setItem(final String p) {
        this.item = p;
    }

    /** MATERIAL */
    @jakarta.validation.constraints.Size(max = 80)
    private String material;

    /**
     * @return MATERIAL
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param p MATERIAL
     */
    public void setMaterial(final String p) {
        this.material = p;
    }

    /** ORDER_COUNTS_1 */
    @jakarta.validation.constraints.Size(max = 11)
    private String orderCounts1;

    /**
     * @return ORDER_COUNTS_1
     */
    public String getOrderCounts1() {
        return orderCounts1;
    }

    /**
     * @param p ORDER_COUNTS_1
     */
    public void setOrderCounts1(final String p) {
        this.orderCounts1 = p;
    }

    /** UNIT_NAME */
    @jakarta.validation.constraints.Size(max = 10)
    private String unitName;

    /**
     * @return UNIT_NAME
     */
    public String getUnitName() {
        return unitName;
    }

    /**
     * @param p UNIT_NAME
     */
    public void setUnitName(final String p) {
        this.unitName = p;
    }

    /** ORDER_COUNTS_2 */
    @jakarta.validation.constraints.Size(max = 11)
    private String orderCounts2;

    /**
     * @return ORDER_COUNTS_2
     */
    public String getOrderCounts2() {
        return orderCounts2;
    }

    /**
     * @param p ORDER_COUNTS_2
     */
    public void setOrderCounts2(final String p) {
        this.orderCounts2 = p;
    }

    /** UNIT_NAME_2 */
    @jakarta.validation.constraints.Size(max = 10)
    private String unitName2;

    /**
     * @return UNIT_NAME_2
     */
    public String getUnitName2() {
        return unitName2;
    }

    /**
     * @param p UNIT_NAME_2
     */
    public void setUnitName2(final String p) {
        this.unitName2 = p;
    }

    /** ISSHIKI_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String isshikiF;

    /**
     * @return ISSHIKI_F
     */
    public String getIsshikiF() {
        return isshikiF;
    }

    /**
     * @param p ISSHIKI_F
     */
    public void setIsshikiF(final String p) {
        this.isshikiF = p;
    }

    /** FUTAI_F */
    @jakarta.validation.constraints.Size(max = 1)
    private String futaiF;

    /**
     * @return FUTAI_F
     */
    public String getFutaiF() {
        return futaiF;
    }

    /**
     * @param p FUTAI_F
     */
    public void setFutaiF(final String p) {
        this.futaiF = p;
    }

    /** IKKATSU_ORDER_NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String ikkatsuOrderNo;

    /**
     * @return IKKATSU_ORDER_NO
     */
    public String getIkkatsuOrderNo() {
        return ikkatsuOrderNo;
    }

    /**
     * @param p IKKATSU_ORDER_NO
     */
    public void setIkkatsuOrderNo(final String p) {
        this.ikkatsuOrderNo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
