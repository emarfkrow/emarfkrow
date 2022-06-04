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
     * 単価マスタ照会
     *
     * @param param1 販売品番
     * @return 単価マスタ
     */
    public static MTanka get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HHINBAN\") = TRIM (:hhinban)");

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

        // 販売品番の採番処理
        numbering();

        // バーコードマスタの登録
        if (this.mBarcd != null) {
            this.mBarcd.setHhinban(this.getHhinban());
            this.mBarcd.insert(now, id);
        }

        // 原価マスタの登録
        if (this.mGenka != null) {
            this.mGenka.setHhinban(this.getHhinban());
            this.mGenka.insert(now, id);
        }

        // WEB在庫管理マスタの登録
        if (this.mWebkan != null) {
            this.mWebkan.setHhinban(this.getHhinban());
            this.mWebkan.insert(now, id);
        }

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
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_TANKA(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":dairi-tanka");
        valueList.add(":cdaiko-tanka");
        valueList.add(":jdaiko-tanka");
        valueList.add(":orosi-tanka");
        valueList.add(":kouri-kakaku");
        valueList.add(":diy-kakaku");
        valueList.add(":yushutu1-kakaku");
        valueList.add(":yushutu2-kakaku");
        valueList.add(":yushutu3-kakaku");
        valueList.add(":kakaku1");
        valueList.add(":kakaku2");
        valueList.add(":kakaku3");
        valueList.add(":kakaku4");
        valueList.add(":kakaku5");
        valueList.add(":kakaku6");
        valueList.add(":shohinkbn");
        valueList.add(":kakakukbn");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 販売品番の採番処理 */
    private void numbering() {

        if (this.hhinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"HHINBAN\") IS NULL THEN 0 ELSE MAX(e.\"HHINBAN\") * 1 END + 1, 20, '0') AS \"HHINBAN\" FROM M_TANKA e WHERE e.\"HHINBAN\" < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HHINBAN");

        this.setHhinban(o);
    }

    /**
     * 単価マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // バーコードマスタの登録
        if (this.mBarcd != null) {
            mBarcd.setHhinban(this.getHhinban());
            try {
                mBarcd.insert(now, id);
            } catch (Exception e) {
                mBarcd.update(now, id);
            }
        }

        // 原価マスタの登録
        if (this.mGenka != null) {
            mGenka.setHhinban(this.getHhinban());
            try {
                mGenka.insert(now, id);
            } catch (Exception e) {
                mGenka.update(now, id);
            }
        }

        // WEB在庫管理マスタの登録
        if (this.mWebkan != null) {
            mWebkan.setHhinban(this.getHhinban());
            try {
                mWebkan.insert(now, id);
            } catch (Exception e) {
                mWebkan.update(now, id);
            }
        }

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
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 単価マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // バーコードマスタの削除
        if (this.mBarcd != null) {
            this.mBarcd.delete();
        }

        // 原価マスタの削除
        if (this.mGenka != null) {
            this.mGenka.delete();
        }

        // WEB在庫管理マスタの削除
        if (this.mWebkan != null) {
            this.mWebkan.delete();
        }

        // 単価マスタの削除
        String sql = "DELETE FROM M_TANKA WHERE " + getWhere();

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
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * バーコードマスタ
     */
    private MBarcd mBarcd;

    /**
     * @return バーコードマスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MBarcd")
    public MBarcd getMBarcd() {
        return this.mBarcd;
    }

    /**
     * @param p バーコードマスタ
     */
    public void setMBarcd(final MBarcd p) {
        this.mBarcd = p;
    }

    /**
     * @return バーコードマスタ
     */
    public MBarcd referMBarcd() {
        if (this.mBarcd == null) {
            try {
                this.mBarcd = MBarcd.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mBarcd;
    }

    /**
     * 原価マスタ
     */
    private MGenka mGenka;

    /**
     * @return 原価マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MGenka")
    public MGenka getMGenka() {
        return this.mGenka;
    }

    /**
     * @param p 原価マスタ
     */
    public void setMGenka(final MGenka p) {
        this.mGenka = p;
    }

    /**
     * @return 原価マスタ
     */
    public MGenka referMGenka() {
        if (this.mGenka == null) {
            try {
                this.mGenka = MGenka.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mGenka;
    }

    /**
     * WEB在庫管理マスタ
     */
    private MWebkan mWebkan;

    /**
     * @return WEB在庫管理マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MWebkan")
    public MWebkan getMWebkan() {
        return this.mWebkan;
    }

    /**
     * @param p WEB在庫管理マスタ
     */
    public void setMWebkan(final MWebkan p) {
        this.mWebkan = p;
    }

    /**
     * @return WEB在庫管理マスタ
     */
    public MWebkan referMWebkan() {
        if (this.mWebkan == null) {
            try {
                this.mWebkan = MWebkan.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mWebkan;
    }
}
