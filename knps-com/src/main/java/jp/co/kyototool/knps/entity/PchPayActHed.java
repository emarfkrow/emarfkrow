package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_PAY_ACT_HED
 *
 * @author emarfkrow
 */
public class PchPayActHed implements IEntity {

    /** PAY_NO */
    private String payNo;

    /**
     * @return PAY_NO
     */
    public String getPayNo() {
        return this.payNo;
    }

    /**
     * @param o PAY_NO
     */
    public void setPayNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.payNo = String.valueOf(o.toString());
        } else {
            this.payNo = null;
        }
    }

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return this.hinban;
    }

    /**
     * @param o HINBAN
     */
    public void setHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinban = String.valueOf(o.toString());
        } else {
            this.hinban = null;
        }
    }

    /** ITEM */
    private String item;

    /**
     * @return ITEM
     */
    public String getItem() {
        return this.item;
    }

    /**
     * @param o ITEM
     */
    public void setItem(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.item = String.valueOf(o.toString());
        } else {
            this.item = null;
        }
    }

    /** SUPPLY_KBN */
    private java.math.BigDecimal supplyKbn;

    /**
     * @return SUPPLY_KBN
     */
    public java.math.BigDecimal getSupplyKbn() {
        return this.supplyKbn;
    }

    /**
     * @param o SUPPLY_KBN
     */
    public void setSupplyKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.supplyKbn = null;
        }
    }

    /** FROM_PAY */
    private String fromPay;

    /**
     * @return FROM_PAY
     */
    public String getFromPay() {
        return this.fromPay;
    }

    /**
     * @param o FROM_PAY
     */
    public void setFromPay(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fromPay = String.valueOf(o.toString());
        } else {
            this.fromPay = null;
        }
    }

    /** TO_PAY */
    private String toPay;

    /**
     * @return TO_PAY
     */
    public String getToPay() {
        return this.toPay;
    }

    /**
     * @param o TO_PAY
     */
    public void setToPay(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.toPay = String.valueOf(o.toString());
        } else {
            this.toPay = null;
        }
    }

    /** UNIT_CODE */
    private String unitCode;

    /**
     * @return UNIT_CODE
     */
    public String getUnitCode() {
        return this.unitCode;
    }

    /**
     * @param o UNIT_CODE
     */
    public void setUnitCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unitCode = String.valueOf(o.toString());
        } else {
            this.unitCode = null;
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

    /** ACCOUNT_CODE */
    private String accountCode;

    /**
     * @return ACCOUNT_CODE
     */
    public String getAccountCode() {
        return this.accountCode;
    }

    /**
     * @param o ACCOUNT_CODE
     */
    public void setAccountCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.accountCode = String.valueOf(o.toString());
        } else {
            this.accountCode = null;
        }
    }

    /** SUPPLY_NO */
    private String supplyNo;

    /**
     * @return SUPPLY_NO
     */
    public String getSupplyNo() {
        return this.supplyNo;
    }

    /**
     * @param o SUPPLY_NO
     */
    public void setSupplyNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supplyNo = String.valueOf(o.toString());
        } else {
            this.supplyNo = null;
        }
    }

    /** SHIP_ORDER_NO */
    private String shipOrderNo;

    /**
     * @return SHIP_ORDER_NO
     */
    public String getShipOrderNo() {
        return this.shipOrderNo;
    }

    /**
     * @param o SHIP_ORDER_NO
     */
    public void setShipOrderNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shipOrderNo = String.valueOf(o.toString());
        } else {
            this.shipOrderNo = null;
        }
    }

    /** PAY_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime payDate;

    /**
     * @return PAY_DATE
     */
    public java.time.LocalDateTime getPayDate() {
        return this.payDate;
    }

    /**
     * @param o PAY_DATE
     */
    public void setPayDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.payDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.payDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.payDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.payDate = null;
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

    /**
     * PCH_PAY_ACT_HED照会
     *
     * @param param1 PAY_NO
     * @return PCH_PAY_ACT_HED
     */
    public static PchPayActHed get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PAY_NO\") = TRIM (:pay_no)");

        String sql = "SELECT * FROM PCH_PAY_ACT_HED WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pay_no", param1);

        return Queries.get(sql, params, PchPayActHed.class);
    }

    /**
     * PCH_PAY_ACT_HED追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PAY_NOの採番処理
        numbering();

        // PCH_PAY_ACT_DETの登録
        if (this.pchPayActDets != null) {
            for (PchPayActDet pchPayActDet : this.pchPayActDets) {
                pchPayActDet.setPayNo(this.getPayNo());
                pchPayActDet.insert(now, id);
            }
        }

        // PCH_PAY_ACT_HEDの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("pay_no -- :pay_no");
        nameList.add("hinban -- :hinban");
        nameList.add("item -- :item");
        nameList.add("supply_kbn -- :supply_kbn");
        nameList.add("from_pay -- :from_pay");
        nameList.add("to_pay -- :to_pay");
        nameList.add("unit_code -- :unit_code");
        nameList.add("tax_code -- :tax_code");
        nameList.add("tax_cal_code -- :tax_cal_code");
        nameList.add("account_code -- :account_code");
        nameList.add("supply_no -- :supply_no");
        nameList.add("ship_order_no -- :ship_order_no");
        nameList.add("pay_date -- :pay_date");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_PAY_ACT_HED(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":pay_no");
        valueList.add(":hinban");
        valueList.add(":item");
        valueList.add(":supply_kbn");
        valueList.add(":from_pay");
        valueList.add(":to_pay");
        valueList.add(":unit_code");
        valueList.add(":tax_code");
        valueList.add(":tax_cal_code");
        valueList.add(":account_code");
        valueList.add(":supply_no");
        valueList.add(":ship_order_no");
        valueList.add("TO_TIMESTAMP (:pay_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** PAY_NOの採番処理 */
    private void numbering() {

        if (this.payNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.PAY_NO) IS NULL THEN 0 ELSE MAX(e.PAY_NO) * 1 END + 1, 10, '0') AS PAY_NO FROM PCH_PAY_ACT_HED e WHERE e.PAY_NO < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("PAY_NO");

        this.setPayNo(o);
    }

    /**
     * PCH_PAY_ACT_HED更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_PAY_ACT_DETの登録
        if (this.pchPayActDets != null) {
            for (PchPayActDet pchPayActDet : this.pchPayActDets) {
                pchPayActDet.setPayNo(this.payNo);
                try {
                    pchPayActDet.insert(now, id);
                } catch (Exception e) {
                    pchPayActDet.update(now, id);
                }
            }
            this.pchPayActDets = null;
            this.referPchPayActDets();
            if (this.pchPayActDets != null) {
                for (PchPayActDet pchPayActDet : this.pchPayActDets) {
                    if (!pchPayActDet.getTimeStampChange().equals(now)) {
                        pchPayActDet.delete();
                    }
                }
            }
        }

        // PCH_PAY_ACT_HEDの登録
        String sql = "UPDATE PCH_PAY_ACT_HED\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("pay_no = :pay_no");
        setList.add("hinban = :hinban");
        setList.add("item = :item");
        setList.add("supply_kbn = :supply_kbn");
        setList.add("from_pay = :from_pay");
        setList.add("to_pay = :to_pay");
        setList.add("unit_code = :unit_code");
        setList.add("tax_code = :tax_code");
        setList.add("tax_cal_code = :tax_cal_code");
        setList.add("account_code = :account_code");
        setList.add("supply_no = :supply_no");
        setList.add("ship_order_no = :ship_order_no");
        setList.add("pay_date = TO_TIMESTAMP (:pay_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_PAY_ACT_HED削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_PAY_ACT_DETの削除
        if (this.pchPayActDets != null) {
            for (PchPayActDet pchPayActDet : this.pchPayActDets) {
                pchPayActDet.delete();
            }
        }

        // PCH_PAY_ACT_HEDの削除
        String sql = "DELETE FROM PCH_PAY_ACT_HED WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (pay_no) = TRIM (:pay_no)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("PAY_NO", this.payNo);
        params.put("HINBAN", this.hinban);
        params.put("ITEM", this.item);
        params.put("SUPPLY_KBN", this.supplyKbn);
        params.put("FROM_PAY", this.fromPay);
        params.put("TO_PAY", this.toPay);
        params.put("UNIT_CODE", this.unitCode);
        params.put("TAX_CODE", this.taxCode);
        params.put("TAX_CAL_CODE", this.taxCalCode);
        params.put("ACCOUNT_CODE", this.accountCode);
        params.put("SUPPLY_NO", this.supplyNo);
        params.put("SHIP_ORDER_NO", this.shipOrderNo);
        params.put("PAY_DATE", this.payDate);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PCH_PAY_ACT_DETのリスト
     */
    private List<PchPayActDet> pchPayActDets;

    /**
     * @return PCH_PAY_ACT_DETのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PchPayActDets")
    public List<PchPayActDet> getPchPayActDets() {
        return this.pchPayActDets;
    }

    /**
     * @param list PCH_PAY_ACT_DETのリスト
     */
    public void setPchPayActDets(final List<PchPayActDet> list) {
        this.pchPayActDets = list;
    }

    /**
     * @param pchPayActDet
     */
    public void addPchPayActDets(final PchPayActDet pchPayActDet) {
        if (this.pchPayActDets == null) {
            this.pchPayActDets = new ArrayList<PchPayActDet>();
        }
        this.pchPayActDets.add(pchPayActDet);
    }

    /**
     * @return PCH_PAY_ACT_DETのリスト
     */
    public List<PchPayActDet> referPchPayActDets() {
        if (this.pchPayActDets == null) {
            this.pchPayActDets = PchPayActHed.referPchPayActDets(this.payNo);
        }
        return this.pchPayActDets;
    }

    /**
     * @param param1 payNo
     * @return List<PchPayActDet>
     */
    public static List<PchPayActDet> referPchPayActDets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("pay_no = :pay_no");

        String sql = "SELECT * FROM PCH_PAY_ACT_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pay_no", param1);

        return Queries.select(sql, params, PchPayActDet.class);
    }
}
