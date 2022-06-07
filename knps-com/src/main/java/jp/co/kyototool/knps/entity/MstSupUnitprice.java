package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SUP_UNITPRICE
 *
 * @author emarfkrow
 */
public class MstSupUnitprice implements IEntity {

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINBAN")
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

    /** SUBINV_CODE */
    private String subinvCode;

    /**
     * @return SUBINV_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUBINV_CODE")
    public String getSubinvCode() {
        return this.subinvCode;
    }

    /**
     * @param o SUBINV_CODE
     */
    public void setSubinvCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.subinvCode = String.valueOf(o.toString());
        } else {
            this.subinvCode = null;
        }
    }

    /** PROCURE_LT */
    private java.math.BigDecimal procureLt;

    /**
     * @return PROCURE_LT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PROCURE_LT")
    public java.math.BigDecimal getProcureLt() {
        return this.procureLt;
    }

    /**
     * @param o PROCURE_LT
     */
    public void setProcureLt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.procureLt = new java.math.BigDecimal(o.toString());
        } else {
            this.procureLt = null;
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

    /** MUSHO_HACCHU_F */
    private String mushoHacchuF;

    /**
     * @return MUSHO_HACCHU_F
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MUSHO_HACCHU_F")
    public String getMushoHacchuF() {
        return this.mushoHacchuF;
    }

    /**
     * @param o MUSHO_HACCHU_F
     */
    public void setMushoHacchuF(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mushoHacchuF = String.valueOf(o.toString());
        } else {
            this.mushoHacchuF = null;
        }
    }

    /**
     * MST_SUP_UNITPRICE照会
     *
     * @param param1 HINBAN
     * @param param2 SUP_CODE
     * @return MST_SUP_UNITPRICE
     */
    public static MstSupUnitprice get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"SUP_CODE\") = TRIM (:sup_code)");

        String sql = "SELECT * FROM MST_SUP_UNITPRICE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sup_code", param2);

        return Queries.get(sql, params, MstSupUnitprice.class);
    }

    /**
     * MST_SUP_UNITPRICE追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SUP_CODEの採番処理
        numbering();

        // MST_SUP_UNITPRICE_BKの登録
        if (this.mstSupUnitpriceBks != null) {
            for (MstSupUnitpriceBk mstSupUnitpriceBk : this.mstSupUnitpriceBks) {
                mstSupUnitpriceBk.setHinban(this.getHinban());
                mstSupUnitpriceBk.setSupCode(this.getSupCode());
                mstSupUnitpriceBk.insert(now, id);
            }
        }

        // MST_SUP_UNITPRICE_DETAILの登録
        if (this.mstSupUnitpriceDetails != null) {
            for (MstSupUnitpriceDetail mstSupUnitpriceDetail : this.mstSupUnitpriceDetails) {
                mstSupUnitpriceDetail.setHinban(this.getHinban());
                mstSupUnitpriceDetail.setSupCode(this.getSupCode());
                mstSupUnitpriceDetail.insert(now, id);
            }
        }

        // MST_SUP_UNITPRICE_HSの登録
        if (this.mstSupUnitpriceHss != null) {
            for (MstSupUnitpriceHs mstSupUnitpriceHs : this.mstSupUnitpriceHss) {
                mstSupUnitpriceHs.setHinban(this.getHinban());
                mstSupUnitpriceHs.setSupCode(this.getSupCode());
                mstSupUnitpriceHs.insert(now, id);
            }
        }

        // MST_SUP_UNITPRICEの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"SUBINV_CODE\" -- :subinv_code");
        nameList.add("\"PROCURE_LT\" -- :procure_lt");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        nameList.add("\"DELETE_FLAG\" -- :delete_flag");
        nameList.add("\"MUSHO_HACCHU_F\" -- :musho_hacchu_f");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SUP_UNITPRICE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hinban");
        valueList.add(":sup_code");
        valueList.add(":subinv_code");
        valueList.add(":procure_lt");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        valueList.add(":musho_hacchu_f");
        return String.join("\r\n    , ", valueList);
    }

    /** SUP_CODEの採番処理 */
    private void numbering() {

        if (this.supCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"SUP_CODE\") IS NULL THEN 0 ELSE MAX(e.\"SUP_CODE\") * 1 END + 1, 6, '0') AS \"SUP_CODE\" FROM MST_SUP_UNITPRICE e WHERE e.\"SUP_CODE\" < '999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"HINBAN\" = :hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("hinban", this.hinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SUP_CODE");

        this.setSupCode(o);
    }

    /**
     * MST_SUP_UNITPRICE更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_SUP_UNITPRICE_BKの登録
        if (this.mstSupUnitpriceBks != null) {
            for (MstSupUnitpriceBk mstSupUnitpriceBk : this.mstSupUnitpriceBks) {
                mstSupUnitpriceBk.setHinban(this.hinban);
                mstSupUnitpriceBk.setSupCode(this.supCode);
                try {
                    mstSupUnitpriceBk.insert(now, id);
                } catch (Exception e) {
                    mstSupUnitpriceBk.update(now, id);
                }
            }
            this.mstSupUnitpriceBks = null;
            this.referMstSupUnitpriceBks();
            if (this.mstSupUnitpriceBks != null) {
                for (MstSupUnitpriceBk mstSupUnitpriceBk : this.mstSupUnitpriceBks) {
                    if (!mstSupUnitpriceBk.getTimeStampChange().equals(now)) {
                        mstSupUnitpriceBk.delete();
                    }
                }
            }
        }

        // MST_SUP_UNITPRICE_DETAILの登録
        if (this.mstSupUnitpriceDetails != null) {
            for (MstSupUnitpriceDetail mstSupUnitpriceDetail : this.mstSupUnitpriceDetails) {
                mstSupUnitpriceDetail.setHinban(this.hinban);
                mstSupUnitpriceDetail.setSupCode(this.supCode);
                try {
                    mstSupUnitpriceDetail.insert(now, id);
                } catch (Exception e) {
                    mstSupUnitpriceDetail.update(now, id);
                }
            }
            this.mstSupUnitpriceDetails = null;
            this.referMstSupUnitpriceDetails();
            if (this.mstSupUnitpriceDetails != null) {
                for (MstSupUnitpriceDetail mstSupUnitpriceDetail : this.mstSupUnitpriceDetails) {
                    if (!mstSupUnitpriceDetail.getTimeStampChange().equals(now)) {
                        mstSupUnitpriceDetail.delete();
                    }
                }
            }
        }

        // MST_SUP_UNITPRICE_HSの登録
        if (this.mstSupUnitpriceHss != null) {
            for (MstSupUnitpriceHs mstSupUnitpriceHs : this.mstSupUnitpriceHss) {
                mstSupUnitpriceHs.setHinban(this.hinban);
                mstSupUnitpriceHs.setSupCode(this.supCode);
                try {
                    mstSupUnitpriceHs.insert(now, id);
                } catch (Exception e) {
                    mstSupUnitpriceHs.update(now, id);
                }
            }
            this.mstSupUnitpriceHss = null;
            this.referMstSupUnitpriceHss();
            if (this.mstSupUnitpriceHss != null) {
                for (MstSupUnitpriceHs mstSupUnitpriceHs : this.mstSupUnitpriceHss) {
                    if (!mstSupUnitpriceHs.getTimeStampChange().equals(now)) {
                        mstSupUnitpriceHs.delete();
                    }
                }
            }
        }

        // MST_SUP_UNITPRICEの登録
        String sql = "UPDATE MST_SUP_UNITPRICE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"SUBINV_CODE\" = :subinv_code");
        setList.add("\"PROCURE_LT\" = :procure_lt");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        setList.add("\"DELETE_FLAG\" = :delete_flag");
        setList.add("\"MUSHO_HACCHU_F\" = :musho_hacchu_f");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SUP_UNITPRICE削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_SUP_UNITPRICE_BKの削除
        if (this.mstSupUnitpriceBks != null) {
            for (MstSupUnitpriceBk mstSupUnitpriceBk : this.mstSupUnitpriceBks) {
                mstSupUnitpriceBk.delete();
            }
        }

        // MST_SUP_UNITPRICE_DETAILの削除
        if (this.mstSupUnitpriceDetails != null) {
            for (MstSupUnitpriceDetail mstSupUnitpriceDetail : this.mstSupUnitpriceDetails) {
                mstSupUnitpriceDetail.delete();
            }
        }

        // MST_SUP_UNITPRICE_HSの削除
        if (this.mstSupUnitpriceHss != null) {
            for (MstSupUnitpriceHs mstSupUnitpriceHs : this.mstSupUnitpriceHss) {
                mstSupUnitpriceHs.delete();
            }
        }

        // MST_SUP_UNITPRICEの削除
        String sql = "DELETE FROM MST_SUP_UNITPRICE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("TRIM (\"SUP_CODE\") = TRIM (:sup_code)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", this.hinban);
        params.put("sup_code", this.supCode);
        params.put("subinv_code", this.subinvCode);
        params.put("procure_lt", this.procureLt);
        params.put("delete_flag", this.deleteFlag);
        params.put("musho_hacchu_f", this.mushoHacchuF);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MST_SUP_UNITPRICE_BKのリスト
     */
    private List<MstSupUnitpriceBk> mstSupUnitpriceBks;

    /**
     * @return MST_SUP_UNITPRICE_BKのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstSupUnitpriceBks")
    public List<MstSupUnitpriceBk> getMstSupUnitpriceBks() {
        return this.mstSupUnitpriceBks;
    }

    /**
     * @param list MST_SUP_UNITPRICE_BKのリスト
     */
    public void setMstSupUnitpriceBks(final List<MstSupUnitpriceBk> list) {
        this.mstSupUnitpriceBks = list;
    }

    /**
     * @param mstSupUnitpriceBk
     */
    public void addMstSupUnitpriceBks(final MstSupUnitpriceBk mstSupUnitpriceBk) {
        if (this.mstSupUnitpriceBks == null) {
            this.mstSupUnitpriceBks = new ArrayList<MstSupUnitpriceBk>();
        }
        this.mstSupUnitpriceBks.add(mstSupUnitpriceBk);
    }

    /**
     * @return MST_SUP_UNITPRICE_BKのリスト
     */
    public List<MstSupUnitpriceBk> referMstSupUnitpriceBks() {
        if (this.mstSupUnitpriceBks == null) {
            this.mstSupUnitpriceBks = MstSupUnitprice.referMstSupUnitpriceBks(this.hinban, this.supCode);
        }
        return this.mstSupUnitpriceBks;
    }

    /**
     * @param param1 hinban
     * @param param2 supCode
     * @return List<MstSupUnitpriceBk>
     */
    public static List<MstSupUnitpriceBk> referMstSupUnitpriceBks(final String param1, final String param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("hinban = :hinban");
        whereList.add("sup_code = :sup_code");

        String sql = "SELECT * FROM MST_SUP_UNITPRICE_BK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sup_code", param2);

        return Queries.select(sql, params, MstSupUnitpriceBk.class);
    }

    /**
     * MST_SUP_UNITPRICE_DETAILのリスト
     */
    private List<MstSupUnitpriceDetail> mstSupUnitpriceDetails;

    /**
     * @return MST_SUP_UNITPRICE_DETAILのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstSupUnitpriceDetails")
    public List<MstSupUnitpriceDetail> getMstSupUnitpriceDetails() {
        return this.mstSupUnitpriceDetails;
    }

    /**
     * @param list MST_SUP_UNITPRICE_DETAILのリスト
     */
    public void setMstSupUnitpriceDetails(final List<MstSupUnitpriceDetail> list) {
        this.mstSupUnitpriceDetails = list;
    }

    /**
     * @param mstSupUnitpriceDetail
     */
    public void addMstSupUnitpriceDetails(final MstSupUnitpriceDetail mstSupUnitpriceDetail) {
        if (this.mstSupUnitpriceDetails == null) {
            this.mstSupUnitpriceDetails = new ArrayList<MstSupUnitpriceDetail>();
        }
        this.mstSupUnitpriceDetails.add(mstSupUnitpriceDetail);
    }

    /**
     * @return MST_SUP_UNITPRICE_DETAILのリスト
     */
    public List<MstSupUnitpriceDetail> referMstSupUnitpriceDetails() {
        if (this.mstSupUnitpriceDetails == null) {
            this.mstSupUnitpriceDetails = MstSupUnitprice.referMstSupUnitpriceDetails(this.hinban, this.supCode);
        }
        return this.mstSupUnitpriceDetails;
    }

    /**
     * @param param1 hinban
     * @param param2 supCode
     * @return List<MstSupUnitpriceDetail>
     */
    public static List<MstSupUnitpriceDetail> referMstSupUnitpriceDetails(final String param1, final String param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("hinban = :hinban");
        whereList.add("sup_code = :sup_code");

        String sql = "SELECT * FROM MST_SUP_UNITPRICE_DETAIL WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sup_code", param2);

        return Queries.select(sql, params, MstSupUnitpriceDetail.class);
    }

    /**
     * MST_SUP_UNITPRICE_HSのリスト
     */
    private List<MstSupUnitpriceHs> mstSupUnitpriceHss;

    /**
     * @return MST_SUP_UNITPRICE_HSのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstSupUnitpriceHss")
    public List<MstSupUnitpriceHs> getMstSupUnitpriceHss() {
        return this.mstSupUnitpriceHss;
    }

    /**
     * @param list MST_SUP_UNITPRICE_HSのリスト
     */
    public void setMstSupUnitpriceHss(final List<MstSupUnitpriceHs> list) {
        this.mstSupUnitpriceHss = list;
    }

    /**
     * @param mstSupUnitpriceHs
     */
    public void addMstSupUnitpriceHss(final MstSupUnitpriceHs mstSupUnitpriceHs) {
        if (this.mstSupUnitpriceHss == null) {
            this.mstSupUnitpriceHss = new ArrayList<MstSupUnitpriceHs>();
        }
        this.mstSupUnitpriceHss.add(mstSupUnitpriceHs);
    }

    /**
     * @return MST_SUP_UNITPRICE_HSのリスト
     */
    public List<MstSupUnitpriceHs> referMstSupUnitpriceHss() {
        if (this.mstSupUnitpriceHss == null) {
            this.mstSupUnitpriceHss = MstSupUnitprice.referMstSupUnitpriceHss(this.hinban, this.supCode);
        }
        return this.mstSupUnitpriceHss;
    }

    /**
     * @param param1 hinban
     * @param param2 supCode
     * @return List<MstSupUnitpriceHs>
     */
    public static List<MstSupUnitpriceHs> referMstSupUnitpriceHss(final String param1, final String param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("hinban = :hinban");
        whereList.add("sup_code = :sup_code");

        String sql = "SELECT * FROM MST_SUP_UNITPRICE_HS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);
        params.put("sup_code", param2);

        return Queries.select(sql, params, MstSupUnitpriceHs.class);
    }
}
