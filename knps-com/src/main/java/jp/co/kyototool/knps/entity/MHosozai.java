package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 包装材マスタ
 *
 * @author emarfkrow
 */
public class MHosozai implements IEntity {

    /** 包装品番 */
    private String hosoHinban;

    /**
     * @return 包装品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HOSO-HINBAN")
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

    /** 包装品名 */
    private String hosoHinmei;

    /**
     * @return 包装品名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HOSO-HINMEI")
    public String getHosoHinmei() {
        return this.hosoHinmei;
    }

    /**
     * @param o 包装品名
     */
    public void setHosoHinmei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoHinmei = String.valueOf(o.toString());
        } else {
            this.hosoHinmei = null;
        }
    }

    /** 包装品名略称 */
    private String hosoHinmeiRyaku;

    /**
     * @return 包装品名略称
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HOSO-HINMEI-RYAKU")
    public String getHosoHinmeiRyaku() {
        return this.hosoHinmeiRyaku;
    }

    /**
     * @param o 包装品名略称
     */
    public void setHosoHinmeiRyaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoHinmeiRyaku = String.valueOf(o.toString());
        } else {
            this.hosoHinmeiRyaku = null;
        }
    }

    /** 包装サイズ */
    private String hosoSize;

    /**
     * @return 包装サイズ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HOSO-SIZE")
    public String getHosoSize() {
        return this.hosoSize;
    }

    /**
     * @param o 包装サイズ
     */
    public void setHosoSize(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoSize = String.valueOf(o.toString());
        } else {
            this.hosoSize = null;
        }
    }

    /** 包装単価 */
    private java.math.BigDecimal hosoTanka;

    /**
     * @return 包装単価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HOSO-TANKA")
    public java.math.BigDecimal getHosoTanka() {
        return this.hosoTanka;
    }

    /**
     * @param o 包装単価
     */
    public void setHosoTanka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoTanka = new java.math.BigDecimal(o.toString());
        } else {
            this.hosoTanka = null;
        }
    }

    /** 包装材質コード */
    private String hosoZaicode;

    /**
     * @return 包装材質コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HOSO-ZAICODE")
    public String getHosoZaicode() {
        return this.hosoZaicode;
    }

    /**
     * @param o 包装材質コード
     */
    public void setHosoZaicode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoZaicode = String.valueOf(o.toString());
        } else {
            this.hosoZaicode = null;
        }
    }

    /** 包装重量 */
    private java.math.BigDecimal hosoWeight;

    /**
     * @return 包装重量
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HOSO-WEIGHT")
    public java.math.BigDecimal getHosoWeight() {
        return this.hosoWeight;
    }

    /**
     * @param o 包装重量
     */
    public void setHosoWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.hosoWeight = null;
        }
    }

    /** 作成日付 */
    private java.math.BigDecimal makedate;

    /**
     * @return 作成日付
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MAKEDATE")
    public java.math.BigDecimal getMakedate() {
        return this.makedate;
    }

    /**
     * @param o 作成日付
     */
    public void setMakedate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.makedate = new java.math.BigDecimal(o.toString());
        } else {
            this.makedate = null;
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

    /**
     * 包装材マスタ照会
     *
     * @param param1 包装品番
     * @return 包装材マスタ
     */
    public static MHosozai get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HOSO-HINBAN\" = :hoso_hinban");

        String sql = "SELECT * FROM M_HOSOZAI WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hoso_hinban", param1);

        return Queries.get(sql, params, MHosozai.class);
    }

    /**
     * 包装材マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 包装材マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HOSO-HINBAN\" -- :hoso_hinban");
        nameList.add("\"HOSO-HINMEI\" -- :hoso_hinmei");
        nameList.add("\"HOSO-HINMEI-RYAKU\" -- :hoso_hinmei_ryaku");
        nameList.add("\"HOSO-SIZE\" -- :hoso_size");
        nameList.add("\"HOSO-TANKA\" -- :hoso_tanka");
        nameList.add("\"HOSO-ZAICODE\" -- :hoso_zaicode");
        nameList.add("\"HOSO-WEIGHT\" -- :hoso_weight");
        nameList.add("\"MAKEDATE\" -- :makedate");
        nameList.add("\"UPDDATE\" -- :upddate");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_HOSOZAI(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hoso_hinban");
        valueList.add(":hoso_hinmei");
        valueList.add(":hoso_hinmei_ryaku");
        valueList.add(":hoso_size");
        valueList.add(":hoso_tanka");
        valueList.add(":hoso_zaicode");
        valueList.add(":hoso_weight");
        valueList.add(":makedate");
        valueList.add(":upddate");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 包装材マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 包装材マスタの登録
        String sql = "UPDATE M_HOSOZAI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HOSO-HINBAN\" = :hoso_hinban");
        setList.add("\"HOSO-HINMEI\" = :hoso_hinmei");
        setList.add("\"HOSO-HINMEI-RYAKU\" = :hoso_hinmei_ryaku");
        setList.add("\"HOSO-SIZE\" = :hoso_size");
        setList.add("\"HOSO-TANKA\" = :hoso_tanka");
        setList.add("\"HOSO-ZAICODE\" = :hoso_zaicode");
        setList.add("\"HOSO-WEIGHT\" = :hoso_weight");
        setList.add("\"MAKEDATE\" = :makedate");
        setList.add("\"UPDDATE\" = :upddate");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 包装材マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 包装材マスタの削除
        String sql = "DELETE FROM M_HOSOZAI WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HOSO-HINBAN\" = :hoso_hinban");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hoso_hinban", this.hosoHinban);
        params.put("hoso_hinmei", this.hosoHinmei);
        params.put("hoso_hinmei_ryaku", this.hosoHinmeiRyaku);
        params.put("hoso_size", this.hosoSize);
        params.put("hoso_tanka", this.hosoTanka);
        params.put("hoso_zaicode", this.hosoZaicode);
        params.put("hoso_weight", this.hosoWeight);
        params.put("makedate", this.makedate);
        params.put("upddate", this.upddate);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
