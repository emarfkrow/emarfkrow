package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 包装材構成マスタ
 *
 * @author emarfkrow
 */
public class MHososet implements IEntity {

    /** 販売品番 */
    private String hhinban;

    /**
     * @return 販売品番
     */
    public String getHhinban() {
        return this.hhinban;
    }

    /**
     * @param o 販売品番
     */
    public void setHhinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hhinban = String.valueOf(o.toString());
        } else {
            this.hhinban = null;
        }
    }

    /** 包装品番 */
    private String hosoHinban;

    /**
     * @return 包装品番
     */
    public String getHosoHinban() {
        return this.hosoHinban;
    }

    /**
     * @param o 包装品番
     */
    public void setHosoHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoHinban = String.valueOf(o.toString());
        } else {
            this.hosoHinban = null;
        }
    }

    /** 員数 */
    private java.math.BigDecimal inzu;

    /**
     * @return 員数
     */
    public java.math.BigDecimal getInzu() {
        return this.inzu;
    }

    /**
     * @param o 員数
     */
    public void setInzu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.inzu = new java.math.BigDecimal(o.toString());
        } else {
            this.inzu = null;
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
     * 包装材構成マスタ照会
     *
     * @param param1 販売品番
     * @param param2 包装品番
     * @return 包装材構成マスタ
     */
    public static MHososet get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HHINBAN\") = TRIM (:hhinban)");
        whereList.add("TRIM (\"HOSO-HINBAN\") = TRIM (:hoso_hinban)");

        String sql = "SELECT * FROM M_HOSOSET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);
        params.put("hoso_hinban", param2);

        return Queries.get(sql, params, MHososet.class);
    }

    /**
     * 包装材構成マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 包装品番の採番処理
        numbering();

        // 包装材構成マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HHINBAN\" -- :hhinban");
        nameList.add("\"HOSO-HINBAN\" -- :hoso_hinban");
        nameList.add("\"INZU\" -- :inzu");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_HOSOSET(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":hoso_hinban");
        valueList.add(":inzu");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 包装品番の採番処理 */
    private void numbering() {

        if (this.hosoHinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"HOSO-HINBAN\") IS NULL THEN 0 ELSE MAX(e.\"HOSO-HINBAN\") * 1 END + 1, 25, '0') AS \"HOSO-HINBAN\" FROM M_HOSOSET e WHERE e.\"HOSO-HINBAN\" < '9999999999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"HHINBAN\" = :hhinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("hhinban", this.hhinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HOSO-HINBAN");

        this.setHosoHinban(o);
    }

    /**
     * 包装材構成マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 包装材構成マスタの登録
        String sql = "UPDATE M_HOSOSET\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HHINBAN\" = :hhinban");
        setList.add("\"HOSO-HINBAN\" = :hoso_hinban");
        setList.add("\"INZU\" = :inzu");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 包装材構成マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 包装材構成マスタの削除
        String sql = "DELETE FROM M_HOSOSET WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HHINBAN\") = TRIM (:hhinban)");
        whereList.add("TRIM (\"HOSO-HINBAN\") = TRIM (:hoso_hinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", this.hhinban);
        params.put("hoso_hinban", this.hosoHinban);
        params.put("inzu", this.inzu);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
