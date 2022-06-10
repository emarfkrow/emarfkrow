package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * セット構成マスタ
 *
 * @author emarfkrow
 */
public class MSetkose implements IEntity {

    /** セット品番 */
    private String setHinban;

    /**
     * @return セット品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SET-HINBAN")
    public String getSetHinban() {
        return this.setHinban;
    }

    /**
     * @param o セット品番
     */
    public void setSetHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setHinban = String.valueOf(o.toString());
        } else {
            this.setHinban = null;
        }
    }

    /** セット子品番 */
    private String setKhinban;

    /**
     * @return セット子品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SET-KHINBAN")
    public String getSetKhinban() {
        return this.setKhinban;
    }

    /**
     * @param o セット子品番
     */
    public void setSetKhinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setKhinban = String.valueOf(o.toString());
        } else {
            this.setKhinban = null;
        }
    }

    /** 削除フラグ */
    private java.math.BigDecimal dltflg = new java.math.BigDecimal(0);

    /**
     * @return 削除フラグ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DLTFLG")
    public java.math.BigDecimal getDltflg() {
        return this.dltflg;
    }

    /**
     * @param o 削除フラグ
     */
    public void setDltflg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dltflg = new java.math.BigDecimal(o.toString());
        } else {
            this.dltflg = null;
        }
    }

    /** ボトムフラグ */
    private String botm;

    /**
     * @return ボトムフラグ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("BOTM")
    public String getBotm() {
        return this.botm;
    }

    /**
     * @param o ボトムフラグ
     */
    public void setBotm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.botm = String.valueOf(o.toString());
        } else {
            this.botm = null;
        }
    }

    /** セット員数 */
    private java.math.BigDecimal setinzu;

    /**
     * @return セット員数
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SETINZU")
    public java.math.BigDecimal getSetinzu() {
        return this.setinzu;
    }

    /**
     * @param o セット員数
     */
    public void setSetinzu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setinzu = new java.math.BigDecimal(o.toString());
        } else {
            this.setinzu = null;
        }
    }

    /** 無償支給区分 */
    private String mushokbn;

    /**
     * @return 無償支給区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MUSHOKBN")
    public String getMushokbn() {
        return this.mushokbn;
    }

    /**
     * @param o 無償支給区分
     */
    public void setMushokbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mushokbn = String.valueOf(o.toString());
        } else {
            this.mushokbn = null;
        }
    }

    /**
     * セット構成マスタ照会
     *
     * @param param1 セット品番
     * @param param2 セット子品番
     * @return セット構成マスタ
     */
    public static MSetkose get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SET-HINBAN\" = :set_hinban");
        whereList.add("\"SET-KHINBAN\" = :set_khinban");

        String sql = "SELECT * FROM M_SETKOSE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("set_hinban", param1);
        params.put("set_khinban", param2);

        return Queries.get(sql, params, MSetkose.class);
    }

    /**
     * セット構成マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // セット構成マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"SET-HINBAN\" -- :set_hinban");
        nameList.add("\"SET-KHINBAN\" -- :set_khinban");
        nameList.add("\"DLTFLG\" -- :dltflg");
        nameList.add("\"BOTM\" -- :botm");
        nameList.add("\"SETINZU\" -- :setinzu");
        nameList.add("\"MUSHOKBN\" -- :mushokbn");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_SETKOSE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":set_hinban");
        valueList.add(":set_khinban");
        valueList.add(":dltflg");
        valueList.add(":botm");
        valueList.add(":setinzu");
        valueList.add(":mushokbn");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * セット構成マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // セット構成マスタの登録
        String sql = "UPDATE M_SETKOSE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"SET-HINBAN\" = :set_hinban");
        setList.add("\"SET-KHINBAN\" = :set_khinban");
        setList.add("\"DLTFLG\" = :dltflg");
        setList.add("\"BOTM\" = :botm");
        setList.add("\"SETINZU\" = :setinzu");
        setList.add("\"MUSHOKBN\" = :mushokbn");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * セット構成マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // セット構成マスタの削除
        String sql = "DELETE FROM M_SETKOSE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SET-HINBAN\" = :set_hinban");
        whereList.add("\"SET-KHINBAN\" = :set_khinban");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("set_hinban", this.setHinban);
        params.put("set_khinban", this.setKhinban);
        params.put("dltflg", this.dltflg);
        params.put("botm", this.botm);
        params.put("setinzu", this.setinzu);
        params.put("mushokbn", this.mushokbn);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
