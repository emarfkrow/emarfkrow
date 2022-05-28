package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_Y_PRO_PLAN_HINBAN
 *
 * @author emarfkrow
 */
public class PrdYProPlanHinban implements IEntity {

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

    /** ITEM_KBN */
    private java.math.BigDecimal itemKbn;

    /**
     * @return ITEM_KBN
     */
    public java.math.BigDecimal getItemKbn() {
        return this.itemKbn;
    }

    /**
     * @param o ITEM_KBN
     */
    public void setItemKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.itemKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.itemKbn = null;
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

    /** PARENT_HINBAN */
    private String parentHinban;

    /**
     * @return PARENT_HINBAN
     */
    public String getParentHinban() {
        return this.parentHinban;
    }

    /**
     * @param o PARENT_HINBAN
     */
    public void setParentHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.parentHinban = String.valueOf(o.toString());
        } else {
            this.parentHinban = null;
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
     * PRD_Y_PRO_PLAN_HINBAN照会
     *
     * @param param1 YYYY
     * @param param2 MM
     * @param param3 PRO_HINBAN
     * @param param4 HINBAN
     * @return PRD_Y_PRO_PLAN_HINBAN
     */
    public static PrdYProPlanHinban get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (yyyy) = TRIM (:yyyy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");
        whereList.add("TRIM (pro_hinban) = TRIM (:pro_hinban)");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");

        String sql = "SELECT * FROM PRD_Y_PRO_PLAN_HINBAN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);
        params.put("pro_hinban", param3);
        params.put("hinban", param4);

        return Queries.get(sql, params, PrdYProPlanHinban.class);
    }

    /**
     * PRD_Y_PRO_PLAN_HINBAN追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // HINBANの採番処理
        numbering();

        // PRD_Y_PRO_PLAN_ROUTINGの登録
        if (this.prdYProPlanRoutings != null) {
            for (PrdYProPlanRouting prdYProPlanRouting : this.prdYProPlanRoutings) {
                prdYProPlanRouting.setYyyy(this.getYyyy());
                prdYProPlanRouting.setMm(this.getMm());
                prdYProPlanRouting.setProHinban(this.getProHinban());
                prdYProPlanRouting.setHinban(this.getHinban());
                prdYProPlanRouting.insert(now, id);
            }
        }

        // PRD_Y_PRO_PLAN_HINBANの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("yyyy -- :yyyy");
        nameList.add("mm -- :mm");
        nameList.add("pro_hinban -- :pro_hinban");
        nameList.add("hinban -- :hinban");
        nameList.add("item_kbn -- :item_kbn");
        nameList.add("shikake_kbn -- :shikake_kbn");
        nameList.add("nes_counts -- :nes_counts");
        nameList.add("parent_hinban -- :parent_hinban");
        nameList.add("pro_lt -- :pro_lt");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_Y_PRO_PLAN_HINBAN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":pro_hinban");
        valueList.add(":hinban");
        valueList.add(":item_kbn");
        valueList.add(":shikake_kbn");
        valueList.add(":nes_counts");
        valueList.add(":parent_hinban");
        valueList.add(":pro_lt");
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

        String sql = "SELECT LPAD (CASE WHEN MAX(e.HINBAN) IS NULL THEN 0 ELSE MAX(e.HINBAN) * 1 END + 1, 25, '0') AS HINBAN FROM PRD_Y_PRO_PLAN_HINBAN e WHERE e.HINBAN < '9999999999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.YYYY = :yyyy");
        whereList.add("e.MM = :mm");
        whereList.add("e.PRO_HINBAN = :pro_hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("yyyy", this.yyyy);
        params.put("mm", this.mm);
        params.put("proHinban", this.proHinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HINBAN");

        this.setHinban(o);
    }

    /**
     * PRD_Y_PRO_PLAN_HINBAN更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_Y_PRO_PLAN_ROUTINGの登録
        if (this.prdYProPlanRoutings != null) {
            for (PrdYProPlanRouting prdYProPlanRouting : this.prdYProPlanRoutings) {
                prdYProPlanRouting.setYyyy(this.yyyy);
                prdYProPlanRouting.setMm(this.mm);
                prdYProPlanRouting.setProHinban(this.proHinban);
                prdYProPlanRouting.setHinban(this.hinban);
                try {
                    prdYProPlanRouting.insert(now, id);
                } catch (Exception e) {
                    prdYProPlanRouting.update(now, id);
                }
            }
            this.prdYProPlanRoutings = null;
            this.referPrdYProPlanRoutings();
            if (this.prdYProPlanRoutings != null) {
                for (PrdYProPlanRouting prdYProPlanRouting : this.prdYProPlanRoutings) {
                    if (!prdYProPlanRouting.getTimeStampChange().equals(now)) {
                        prdYProPlanRouting.delete();
                    }
                }
            }
        }

        // PRD_Y_PRO_PLAN_HINBANの登録
        String sql = "UPDATE PRD_Y_PRO_PLAN_HINBAN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("yyyy = :yyyy");
        setList.add("mm = :mm");
        setList.add("pro_hinban = :pro_hinban");
        setList.add("hinban = :hinban");
        setList.add("item_kbn = :item_kbn");
        setList.add("shikake_kbn = :shikake_kbn");
        setList.add("nes_counts = :nes_counts");
        setList.add("parent_hinban = :parent_hinban");
        setList.add("pro_lt = :pro_lt");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_Y_PRO_PLAN_HINBAN削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_Y_PRO_PLAN_ROUTINGの削除
        if (this.prdYProPlanRoutings != null) {
            for (PrdYProPlanRouting prdYProPlanRouting : this.prdYProPlanRoutings) {
                prdYProPlanRouting.delete();
            }
        }

        // PRD_Y_PRO_PLAN_HINBANの削除
        String sql = "DELETE FROM PRD_Y_PRO_PLAN_HINBAN WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (yyyy) = TRIM (:yyyy)");
        whereList.add("TRIM (mm) = TRIM (:mm)");
        whereList.add("TRIM (pro_hinban) = TRIM (:pro_hinban)");
        whereList.add("TRIM (hinban) = TRIM (:hinban)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YYYY", this.yyyy);
        params.put("MM", this.mm);
        params.put("PRO_HINBAN", this.proHinban);
        params.put("HINBAN", this.hinban);
        params.put("ITEM_KBN", this.itemKbn);
        params.put("SHIKAKE_KBN", this.shikakeKbn);
        params.put("NES_COUNTS", this.nesCounts);
        params.put("PARENT_HINBAN", this.parentHinban);
        params.put("PRO_LT", this.proLt);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_Y_PRO_PLAN_ROUTINGのリスト
     */
    private List<PrdYProPlanRouting> prdYProPlanRoutings;

    /**
     * @return PRD_Y_PRO_PLAN_ROUTINGのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdYProPlanRoutings")
    public List<PrdYProPlanRouting> getPrdYProPlanRoutings() {
        return this.prdYProPlanRoutings;
    }

    /**
     * @param list PRD_Y_PRO_PLAN_ROUTINGのリスト
     */
    public void setPrdYProPlanRoutings(final List<PrdYProPlanRouting> list) {
        this.prdYProPlanRoutings = list;
    }

    /**
     * @param prdYProPlanRouting
     */
    public void addPrdYProPlanRoutings(final PrdYProPlanRouting prdYProPlanRouting) {
        if (this.prdYProPlanRoutings == null) {
            this.prdYProPlanRoutings = new ArrayList<PrdYProPlanRouting>();
        }
        this.prdYProPlanRoutings.add(prdYProPlanRouting);
    }

    /**
     * @return PRD_Y_PRO_PLAN_ROUTINGのリスト
     */
    public List<PrdYProPlanRouting> referPrdYProPlanRoutings() {
        if (this.prdYProPlanRoutings == null) {
            this.prdYProPlanRoutings = PrdYProPlanHinban.referPrdYProPlanRoutings(this.yyyy, this.mm, this.proHinban, this.hinban);
        }
        return this.prdYProPlanRoutings;
    }

    /**
     * @param param1 yyyy
     * @param param2 mm
     * @param param3 proHinban
     * @param param4 hinban
     * @return List<PrdYProPlanRouting>
     */
    public static List<PrdYProPlanRouting> referPrdYProPlanRoutings(final String param1, final String param2, final String param3, final String param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("yyyy = :yyyy");
        whereList.add("mm = :mm");
        whereList.add("pro_hinban = :pro_hinban");
        whereList.add("hinban = :hinban");

        String sql = "SELECT * FROM PRD_Y_PRO_PLAN_ROUTING WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yyyy", param1);
        params.put("mm", param2);
        params.put("pro_hinban", param3);
        params.put("hinban", param4);

        return Queries.select(sql, params, PrdYProPlanRouting.class);
    }
}
