package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_Y_STK_PROD_AMOUNT_PROD
 *
 * @author emarfkrow
 */
public class InvYStkProdAmountProd implements IEntity {

    /** PRO_HINBAN */
    private String proHinban;

    /**
     * @return PRO_HINBAN
     */
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

    /** SHIKAKE_KBN */
    private String shikakeKbn;

    /**
     * @return SHIKAKE_KBN
     */
    public String getShikakeKbn() {
        return this.shikakeKbn;
    }

    /**
     * @param o SHIKAKE_KBN
     */
    public void setShikakeKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shikakeKbn = String.valueOf(o.toString());
        } else {
            this.shikakeKbn = null;
        }
    }

    /** PRO_LT */
    private java.math.BigDecimal proLt;

    /**
     * @return PRO_LT
     */
    public java.math.BigDecimal getProLt() {
        return this.proLt;
    }

    /**
     * @param o PRO_LT
     */
    public void setProLt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.proLt = new java.math.BigDecimal(o.toString());
        } else {
            this.proLt = null;
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
     * INV_Y_STK_PROD_AMOUNT_PROD照会
     *
     * @param param1 PRO_HINBAN
     * @param param2 YYYY
     * @param param3 MM
     * @return INV_Y_STK_PROD_AMOUNT_PROD
     */
    public static InvYStkProdAmountProd get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PRO_HINBAN\") = TRIM (:pro_hinban)");
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");

        String sql = "SELECT * FROM INV_Y_STK_PROD_AMOUNT_PROD WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("pro_hinban", param1);
        params.put("yyyy", param2);
        params.put("mm", param3);

        return Queries.get(sql, params, InvYStkProdAmountProd.class);
    }

    /**
     * INV_Y_STK_PROD_AMOUNT_PROD追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MMの採番処理
        numbering();

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

        // INV_Y_STK_PROD_AMOUNT_PRODの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("pro_hinban -- :pro_hinban");
        nameList.add("yyyy -- :yyyy");
        nameList.add("mm -- :mm");
        nameList.add("nes_counts -- :nes_counts");
        nameList.add("stan_costs -- :stan_costs");
        nameList.add("shikake_kbn -- :shikake_kbn");
        nameList.add("pro_lt -- :pro_lt");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_Y_STK_PROD_AMOUNT_PROD(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

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
        valueList.add(":shikake_kbn");
        valueList.add(":pro_lt");
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

        String sql = "SELECT LPAD (CASE WHEN MAX(e.MM) IS NULL THEN 0 ELSE MAX(e.MM) * 1 END + 1, 2, '0') AS MM FROM INV_Y_STK_PROD_AMOUNT_PROD e WHERE e.MM < '99'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.PRO_HINBAN = :pro_hinban");
        whereList.add("e.YYYY = :yyyy");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("proHinban", this.proHinban);
        params.put("yyyy", this.yyyy);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("MM");

        this.setMm(o);
    }

    /**
     * INV_Y_STK_PROD_AMOUNT_PROD更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

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

        // INV_Y_STK_PROD_AMOUNT_PRODの登録
        String sql = "UPDATE INV_Y_STK_PROD_AMOUNT_PROD\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("pro_hinban = :pro_hinban");
        setList.add("yyyy = :yyyy");
        setList.add("mm = :mm");
        setList.add("nes_counts = :nes_counts");
        setList.add("stan_costs = :stan_costs");
        setList.add("shikake_kbn = :shikake_kbn");
        setList.add("pro_lt = :pro_lt");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_Y_STK_PROD_AMOUNT_PROD削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_M_PRO_NES_COUNTSの削除
        if (this.prdMProNesCounts != null) {
            this.prdMProNesCounts.delete();
        }

        // PRD_Y_PRO_NES_COUNTSの削除
        if (this.prdYProNesCounts != null) {
            this.prdYProNesCounts.delete();
        }

        // INV_Y_STK_PROD_AMOUNT_PRODの削除
        String sql = "DELETE FROM INV_Y_STK_PROD_AMOUNT_PROD WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (pro_hinban) = TRIM (:pro_hinban)");
        whereList.add("TRIM (yyyy) = TRIM (:yyyy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("PRO_HINBAN", this.proHinban);
        params.put("YYYY", this.yyyy);
        params.put("MM", this.mm);
        params.put("NES_COUNTS", this.nesCounts);
        params.put("STAN_COSTS", this.stanCosts);
        params.put("SHIKAKE_KBN", this.shikakeKbn);
        params.put("PRO_LT", this.proLt);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
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
