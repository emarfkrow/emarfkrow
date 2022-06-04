package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SUP_UNITPRICE_DETAIL
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceDetail implements IEntity {

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

    /** MIN_ORDER */
    private java.math.BigDecimal minOrder;

    /**
     * @return MIN_ORDER
     */
    public java.math.BigDecimal getMinOrder() {
        return this.minOrder;
    }

    /**
     * @param o MIN_ORDER
     */
    public void setMinOrder(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.minOrder = new java.math.BigDecimal(o.toString());
        } else {
            this.minOrder = null;
        }
    }

    /** STAN_COUNTS */
    private java.math.BigDecimal stanCounts;

    /**
     * @return STAN_COUNTS
     */
    public java.math.BigDecimal getStanCounts() {
        return this.stanCounts;
    }

    /**
     * @param o STAN_COUNTS
     */
    public void setStanCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stanCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.stanCounts = null;
        }
    }

    /** ORDER_UNIT */
    private java.math.BigDecimal orderUnit;

    /**
     * @return ORDER_UNIT
     */
    public java.math.BigDecimal getOrderUnit() {
        return this.orderUnit;
    }

    /**
     * @param o ORDER_UNIT
     */
    public void setOrderUnit(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderUnit = new java.math.BigDecimal(o.toString());
        } else {
            this.orderUnit = null;
        }
    }

    /** STANDARD_UNITPRICE_FLAG */
    private java.math.BigDecimal standardUnitpriceFlag;

    /**
     * @return STANDARD_UNITPRICE_FLAG
     */
    public java.math.BigDecimal getStandardUnitpriceFlag() {
        return this.standardUnitpriceFlag;
    }

    /**
     * @param o STANDARD_UNITPRICE_FLAG
     */
    public void setStandardUnitpriceFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.standardUnitpriceFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.standardUnitpriceFlag = null;
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

    /** GAIKA_KB */
    private String gaikaKb;

    /**
     * @return GAIKA_KB
     */
    public String getGaikaKb() {
        return this.gaikaKb;
    }

    /**
     * @param o GAIKA_KB
     */
    public void setGaikaKb(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gaikaKb = String.valueOf(o.toString());
        } else {
            this.gaikaKb = null;
        }
    }

    /** GAIKA_TK */
    private java.math.BigDecimal gaikaTk;

    /**
     * @return GAIKA_TK
     */
    public java.math.BigDecimal getGaikaTk() {
        return this.gaikaTk;
    }

    /**
     * @param o GAIKA_TK
     */
    public void setGaikaTk(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gaikaTk = new java.math.BigDecimal(o.toString());
        } else {
            this.gaikaTk = null;
        }
    }

    /**
     * MST_SUP_UNITPRICE_DETAIL照会
     *
     * @param param1 HINBAN
     * @param param2 SUP_CODE
     * @param param3 MIN_ORDER
     * @return MST_SUP_UNITPRICE_DETAIL
     */
    public static MstSupUnitpriceDetail get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"SUP_CODE\") = TRIM (:sup_code)");
        whereList.add("\"MIN_ORDER\" = :min_order");

        String sql = "SELECT * FROM MST_SUP_UNITPRICE_DETAIL WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sup_code", param2);
        params.put("min_order", param3);

        return Queries.get(sql, params, MstSupUnitpriceDetail.class);
    }

    /**
     * MST_SUP_UNITPRICE_DETAIL追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_SUP_UNITPRICE_DETAIL_BKの登録
        if (this.mstSupUnitpriceDetailBks != null) {
            for (MstSupUnitpriceDetailBk mstSupUnitpriceDetailBk : this.mstSupUnitpriceDetailBks) {
                mstSupUnitpriceDetailBk.setHinban(this.getHinban());
                mstSupUnitpriceDetailBk.setSupCode(this.getSupCode());
                mstSupUnitpriceDetailBk.setMinOrder(this.getMinOrder());
                mstSupUnitpriceDetailBk.insert(now, id);
            }
        }

        // MST_SUP_UNITPRICE_DETAIL_HSの登録
        if (this.mstSupUnitpriceDetailHss != null) {
            for (MstSupUnitpriceDetailHs mstSupUnitpriceDetailHs : this.mstSupUnitpriceDetailHss) {
                mstSupUnitpriceDetailHs.setHinban(this.getHinban());
                mstSupUnitpriceDetailHs.setSupCode(this.getSupCode());
                mstSupUnitpriceDetailHs.setMinOrder(this.getMinOrder());
                mstSupUnitpriceDetailHs.insert(now, id);
            }
        }

        // MST_SUP_UNITPRICE_DETAILの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"MIN_ORDER\" -- :min_order");
        nameList.add("\"STAN_COUNTS\" -- :stan_counts");
        nameList.add("\"ORDER_UNIT\" -- :order_unit");
        nameList.add("\"STANDARD_UNITPRICE_FLAG\" -- :standard_unitprice_flag");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        nameList.add("\"GAIKA_KB\" -- :gaika_kb");
        nameList.add("\"GAIKA_TK\" -- :gaika_tk");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SUP_UNITPRICE_DETAIL(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hinban");
        valueList.add(":sup_code");
        valueList.add(":min_order");
        valueList.add(":stan_counts");
        valueList.add(":order_unit");
        valueList.add(":standard_unitprice_flag");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        valueList.add(":gaika_kb");
        valueList.add(":gaika_tk");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_SUP_UNITPRICE_DETAIL更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_SUP_UNITPRICE_DETAIL_BKの登録
        if (this.mstSupUnitpriceDetailBks != null) {
            for (MstSupUnitpriceDetailBk mstSupUnitpriceDetailBk : this.mstSupUnitpriceDetailBks) {
                mstSupUnitpriceDetailBk.setHinban(this.hinban);
                mstSupUnitpriceDetailBk.setSupCode(this.supCode);
                mstSupUnitpriceDetailBk.setMinOrder(this.minOrder);
                try {
                    mstSupUnitpriceDetailBk.insert(now, id);
                } catch (Exception e) {
                    mstSupUnitpriceDetailBk.update(now, id);
                }
            }
            this.mstSupUnitpriceDetailBks = null;
            this.referMstSupUnitpriceDetailBks();
            if (this.mstSupUnitpriceDetailBks != null) {
                for (MstSupUnitpriceDetailBk mstSupUnitpriceDetailBk : this.mstSupUnitpriceDetailBks) {
                    if (!mstSupUnitpriceDetailBk.getTimeStampChange().equals(now)) {
                        mstSupUnitpriceDetailBk.delete();
                    }
                }
            }
        }

        // MST_SUP_UNITPRICE_DETAIL_HSの登録
        if (this.mstSupUnitpriceDetailHss != null) {
            for (MstSupUnitpriceDetailHs mstSupUnitpriceDetailHs : this.mstSupUnitpriceDetailHss) {
                mstSupUnitpriceDetailHs.setHinban(this.hinban);
                mstSupUnitpriceDetailHs.setSupCode(this.supCode);
                mstSupUnitpriceDetailHs.setMinOrder(this.minOrder);
                try {
                    mstSupUnitpriceDetailHs.insert(now, id);
                } catch (Exception e) {
                    mstSupUnitpriceDetailHs.update(now, id);
                }
            }
            this.mstSupUnitpriceDetailHss = null;
            this.referMstSupUnitpriceDetailHss();
            if (this.mstSupUnitpriceDetailHss != null) {
                for (MstSupUnitpriceDetailHs mstSupUnitpriceDetailHs : this.mstSupUnitpriceDetailHss) {
                    if (!mstSupUnitpriceDetailHs.getTimeStampChange().equals(now)) {
                        mstSupUnitpriceDetailHs.delete();
                    }
                }
            }
        }

        // MST_SUP_UNITPRICE_DETAILの登録
        String sql = "UPDATE MST_SUP_UNITPRICE_DETAIL\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"MIN_ORDER\" = :min_order");
        setList.add("\"STAN_COUNTS\" = :stan_counts");
        setList.add("\"ORDER_UNIT\" = :order_unit");
        setList.add("\"STANDARD_UNITPRICE_FLAG\" = :standard_unitprice_flag");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        setList.add("\"GAIKA_KB\" = :gaika_kb");
        setList.add("\"GAIKA_TK\" = :gaika_tk");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SUP_UNITPRICE_DETAIL削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_SUP_UNITPRICE_DETAIL_BKの削除
        if (this.mstSupUnitpriceDetailBks != null) {
            for (MstSupUnitpriceDetailBk mstSupUnitpriceDetailBk : this.mstSupUnitpriceDetailBks) {
                mstSupUnitpriceDetailBk.delete();
            }
        }

        // MST_SUP_UNITPRICE_DETAIL_HSの削除
        if (this.mstSupUnitpriceDetailHss != null) {
            for (MstSupUnitpriceDetailHs mstSupUnitpriceDetailHs : this.mstSupUnitpriceDetailHss) {
                mstSupUnitpriceDetailHs.delete();
            }
        }

        // MST_SUP_UNITPRICE_DETAILの削除
        String sql = "DELETE FROM MST_SUP_UNITPRICE_DETAIL WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"SUP_CODE\") = TRIM (:sup_code)");
        whereList.add("\"MIN_ORDER\" = :min_order");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", this.hinban);
        params.put("sup_code", this.supCode);
        params.put("min_order", this.minOrder);
        params.put("stan_counts", this.stanCounts);
        params.put("order_unit", this.orderUnit);
        params.put("standard_unitprice_flag", this.standardUnitpriceFlag);
        params.put("delete_flag", this.deleteFlag);
        params.put("gaika_kb", this.gaikaKb);
        params.put("gaika_tk", this.gaikaTk);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MST_SUP_UNITPRICE_DETAIL_BKのリスト
     */
    private List<MstSupUnitpriceDetailBk> mstSupUnitpriceDetailBks;

    /**
     * @return MST_SUP_UNITPRICE_DETAIL_BKのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstSupUnitpriceDetailBks")
    public List<MstSupUnitpriceDetailBk> getMstSupUnitpriceDetailBks() {
        return this.mstSupUnitpriceDetailBks;
    }

    /**
     * @param list MST_SUP_UNITPRICE_DETAIL_BKのリスト
     */
    public void setMstSupUnitpriceDetailBks(final List<MstSupUnitpriceDetailBk> list) {
        this.mstSupUnitpriceDetailBks = list;
    }

    /**
     * @param mstSupUnitpriceDetailBk
     */
    public void addMstSupUnitpriceDetailBks(final MstSupUnitpriceDetailBk mstSupUnitpriceDetailBk) {
        if (this.mstSupUnitpriceDetailBks == null) {
            this.mstSupUnitpriceDetailBks = new ArrayList<MstSupUnitpriceDetailBk>();
        }
        this.mstSupUnitpriceDetailBks.add(mstSupUnitpriceDetailBk);
    }

    /**
     * @return MST_SUP_UNITPRICE_DETAIL_BKのリスト
     */
    public List<MstSupUnitpriceDetailBk> referMstSupUnitpriceDetailBks() {
        if (this.mstSupUnitpriceDetailBks == null) {
            this.mstSupUnitpriceDetailBks = MstSupUnitpriceDetail.referMstSupUnitpriceDetailBks(this.hinban, this.supCode, this.minOrder);
        }
        return this.mstSupUnitpriceDetailBks;
    }

    /**
     * @param param1 hinban
     * @param param2 supCode
     * @param param3 minOrder
     * @return List<MstSupUnitpriceDetailBk>
     */
    public static List<MstSupUnitpriceDetailBk> referMstSupUnitpriceDetailBks(final String param1, final String param2, final java.math.BigDecimal param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("hinban = :hinban");
        whereList.add("sup_code = :sup_code");
        whereList.add("min_order = :min_order");

        String sql = "SELECT * FROM MST_SUP_UNITPRICE_DETAIL_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sup_code", param2);
        params.put("min_order", param3);

        return Queries.select(sql, params, MstSupUnitpriceDetailBk.class);
    }

    /**
     * MST_SUP_UNITPRICE_DETAIL_HSのリスト
     */
    private List<MstSupUnitpriceDetailHs> mstSupUnitpriceDetailHss;

    /**
     * @return MST_SUP_UNITPRICE_DETAIL_HSのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstSupUnitpriceDetailHss")
    public List<MstSupUnitpriceDetailHs> getMstSupUnitpriceDetailHss() {
        return this.mstSupUnitpriceDetailHss;
    }

    /**
     * @param list MST_SUP_UNITPRICE_DETAIL_HSのリスト
     */
    public void setMstSupUnitpriceDetailHss(final List<MstSupUnitpriceDetailHs> list) {
        this.mstSupUnitpriceDetailHss = list;
    }

    /**
     * @param mstSupUnitpriceDetailHs
     */
    public void addMstSupUnitpriceDetailHss(final MstSupUnitpriceDetailHs mstSupUnitpriceDetailHs) {
        if (this.mstSupUnitpriceDetailHss == null) {
            this.mstSupUnitpriceDetailHss = new ArrayList<MstSupUnitpriceDetailHs>();
        }
        this.mstSupUnitpriceDetailHss.add(mstSupUnitpriceDetailHs);
    }

    /**
     * @return MST_SUP_UNITPRICE_DETAIL_HSのリスト
     */
    public List<MstSupUnitpriceDetailHs> referMstSupUnitpriceDetailHss() {
        if (this.mstSupUnitpriceDetailHss == null) {
            this.mstSupUnitpriceDetailHss = MstSupUnitpriceDetail.referMstSupUnitpriceDetailHss(this.hinban, this.supCode, this.minOrder);
        }
        return this.mstSupUnitpriceDetailHss;
    }

    /**
     * @param param1 hinban
     * @param param2 supCode
     * @param param3 minOrder
     * @return List<MstSupUnitpriceDetailHs>
     */
    public static List<MstSupUnitpriceDetailHs> referMstSupUnitpriceDetailHss(final String param1, final String param2, final java.math.BigDecimal param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("hinban = :hinban");
        whereList.add("sup_code = :sup_code");
        whereList.add("min_order = :min_order");

        String sql = "SELECT * FROM MST_SUP_UNITPRICE_DETAIL_HS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sup_code", param2);
        params.put("min_order", param3);

        return Queries.select(sql, params, MstSupUnitpriceDetailHs.class);
    }
}
