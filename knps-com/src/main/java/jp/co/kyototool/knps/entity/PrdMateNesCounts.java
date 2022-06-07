package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_MATE_NES_COUNTS
 *
 * @author emarfkrow
 */
public class PrdMateNesCounts implements IEntity {

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

    /** ORDER_COUNTS */
    private java.math.BigDecimal orderCounts;

    /**
     * @return ORDER_COUNTS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ORDER_COUNTS")
    public java.math.BigDecimal getOrderCounts() {
        return this.orderCounts;
    }

    /**
     * @param o ORDER_COUNTS
     */
    public void setOrderCounts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderCounts = new java.math.BigDecimal(o.toString());
        } else {
            this.orderCounts = null;
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

    /** ORDER_UNIT */
    private java.math.BigDecimal orderUnit;

    /**
     * @return ORDER_UNIT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ORDER_UNIT")
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

    /** ORDER_AMOUNT */
    private java.math.BigDecimal orderAmount;

    /**
     * @return ORDER_AMOUNT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("ORDER_AMOUNT")
    public java.math.BigDecimal getOrderAmount() {
        return this.orderAmount;
    }

    /**
     * @param o ORDER_AMOUNT
     */
    public void setOrderAmount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orderAmount = new java.math.BigDecimal(o.toString());
        } else {
            this.orderAmount = null;
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
     * PRD_MATE_NES_COUNTS照会
     *
     * @param param1 YYYY
     * @param param2 MM
     * @param param3 HINBAN
     * @return PRD_MATE_NES_COUNTS
     */
    public static PrdMateNesCounts get(final Object param1, final Object param2, final Object param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");

        String sql = "SELECT * FROM PRD_MATE_NES_COUNTS WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);
        params.put("hinban", param3);

        return Queries.get(sql, params, PrdMateNesCounts.class);
    }

    /**
     * PRD_MATE_NES_COUNTS追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // HINBANの採番処理
        numbering();

        // INV_Y_STK_AMOUNT_PROGの登録
        if (this.invYStkAmountProgs != null) {
            for (InvYStkAmountProg invYStkAmountProg : this.invYStkAmountProgs) {
                invYStkAmountProg.setYyyy(this.getYyyy());
                invYStkAmountProg.setMm(this.getMm());
                invYStkAmountProg.setHinban(this.getHinban());
                invYStkAmountProg.insert(now, id);
            }
        }

        // PRD_M_SUP_BUDGET_PURの登録
        if (this.prdMSupBudgetPurs != null) {
            for (PrdMSupBudgetPur prdMSupBudgetPur : this.prdMSupBudgetPurs) {
                prdMSupBudgetPur.setYyyy(this.getYyyy());
                prdMSupBudgetPur.setMm(this.getMm());
                prdMSupBudgetPur.setHinban(this.getHinban());
                prdMSupBudgetPur.insert(now, id);
            }
        }

        // PRD_MATE_NES_COUNTSの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YYYY\" -- :yyyy");
        nameList.add("\"MM\" -- :mm");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"ORDER_COUNTS\" -- :order_counts");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"ORDER_UNIT\" -- :order_unit");
        nameList.add("\"ORDER_AMOUNT\" -- :order_amount");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_MATE_NES_COUNTS(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":hinban");
        valueList.add(":order_counts");
        valueList.add(":sup_code");
        valueList.add(":order_unit");
        valueList.add(":order_amount");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** HINBANの採番処理 */
    private void numbering() {

        if (this.hinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"HINBAN\") IS NULL THEN 0 ELSE MAX(e.\"HINBAN\") * 1 END + 1, 25, '0') AS \"HINBAN\" FROM PRD_MATE_NES_COUNTS e WHERE e.\"HINBAN\" < '9999999999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"YYYY\" = :yyyy");
        whereList.add("e.\"MM\" = :mm");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HINBAN");

        this.setHinban(o);
    }

    /**
     * PRD_MATE_NES_COUNTS更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_Y_STK_AMOUNT_PROGの登録
        if (this.invYStkAmountProgs != null) {
            for (InvYStkAmountProg invYStkAmountProg : this.invYStkAmountProgs) {
                invYStkAmountProg.setYyyy(this.yyyy);
                invYStkAmountProg.setMm(this.mm);
                invYStkAmountProg.setHinban(this.hinban);
                try {
                    invYStkAmountProg.insert(now, id);
                } catch (Exception e) {
                    invYStkAmountProg.update(now, id);
                }
            }
            this.invYStkAmountProgs = null;
            this.referInvYStkAmountProgs();
            if (this.invYStkAmountProgs != null) {
                for (InvYStkAmountProg invYStkAmountProg : this.invYStkAmountProgs) {
                    if (!invYStkAmountProg.getTimeStampChange().equals(now)) {
                        invYStkAmountProg.delete();
                    }
                }
            }
        }

        // PRD_M_SUP_BUDGET_PURの登録
        if (this.prdMSupBudgetPurs != null) {
            for (PrdMSupBudgetPur prdMSupBudgetPur : this.prdMSupBudgetPurs) {
                prdMSupBudgetPur.setYyyy(this.yyyy);
                prdMSupBudgetPur.setMm(this.mm);
                prdMSupBudgetPur.setHinban(this.hinban);
                try {
                    prdMSupBudgetPur.insert(now, id);
                } catch (Exception e) {
                    prdMSupBudgetPur.update(now, id);
                }
            }
            this.prdMSupBudgetPurs = null;
            this.referPrdMSupBudgetPurs();
            if (this.prdMSupBudgetPurs != null) {
                for (PrdMSupBudgetPur prdMSupBudgetPur : this.prdMSupBudgetPurs) {
                    if (!prdMSupBudgetPur.getTimeStampChange().equals(now)) {
                        prdMSupBudgetPur.delete();
                    }
                }
            }
        }

        // PRD_MATE_NES_COUNTSの登録
        String sql = "UPDATE PRD_MATE_NES_COUNTS\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YYYY\" = :yyyy");
        setList.add("\"MM\" = :mm");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"ORDER_COUNTS\" = :order_counts");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"ORDER_UNIT\" = :order_unit");
        setList.add("\"ORDER_AMOUNT\" = :order_amount");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_MATE_NES_COUNTS削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_Y_STK_AMOUNT_PROGの削除
        if (this.invYStkAmountProgs != null) {
            for (InvYStkAmountProg invYStkAmountProg : this.invYStkAmountProgs) {
                invYStkAmountProg.delete();
            }
        }

        // PRD_M_SUP_BUDGET_PURの削除
        if (this.prdMSupBudgetPurs != null) {
            for (PrdMSupBudgetPur prdMSupBudgetPur : this.prdMSupBudgetPurs) {
                prdMSupBudgetPur.delete();
            }
        }

        // PRD_MATE_NES_COUNTSの削除
        String sql = "DELETE FROM PRD_MATE_NES_COUNTS WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YYYY\") = TRIM (:yyyy)");
        whereList.add("TRIM (\"MM\") = TRIM (:mm)");
        whereList.add("TRIM (\"HINBAN\") = TRIM (:hinban)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("hinban", this.hinban);
        params.put("order_counts", this.orderCounts);
        params.put("sup_code", this.supCode);
        params.put("order_unit", this.orderUnit);
        params.put("order_amount", this.orderAmount);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * INV_Y_STK_AMOUNT_PROGのリスト
     */
    private List<InvYStkAmountProg> invYStkAmountProgs;

    /**
     * @return INV_Y_STK_AMOUNT_PROGのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("InvYStkAmountProgs")
    public List<InvYStkAmountProg> getInvYStkAmountProgs() {
        return this.invYStkAmountProgs;
    }

    /**
     * @param list INV_Y_STK_AMOUNT_PROGのリスト
     */
    public void setInvYStkAmountProgs(final List<InvYStkAmountProg> list) {
        this.invYStkAmountProgs = list;
    }

    /**
     * @param invYStkAmountProg
     */
    public void addInvYStkAmountProgs(final InvYStkAmountProg invYStkAmountProg) {
        if (this.invYStkAmountProgs == null) {
            this.invYStkAmountProgs = new ArrayList<InvYStkAmountProg>();
        }
        this.invYStkAmountProgs.add(invYStkAmountProg);
    }

    /**
     * @return INV_Y_STK_AMOUNT_PROGのリスト
     */
    public List<InvYStkAmountProg> referInvYStkAmountProgs() {
        if (this.invYStkAmountProgs == null) {
            this.invYStkAmountProgs = PrdMateNesCounts.referInvYStkAmountProgs(this.yyyy, this.mm, this.hinban);
        }
        return this.invYStkAmountProgs;
    }

    /**
     * @param param1 yyyy
     * @param param2 mm
     * @param param3 hinban
     * @return List<InvYStkAmountProg>
     */
    public static List<InvYStkAmountProg> referInvYStkAmountProgs(final String param1, final String param2, final String param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("yyyy = :yyyy");
        whereList.add("mm = :mm");
        whereList.add("hinban = :hinban");

        String sql = "SELECT * FROM INV_Y_STK_AMOUNT_PROG WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);
        params.put("hinban", param3);

        return Queries.select(sql, params, InvYStkAmountProg.class);
    }

    /**
     * PRD_M_SUP_BUDGET_PURのリスト
     */
    private List<PrdMSupBudgetPur> prdMSupBudgetPurs;

    /**
     * @return PRD_M_SUP_BUDGET_PURのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdMSupBudgetPurs")
    public List<PrdMSupBudgetPur> getPrdMSupBudgetPurs() {
        return this.prdMSupBudgetPurs;
    }

    /**
     * @param list PRD_M_SUP_BUDGET_PURのリスト
     */
    public void setPrdMSupBudgetPurs(final List<PrdMSupBudgetPur> list) {
        this.prdMSupBudgetPurs = list;
    }

    /**
     * @param prdMSupBudgetPur
     */
    public void addPrdMSupBudgetPurs(final PrdMSupBudgetPur prdMSupBudgetPur) {
        if (this.prdMSupBudgetPurs == null) {
            this.prdMSupBudgetPurs = new ArrayList<PrdMSupBudgetPur>();
        }
        this.prdMSupBudgetPurs.add(prdMSupBudgetPur);
    }

    /**
     * @return PRD_M_SUP_BUDGET_PURのリスト
     */
    public List<PrdMSupBudgetPur> referPrdMSupBudgetPurs() {
        if (this.prdMSupBudgetPurs == null) {
            this.prdMSupBudgetPurs = PrdMateNesCounts.referPrdMSupBudgetPurs(this.yyyy, this.mm, this.hinban);
        }
        return this.prdMSupBudgetPurs;
    }

    /**
     * @param param1 yyyy
     * @param param2 mm
     * @param param3 hinban
     * @return List<PrdMSupBudgetPur>
     */
    public static List<PrdMSupBudgetPur> referPrdMSupBudgetPurs(final String param1, final String param2, final String param3) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("yyyy = :yyyy");
        whereList.add("mm = :mm");
        whereList.add("hinban = :hinban");

        String sql = "SELECT * FROM PRD_M_SUP_BUDGET_PUR WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);
        params.put("hinban", param3);

        return Queries.select(sql, params, PrdMSupBudgetPur.class);
    }
}
