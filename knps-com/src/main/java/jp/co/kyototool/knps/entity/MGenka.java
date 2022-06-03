package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 原価マスタ
 *
 * @author emarfkrow
 */
public class MGenka implements IEntity {

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

    /** 品目コード */
    private String hincd;

    /**
     * @return 品目コード
     */
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
     * 原価マスタ照会
     *
     * @param param1 販売品番
     * @return 原価マスタ
     */
    public static MGenka get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HHINBAN\") = TRIM (:hhinban)");

        String sql = "SELECT * FROM M_GENKA WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);

        return Queries.get(sql, params, MGenka.class);
    }

    /**
     * 原価マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 販売品番の採番処理
        numbering();

        // 原価マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("hhinban -- :hhinban");
        nameList.add("hincd -- :hincd");
        nameList.add("setkbn -- :setkbn");
        nameList.add("genka -- :genka");
        nameList.add("seihin_genka -- :seihin_genka");
        nameList.add("shohin_genka -- :shohin_genka");
        nameList.add("baika -- :baika");
        nameList.add("seihin_baika -- :seihin_baika");
        nameList.add("shohin_baika -- :shohin_baika");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_GENKA(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":hincd");
        valueList.add(":setkbn");
        valueList.add(":genka");
        valueList.add(":seihin-genka");
        valueList.add(":shohin-genka");
        valueList.add(":baika");
        valueList.add(":seihin-baika");
        valueList.add(":shohin-baika");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 販売品番の採番処理 */
    private void numbering() {

        if (this.hhinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.HHINBAN) IS NULL THEN 0 ELSE MAX(e.HHINBAN) * 1 END + 1, 20, '0') AS HHINBAN FROM M_GENKA e WHERE e.HHINBAN < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HHINBAN");

        this.setHhinban(o);
    }

    /**
     * 原価マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 原価マスタの登録
        String sql = "UPDATE M_GENKA\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("hhinban = :hhinban");
        setList.add("hincd = :hincd");
        setList.add("setkbn = :setkbn");
        setList.add("genka = :genka");
        setList.add("seihin-genka = :seihin-genka");
        setList.add("shohin-genka = :shohin-genka");
        setList.add("baika = :baika");
        setList.add("seihin-baika = :seihin-baika");
        setList.add("shohin-baika = :shohin-baika");
        setList.add("filler = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 原価マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 原価マスタの削除
        String sql = "DELETE FROM M_GENKA WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hhinban) = TRIM (:hhinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("HHINBAN", this.hhinban);
        params.put("HINCD", this.hincd);
        params.put("SETKBN", this.setkbn);
        params.put("GENKA", this.genka);
        params.put("SEIHIN-GENKA", this.seihinGenka);
        params.put("SHOHIN-GENKA", this.shohinGenka);
        params.put("BAIKA", this.baika);
        params.put("SEIHIN-BAIKA", this.seihinBaika);
        params.put("SHOHIN-BAIKA", this.shohinBaika);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
