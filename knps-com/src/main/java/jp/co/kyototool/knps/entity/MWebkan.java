package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * WEB在庫管理マスタ
 *
 * @author emarfkrow
 */
public class MWebkan implements IEntity {

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

    /** 規格 */
    private String kikaku;

    /**
     * @return 規格
     */
    public String getKikaku() {
        return this.kikaku;
    }

    /**
     * @param o 規格
     */
    public void setKikaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kikaku = String.valueOf(o.toString());
        } else {
            this.kikaku = null;
        }
    }

    /** 大分類コード */
    private String daicd;

    /**
     * @return 大分類コード
     */
    public String getDaicd() {
        return this.daicd;
    }

    /**
     * @param o 大分類コード
     */
    public void setDaicd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.daicd = String.valueOf(o.toString());
        } else {
            this.daicd = null;
        }
    }

    /** 中分類コード */
    private String chucd;

    /**
     * @return 中分類コード
     */
    public String getChucd() {
        return this.chucd;
    }

    /**
     * @param o 中分類コード
     */
    public void setChucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chucd = String.valueOf(o.toString());
        } else {
            this.chucd = null;
        }
    }

    /** 小分類コード */
    private String shocd;

    /**
     * @return 小分類コード
     */
    public String getShocd() {
        return this.shocd;
    }

    /**
     * @param o 小分類コード
     */
    public void setShocd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shocd = String.valueOf(o.toString());
        } else {
            this.shocd = null;
        }
    }

    /** 分類Ａコード */
    private String abuncd;

    /**
     * @return 分類Ａコード
     */
    public String getAbuncd() {
        return this.abuncd;
    }

    /**
     * @param o 分類Ａコード
     */
    public void setAbuncd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.abuncd = String.valueOf(o.toString());
        } else {
            this.abuncd = null;
        }
    }

    /** 分類Ｂコード */
    private String bbuncd;

    /**
     * @return 分類Ｂコード
     */
    public String getBbuncd() {
        return this.bbuncd;
    }

    /**
     * @param o 分類Ｂコード
     */
    public void setBbuncd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.bbuncd = String.valueOf(o.toString());
        } else {
            this.bbuncd = null;
        }
    }

    /** WEB表示区分 */
    private String whyojikbn;

    /**
     * @return WEB表示区分
     */
    public String getWhyojikbn() {
        return this.whyojikbn;
    }

    /**
     * @param o WEB表示区分
     */
    public void setWhyojikbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.whyojikbn = String.valueOf(o.toString());
        } else {
            this.whyojikbn = null;
        }
    }

    /** 入数 */
    private java.math.BigDecimal irisu;

    /**
     * @return 入数
     */
    public java.math.BigDecimal getIrisu() {
        return this.irisu;
    }

    /**
     * @param o 入数
     */
    public void setIrisu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.irisu = new java.math.BigDecimal(o.toString());
        } else {
            this.irisu = null;
        }
    }

    /** 最低在庫閾値 */
    private java.math.BigDecimal zaisikii;

    /**
     * @return 最低在庫閾値
     */
    public java.math.BigDecimal getZaisikii() {
        return this.zaisikii;
    }

    /**
     * @param o 最低在庫閾値
     */
    public void setZaisikii(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zaisikii = new java.math.BigDecimal(o.toString());
        } else {
            this.zaisikii = null;
        }
    }

    /** 入庫予定数閾値 */
    private java.math.BigDecimal nyuyoteisikii;

    /**
     * @return 入庫予定数閾値
     */
    public java.math.BigDecimal getNyuyoteisikii() {
        return this.nyuyoteisikii;
    }

    /**
     * @param o 入庫予定数閾値
     */
    public void setNyuyoteisikii(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nyuyoteisikii = new java.math.BigDecimal(o.toString());
        } else {
            this.nyuyoteisikii = null;
        }
    }

    /** 汎用文字１ */
    private String hanyou1;

    /**
     * @return 汎用文字１
     */
    public String getHanyou1() {
        return this.hanyou1;
    }

    /**
     * @param o 汎用文字１
     */
    public void setHanyou1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hanyou1 = String.valueOf(o.toString());
        } else {
            this.hanyou1 = null;
        }
    }

    /** 汎用文字２ */
    private String hanyou2;

    /**
     * @return 汎用文字２
     */
    public String getHanyou2() {
        return this.hanyou2;
    }

    /**
     * @param o 汎用文字２
     */
    public void setHanyou2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hanyou2 = String.valueOf(o.toString());
        } else {
            this.hanyou2 = null;
        }
    }

    /** 汎用文字３ */
    private String hanyou3;

    /**
     * @return 汎用文字３
     */
    public String getHanyou3() {
        return this.hanyou3;
    }

    /**
     * @param o 汎用文字３
     */
    public void setHanyou3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hanyou3 = String.valueOf(o.toString());
        } else {
            this.hanyou3 = null;
        }
    }

    /** 在庫表示変更区分 */
    private String zaihenkbn;

    /**
     * @return 在庫表示変更区分
     */
    public String getZaihenkbn() {
        return this.zaihenkbn;
    }

    /**
     * @param o 在庫表示変更区分
     */
    public void setZaihenkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zaihenkbn = String.valueOf(o.toString());
        } else {
            this.zaihenkbn = null;
        }
    }

    /** 定価表示制御区分 */
    private String teidspkbn;

    /**
     * @return 定価表示制御区分
     */
    public String getTeidspkbn() {
        return this.teidspkbn;
    }

    /**
     * @param o 定価表示制御区分
     */
    public void setTeidspkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.teidspkbn = String.valueOf(o.toString());
        } else {
            this.teidspkbn = null;
        }
    }

    /** 閾値更新対象区分 */
    private String updexcdkbn;

    /**
     * @return 閾値更新対象区分
     */
    public String getUpdexcdkbn() {
        return this.updexcdkbn;
    }

    /**
     * @param o 閾値更新対象区分
     */
    public void setUpdexcdkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updexcdkbn = String.valueOf(o.toString());
        } else {
            this.updexcdkbn = null;
        }
    }

    /** 作成日 */
    private java.math.BigDecimal tourokubi;

    /**
     * @return 作成日
     */
    public java.math.BigDecimal getTourokubi() {
        return this.tourokubi;
    }

    /**
     * @param o 作成日
     */
    public void setTourokubi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tourokubi = new java.math.BigDecimal(o.toString());
        } else {
            this.tourokubi = null;
        }
    }

    /** 更新日 */
    private java.math.BigDecimal shuseibi;

    /**
     * @return 更新日
     */
    public java.math.BigDecimal getShuseibi() {
        return this.shuseibi;
    }

    /**
     * @param o 更新日
     */
    public void setShuseibi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shuseibi = new java.math.BigDecimal(o.toString());
        } else {
            this.shuseibi = null;
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
     * WEB在庫管理マスタ照会
     *
     * @param param1 販売品番
     * @return WEB在庫管理マスタ
     */
    public static MWebkan get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HHINBAN\") = TRIM (:hhinban)");

        String sql = "SELECT * FROM M_WEBKAN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);

        return Queries.get(sql, params, MWebkan.class);
    }

    /**
     * WEB在庫管理マスタ追加
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
        List<String> nameList = new ArrayList<String>();
        nameList.add("hhinban -- :hhinban");
        nameList.add("kikaku -- :kikaku");
        nameList.add("daicd -- :daicd");
        nameList.add("chucd -- :chucd");
        nameList.add("shocd -- :shocd");
        nameList.add("abuncd -- :abuncd");
        nameList.add("bbuncd -- :bbuncd");
        nameList.add("whyojikbn -- :whyojikbn");
        nameList.add("irisu -- :irisu");
        nameList.add("zaisikii -- :zaisikii");
        nameList.add("nyuyoteisikii -- :nyuyoteisikii");
        nameList.add("hanyou1 -- :hanyou1");
        nameList.add("hanyou2 -- :hanyou2");
        nameList.add("hanyou3 -- :hanyou3");
        nameList.add("zaihenkbn -- :zaihenkbn");
        nameList.add("teidspkbn -- :teidspkbn");
        nameList.add("updexcdkbn -- :updexcdkbn");
        nameList.add("tourokubi -- :tourokubi");
        nameList.add("shuseibi -- :shuseibi");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_WEBKAN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":kikaku");
        valueList.add(":daicd");
        valueList.add(":chucd");
        valueList.add(":shocd");
        valueList.add(":abuncd");
        valueList.add(":bbuncd");
        valueList.add(":whyojikbn");
        valueList.add(":irisu");
        valueList.add(":zaisikii");
        valueList.add(":nyuyoteisikii");
        valueList.add(":hanyou1");
        valueList.add(":hanyou2");
        valueList.add(":hanyou3");
        valueList.add(":zaihenkbn");
        valueList.add(":teidspkbn");
        valueList.add(":updexcdkbn");
        valueList.add(":tourokubi");
        valueList.add(":shuseibi");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 販売品番の採番処理 */
    private void numbering() {

        if (this.hhinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.HHINBAN) IS NULL THEN 0 ELSE MAX(e.HHINBAN) * 1 END + 1, 20, '0') AS HHINBAN FROM M_WEBKAN e WHERE e.HHINBAN < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HHINBAN");

        this.setHhinban(o);
    }

    /**
     * WEB在庫管理マスタ更新
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
        String sql = "UPDATE M_WEBKAN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("hhinban = :hhinban");
        setList.add("kikaku = :kikaku");
        setList.add("daicd = :daicd");
        setList.add("chucd = :chucd");
        setList.add("shocd = :shocd");
        setList.add("abuncd = :abuncd");
        setList.add("bbuncd = :bbuncd");
        setList.add("whyojikbn = :whyojikbn");
        setList.add("irisu = :irisu");
        setList.add("zaisikii = :zaisikii");
        setList.add("nyuyoteisikii = :nyuyoteisikii");
        setList.add("hanyou1 = :hanyou1");
        setList.add("hanyou2 = :hanyou2");
        setList.add("hanyou3 = :hanyou3");
        setList.add("zaihenkbn = :zaihenkbn");
        setList.add("teidspkbn = :teidspkbn");
        setList.add("updexcdkbn = :updexcdkbn");
        setList.add("tourokubi = :tourokubi");
        setList.add("shuseibi = :shuseibi");
        setList.add("filler = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * WEB在庫管理マスタ削除
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
        String sql = "DELETE FROM M_WEBKAN WHERE " + getWhere();

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
        params.put("KIKAKU", this.kikaku);
        params.put("DAICD", this.daicd);
        params.put("CHUCD", this.chucd);
        params.put("SHOCD", this.shocd);
        params.put("ABUNCD", this.abuncd);
        params.put("BBUNCD", this.bbuncd);
        params.put("WHYOJIKBN", this.whyojikbn);
        params.put("IRISU", this.irisu);
        params.put("ZAISIKII", this.zaisikii);
        params.put("NYUYOTEISIKII", this.nyuyoteisikii);
        params.put("HANYOU1", this.hanyou1);
        params.put("HANYOU2", this.hanyou2);
        params.put("HANYOU3", this.hanyou3);
        params.put("ZAIHENKBN", this.zaihenkbn);
        params.put("TEIDSPKBN", this.teidspkbn);
        params.put("UPDEXCDKBN", this.updexcdkbn);
        params.put("TOUROKUBI", this.tourokubi);
        params.put("SHUSEIBI", this.shuseibi);
        params.put("FILLER", this.filler);
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
}
