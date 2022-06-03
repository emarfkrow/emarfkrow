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
     * 日産単価マスタ照会
     *
     * @param param1 販売品番
     * @return 日産単価マスタ
     */
    public static MNtanka get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hhinban) = TRIM (:hhinban)");

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

        // 製品原価マスタの登録
        if (this.mSgenka != null) {
            this.mSgenka.setHhinban(this.getHhinban());
            this.mSgenka.insert(now, id);
        }

        // ＳＫ品番マスタの登録
        if (this.mSkhin != null) {
            this.mSkhin.setHhinban(this.getHhinban());
            this.mSkhin.insert(now, id);
        }

        // 単価マスタの登録
        if (this.mTanka != null) {
            this.mTanka.setHhinban(this.getHhinban());
            this.mTanka.insert(now, id);
        }

        // WEB在庫管理マスタの登録
        if (this.mWebkan != null) {
            this.mWebkan.setHhinban(this.getHhinban());
            this.mWebkan.insert(now, id);
        }

        // 日産単価マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("hhinban -- :hhinban");
        nameList.add("nissan-hinban -- :nissan-hinban");
        nameList.add("nissan-tanka -- :nissan-tanka");
        nameList.add("kouri-kakaku -- :kouri-kakaku");
        nameList.add("shohinkbn -- :shohinkbn");
        nameList.add("persokbn -- :persokbn");
        nameList.add("kakakukbn -- :kakakukbn");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_NTANKA(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":nissan-hinban");
        valueList.add(":nissan-tanka");
        valueList.add(":kouri-kakaku");
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

        String sql = "SELECT LPAD (CASE WHEN MAX(e.HHINBAN) IS NULL THEN 0 ELSE MAX(e.HHINBAN) * 1 END + 1, 20, '0') AS HHINBAN FROM M_NTANKA e WHERE e.HHINBAN < '99999999999999999999'";

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

        // 製品原価マスタの登録
        if (this.mSgenka != null) {
            mSgenka.setHhinban(this.getHhinban());
            try {
                mSgenka.insert(now, id);
            } catch (Exception e) {
                mSgenka.update(now, id);
            }
        }

        // ＳＫ品番マスタの登録
        if (this.mSkhin != null) {
            mSkhin.setHhinban(this.getHhinban());
            try {
                mSkhin.insert(now, id);
            } catch (Exception e) {
                mSkhin.update(now, id);
            }
        }

        // 単価マスタの登録
        if (this.mTanka != null) {
            mTanka.setHhinban(this.getHhinban());
            try {
                mTanka.insert(now, id);
            } catch (Exception e) {
                mTanka.update(now, id);
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

        // 日産単価マスタの登録
        String sql = "UPDATE M_NTANKA\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("hhinban = :hhinban");
        setList.add("nissan-hinban = :nissan-hinban");
        setList.add("nissan-tanka = :nissan-tanka");
        setList.add("kouri-kakaku = :kouri-kakaku");
        setList.add("shohinkbn = :shohinkbn");
        setList.add("persokbn = :persokbn");
        setList.add("kakakukbn = :kakakukbn");
        setList.add("filler = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 日産単価マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 製品原価マスタの削除
        if (this.mSgenka != null) {
            this.mSgenka.delete();
        }

        // ＳＫ品番マスタの削除
        if (this.mSkhin != null) {
            this.mSkhin.delete();
        }

        // 単価マスタの削除
        if (this.mTanka != null) {
            this.mTanka.delete();
        }

        // WEB在庫管理マスタの削除
        if (this.mWebkan != null) {
            this.mWebkan.delete();
        }

        // 日産単価マスタの削除
        String sql = "DELETE FROM M_NTANKA WHERE " + getWhere();

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
        params.put("NISSAN-HINBAN", this.nissanHinban);
        params.put("NISSAN-TANKA", this.nissanTanka);
        params.put("KOURI-KAKAKU", this.kouriKakaku);
        params.put("SHOHINKBN", this.shohinkbn);
        params.put("PERSOKBN", this.persokbn);
        params.put("KAKAKUKBN", this.kakakukbn);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * 製品原価マスタ
     */
    private MSgenka mSgenka;

    /**
     * @return 製品原価マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MSgenka")
    public MSgenka getMSgenka() {
        return this.mSgenka;
    }

    /**
     * @param p 製品原価マスタ
     */
    public void setMSgenka(final MSgenka p) {
        this.mSgenka = p;
    }

    /**
     * @return 製品原価マスタ
     */
    public MSgenka referMSgenka() {
        if (this.mSgenka == null) {
            try {
                this.mSgenka = MSgenka.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mSgenka;
    }

    /**
     * ＳＫ品番マスタ
     */
    private MSkhin mSkhin;

    /**
     * @return ＳＫ品番マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MSkhin")
    public MSkhin getMSkhin() {
        return this.mSkhin;
    }

    /**
     * @param p ＳＫ品番マスタ
     */
    public void setMSkhin(final MSkhin p) {
        this.mSkhin = p;
    }

    /**
     * @return ＳＫ品番マスタ
     */
    public MSkhin referMSkhin() {
        if (this.mSkhin == null) {
            try {
                this.mSkhin = MSkhin.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mSkhin;
    }

    /**
     * 単価マスタ
     */
    private MTanka mTanka;

    /**
     * @return 単価マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MTanka")
    public MTanka getMTanka() {
        return this.mTanka;
    }

    /**
     * @param p 単価マスタ
     */
    public void setMTanka(final MTanka p) {
        this.mTanka = p;
    }

    /**
     * @return 単価マスタ
     */
    public MTanka referMTanka() {
        if (this.mTanka == null) {
            try {
                this.mTanka = MTanka.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mTanka;
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
