package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 部品構成マスタ
 *
 * @author emarfkrow
 */
public class MPkose implements IEntity {

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

    /** 販売品名 */
    private String hinmei;

    /**
     * @return 販売品名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINMEI")
    public String getHinmei() {
        return this.hinmei;
    }

    /**
     * @param o 販売品名
     */
    public void setHinmei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinmei = String.valueOf(o.toString());
        } else {
            this.hinmei = null;
        }
    }

    /** 部品品番 */
    private String phinban;

    /**
     * @return 部品品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PHINBAN")
    public String getPhinban() {
        return this.phinban;
    }

    /**
     * @param o 部品品番
     */
    public void setPhinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.phinban = String.valueOf(o.toString());
        } else {
            this.phinban = null;
        }
    }

    /** 部品名 */
    private String phinmei;

    /**
     * @return 部品名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PHINMEI")
    public String getPhinmei() {
        return this.phinmei;
    }

    /**
     * @param o 部品名
     */
    public void setPhinmei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.phinmei = String.valueOf(o.toString());
        } else {
            this.phinmei = null;
        }
    }

    /** 登録日 */
    private java.math.BigDecimal tourokubi;

    /**
     * @return 登録日
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOUROKUBI")
    public java.math.BigDecimal getTourokubi() {
        return this.tourokubi;
    }

    /**
     * @param o 登録日
     */
    public void setTourokubi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tourokubi = new java.math.BigDecimal(o.toString());
        } else {
            this.tourokubi = null;
        }
    }

    /**
     * 部品構成マスタ照会
     *
     * @param param1 販売品番
     * @param param2 部品品番
     * @return 部品構成マスタ
     */
    public static MPkose get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HHINBAN\" = :hhinban");
        whereList.add("\"PHINBAN\" = :phinban");

        String sql = "SELECT * FROM M_PKOSE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);
        params.put("phinban", param2);

        return Queries.get(sql, params, MPkose.class);
    }

    /**
     * 部品構成マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 部品構成マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HHINBAN\" -- :hhinban");
        nameList.add("\"HINMEI\" -- :hinmei");
        nameList.add("\"PHINBAN\" -- :phinban");
        nameList.add("\"PHINMEI\" -- :phinmei");
        nameList.add("\"TOUROKUBI\" -- :tourokubi");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_PKOSE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":hinmei");
        valueList.add(":phinban");
        valueList.add(":phinmei");
        valueList.add(":tourokubi");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 部品構成マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 部品構成マスタの登録
        String sql = "UPDATE M_PKOSE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HHINBAN\" = :hhinban");
        setList.add("\"HINMEI\" = :hinmei");
        setList.add("\"PHINBAN\" = :phinban");
        setList.add("\"PHINMEI\" = :phinmei");
        setList.add("\"TOUROKUBI\" = :tourokubi");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 部品構成マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 部品構成マスタの削除
        String sql = "DELETE FROM M_PKOSE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HHINBAN\" = :hhinban");
        whereList.add("\"PHINBAN\" = :phinban");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", this.hhinban);
        params.put("hinmei", this.hinmei);
        params.put("phinban", this.phinban);
        params.put("phinmei", this.phinmei);
        params.put("tourokubi", this.tourokubi);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
