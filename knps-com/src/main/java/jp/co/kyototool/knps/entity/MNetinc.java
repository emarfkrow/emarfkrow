package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * ネットインカム
 *
 * @author emarfkrow
 */
public class MNetinc implements IEntity {

    /** 本社コード */
    private java.math.BigDecimal honshacd;

    /**
     * @return 本社コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HONSHACD")
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

    /** 得意先コード */
    private java.math.BigDecimal tokucd;

    /**
     * @return 得意先コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOKUCD")
    public java.math.BigDecimal getTokucd() {
        return this.tokucd;
    }

    /**
     * @param o 得意先コード
     */
    public void setTokucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokucd = new java.math.BigDecimal(o.toString());
        } else {
            this.tokucd = null;
        }
    }

    /** 略得意先名 */
    private String rtokumei;

    /**
     * @return 略得意先名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("RTOKUMEI")
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

    /** 値引率 */
    private java.math.BigDecimal nebikiritu;

    /**
     * @return 値引率
     */
    @com.fasterxml.jackson.annotation.JsonProperty("NEBIKIRITU")
    public java.math.BigDecimal getNebikiritu() {
        return this.nebikiritu;
    }

    /**
     * @param o 値引率
     */
    public void setNebikiritu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nebikiritu = new java.math.BigDecimal(o.toString());
        } else {
            this.nebikiritu = null;
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
     * ネットインカム照会
     *
     * @param param1 本社コード
     * @return ネットインカム
     */
    public static MNetinc get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HONSHACD\" = :honshacd");

        String sql = "SELECT * FROM M_NETINC WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("honshacd", param1);

        return Queries.get(sql, params, MNetinc.class);
    }

    /**
     * ネットインカム追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 契約単価マスタの登録
        if (this.mKtankas != null) {
            for (MKtanka mKtanka : this.mKtankas) {
                mKtanka.setHonshacd(this.getHonshacd());
                mKtanka.insert(now, id);
            }
        }

        // ネットインカムの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HONSHACD\" -- :honshacd");
        nameList.add("\"TOKUCD\" -- :tokucd");
        nameList.add("\"RTOKUMEI\" -- :rtokumei");
        nameList.add("\"NEBIKIRITU\" -- :nebikiritu");
        nameList.add("\"UPDDATE\" -- :upddate");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_NETINC(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":honshacd");
        valueList.add(":tokucd");
        valueList.add(":rtokumei");
        valueList.add(":nebikiritu");
        valueList.add(":upddate");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * ネットインカム更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 契約単価マスタの登録
        if (this.mKtankas != null) {
            Queries.regist("DELETE FROM M_KTANKA WHERE \"HONSHACD\" = :honshacd AND \"SHAGAI-HINBAN\" = :shagai_hinban", toMap(now, id));
            for (MKtanka mKtanka : this.mKtankas) {
                mKtanka.setHonshacd(this.honshacd);
                try {
                    mKtanka.insert(now, id);
                } catch (Exception e) {
                    mKtanka.update(now, id);
                }
            }
        }

        // ネットインカムの登録
        String sql = "UPDATE M_NETINC\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HONSHACD\" = :honshacd");
        setList.add("\"TOKUCD\" = :tokucd");
        setList.add("\"RTOKUMEI\" = :rtokumei");
        setList.add("\"NEBIKIRITU\" = :nebikiritu");
        setList.add("\"UPDDATE\" = :upddate");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * ネットインカム削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 契約単価マスタの削除
        if (this.mKtankas != null) {
            for (MKtanka mKtanka : this.mKtankas) {
                mKtanka.delete();
            }
        }

        // ネットインカムの削除
        String sql = "DELETE FROM M_NETINC WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HONSHACD\" = :honshacd");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("honshacd", this.honshacd);
        params.put("tokucd", this.tokucd);
        params.put("rtokumei", this.rtokumei);
        params.put("nebikiritu", this.nebikiritu);
        params.put("upddate", this.upddate);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * 契約単価マスタのリスト
     */
    private List<MKtanka> mKtankas;

    /**
     * @return 契約単価マスタのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MKtankas")
    public List<MKtanka> getMKtankas() {
        return this.mKtankas;
    }

    /**
     * @param list 契約単価マスタのリスト
     */
    public void setMKtankas(final List<MKtanka> list) {
        this.mKtankas = list;
    }

    /**
     * @param mKtanka
     */
    public void addMKtankas(final MKtanka mKtanka) {
        if (this.mKtankas == null) {
            this.mKtankas = new ArrayList<MKtanka>();
        }
        this.mKtankas.add(mKtanka);
    }

    /**
     * @return 契約単価マスタのリスト
     */
    public List<MKtanka> referMKtankas() {
        if (this.mKtankas == null) {
            this.mKtankas = MNetinc.referMKtankas(this.honshacd);
        }
        return this.mKtankas;
    }

    /**
     * @param param1 honshacd
     * @return List<MKtanka>
     */
    public static List<MKtanka> referMKtankas(final java.math.BigDecimal param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("honshacd = :honshacd");

        String sql = "SELECT * FROM M_KTANKA WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("honshacd", param1);

        return Queries.select(sql, params, MKtanka.class);
    }
}
