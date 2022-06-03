package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * バーコードマスタ
 *
 * @author emarfkrow
 */
public class MBarcd implements IEntity {

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

    /** 品名 */
    private String hinmei;

    /**
     * @return 品名
     */
    public String getHinmei() {
        return this.hinmei;
    }

    /**
     * @param o 品名
     */
    public void setHinmei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinmei = String.valueOf(o.toString());
        } else {
            this.hinmei = null;
        }
    }

    /** バーコード */
    private java.math.BigDecimal barcode;

    /**
     * @return バーコード
     */
    public java.math.BigDecimal getBarcode() {
        return this.barcode;
    }

    /**
     * @param o バーコード
     */
    public void setBarcode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barcode = new java.math.BigDecimal(o.toString());
        } else {
            this.barcode = null;
        }
    }

    /** 自由項目１ */
    private String free1;

    /**
     * @return 自由項目１
     */
    public String getFree1() {
        return this.free1;
    }

    /**
     * @param o 自由項目１
     */
    public void setFree1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.free1 = String.valueOf(o.toString());
        } else {
            this.free1 = null;
        }
    }

    /** 自由項目２ */
    private String free2;

    /**
     * @return 自由項目２
     */
    public String getFree2() {
        return this.free2;
    }

    /**
     * @param o 自由項目２
     */
    public void setFree2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.free2 = String.valueOf(o.toString());
        } else {
            this.free2 = null;
        }
    }

    /** 自由項目３ */
    private String free3;

    /**
     * @return 自由項目３
     */
    public String getFree3() {
        return this.free3;
    }

    /**
     * @param o 自由項目３
     */
    public void setFree3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.free3 = String.valueOf(o.toString());
        } else {
            this.free3 = null;
        }
    }

    /** 予備領域 */
    private String fller;

    /**
     * @return 予備領域
     */
    public String getFller() {
        return this.fller;
    }

    /**
     * @param o 予備領域
     */
    public void setFller(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.fller = String.valueOf(o.toString());
        } else {
            this.fller = null;
        }
    }

    /**
     * バーコードマスタ照会
     *
     * @param param1 販売品番
     * @return バーコードマスタ
     */
    public static MBarcd get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hhinban) = TRIM (:hhinban)");

        String sql = "SELECT * FROM M_BARCD WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);

        return Queries.get(sql, params, MBarcd.class);
    }

    /**
     * バーコードマスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 販売品番の採番処理
        numbering();

        // 包装材構成マスタの登録
        if (this.mHososets != null) {
            for (MHososet mHososet : this.mHososets) {
                mHososet.setHhinban(this.getHhinban());
                mHososet.insert(now, id);
            }
        }

        // 部品構成マスタの登録
        if (this.mPkoses != null) {
            for (MPkose mPkose : this.mPkoses) {
                mPkose.setHhinban(this.getHhinban());
                mPkose.insert(now, id);
            }
        }

        // 原価マスタの登録
        if (this.mGenka != null) {
            this.mGenka.setHhinban(this.getHhinban());
            this.mGenka.insert(now, id);
        }

        // 販売品目マスタの登録
        if (this.mHhinmok != null) {
            this.mHhinmok.setHhinban(this.getHhinban());
            this.mHhinmok.insert(now, id);
        }

        // 日産単価マスタの登録
        if (this.mNtanka != null) {
            this.mNtanka.setHhinban(this.getHhinban());
            this.mNtanka.insert(now, id);
        }

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

        // バーコードマスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("hhinban -- :hhinban");
        nameList.add("hinmei -- :hinmei");
        nameList.add("barcode -- :barcode");
        nameList.add("free1 -- :free1");
        nameList.add("free2 -- :free2");
        nameList.add("free3 -- :free3");
        nameList.add("fller -- :fller");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_BARCD(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":hinmei");
        valueList.add(":barcode");
        valueList.add(":free1");
        valueList.add(":free2");
        valueList.add(":free3");
        valueList.add(":fller");
        return String.join("\r\n    , ", valueList);
    }

    /** 販売品番の採番処理 */
    private void numbering() {

        if (this.hhinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.HHINBAN) IS NULL THEN 0 ELSE MAX(e.HHINBAN) * 1 END + 1, 20, '0') AS HHINBAN FROM M_BARCD e WHERE e.HHINBAN < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HHINBAN");

        this.setHhinban(o);
    }

    /**
     * バーコードマスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 包装材構成マスタの登録
        if (this.mHososets != null) {
            Queries.regist("DELETE FROM M_HOSOSET WHERE HHINBAN = :HHINBAN AND HOSO-HINBAN = :HOSO-HINBAN", toMap(now, id));
            for (MHososet mHososet : this.mHososets) {
                mHososet.setHhinban(this.hhinban);
                try {
                    mHososet.insert(now, id);
                } catch (Exception e) {
                    mHososet.update(now, id);
                }
            }
        }

        // 部品構成マスタの登録
        if (this.mPkoses != null) {
            Queries.regist("DELETE FROM M_PKOSE WHERE HHINBAN = :HHINBAN AND PHINBAN = :PHINBAN", toMap(now, id));
            for (MPkose mPkose : this.mPkoses) {
                mPkose.setHhinban(this.hhinban);
                try {
                    mPkose.insert(now, id);
                } catch (Exception e) {
                    mPkose.update(now, id);
                }
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

        // 販売品目マスタの登録
        if (this.mHhinmok != null) {
            mHhinmok.setHhinban(this.getHhinban());
            try {
                mHhinmok.insert(now, id);
            } catch (Exception e) {
                mHhinmok.update(now, id);
            }
        }

        // 日産単価マスタの登録
        if (this.mNtanka != null) {
            mNtanka.setHhinban(this.getHhinban());
            try {
                mNtanka.insert(now, id);
            } catch (Exception e) {
                mNtanka.update(now, id);
            }
        }

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

        // バーコードマスタの登録
        String sql = "UPDATE M_BARCD\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("hhinban = :hhinban");
        setList.add("hinmei = :hinmei");
        setList.add("barcode = :barcode");
        setList.add("free1 = :free1");
        setList.add("free2 = :free2");
        setList.add("free3 = :free3");
        setList.add("fller = :fller");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * バーコードマスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 包装材構成マスタの削除
        if (this.mHososets != null) {
            for (MHososet mHososet : this.mHososets) {
                mHososet.delete();
            }
        }

        // 部品構成マスタの削除
        if (this.mPkoses != null) {
            for (MPkose mPkose : this.mPkoses) {
                mPkose.delete();
            }
        }

        // 原価マスタの削除
        if (this.mGenka != null) {
            this.mGenka.delete();
        }

        // 販売品目マスタの削除
        if (this.mHhinmok != null) {
            this.mHhinmok.delete();
        }

        // 日産単価マスタの削除
        if (this.mNtanka != null) {
            this.mNtanka.delete();
        }

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

        // バーコードマスタの削除
        String sql = "DELETE FROM M_BARCD WHERE " + getWhere();

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
        params.put("HINMEI", this.hinmei);
        params.put("BARCODE", this.barcode);
        params.put("FREE1", this.free1);
        params.put("FREE2", this.free2);
        params.put("FREE3", this.free3);
        params.put("FLLER", this.fller);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
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
     * 販売品目マスタ
     */
    private MHhinmok mHhinmok;

    /**
     * @return 販売品目マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MHhinmok")
    public MHhinmok getMHhinmok() {
        return this.mHhinmok;
    }

    /**
     * @param p 販売品目マスタ
     */
    public void setMHhinmok(final MHhinmok p) {
        this.mHhinmok = p;
    }

    /**
     * @return 販売品目マスタ
     */
    public MHhinmok referMHhinmok() {
        if (this.mHhinmok == null) {
            try {
                this.mHhinmok = MHhinmok.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mHhinmok;
    }

    /**
     * 日産単価マスタ
     */
    private MNtanka mNtanka;

    /**
     * @return 日産単価マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MNtanka")
    public MNtanka getMNtanka() {
        return this.mNtanka;
    }

    /**
     * @param p 日産単価マスタ
     */
    public void setMNtanka(final MNtanka p) {
        this.mNtanka = p;
    }

    /**
     * @return 日産単価マスタ
     */
    public MNtanka referMNtanka() {
        if (this.mNtanka == null) {
            try {
                this.mNtanka = MNtanka.get(this.hhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mNtanka;
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

    /**
     * 包装材構成マスタのリスト
     */
    private List<MHososet> mHososets;

    /**
     * @return 包装材構成マスタのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MHososets")
    public List<MHososet> getMHososets() {
        return this.mHososets;
    }

    /**
     * @param list 包装材構成マスタのリスト
     */
    public void setMHososets(final List<MHososet> list) {
        this.mHososets = list;
    }

    /**
     * @param mHososet
     */
    public void addMHososets(final MHososet mHososet) {
        if (this.mHososets == null) {
            this.mHososets = new ArrayList<MHososet>();
        }
        this.mHososets.add(mHososet);
    }

    /**
     * @return 包装材構成マスタのリスト
     */
    public List<MHososet> referMHososets() {
        if (this.mHososets == null) {
            this.mHososets = MBarcd.referMHososets(this.hhinban);
        }
        return this.mHososets;
    }

    /**
     * @param param1 hhinban
     * @return List<MHososet>
     */
    public static List<MHososet> referMHososets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("hhinban = :hhinban");

        String sql = "SELECT * FROM M_HOSOSET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);

        return Queries.select(sql, params, MHososet.class);
    }

    /**
     * 部品構成マスタのリスト
     */
    private List<MPkose> mPkoses;

    /**
     * @return 部品構成マスタのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MPkoses")
    public List<MPkose> getMPkoses() {
        return this.mPkoses;
    }

    /**
     * @param list 部品構成マスタのリスト
     */
    public void setMPkoses(final List<MPkose> list) {
        this.mPkoses = list;
    }

    /**
     * @param mPkose
     */
    public void addMPkoses(final MPkose mPkose) {
        if (this.mPkoses == null) {
            this.mPkoses = new ArrayList<MPkose>();
        }
        this.mPkoses.add(mPkose);
    }

    /**
     * @return 部品構成マスタのリスト
     */
    public List<MPkose> referMPkoses() {
        if (this.mPkoses == null) {
            this.mPkoses = MBarcd.referMPkoses(this.hhinban);
        }
        return this.mPkoses;
    }

    /**
     * @param param1 hhinban
     * @return List<MPkose>
     */
    public static List<MPkose> referMPkoses(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("hhinban = :hhinban");

        String sql = "SELECT * FROM M_PKOSE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);

        return Queries.select(sql, params, MPkose.class);
    }
}
