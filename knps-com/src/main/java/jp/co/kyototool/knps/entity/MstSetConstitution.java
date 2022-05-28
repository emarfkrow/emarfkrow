package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SET_CONSTITUTION
 *
 * @author emarfkrow
 */
public class MstSetConstitution implements IEntity {

    /** SET_HINBAN */
    private String setHinban;

    /**
     * @return SET_HINBAN
     */
    public String getSetHinban() {
        return this.setHinban;
    }

    /**
     * @param o SET_HINBAN
     */
    public void setSetHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setHinban = String.valueOf(o.toString());
        } else {
            this.setHinban = null;
        }
    }

    /** SET_CHILD_HINBAN */
    private String setChildHinban;

    /**
     * @return SET_CHILD_HINBAN
     */
    public String getSetChildHinban() {
        return this.setChildHinban;
    }

    /**
     * @param o SET_CHILD_HINBAN
     */
    public void setSetChildHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setChildHinban = String.valueOf(o.toString());
        } else {
            this.setChildHinban = null;
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

    /** BOTTOM_FLAG */
    private String bottomFlag;

    /**
     * @return BOTTOM_FLAG
     */
    public String getBottomFlag() {
        return this.bottomFlag;
    }

    /**
     * @param o BOTTOM_FLAG
     */
    public void setBottomFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.bottomFlag = String.valueOf(o.toString());
        } else {
            this.bottomFlag = null;
        }
    }

    /** SET_COUNT */
    private java.math.BigDecimal setCount;

    /**
     * @return SET_COUNT
     */
    public java.math.BigDecimal getSetCount() {
        return this.setCount;
    }

    /**
     * @param o SET_COUNT
     */
    public void setSetCount(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setCount = new java.math.BigDecimal(o.toString());
        } else {
            this.setCount = null;
        }
    }

    /** GRATIS_SUPPLY_KBN */
    private String gratisSupplyKbn;

    /**
     * @return GRATIS_SUPPLY_KBN
     */
    public String getGratisSupplyKbn() {
        return this.gratisSupplyKbn;
    }

    /**
     * @param o GRATIS_SUPPLY_KBN
     */
    public void setGratisSupplyKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gratisSupplyKbn = String.valueOf(o.toString());
        } else {
            this.gratisSupplyKbn = null;
        }
    }

    /**
     * MST_SET_CONSTITUTION照会
     *
     * @param param1 SET_HINBAN
     * @param param2 SET_CHILD_HINBAN
     * @return MST_SET_CONSTITUTION
     */
    public static MstSetConstitution get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (set_hinban) = TRIM (:set_hinban)");
        whereList.add("TRIM (set_child_hinban) = TRIM (:set_child_hinban)");

        String sql = "SELECT * FROM MST_SET_CONSTITUTION WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("set_hinban", param1);
        params.put("set_child_hinban", param2);

        return Queries.get(sql, params, MstSetConstitution.class);
    }

    /**
     * MST_SET_CONSTITUTION追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SET_CHILD_HINBANの採番処理
        numbering();

        // MST_SET_CONSTITUTIONの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("set_hinban -- :set_hinban");
        nameList.add("set_child_hinban -- :set_child_hinban");
        nameList.add("delete_flag -- :delete_flag");
        nameList.add("bottom_flag -- :bottom_flag");
        nameList.add("set_count -- :set_count");
        nameList.add("gratis_supply_kbn -- :gratis_supply_kbn");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SET_CONSTITUTION(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":set_hinban");
        valueList.add(":set_child_hinban");
        valueList.add(":delete_flag");
        valueList.add(":bottom_flag");
        valueList.add(":set_count");
        valueList.add(":gratis_supply_kbn");
        return String.join("\r\n    , ", valueList);
    }

    /** SET_CHILD_HINBANの採番処理 */
    private void numbering() {

        if (this.setChildHinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.SET_CHILD_HINBAN) IS NULL THEN 0 ELSE MAX(e.SET_CHILD_HINBAN) * 1 END + 1, 20, '0') AS SET_CHILD_HINBAN FROM MST_SET_CONSTITUTION e WHERE e.SET_CHILD_HINBAN < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.SET_HINBAN = :set_hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("setHinban", this.setHinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SET_CHILD_HINBAN");

        this.setSetChildHinban(o);
    }

    /**
     * MST_SET_CONSTITUTION更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_SET_CONSTITUTIONの登録
        String sql = "UPDATE MST_SET_CONSTITUTION\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("set_hinban = :set_hinban");
        setList.add("set_child_hinban = :set_child_hinban");
        setList.add("delete_flag = :delete_flag");
        setList.add("bottom_flag = :bottom_flag");
        setList.add("set_count = :set_count");
        setList.add("gratis_supply_kbn = :gratis_supply_kbn");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SET_CONSTITUTION削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_SET_CONSTITUTIONの削除
        String sql = "DELETE FROM MST_SET_CONSTITUTION WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (set_hinban) = TRIM (:set_hinban)");
        whereList.add("TRIM (set_child_hinban) = TRIM (:set_child_hinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SET_HINBAN", this.setHinban);
        params.put("SET_CHILD_HINBAN", this.setChildHinban);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("BOTTOM_FLAG", this.bottomFlag);
        params.put("SET_COUNT", this.setCount);
        params.put("GRATIS_SUPPLY_KBN", this.gratisSupplyKbn);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
