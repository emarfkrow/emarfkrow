package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * バラ展開マスタ
 *
 * @author emarfkrow
 */
public class MBaraten implements IEntity {

    /** 親品番 */
    private String oyaHinban;

    /**
     * @return 親品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA-HINBAN")
    public String getOyaHinban() {
        return this.oyaHinban;
    }

    /**
     * @param o 親品番
     */
    public void setOyaHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaHinban = String.valueOf(o.toString());
        } else {
            this.oyaHinban = null;
        }
    }

    /** 子品番 */
    private String koHinban;

    /**
     * @return 子品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KO-HINBAN")
    public String getKoHinban() {
        return this.koHinban;
    }

    /**
     * @param o 子品番
     */
    public void setKoHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koHinban = String.valueOf(o.toString());
        } else {
            this.koHinban = null;
        }
    }

    /** 親品目コード */
    private String oyaHinc;

    /**
     * @return 親品目コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA-HINC")
    public String getOyaHinc() {
        return this.oyaHinc;
    }

    /**
     * @param o 親品目コード
     */
    public void setOyaHinc(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaHinc = String.valueOf(o.toString());
        } else {
            this.oyaHinc = null;
        }
    }

    /** 子品目コード */
    private String koHinc;

    /**
     * @return 子品目コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KO-HINC")
    public String getKoHinc() {
        return this.koHinc;
    }

    /**
     * @param o 子品目コード
     */
    public void setKoHinc(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koHinc = String.valueOf(o.toString());
        } else {
            this.koHinc = null;
        }
    }

    /** 員数 */
    private java.math.BigDecimal inzu;

    /**
     * @return 員数
     */
    @com.fasterxml.jackson.annotation.JsonProperty("INZU")
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

    /** 親売価 */
    private java.math.BigDecimal oyaBaika;

    /**
     * @return 親売価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA-BAIKA")
    public java.math.BigDecimal getOyaBaika() {
        return this.oyaBaika;
    }

    /**
     * @param o 親売価
     */
    public void setOyaBaika(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaBaika = new java.math.BigDecimal(o.toString());
        } else {
            this.oyaBaika = null;
        }
    }

    /** 親原価 */
    private java.math.BigDecimal oyaGenka;

    /**
     * @return 親原価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA-GENKA")
    public java.math.BigDecimal getOyaGenka() {
        return this.oyaGenka;
    }

    /**
     * @param o 親原価
     */
    public void setOyaGenka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaGenka = new java.math.BigDecimal(o.toString());
        } else {
            this.oyaGenka = null;
        }
    }

    /** 子単価 */
    private java.math.BigDecimal koTanka;

    /**
     * @return 子単価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KO-TANKA")
    public java.math.BigDecimal getKoTanka() {
        return this.koTanka;
    }

    /**
     * @param o 子単価
     */
    public void setKoTanka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koTanka = new java.math.BigDecimal(o.toString());
        } else {
            this.koTanka = null;
        }
    }

    /** 子原価 */
    private java.math.BigDecimal koGenka;

    /**
     * @return 子原価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KO-GENKA")
    public java.math.BigDecimal getKoGenka() {
        return this.koGenka;
    }

    /**
     * @param o 子原価
     */
    public void setKoGenka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koGenka = new java.math.BigDecimal(o.toString());
        } else {
            this.koGenka = null;
        }
    }

    /** 子単価率 */
    private java.math.BigDecimal koTanritu;

    /**
     * @return 子単価率
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KO-TANRITU")
    public java.math.BigDecimal getKoTanritu() {
        return this.koTanritu;
    }

    /**
     * @param o 子単価率
     */
    public void setKoTanritu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koTanritu = new java.math.BigDecimal(o.toString());
        } else {
            this.koTanritu = null;
        }
    }

    /** 検索マスター */
    private String kensakum;

    /**
     * @return 検索マスター
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KENSAKUM")
    public String getKensakum() {
        return this.kensakum;
    }

    /**
     * @param o 検索マスター
     */
    public void setKensakum(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kensakum = String.valueOf(o.toString());
        } else {
            this.kensakum = null;
        }
    }

    /** ケース区分 */
    private String casekbn;

    /**
     * @return ケース区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CASEKBN")
    public String getCasekbn() {
        return this.casekbn;
    }

    /**
     * @param o ケース区分
     */
    public void setCasekbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.casekbn = String.valueOf(o.toString());
        } else {
            this.casekbn = null;
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
     * バラ展開マスタ照会
     *
     * @param param1 親品番
     * @param param2 子品番
     * @return バラ展開マスタ
     */
    public static MBaraten get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"OYA-HINBAN\" = :oya_hinban");
        whereList.add("\"KO-HINBAN\" = :ko_hinban");

        String sql = "SELECT * FROM M_BARATEN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("oya_hinban", param1);
        params.put("ko_hinban", param2);

        return Queries.get(sql, params, MBaraten.class);
    }

    /**
     * バラ展開マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // バラ展開マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"OYA-HINBAN\" -- :oya_hinban");
        nameList.add("\"KO-HINBAN\" -- :ko_hinban");
        nameList.add("\"OYA-HINC\" -- :oya_hinc");
        nameList.add("\"KO-HINC\" -- :ko_hinc");
        nameList.add("\"INZU\" -- :inzu");
        nameList.add("\"OYA-BAIKA\" -- :oya_baika");
        nameList.add("\"OYA-GENKA\" -- :oya_genka");
        nameList.add("\"KO-TANKA\" -- :ko_tanka");
        nameList.add("\"KO-GENKA\" -- :ko_genka");
        nameList.add("\"KO-TANRITU\" -- :ko_tanritu");
        nameList.add("\"KENSAKUM\" -- :kensakum");
        nameList.add("\"CASEKBN\" -- :casekbn");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_BARATEN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":oya_hinban");
        valueList.add(":ko_hinban");
        valueList.add(":oya_hinc");
        valueList.add(":ko_hinc");
        valueList.add(":inzu");
        valueList.add(":oya_baika");
        valueList.add(":oya_genka");
        valueList.add(":ko_tanka");
        valueList.add(":ko_genka");
        valueList.add(":ko_tanritu");
        valueList.add(":kensakum");
        valueList.add(":casekbn");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * バラ展開マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // バラ展開マスタの登録
        String sql = "UPDATE M_BARATEN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"OYA-HINBAN\" = :oya_hinban");
        setList.add("\"KO-HINBAN\" = :ko_hinban");
        setList.add("\"OYA-HINC\" = :oya_hinc");
        setList.add("\"KO-HINC\" = :ko_hinc");
        setList.add("\"INZU\" = :inzu");
        setList.add("\"OYA-BAIKA\" = :oya_baika");
        setList.add("\"OYA-GENKA\" = :oya_genka");
        setList.add("\"KO-TANKA\" = :ko_tanka");
        setList.add("\"KO-GENKA\" = :ko_genka");
        setList.add("\"KO-TANRITU\" = :ko_tanritu");
        setList.add("\"KENSAKUM\" = :kensakum");
        setList.add("\"CASEKBN\" = :casekbn");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * バラ展開マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // バラ展開マスタの削除
        String sql = "DELETE FROM M_BARATEN WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"OYA-HINBAN\" = :oya_hinban");
        whereList.add("\"KO-HINBAN\" = :ko_hinban");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("oya_hinban", this.oyaHinban);
        params.put("ko_hinban", this.koHinban);
        params.put("oya_hinc", this.oyaHinc);
        params.put("ko_hinc", this.koHinc);
        params.put("inzu", this.inzu);
        params.put("oya_baika", this.oyaBaika);
        params.put("oya_genka", this.oyaGenka);
        params.put("ko_tanka", this.koTanka);
        params.put("ko_genka", this.koGenka);
        params.put("ko_tanritu", this.koTanritu);
        params.put("kensakum", this.kensakum);
        params.put("casekbn", this.casekbn);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
