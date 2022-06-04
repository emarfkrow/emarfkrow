package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 与信管理マスタ
 *
 * @author emarfkrow
 */
public class MYosin implements IEntity {

    /** 集金先コード */
    private java.math.BigDecimal shukincd;

    /**
     * @return 集金先コード
     */
    public java.math.BigDecimal getShukincd() {
        return this.shukincd;
    }

    /**
     * @param o 集金先コード
     */
    public void setShukincd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shukincd = new java.math.BigDecimal(o.toString());
        } else {
            this.shukincd = null;
        }
    }

    /** 本社コード */
    private java.math.BigDecimal honshacd;

    /**
     * @return 本社コード
     */
    public java.math.BigDecimal getHonshacd() {
        return this.honshacd;
    }

    /**
     * @param o 本社コード
     */
    public void setHonshacd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.honshacd = new java.math.BigDecimal(o.toString());
        } else {
            this.honshacd = null;
        }
    }

    /** 略得意先名 */
    private String rtokumei;

    /**
     * @return 略得意先名
     */
    public String getRtokumei() {
        return this.rtokumei;
    }

    /**
     * @param o 略得意先名
     */
    public void setRtokumei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rtokumei = String.valueOf(o.toString());
        } else {
            this.rtokumei = null;
        }
    }

    /** 信用ランク */
    private String sinyoRank;

    /**
     * @return 信用ランク
     */
    public String getSinyoRank() {
        return this.sinyoRank;
    }

    /**
     * @param o 信用ランク
     */
    public void setSinyoRank(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sinyoRank = String.valueOf(o.toString());
        } else {
            this.sinyoRank = null;
        }
    }

    /** 取引信用保険額 */
    private java.math.BigDecimal sinyoHoken;

    /**
     * @return 取引信用保険額
     */
    public java.math.BigDecimal getSinyoHoken() {
        return this.sinyoHoken;
    }

    /**
     * @param o 取引信用保険額
     */
    public void setSinyoHoken(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sinyoHoken = new java.math.BigDecimal(o.toString());
        } else {
            this.sinyoHoken = null;
        }
    }

    /** 営業保証金 */
    private java.math.BigDecimal eigyoHosyokin;

    /**
     * @return 営業保証金
     */
    public java.math.BigDecimal getEigyoHosyokin() {
        return this.eigyoHosyokin;
    }

    /**
     * @param o 営業保証金
     */
    public void setEigyoHosyokin(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.eigyoHosyokin = new java.math.BigDecimal(o.toString());
        } else {
            this.eigyoHosyokin = null;
        }
    }

    /** 担保株式数 */
    private java.math.BigDecimal tanpoKabusu;

    /**
     * @return 担保株式数
     */
    public java.math.BigDecimal getTanpoKabusu() {
        return this.tanpoKabusu;
    }

    /**
     * @param o 担保株式数
     */
    public void setTanpoKabusu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tanpoKabusu = new java.math.BigDecimal(o.toString());
        } else {
            this.tanpoKabusu = null;
        }
    }

    /** 出資額 */
    private java.math.BigDecimal shushigaku;

    /**
     * @return 出資額
     */
    public java.math.BigDecimal getShushigaku() {
        return this.shushigaku;
    }

    /**
     * @param o 出資額
     */
    public void setShushigaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shushigaku = new java.math.BigDecimal(o.toString());
        } else {
            this.shushigaku = null;
        }
    }

    /** 貸倒懸念先引当金 */
    private java.math.BigDecimal kasidaoreHikiate;

    /**
     * @return 貸倒懸念先引当金
     */
    public java.math.BigDecimal getKasidaoreHikiate() {
        return this.kasidaoreHikiate;
    }

    /**
     * @param o 貸倒懸念先引当金
     */
    public void setKasidaoreHikiate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kasidaoreHikiate = new java.math.BigDecimal(o.toString());
        } else {
            this.kasidaoreHikiate = null;
        }
    }

    /** 出荷限度額 */
    private java.math.BigDecimal shukaGendo;

    /**
     * @return 出荷限度額
     */
    public java.math.BigDecimal getShukaGendo() {
        return this.shukaGendo;
    }

    /**
     * @param o 出荷限度額
     */
    public void setShukaGendo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shukaGendo = new java.math.BigDecimal(o.toString());
        } else {
            this.shukaGendo = null;
        }
    }

    /** マスター登録日 */
    private java.math.BigDecimal tourokubi;

    /**
     * @return マスター登録日
     */
    public java.math.BigDecimal getTourokubi() {
        return this.tourokubi;
    }

    /**
     * @param o マスター登録日
     */
    public void setTourokubi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tourokubi = new java.math.BigDecimal(o.toString());
        } else {
            this.tourokubi = null;
        }
    }

    /** 更新日付 */
    private java.math.BigDecimal upddate;

    /**
     * @return 更新日付
     */
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
     * 与信管理マスタ照会
     *
     * @param param1 集金先コード
     * @return 与信管理マスタ
     */
    public static MYosin get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SHUKINCD\" = :shukincd");

        String sql = "SELECT * FROM M_YOSIN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("shukincd", param1);

        return Queries.get(sql, params, MYosin.class);
    }

    /**
     * 与信管理マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 与信管理マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"SHUKINCD\" -- :shukincd");
        nameList.add("\"HONSHACD\" -- :honshacd");
        nameList.add("\"RTOKUMEI\" -- :rtokumei");
        nameList.add("\"SINYO-RANK\" -- :sinyo_rank");
        nameList.add("\"SINYO-HOKEN\" -- :sinyo_hoken");
        nameList.add("\"EIGYO-HOSYOKIN\" -- :eigyo_hosyokin");
        nameList.add("\"TANPO-KABUSU\" -- :tanpo_kabusu");
        nameList.add("\"SHUSHIGAKU\" -- :shushigaku");
        nameList.add("\"KASIDAORE-HIKIATE\" -- :kasidaore_hikiate");
        nameList.add("\"SHUKA-GENDO\" -- :shuka_gendo");
        nameList.add("\"TOUROKUBI\" -- :tourokubi");
        nameList.add("\"UPDDATE\" -- :upddate");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_YOSIN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":shukincd");
        valueList.add(":honshacd");
        valueList.add(":rtokumei");
        valueList.add(":sinyo_rank");
        valueList.add(":sinyo_hoken");
        valueList.add(":eigyo_hosyokin");
        valueList.add(":tanpo_kabusu");
        valueList.add(":shushigaku");
        valueList.add(":kasidaore_hikiate");
        valueList.add(":shuka_gendo");
        valueList.add(":tourokubi");
        valueList.add(":upddate");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 与信管理マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 与信管理マスタの登録
        String sql = "UPDATE M_YOSIN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"SHUKINCD\" = :shukincd");
        setList.add("\"HONSHACD\" = :honshacd");
        setList.add("\"RTOKUMEI\" = :rtokumei");
        setList.add("\"SINYO-RANK\" = :sinyo_rank");
        setList.add("\"SINYO-HOKEN\" = :sinyo_hoken");
        setList.add("\"EIGYO-HOSYOKIN\" = :eigyo_hosyokin");
        setList.add("\"TANPO-KABUSU\" = :tanpo_kabusu");
        setList.add("\"SHUSHIGAKU\" = :shushigaku");
        setList.add("\"KASIDAORE-HIKIATE\" = :kasidaore_hikiate");
        setList.add("\"SHUKA-GENDO\" = :shuka_gendo");
        setList.add("\"TOUROKUBI\" = :tourokubi");
        setList.add("\"UPDDATE\" = :upddate");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 与信管理マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 与信管理マスタの削除
        String sql = "DELETE FROM M_YOSIN WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SHUKINCD\" = :shukincd");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("shukincd", this.shukincd);
        params.put("honshacd", this.honshacd);
        params.put("rtokumei", this.rtokumei);
        params.put("sinyo_rank", this.sinyoRank);
        params.put("sinyo_hoken", this.sinyoHoken);
        params.put("eigyo_hosyokin", this.eigyoHosyokin);
        params.put("tanpo_kabusu", this.tanpoKabusu);
        params.put("shushigaku", this.shushigaku);
        params.put("kasidaore_hikiate", this.kasidaoreHikiate);
        params.put("shuka_gendo", this.shukaGendo);
        params.put("tourokubi", this.tourokubi);
        params.put("upddate", this.upddate);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
