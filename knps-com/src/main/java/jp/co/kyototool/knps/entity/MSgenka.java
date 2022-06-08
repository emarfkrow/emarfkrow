package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 製品原価マスタ
 *
 * @author emarfkrow
 */
public class MSgenka implements IEntity {

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

    /** 品目コード */
    private String hincd;

    /**
     * @return 品目コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINCD")
    public String getHincd() {
        return this.hincd;
    }

    /**
     * @param o 品目コード
     */
    public void setHincd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hincd = String.valueOf(o.toString());
        } else {
            this.hincd = null;
        }
    }

    /** セット区分 */
    private String setkbn;

    /**
     * @return セット区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SETKBN")
    public String getSetkbn() {
        return this.setkbn;
    }

    /**
     * @param o セット区分
     */
    public void setSetkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setkbn = String.valueOf(o.toString());
        } else {
            this.setkbn = null;
        }
    }

    /** 原価 */
    private java.math.BigDecimal genka;

    /**
     * @return 原価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("GENKA")
    public java.math.BigDecimal getGenka() {
        return this.genka;
    }

    /**
     * @param o 原価
     */
    public void setGenka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.genka = new java.math.BigDecimal(o.toString());
        } else {
            this.genka = null;
        }
    }

    /** 製品原価 */
    private java.math.BigDecimal seihinGenka;

    /**
     * @return 製品原価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SEIHIN-GENKA")
    public java.math.BigDecimal getSeihinGenka() {
        return this.seihinGenka;
    }

    /**
     * @param o 製品原価
     */
    public void setSeihinGenka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.seihinGenka = new java.math.BigDecimal(o.toString());
        } else {
            this.seihinGenka = null;
        }
    }

    /** 商品原価 */
    private java.math.BigDecimal shohinGenka;

    /**
     * @return 商品原価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHOHIN-GENKA")
    public java.math.BigDecimal getShohinGenka() {
        return this.shohinGenka;
    }

    /**
     * @param o 商品原価
     */
    public void setShohinGenka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shohinGenka = new java.math.BigDecimal(o.toString());
        } else {
            this.shohinGenka = null;
        }
    }

    /** 売価 */
    private java.math.BigDecimal baika;

    /**
     * @return 売価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("BAIKA")
    public java.math.BigDecimal getBaika() {
        return this.baika;
    }

    /**
     * @param o 売価
     */
    public void setBaika(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.baika = new java.math.BigDecimal(o.toString());
        } else {
            this.baika = null;
        }
    }

    /** 製品売価 */
    private java.math.BigDecimal seihinBaika;

    /**
     * @return 製品売価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SEIHIN-BAIKA")
    public java.math.BigDecimal getSeihinBaika() {
        return this.seihinBaika;
    }

    /**
     * @param o 製品売価
     */
    public void setSeihinBaika(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.seihinBaika = new java.math.BigDecimal(o.toString());
        } else {
            this.seihinBaika = null;
        }
    }

    /** 商品売価 */
    private java.math.BigDecimal shohinBaika;

    /**
     * @return 商品売価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHOHIN-BAIKA")
    public java.math.BigDecimal getShohinBaika() {
        return this.shohinBaika;
    }

    /**
     * @param o 商品売価
     */
    public void setShohinBaika(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shohinBaika = new java.math.BigDecimal(o.toString());
        } else {
            this.shohinBaika = null;
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
     * 製品原価マスタ照会
     *
     * @param param1 販売品番
     * @return 製品原価マスタ
     */
    public static MSgenka get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HHINBAN\" = :hhinban");

        String sql = "SELECT * FROM M_SGENKA WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);

        return Queries.get(sql, params, MSgenka.class);
    }

    /**
     * 製品原価マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 製品原価マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HHINBAN\" -- :hhinban");
        nameList.add("\"HINCD\" -- :hincd");
        nameList.add("\"SETKBN\" -- :setkbn");
        nameList.add("\"GENKA\" -- :genka");
        nameList.add("\"SEIHIN-GENKA\" -- :seihin_genka");
        nameList.add("\"SHOHIN-GENKA\" -- :shohin_genka");
        nameList.add("\"BAIKA\" -- :baika");
        nameList.add("\"SEIHIN-BAIKA\" -- :seihin_baika");
        nameList.add("\"SHOHIN-BAIKA\" -- :shohin_baika");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_SGENKA(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":hincd");
        valueList.add(":setkbn");
        valueList.add(":genka");
        valueList.add(":seihin_genka");
        valueList.add(":shohin_genka");
        valueList.add(":baika");
        valueList.add(":seihin_baika");
        valueList.add(":shohin_baika");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 製品原価マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 製品原価マスタの登録
        String sql = "UPDATE M_SGENKA\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HHINBAN\" = :hhinban");
        setList.add("\"HINCD\" = :hincd");
        setList.add("\"SETKBN\" = :setkbn");
        setList.add("\"GENKA\" = :genka");
        setList.add("\"SEIHIN-GENKA\" = :seihin_genka");
        setList.add("\"SHOHIN-GENKA\" = :shohin_genka");
        setList.add("\"BAIKA\" = :baika");
        setList.add("\"SEIHIN-BAIKA\" = :seihin_baika");
        setList.add("\"SHOHIN-BAIKA\" = :shohin_baika");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 製品原価マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 製品原価マスタの削除
        String sql = "DELETE FROM M_SGENKA WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HHINBAN\" = :hhinban");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", this.hhinban);
        params.put("hincd", this.hincd);
        params.put("setkbn", this.setkbn);
        params.put("genka", this.genka);
        params.put("seihin_genka", this.seihinGenka);
        params.put("shohin_genka", this.shohinGenka);
        params.put("baika", this.baika);
        params.put("seihin_baika", this.seihinBaika);
        params.put("shohin_baika", this.shohinBaika);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
