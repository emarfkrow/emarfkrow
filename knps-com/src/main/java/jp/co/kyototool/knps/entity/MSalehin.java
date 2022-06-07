package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * セール品目マスタ
 *
 * @author emarfkrow
 */
public class MSalehin implements IEntity {

    /** セール区分 */
    private String salekbn;

    /**
     * @return セール区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SALEKBN")
    public String getSalekbn() {
        return this.salekbn;
    }

    /**
     * @param o セール区分
     */
    public void setSalekbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.salekbn = String.valueOf(o.toString());
        } else {
            this.salekbn = null;
        }
    }

    /** セール名 */
    private String salemei;

    /**
     * @return セール名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SALEMEI")
    public String getSalemei() {
        return this.salemei;
    }

    /**
     * @param o セール名
     */
    public void setSalemei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.salemei = String.valueOf(o.toString());
        } else {
            this.salemei = null;
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

    /** 開始年 */
    private java.math.BigDecimal kaisiYy;

    /**
     * @return 開始年
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAISI-YY")
    public java.math.BigDecimal getKaisiYy() {
        return this.kaisiYy;
    }

    /**
     * @param o 開始年
     */
    public void setKaisiYy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaisiYy = new java.math.BigDecimal(o.toString());
        } else {
            this.kaisiYy = null;
        }
    }

    /** 開始月 */
    private java.math.BigDecimal kaisiMm;

    /**
     * @return 開始月
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAISI-MM")
    public java.math.BigDecimal getKaisiMm() {
        return this.kaisiMm;
    }

    /**
     * @param o 開始月
     */
    public void setKaisiMm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaisiMm = new java.math.BigDecimal(o.toString());
        } else {
            this.kaisiMm = null;
        }
    }

    /** 開始日 */
    private java.math.BigDecimal kaisiDd;

    /**
     * @return 開始日
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAISI-DD")
    public java.math.BigDecimal getKaisiDd() {
        return this.kaisiDd;
    }

    /**
     * @param o 開始日
     */
    public void setKaisiDd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaisiDd = new java.math.BigDecimal(o.toString());
        } else {
            this.kaisiDd = null;
        }
    }

    /** 終了年 */
    private java.math.BigDecimal shuryoYy;

    /**
     * @return 終了年
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHURYO-YY")
    public java.math.BigDecimal getShuryoYy() {
        return this.shuryoYy;
    }

    /**
     * @param o 終了年
     */
    public void setShuryoYy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shuryoYy = new java.math.BigDecimal(o.toString());
        } else {
            this.shuryoYy = null;
        }
    }

    /** 終了月 */
    private java.math.BigDecimal shuryoMm;

    /**
     * @return 終了月
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHURYO-MM")
    public java.math.BigDecimal getShuryoMm() {
        return this.shuryoMm;
    }

    /**
     * @param o 終了月
     */
    public void setShuryoMm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shuryoMm = new java.math.BigDecimal(o.toString());
        } else {
            this.shuryoMm = null;
        }
    }

    /** 終了日 */
    private java.math.BigDecimal shuryoDd;

    /**
     * @return 終了日
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHURYO-DD")
    public java.math.BigDecimal getShuryoDd() {
        return this.shuryoDd;
    }

    /**
     * @param o 終了日
     */
    public void setShuryoDd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shuryoDd = new java.math.BigDecimal(o.toString());
        } else {
            this.shuryoDd = null;
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
     * セール品目マスタ照会
     *
     * @param param1 セール区分
     * @param param2 販売品番
     * @param param3 開始年
     * @param param4 開始月
     * @param param5 開始日
     * @param param6 終了年
     * @param param7 終了月
     * @param param8 終了日
     * @return セール品目マスタ
     */
    public static MSalehin get(final Object param1, final Object param2, final Object param3, final Object param4, final Object param5, final Object param6, final Object param7, final Object param8) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SALEKBN\") = TRIM (:salekbn)");
        whereList.add("TRIM (\"HHINBAN\") = TRIM (:hhinban)");
        whereList.add("\"KAISI-YY\" = :kaisi_yy");
        whereList.add("\"KAISI-MM\" = :kaisi_mm");
        whereList.add("\"KAISI-DD\" = :kaisi_dd");
        whereList.add("\"SHURYO-YY\" = :shuryo_yy");
        whereList.add("\"SHURYO-MM\" = :shuryo_mm");
        whereList.add("\"SHURYO-DD\" = :shuryo_dd");

        String sql = "SELECT * FROM M_SALEHIN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("salekbn", param1);
        params.put("hhinban", param2);
        params.put("kaisi_yy", param3);
        params.put("kaisi_mm", param4);
        params.put("kaisi_dd", param5);
        params.put("shuryo_yy", param6);
        params.put("shuryo_mm", param7);
        params.put("shuryo_dd", param8);

        return Queries.get(sql, params, MSalehin.class);
    }

    /**
     * セール品目マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // セール品目マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"SALEKBN\" -- :salekbn");
        nameList.add("\"SALEMEI\" -- :salemei");
        nameList.add("\"HHINBAN\" -- :hhinban");
        nameList.add("\"KAISI-YY\" -- :kaisi_yy");
        nameList.add("\"KAISI-MM\" -- :kaisi_mm");
        nameList.add("\"KAISI-DD\" -- :kaisi_dd");
        nameList.add("\"SHURYO-YY\" -- :shuryo_yy");
        nameList.add("\"SHURYO-MM\" -- :shuryo_mm");
        nameList.add("\"SHURYO-DD\" -- :shuryo_dd");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_SALEHIN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":salekbn");
        valueList.add(":salemei");
        valueList.add(":hhinban");
        valueList.add(":kaisi_yy");
        valueList.add(":kaisi_mm");
        valueList.add(":kaisi_dd");
        valueList.add(":shuryo_yy");
        valueList.add(":shuryo_mm");
        valueList.add(":shuryo_dd");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * セール品目マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // セール品目マスタの登録
        String sql = "UPDATE M_SALEHIN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"SALEKBN\" = :salekbn");
        setList.add("\"SALEMEI\" = :salemei");
        setList.add("\"HHINBAN\" = :hhinban");
        setList.add("\"KAISI-YY\" = :kaisi_yy");
        setList.add("\"KAISI-MM\" = :kaisi_mm");
        setList.add("\"KAISI-DD\" = :kaisi_dd");
        setList.add("\"SHURYO-YY\" = :shuryo_yy");
        setList.add("\"SHURYO-MM\" = :shuryo_mm");
        setList.add("\"SHURYO-DD\" = :shuryo_dd");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * セール品目マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // セール品目マスタの削除
        String sql = "DELETE FROM M_SALEHIN WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SALEKBN\") = TRIM (:salekbn)");
        whereList.add("TRIM (\"HHINBAN\") = TRIM (:hhinban)");
        whereList.add("\"KAISI-YY\" = :kaisi_yy");
        whereList.add("\"KAISI-MM\" = :kaisi_mm");
        whereList.add("\"KAISI-DD\" = :kaisi_dd");
        whereList.add("\"SHURYO-YY\" = :shuryo_yy");
        whereList.add("\"SHURYO-MM\" = :shuryo_mm");
        whereList.add("\"SHURYO-DD\" = :shuryo_dd");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("salekbn", this.salekbn);
        params.put("salemei", this.salemei);
        params.put("hhinban", this.hhinban);
        params.put("kaisi_yy", this.kaisiYy);
        params.put("kaisi_mm", this.kaisiMm);
        params.put("kaisi_dd", this.kaisiDd);
        params.put("shuryo_yy", this.shuryoYy);
        params.put("shuryo_mm", this.shuryoMm);
        params.put("shuryo_dd", this.shuryoDd);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
