package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_Y_STK_AMOUNT_COMM
 *
 * @author emarfkrow
 */
public class InvYStkAmountComm implements IEntity {

    /** PRO_HINBAN */
    private String proHinban;

    /**
     * @return PRO_HINBAN
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PRO_HINBAN")
    public String getProHinban() {
        return this.proHinban;
    }

    /**
     * @param o PRO_HINBAN
     */
    public void setProHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proHinban = String.valueOf(o.toString());
        } else {
            this.proHinban = null;
        }
    }

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

    /** NES_COUNTS */
    private java.math.BigDecimal nesCounts;

    /**
     * @return NES_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NES_COUNTS")
    public java.math.BigDecimal getNesCounts() {
        return this.nesCounts;
    }

    /**
     * @param o NES_COUNTS
     */
    public void setNesCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nesCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.nesCounts = null;
        }
    }

    /** STAN_COSTS */
    private java.math.BigDecimal stanCosts;

    /**
     * @return STAN_COSTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STAN_COSTS")
    public java.math.BigDecimal getStanCosts() {
        return this.stanCosts;
    }

    /**
     * @param o STAN_COSTS
     */
    public void setStanCosts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stanCosts = new java.math.BigDecimal(o.toString());
        } else {
            this.stanCosts = null;
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

    /**
     * INV_Y_STK_AMOUNT_COMM照会
     *
     * @param param1 PRO_HINBAN
     * @param param2 YYYY
     * @param param3 MM
     * @return INV_Y_STK_AMOUNT_COMM
     */
    public static InvYStkAmountComm get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRO_HINBAN\") = TRIM (:pro_hinban)");
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");

        String sql = "SELECT * FROM INV_Y_STK_AMOUNT_COMM WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_hinban", param1);
        params.put("yyyy", param2);
        params.put("mm", param3);

        return Queries.get(sql, params, InvYStkAmountComm.class);
    }

    /**
     * INV_Y_STK_AMOUNT_COMM追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MMの採番処理
        numbering();

        // INV_Y_STK_PROD_AMOUNT_PRODの登録
        if (this.invYStkProdAmountProd != null) {
            this.invYStkProdAmountProd.setProHinban(this.getProHinban());
            this.invYStkProdAmountProd.setYyyy(this.getYyyy());
            this.invYStkProdAmountProd.setMm(this.getMm());
            this.invYStkProdAmountProd.insert(now, id);
        }

        // PRD_M_PRO_NES_COUNTSの登録
        if (this.prdMProNesCounts != null) {
            this.prdMProNesCounts.setProHinban(this.getProHinban());
            this.prdMProNesCounts.setYyyy(this.getYyyy());
            this.prdMProNesCounts.setMm(this.getMm());
            this.prdMProNesCounts.insert(now, id);
        }

        // PRD_Y_PRO_NES_COUNTSの登録
        if (this.prdYProNesCounts != null) {
            this.prdYProNesCounts.setProHinban(this.getProHinban());
            this.prdYProNesCounts.setYyyy(this.getYyyy());
            this.prdYProNesCounts.setMm(this.getMm());
            this.prdYProNesCounts.insert(now, id);
        }

        // INV_Y_STK_AMOUNT_COMMの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PRO_HINBAN\" -- :pro_hinban");
        nameList.add("\"YYYY\" -- :yyyy");
        nameList.add("\"MM\" -- :mm");
        nameList.add("\"NES_COUNTS\" -- :nes_counts");
        nameList.add("\"STAN_COSTS\" -- :stan_costs");
        nameList.add("\"PROCURE_LT\" -- :procure_lt");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_Y_STK_AMOUNT_COMM(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":pro_hinban");
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":nes_counts");
        valueList.add(":stan_costs");
        valueList.add(":procure_lt");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** MMの採番処理 */
    private void numbering() {

        if (this.mm != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"MM\") IS NULL THEN 0 ELSE MAX(e.\"MM\") * 1 END + 1, 2, '0') AS \"MM\" FROM INV_Y_STK_AMOUNT_COMM e WHERE e.\"MM\" < '99'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"PRO_HINBAN\" = :pro_hinban");
        whereList.add("e.\"YYYY\" = :yyyy");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("pro_hinban", this.proHinban);
        params.put("yyyy", this.yyyy);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("MM");

        this.setMm(o);
    }

    /**
     * INV_Y_STK_AMOUNT_COMM更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_Y_STK_PROD_AMOUNT_PRODの登録
        if (this.invYStkProdAmountProd != null) {
            invYStkProdAmountProd.setProHinban(this.getProHinban());
            invYStkProdAmountProd.setYyyy(this.getYyyy());
            invYStkProdAmountProd.setMm(this.getMm());
            try {
                invYStkProdAmountProd.insert(now, id);
            } catch (Exception e) {
                invYStkProdAmountProd.update(now, id);
            }
        }

        // PRD_M_PRO_NES_COUNTSの登録
        if (this.prdMProNesCounts != null) {
            prdMProNesCounts.setProHinban(this.getProHinban());
            prdMProNesCounts.setYyyy(this.getYyyy());
            prdMProNesCounts.setMm(this.getMm());
            try {
                prdMProNesCounts.insert(now, id);
            } catch (Exception e) {
                prdMProNesCounts.update(now, id);
            }
        }

        // PRD_Y_PRO_NES_COUNTSの登録
        if (this.prdYProNesCounts != null) {
            prdYProNesCounts.setProHinban(this.getProHinban());
            prdYProNesCounts.setYyyy(this.getYyyy());
            prdYProNesCounts.setMm(this.getMm());
            try {
                prdYProNesCounts.insert(now, id);
            } catch (Exception e) {
                prdYProNesCounts.update(now, id);
            }
        }

        // INV_Y_STK_AMOUNT_COMMの登録
        String sql = "UPDATE INV_Y_STK_AMOUNT_COMM\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PRO_HINBAN\" = :pro_hinban");
        setList.add("\"YYYY\" = :yyyy");
        setList.add("\"MM\" = :mm");
        setList.add("\"NES_COUNTS\" = :nes_counts");
        setList.add("\"STAN_COSTS\" = :stan_costs");
        setList.add("\"PROCURE_LT\" = :procure_lt");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_Y_STK_AMOUNT_COMM削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_Y_STK_PROD_AMOUNT_PRODの削除
        if (this.invYStkProdAmountProd != null) {
            this.invYStkProdAmountProd.delete();
        }

        // PRD_M_PRO_NES_COUNTSの削除
        if (this.prdMProNesCounts != null) {
            this.prdMProNesCounts.delete();
        }

        // PRD_Y_PRO_NES_COUNTSの削除
        if (this.prdYProNesCounts != null) {
            this.prdYProNesCounts.delete();
        }

        // INV_Y_STK_AMOUNT_COMMの削除
        String sql = "DELETE FROM INV_Y_STK_AMOUNT_COMM WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRO_HINBAN\") = TRIM (:pro_hinban)");
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_hinban", this.proHinban);
        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("nes_counts", this.nesCounts);
        params.put("stan_costs", this.stanCosts);
        params.put("procure_lt", this.procureLt);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * INV_Y_STK_PROD_AMOUNT_PROD
     */
    private InvYStkProdAmountProd invYStkProdAmountProd;

    /**
     * @return INV_Y_STK_PROD_AMOUNT_PROD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("InvYStkProdAmountProd")
    public InvYStkProdAmountProd getInvYStkProdAmountProd() {
        return this.invYStkProdAmountProd;
    }

    /**
     * @param p INV_Y_STK_PROD_AMOUNT_PROD
     */
    public void setInvYStkProdAmountProd(final InvYStkProdAmountProd p) {
        this.invYStkProdAmountProd = p;
    }

    /**
     * @return INV_Y_STK_PROD_AMOUNT_PROD
     */
    public InvYStkProdAmountProd referInvYStkProdAmountProd() {
        if (this.invYStkProdAmountProd == null) {
            try {
                this.invYStkProdAmountProd = InvYStkProdAmountProd.get(this.proHinban, this.yyyy, this.mm);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.invYStkProdAmountProd;
    }

    /**
     * PRD_M_PRO_NES_COUNTS
     */
    private PrdMProNesCounts prdMProNesCounts;

    /**
     * @return PRD_M_PRO_NES_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdMProNesCounts")
    public PrdMProNesCounts getPrdMProNesCounts() {
        return this.prdMProNesCounts;
    }

    /**
     * @param p PRD_M_PRO_NES_COUNTS
     */
    public void setPrdMProNesCounts(final PrdMProNesCounts p) {
        this.prdMProNesCounts = p;
    }

    /**
     * @return PRD_M_PRO_NES_COUNTS
     */
    public PrdMProNesCounts referPrdMProNesCounts() {
        if (this.prdMProNesCounts == null) {
            try {
                this.prdMProNesCounts = PrdMProNesCounts.get(this.proHinban, this.yyyy, this.mm);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdMProNesCounts;
    }

    /**
     * PRD_Y_PRO_NES_COUNTS
     */
    private PrdYProNesCounts prdYProNesCounts;

    /**
     * @return PRD_Y_PRO_NES_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdYProNesCounts")
    public PrdYProNesCounts getPrdYProNesCounts() {
        return this.prdYProNesCounts;
    }

    /**
     * @param p PRD_Y_PRO_NES_COUNTS
     */
    public void setPrdYProNesCounts(final PrdYProNesCounts p) {
        this.prdYProNesCounts = p;
    }

    /**
     * @return PRD_Y_PRO_NES_COUNTS
     */
    public PrdYProNesCounts referPrdYProNesCounts() {
        if (this.prdYProNesCounts == null) {
            try {
                this.prdYProNesCounts = PrdYProNesCounts.get(this.proHinban, this.yyyy, this.mm);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdYProNesCounts;
    }
}
