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
        whereList.add("TRIM (\"OYA-HINBAN\") = TRIM (:oya_hinban)");
        whereList.add("TRIM (\"KO-HINBAN\") = TRIM (:ko_hinban)");

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

        // 子品番の採番処理
        numbering();

        // バラ展開マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("oya_hinban -- :oya_hinban");
        nameList.add("ko_hinban -- :ko_hinban");
        nameList.add("oya_hinc -- :oya_hinc");
        nameList.add("ko_hinc -- :ko_hinc");
        nameList.add("inzu -- :inzu");
        nameList.add("oya_baika -- :oya_baika");
        nameList.add("oya_genka -- :oya_genka");
        nameList.add("ko_tanka -- :ko_tanka");
        nameList.add("ko_genka -- :ko_genka");
        nameList.add("ko_tanritu -- :ko_tanritu");
        nameList.add("kensakum -- :kensakum");
        nameList.add("casekbn -- :casekbn");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_BARATEN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":oya-hinban");
        valueList.add(":ko-hinban");
        valueList.add(":oya-hinc");
        valueList.add(":ko-hinc");
        valueList.add(":inzu");
        valueList.add(":oya-baika");
        valueList.add(":oya-genka");
        valueList.add(":ko-tanka");
        valueList.add(":ko-genka");
        valueList.add(":ko-tanritu");
        valueList.add(":kensakum");
        valueList.add(":casekbn");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 子品番の採番処理 */
    private void numbering() {

        if (this.koHinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.KO-HINBAN) IS NULL THEN 0 ELSE MAX(e.KO-HINBAN) * 1 END + 1, 20, '0') AS KO-HINBAN FROM M_BARATEN e WHERE e.KO-HINBAN < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.OYA-HINBAN = :oya-hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("oyaHinban", this.oyaHinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("KO-HINBAN");

        this.setKoHinban(o);
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
        setList.add("oya-hinban = :oya-hinban");
        setList.add("ko-hinban = :ko-hinban");
        setList.add("oya-hinc = :oya-hinc");
        setList.add("ko-hinc = :ko-hinc");
        setList.add("inzu = :inzu");
        setList.add("oya-baika = :oya-baika");
        setList.add("oya-genka = :oya-genka");
        setList.add("ko-tanka = :ko-tanka");
        setList.add("ko-genka = :ko-genka");
        setList.add("ko-tanritu = :ko-tanritu");
        setList.add("kensakum = :kensakum");
        setList.add("casekbn = :casekbn");
        setList.add("filler = :filler");
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
        whereList.add("TRIM (oya-hinban) = TRIM (:oya-hinban)");
        whereList.add("TRIM (ko-hinban) = TRIM (:ko-hinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("OYA-HINBAN", this.oyaHinban);
        params.put("KO-HINBAN", this.koHinban);
        params.put("OYA-HINC", this.oyaHinc);
        params.put("KO-HINC", this.koHinc);
        params.put("INZU", this.inzu);
        params.put("OYA-BAIKA", this.oyaBaika);
        params.put("OYA-GENKA", this.oyaGenka);
        params.put("KO-TANKA", this.koTanka);
        params.put("KO-GENKA", this.koGenka);
        params.put("KO-TANRITU", this.koTanritu);
        params.put("KENSAKUM", this.kensakum);
        params.put("CASEKBN", this.casekbn);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
