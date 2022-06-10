package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 単価マスタ
 *
 * @author emarfkrow
 */
public class MTanka implements IEntity {

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

    /** 代理店単価 */
    private java.math.BigDecimal dairiTanka;

    /**
     * @return 代理店単価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DAIRI-TANKA")
    public java.math.BigDecimal getDairiTanka() {
        return this.dairiTanka;
    }

    /**
     * @param o 代理店単価
     */
    public void setDairiTanka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dairiTanka = new java.math.BigDecimal(o.toString());
        } else {
            this.dairiTanka = null;
        }
    }

    /** Ｃ代行店単価 */
    private java.math.BigDecimal cdaikoTanka;

    /**
     * @return Ｃ代行店単価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CDAIKO-TANKA")
    public java.math.BigDecimal getCdaikoTanka() {
        return this.cdaikoTanka;
    }

    /**
     * @param o Ｃ代行店単価
     */
    public void setCdaikoTanka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.cdaikoTanka = new java.math.BigDecimal(o.toString());
        } else {
            this.cdaikoTanka = null;
        }
    }

    /** 準代行店単価 */
    private java.math.BigDecimal jdaikoTanka;

    /**
     * @return 準代行店単価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("JDAIKO-TANKA")
    public java.math.BigDecimal getJdaikoTanka() {
        return this.jdaikoTanka;
    }

    /**
     * @param o 準代行店単価
     */
    public void setJdaikoTanka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.jdaikoTanka = new java.math.BigDecimal(o.toString());
        } else {
            this.jdaikoTanka = null;
        }
    }

    /** 卸単価 */
    private java.math.BigDecimal orosiTanka;

    /**
     * @return 卸単価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("OROSI-TANKA")
    public java.math.BigDecimal getOrosiTanka() {
        return this.orosiTanka;
    }

    /**
     * @param o 卸単価
     */
    public void setOrosiTanka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.orosiTanka = new java.math.BigDecimal(o.toString());
        } else {
            this.orosiTanka = null;
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

    /** ＤＩＹ価格 */
    private java.math.BigDecimal diyKakaku;

    /**
     * @return ＤＩＹ価格
     */
    @com.fasterxml.jackson.annotation.JsonProperty("DIY-KAKAKU")
    public java.math.BigDecimal getDiyKakaku() {
        return this.diyKakaku;
    }

    /**
     * @param o ＤＩＹ価格
     */
    public void setDiyKakaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.diyKakaku = new java.math.BigDecimal(o.toString());
        } else {
            this.diyKakaku = null;
        }
    }

    /** 輸出価格１ */
    private java.math.BigDecimal yushutu1Kakaku;

    /**
     * @return 輸出価格１
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YUSHUTU1-KAKAKU")
    public java.math.BigDecimal getYushutu1Kakaku() {
        return this.yushutu1Kakaku;
    }

    /**
     * @param o 輸出価格１
     */
    public void setYushutu1Kakaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yushutu1Kakaku = new java.math.BigDecimal(o.toString());
        } else {
            this.yushutu1Kakaku = null;
        }
    }

    /** 輸出価格２ */
    private java.math.BigDecimal yushutu2Kakaku;

    /**
     * @return 輸出価格２
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YUSHUTU2-KAKAKU")
    public java.math.BigDecimal getYushutu2Kakaku() {
        return this.yushutu2Kakaku;
    }

    /**
     * @param o 輸出価格２
     */
    public void setYushutu2Kakaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yushutu2Kakaku = new java.math.BigDecimal(o.toString());
        } else {
            this.yushutu2Kakaku = null;
        }
    }

    /** 輸出価格３ */
    private java.math.BigDecimal yushutu3Kakaku;

    /**
     * @return 輸出価格３
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YUSHUTU3-KAKAKU")
    public java.math.BigDecimal getYushutu3Kakaku() {
        return this.yushutu3Kakaku;
    }

    /**
     * @param o 輸出価格３
     */
    public void setYushutu3Kakaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yushutu3Kakaku = new java.math.BigDecimal(o.toString());
        } else {
            this.yushutu3Kakaku = null;
        }
    }

    /** 価格１ */
    private java.math.BigDecimal kakaku1;

    /**
     * @return 価格１
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAKAKU1")
    public java.math.BigDecimal getKakaku1() {
        return this.kakaku1;
    }

    /**
     * @param o 価格１
     */
    public void setKakaku1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kakaku1 = new java.math.BigDecimal(o.toString());
        } else {
            this.kakaku1 = null;
        }
    }

    /** 価格２ */
    private java.math.BigDecimal kakaku2;

    /**
     * @return 価格２
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAKAKU2")
    public java.math.BigDecimal getKakaku2() {
        return this.kakaku2;
    }

    /**
     * @param o 価格２
     */
    public void setKakaku2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kakaku2 = new java.math.BigDecimal(o.toString());
        } else {
            this.kakaku2 = null;
        }
    }

    /** 価格３ */
    private java.math.BigDecimal kakaku3;

    /**
     * @return 価格３
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAKAKU3")
    public java.math.BigDecimal getKakaku3() {
        return this.kakaku3;
    }

    /**
     * @param o 価格３
     */
    public void setKakaku3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kakaku3 = new java.math.BigDecimal(o.toString());
        } else {
            this.kakaku3 = null;
        }
    }

    /** 価格４ */
    private java.math.BigDecimal kakaku4;

    /**
     * @return 価格４
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAKAKU4")
    public java.math.BigDecimal getKakaku4() {
        return this.kakaku4;
    }

    /**
     * @param o 価格４
     */
    public void setKakaku4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kakaku4 = new java.math.BigDecimal(o.toString());
        } else {
            this.kakaku4 = null;
        }
    }

    /** 価格５ */
    private java.math.BigDecimal kakaku5;

    /**
     * @return 価格５
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAKAKU5")
    public java.math.BigDecimal getKakaku5() {
        return this.kakaku5;
    }

    /**
     * @param o 価格５
     */
    public void setKakaku5(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kakaku5 = new java.math.BigDecimal(o.toString());
        } else {
            this.kakaku5 = null;
        }
    }

    /** 価格６ */
    private java.math.BigDecimal kakaku6;

    /**
     * @return 価格６
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAKAKU6")
    public java.math.BigDecimal getKakaku6() {
        return this.kakaku6;
    }

    /**
     * @param o 価格６
     */
    public void setKakaku6(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kakaku6 = new java.math.BigDecimal(o.toString());
        } else {
            this.kakaku6 = null;
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

    /**
     * 単価マスタ照会
     *
     * @param param1 販売品番
     * @return 単価マスタ
     */
    public static MTanka get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HHINBAN\" = :hhinban");

        String sql = "SELECT * FROM M_TANKA WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);

        return Queries.get(sql, params, MTanka.class);
    }

    /**
     * 単価マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 単価マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HHINBAN\" -- :hhinban");
        nameList.add("\"DAIRI-TANKA\" -- :dairi_tanka");
        nameList.add("\"CDAIKO-TANKA\" -- :cdaiko_tanka");
        nameList.add("\"JDAIKO-TANKA\" -- :jdaiko_tanka");
        nameList.add("\"OROSI-TANKA\" -- :orosi_tanka");
        nameList.add("\"KOURI-KAKAKU\" -- :kouri_kakaku");
        nameList.add("\"DIY-KAKAKU\" -- :diy_kakaku");
        nameList.add("\"YUSHUTU1-KAKAKU\" -- :yushutu1_kakaku");
        nameList.add("\"YUSHUTU2-KAKAKU\" -- :yushutu2_kakaku");
        nameList.add("\"YUSHUTU3-KAKAKU\" -- :yushutu3_kakaku");
        nameList.add("\"KAKAKU1\" -- :kakaku1");
        nameList.add("\"KAKAKU2\" -- :kakaku2");
        nameList.add("\"KAKAKU3\" -- :kakaku3");
        nameList.add("\"KAKAKU4\" -- :kakaku4");
        nameList.add("\"KAKAKU5\" -- :kakaku5");
        nameList.add("\"KAKAKU6\" -- :kakaku6");
        nameList.add("\"SHOHINKBN\" -- :shohinkbn");
        nameList.add("\"KAKAKUKBN\" -- :kakakukbn");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_TANKA(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":dairi_tanka");
        valueList.add(":cdaiko_tanka");
        valueList.add(":jdaiko_tanka");
        valueList.add(":orosi_tanka");
        valueList.add(":kouri_kakaku");
        valueList.add(":diy_kakaku");
        valueList.add(":yushutu1_kakaku");
        valueList.add(":yushutu2_kakaku");
        valueList.add(":yushutu3_kakaku");
        valueList.add(":kakaku1");
        valueList.add(":kakaku2");
        valueList.add(":kakaku3");
        valueList.add(":kakaku4");
        valueList.add(":kakaku5");
        valueList.add(":kakaku6");
        valueList.add(":shohinkbn");
        valueList.add(":kakakukbn");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 単価マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 単価マスタの登録
        String sql = "UPDATE M_TANKA\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HHINBAN\" = :hhinban");
        setList.add("\"DAIRI-TANKA\" = :dairi_tanka");
        setList.add("\"CDAIKO-TANKA\" = :cdaiko_tanka");
        setList.add("\"JDAIKO-TANKA\" = :jdaiko_tanka");
        setList.add("\"OROSI-TANKA\" = :orosi_tanka");
        setList.add("\"KOURI-KAKAKU\" = :kouri_kakaku");
        setList.add("\"DIY-KAKAKU\" = :diy_kakaku");
        setList.add("\"YUSHUTU1-KAKAKU\" = :yushutu1_kakaku");
        setList.add("\"YUSHUTU2-KAKAKU\" = :yushutu2_kakaku");
        setList.add("\"YUSHUTU3-KAKAKU\" = :yushutu3_kakaku");
        setList.add("\"KAKAKU1\" = :kakaku1");
        setList.add("\"KAKAKU2\" = :kakaku2");
        setList.add("\"KAKAKU3\" = :kakaku3");
        setList.add("\"KAKAKU4\" = :kakaku4");
        setList.add("\"KAKAKU5\" = :kakaku5");
        setList.add("\"KAKAKU6\" = :kakaku6");
        setList.add("\"SHOHINKBN\" = :shohinkbn");
        setList.add("\"KAKAKUKBN\" = :kakakukbn");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 単価マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 単価マスタの削除
        String sql = "DELETE FROM M_TANKA WHERE " + getWhere();

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
        params.put("dairi_tanka", this.dairiTanka);
        params.put("cdaiko_tanka", this.cdaikoTanka);
        params.put("jdaiko_tanka", this.jdaikoTanka);
        params.put("orosi_tanka", this.orosiTanka);
        params.put("kouri_kakaku", this.kouriKakaku);
        params.put("diy_kakaku", this.diyKakaku);
        params.put("yushutu1_kakaku", this.yushutu1Kakaku);
        params.put("yushutu2_kakaku", this.yushutu2Kakaku);
        params.put("yushutu3_kakaku", this.yushutu3Kakaku);
        params.put("kakaku1", this.kakaku1);
        params.put("kakaku2", this.kakaku2);
        params.put("kakaku3", this.kakaku3);
        params.put("kakaku4", this.kakaku4);
        params.put("kakaku5", this.kakaku5);
        params.put("kakaku6", this.kakaku6);
        params.put("shohinkbn", this.shohinkbn);
        params.put("kakakukbn", this.kakakukbn);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
