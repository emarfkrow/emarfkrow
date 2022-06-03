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
    private java.math.BigDecimal dltflg;

    /**
     * @return 削除フラグ
     */
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

    /** 予備領域 */
    private String filler;

    /**
     * @return 予備領域
     */
    public String getFiller() {
        return this.filler;
    }

    /**
     * @param o 予備領域
     */
    public void setFiller(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.filler = String.valueOf(o.toString());
        } else {
            this.filler = null;
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
        whereList.add("TRIM (\"SET-HINBAN\") = TRIM (:set_hinban)");
        whereList.add("TRIM (\"SET-KHINBAN\") = TRIM (:set_khinban)");

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

        // セット子品番の採番処理
        numbering();

        // セット構成マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("set_hinban -- :set_hinban");
        nameList.add("set_khinban -- :set_khinban");
        nameList.add("dltflg -- :dltflg");
        nameList.add("botm -- :botm");
        nameList.add("setinzu -- :setinzu");
        nameList.add("mushokbn -- :mushokbn");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_SETKOSE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":set-hinban");
        valueList.add(":set-khinban");
        valueList.add(":dltflg");
        valueList.add(":botm");
        valueList.add(":setinzu");
        valueList.add(":mushokbn");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** セット子品番の採番処理 */
    private void numbering() {

        if (this.setKhinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.SET-KHINBAN) IS NULL THEN 0 ELSE MAX(e.SET-KHINBAN) * 1 END + 1, 20, '0') AS SET-KHINBAN FROM M_SETKOSE e WHERE e.SET-KHINBAN < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.SET-HINBAN = :set-hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("setHinban", this.setHinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SET-KHINBAN");

        this.setSetKhinban(o);
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
        setList.add("set-hinban = :set-hinban");
        setList.add("set-khinban = :set-khinban");
        setList.add("dltflg = :dltflg");
        setList.add("botm = :botm");
        setList.add("setinzu = :setinzu");
        setList.add("mushokbn = :mushokbn");
        setList.add("filler = :filler");
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
        whereList.add("TRIM (set-hinban) = TRIM (:set-hinban)");
        whereList.add("TRIM (set-khinban) = TRIM (:set-khinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SET-HINBAN", this.setHinban);
        params.put("SET-KHINBAN", this.setKhinban);
        params.put("DLTFLG", this.dltflg);
        params.put("BOTM", this.botm);
        params.put("SETINZU", this.setinzu);
        params.put("MUSHOKBN", this.mushokbn);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
