package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 日産単価マスタ
 *
 * @author emarfkrow
 */
public class MNtanka implements IEntity {

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

    /** 日産品番 */
    private String nissanHinban;

    /**
     * @return 日産品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NISSAN-HINBAN")
    public String getNissanHinban() {
        return this.nissanHinban;
    }

    /**
     * @param o 日産品番
     */
    public void setNissanHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nissanHinban = String.valueOf(o.toString());
        } else {
            this.nissanHinban = null;
        }
    }

    /** 日産単価 */
    private java.math.BigDecimal nissanTanka;

    /**
     * @return 日産単価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NISSAN-TANKA")
    public java.math.BigDecimal getNissanTanka() {
        return this.nissanTanka;
    }

    /**
     * @param o 日産単価
     */
    public void setNissanTanka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nissanTanka = new java.math.BigDecimal(o.toString());
        } else {
            this.nissanTanka = null;
        }
    }

    /** 希望小売価格 */
    private java.math.BigDecimal kouriKakaku;

    /**
     * @return 希望小売価格
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KOURI-KAKAKU")
    public java.math.BigDecimal getKouriKakaku() {
        return this.kouriKakaku;
    }

    /**
     * @param o 希望小売価格
     */
    public void setKouriKakaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kouriKakaku = new java.math.BigDecimal(o.toString());
        } else {
            this.kouriKakaku = null;
        }
    }

    /** 商品区分 */
    private String shohinkbn;

    /**
     * @return 商品区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHOHINKBN")
    public String getShohinkbn() {
        return this.shohinkbn;
    }

    /**
     * @param o 商品区分
     */
    public void setShohinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shohinkbn = String.valueOf(o.toString());
        } else {
            this.shohinkbn = null;
        }
    }

    /** パーソナル区分 */
    private String persokbn;

    /**
     * @return パーソナル区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PERSOKBN")
    public String getPersokbn() {
        return this.persokbn;
    }

    /**
     * @param o パーソナル区分
     */
    public void setPersokbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.persokbn = String.valueOf(o.toString());
        } else {
            this.persokbn = null;
        }
    }

    /** 価格体系区分 */
    private String kakakukbn;

    /**
     * @return 価格体系区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAKAKUKBN")
    public String getKakakukbn() {
        return this.kakakukbn;
    }

    /**
     * @param o 価格体系区分
     */
    public void setKakakukbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kakakukbn = String.valueOf(o.toString());
        } else {
            this.kakakukbn = null;
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
     * 日産単価マスタ照会
     *
     * @param param1 販売品番
     * @return 日産単価マスタ
     */
    public static MNtanka get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HHINBAN\") = TRIM (:hhinban)");

        String sql = "SELECT * FROM M_NTANKA WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);

        return Queries.get(sql, params, MNtanka.class);
    }

    /**
     * 日産単価マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 販売品番の採番処理
        numbering();

        // 日産単価マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HHINBAN\" -- :hhinban");
        nameList.add("\"NISSAN-HINBAN\" -- :nissan_hinban");
        nameList.add("\"NISSAN-TANKA\" -- :nissan_tanka");
        nameList.add("\"KOURI-KAKAKU\" -- :kouri_kakaku");
        nameList.add("\"SHOHINKBN\" -- :shohinkbn");
        nameList.add("\"PERSOKBN\" -- :persokbn");
        nameList.add("\"KAKAKUKBN\" -- :kakakukbn");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_NTANKA(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":nissan_hinban");
        valueList.add(":nissan_tanka");
        valueList.add(":kouri_kakaku");
        valueList.add(":shohinkbn");
        valueList.add(":persokbn");
        valueList.add(":kakakukbn");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 販売品番の採番処理 */
    private void numbering() {

        if (this.hhinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"HHINBAN\") IS NULL THEN 0 ELSE MAX(e.\"HHINBAN\") * 1 END + 1, 20, '0') AS \"HHINBAN\" FROM M_NTANKA e WHERE e.\"HHINBAN\" < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HHINBAN");

        this.setHhinban(o);
    }

    /**
     * 日産単価マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 日産単価マスタの登録
        String sql = "UPDATE M_NTANKA\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HHINBAN\" = :hhinban");
        setList.add("\"NISSAN-HINBAN\" = :nissan_hinban");
        setList.add("\"NISSAN-TANKA\" = :nissan_tanka");
        setList.add("\"KOURI-KAKAKU\" = :kouri_kakaku");
        setList.add("\"SHOHINKBN\" = :shohinkbn");
        setList.add("\"PERSOKBN\" = :persokbn");
        setList.add("\"KAKAKUKBN\" = :kakakukbn");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 日産単価マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 日産単価マスタの削除
        String sql = "DELETE FROM M_NTANKA WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HHINBAN\") = TRIM (:hhinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", this.hhinban);
        params.put("nissan_hinban", this.nissanHinban);
        params.put("nissan_tanka", this.nissanTanka);
        params.put("kouri_kakaku", this.kouriKakaku);
        params.put("shohinkbn", this.shohinkbn);
        params.put("persokbn", this.persokbn);
        params.put("kakakukbn", this.kakakukbn);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
