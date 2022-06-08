package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 品番変換マスタ
 *
 * @author emarfkrow
 */
public class MHinccvt implements IEntity {

    /** 変換品番 */
    private String cvthinban;

    /**
     * @return 変換品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CVTHINBAN")
    public String getCvthinban() {
        return this.cvthinban;
    }

    /**
     * @param o 変換品番
     */
    public void setCvthinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.cvthinban = String.valueOf(o.toString());
        } else {
            this.cvthinban = null;
        }
    }

    /** 販売品番 */
    private String hhinban;

    /**
     * @return 販売品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HHINBAN")
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

    /** 直送対象品区分 */
    private String chokuhinkbn;

    /**
     * @return 直送対象品区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CHOKUHINKBN")
    public String getChokuhinkbn() {
        return this.chokuhinkbn;
    }

    /**
     * @param o 直送対象品区分
     */
    public void setChokuhinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chokuhinkbn = String.valueOf(o.toString());
        } else {
            this.chokuhinkbn = null;
        }
    }

    /** 予備領域 */
    private String filler;

    /**
     * @return 予備領域
     */
    @com.fasterxml.jackson.annotation.JsonProperty("FILLER")
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
     * 品番変換マスタ照会
     *
     * @param param1 変換品番
     * @param param2 直送対象品区分
     * @return 品番変換マスタ
     */
    public static MHinccvt get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"CVTHINBAN\" = :cvthinban");
        whereList.add("TRIM (\"CHOKUHINKBN\") = TRIM (:chokuhinkbn)");

        String sql = "SELECT * FROM M_HINCCVT WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("cvthinban", param1);
        params.put("chokuhinkbn", param2);

        return Queries.get(sql, params, MHinccvt.class);
    }

    /**
     * 品番変換マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 直送対象品区分の採番処理
        numbering();

        // 品番変換マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"CVTHINBAN\" -- :cvthinban");
        nameList.add("\"HHINBAN\" -- :hhinban");
        nameList.add("\"CHOKUHINKBN\" -- :chokuhinkbn");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_HINCCVT(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":cvthinban");
        valueList.add(":hhinban");
        valueList.add(":chokuhinkbn");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 直送対象品区分の採番処理 */
    private void numbering() {

        if (this.chokuhinkbn != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"CHOKUHINKBN\") IS NULL THEN 0 ELSE MAX(e.\"CHOKUHINKBN\") * 1 END + 1, 1, '0') AS \"CHOKUHINKBN\" FROM M_HINCCVT e WHERE e.\"CHOKUHINKBN\" < '9'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"CVTHINBAN\" = :cvthinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("cvthinban", this.cvthinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("CHOKUHINKBN");

        this.setChokuhinkbn(o);
    }

    /**
     * 品番変換マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 品番変換マスタの登録
        String sql = "UPDATE M_HINCCVT\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"CVTHINBAN\" = :cvthinban");
        setList.add("\"HHINBAN\" = :hhinban");
        setList.add("\"CHOKUHINKBN\" = :chokuhinkbn");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 品番変換マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 品番変換マスタの削除
        String sql = "DELETE FROM M_HINCCVT WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"CVTHINBAN\" = :cvthinban");
        whereList.add("TRIM (\"CHOKUHINKBN\") = TRIM (:chokuhinkbn)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("cvthinban", this.cvthinban);
        params.put("hhinban", this.hhinban);
        params.put("chokuhinkbn", this.chokuhinkbn);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
