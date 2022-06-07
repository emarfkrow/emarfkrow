package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 有力店ボーナス条件
 *
 * @author emarfkrow
 */
public class MYubojo implements IEntity {

    /** 有力店資格区分 */
    private String yuryokukbn;

    /**
     * @return 有力店資格区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YURYOKUKBN")
    public String getYuryokukbn() {
        return this.yuryokukbn;
    }

    /**
     * @param o 有力店資格区分
     */
    public void setYuryokukbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yuryokukbn = String.valueOf(o.toString());
        } else {
            this.yuryokukbn = null;
        }
    }

    /** 有力店コード */
    private java.math.BigDecimal yuryocd;

    /**
     * @return 有力店コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YURYOCD")
    public java.math.BigDecimal getYuryocd() {
        return this.yuryocd;
    }

    /**
     * @param o 有力店コード
     */
    public void setYuryocd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yuryocd = new java.math.BigDecimal(o.toString());
        } else {
            this.yuryocd = null;
        }
    }

    /** 略有力店名 */
    private String ryuryokumei;

    /**
     * @return 略有力店名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("RYURYOKUMEI")
    public String getRyuryokumei() {
        return this.ryuryokumei;
    }

    /**
     * @param o 略有力店名
     */
    public void setRyuryokumei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ryuryokumei = String.valueOf(o.toString());
        } else {
            this.ryuryokumei = null;
        }
    }

    /** 下限購入額 */
    private java.math.BigDecimal konyuMin;

    /**
     * @return 下限購入額
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KONYU-MIN")
    public java.math.BigDecimal getKonyuMin() {
        return this.konyuMin;
    }

    /**
     * @param o 下限購入額
     */
    public void setKonyuMin(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.konyuMin = new java.math.BigDecimal(o.toString());
        } else {
            this.konyuMin = null;
        }
    }

    /** 上限購入額 */
    private java.math.BigDecimal konyuMax;

    /**
     * @return 上限購入額
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KONYU-MAX")
    public java.math.BigDecimal getKonyuMax() {
        return this.konyuMax;
    }

    /**
     * @param o 上限購入額
     */
    public void setKonyuMax(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.konyuMax = new java.math.BigDecimal(o.toString());
        } else {
            this.konyuMax = null;
        }
    }

    /** 有ボ支払率 */
    private java.math.BigDecimal yuboritu;

    /**
     * @return 有ボ支払率
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YUBORITU")
    public java.math.BigDecimal getYuboritu() {
        return this.yuboritu;
    }

    /**
     * @param o 有ボ支払率
     */
    public void setYuboritu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yuboritu = new java.math.BigDecimal(o.toString());
        } else {
            this.yuboritu = null;
        }
    }

    /** 更新日付 */
    private java.math.BigDecimal upddate;

    /**
     * @return 更新日付
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDDATE")
    public java.math.BigDecimal getUpddate() {
        return this.upddate;
    }

    /**
     * @param o 更新日付
     */
    public void setUpddate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.upddate = new java.math.BigDecimal(o.toString());
        } else {
            this.upddate = null;
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
     * 有力店ボーナス条件照会
     *
     * @param param1 有力店資格区分
     * @param param2 有力店コード
     * @return 有力店ボーナス条件
     */
    public static MYubojo get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YURYOKUKBN\") = TRIM (:yuryokukbn)");
        whereList.add("\"YURYOCD\" = :yuryocd");

        String sql = "SELECT * FROM M_YUBOJO WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yuryokukbn", param1);
        params.put("yuryocd", param2);

        return Queries.get(sql, params, MYubojo.class);
    }

    /**
     * 有力店ボーナス条件追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 有力店ボーナス条件の登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YURYOKUKBN\" -- :yuryokukbn");
        nameList.add("\"YURYOCD\" -- :yuryocd");
        nameList.add("\"RYURYOKUMEI\" -- :ryuryokumei");
        nameList.add("\"KONYU-MIN\" -- :konyu_min");
        nameList.add("\"KONYU-MAX\" -- :konyu_max");
        nameList.add("\"YUBORITU\" -- :yuboritu");
        nameList.add("\"UPDDATE\" -- :upddate");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_YUBOJO(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yuryokukbn");
        valueList.add(":yuryocd");
        valueList.add(":ryuryokumei");
        valueList.add(":konyu_min");
        valueList.add(":konyu_max");
        valueList.add(":yuboritu");
        valueList.add(":upddate");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 有力店ボーナス条件更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 有力店ボーナス条件の登録
        String sql = "UPDATE M_YUBOJO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YURYOKUKBN\" = :yuryokukbn");
        setList.add("\"YURYOCD\" = :yuryocd");
        setList.add("\"RYURYOKUMEI\" = :ryuryokumei");
        setList.add("\"KONYU-MIN\" = :konyu_min");
        setList.add("\"KONYU-MAX\" = :konyu_max");
        setList.add("\"YUBORITU\" = :yuboritu");
        setList.add("\"UPDDATE\" = :upddate");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 有力店ボーナス条件削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 有力店ボーナス条件の削除
        String sql = "DELETE FROM M_YUBOJO WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"YURYOKUKBN\") = TRIM (:yuryokukbn)");
        whereList.add("\"YURYOCD\" = :yuryocd");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yuryokukbn", this.yuryokukbn);
        params.put("yuryocd", this.yuryocd);
        params.put("ryuryokumei", this.ryuryokumei);
        params.put("konyu_min", this.konyuMin);
        params.put("konyu_max", this.konyuMax);
        params.put("yuboritu", this.yuboritu);
        params.put("upddate", this.upddate);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
