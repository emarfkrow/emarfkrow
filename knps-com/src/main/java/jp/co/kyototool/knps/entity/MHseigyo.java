package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 販売制御マスタ
 *
 * @author emarfkrow
 */
public class MHseigyo implements IEntity {

    /** キーコード */
    private java.math.BigDecimal keycd;

    /**
     * @return キーコード
     */
    public java.math.BigDecimal getKeycd() {
        return this.keycd;
    }

    /**
     * @param o キーコード
     */
    public void setKeycd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.keycd = new java.math.BigDecimal(o.toString());
        } else {
            this.keycd = null;
        }
    }

    /** 開始日付 */
    private java.math.BigDecimal kaisibi;

    /**
     * @return 開始日付
     */
    public java.math.BigDecimal getKaisibi() {
        return this.kaisibi;
    }

    /**
     * @param o 開始日付
     */
    public void setKaisibi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kaisibi = new java.math.BigDecimal(o.toString());
        } else {
            this.kaisibi = null;
        }
    }

    /** 終了日付 */
    private java.math.BigDecimal shuryobi;

    /**
     * @return 終了日付
     */
    public java.math.BigDecimal getShuryobi() {
        return this.shuryobi;
    }

    /**
     * @param o 終了日付
     */
    public void setShuryobi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shuryobi = new java.math.BigDecimal(o.toString());
        } else {
            this.shuryobi = null;
        }
    }

    /** 消費税率 */
    private java.math.BigDecimal zeiritu;

    /**
     * @return 消費税率
     */
    public java.math.BigDecimal getZeiritu() {
        return this.zeiritu;
    }

    /**
     * @param o 消費税率
     */
    public void setZeiritu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zeiritu = new java.math.BigDecimal(o.toString());
        } else {
            this.zeiritu = null;
        }
    }

    /** 有ボ入力区分 */
    private java.math.BigDecimal yuboent;

    /**
     * @return 有ボ入力区分
     */
    public java.math.BigDecimal getYuboent() {
        return this.yuboent;
    }

    /**
     * @param o 有ボ入力区分
     */
    public void setYuboent(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yuboent = new java.math.BigDecimal(o.toString());
        } else {
            this.yuboent = null;
        }
    }

    /** 出荷指示番号１ */
    private java.math.BigDecimal shusijino1;

    /**
     * @return 出荷指示番号１
     */
    public java.math.BigDecimal getShusijino1() {
        return this.shusijino1;
    }

    /**
     * @param o 出荷指示番号１
     */
    public void setShusijino1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shusijino1 = new java.math.BigDecimal(o.toString());
        } else {
            this.shusijino1 = null;
        }
    }

    /** 納品書番号 */
    private java.math.BigDecimal nohinshono;

    /**
     * @return 納品書番号
     */
    public java.math.BigDecimal getNohinshono() {
        return this.nohinshono;
    }

    /**
     * @param o 納品書番号
     */
    public void setNohinshono(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.nohinshono = new java.math.BigDecimal(o.toString());
        } else {
            this.nohinshono = null;
        }
    }

    /** セット計画番号 */
    private java.math.BigDecimal setkeino;

    /**
     * @return セット計画番号
     */
    public java.math.BigDecimal getSetkeino() {
        return this.setkeino;
    }

    /**
     * @param o セット計画番号
     */
    public void setSetkeino(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setkeino = new java.math.BigDecimal(o.toString());
        } else {
            this.setkeino = null;
        }
    }

    /** 月次年月 */
    private java.math.BigDecimal getujiYymm;

    /**
     * @return 月次年月
     */
    public java.math.BigDecimal getGetujiYymm() {
        return this.getujiYymm;
    }

    /**
     * @param o 月次年月
     */
    public void setGetujiYymm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.getujiYymm = new java.math.BigDecimal(o.toString());
        } else {
            this.getujiYymm = null;
        }
    }

    /** 当日受注件数 */
    private java.math.BigDecimal tJuccnt;

    /**
     * @return 当日受注件数
     */
    public java.math.BigDecimal getTJuccnt() {
        return this.tJuccnt;
    }

    /**
     * @param o 当日受注件数
     */
    public void setTJuccnt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tJuccnt = new java.math.BigDecimal(o.toString());
        } else {
            this.tJuccnt = null;
        }
    }

    /** 当日受注最大件数 */
    private java.math.BigDecimal tMaxcnt;

    /**
     * @return 当日受注最大件数
     */
    public java.math.BigDecimal getTMaxcnt() {
        return this.tMaxcnt;
    }

    /**
     * @param o 当日受注最大件数
     */
    public void setTMaxcnt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tMaxcnt = new java.math.BigDecimal(o.toString());
        } else {
            this.tMaxcnt = null;
        }
    }

    /** 直送先カウント */
    private java.math.BigDecimal chokucnt;

    /**
     * @return 直送先カウント
     */
    public java.math.BigDecimal getChokucnt() {
        return this.chokucnt;
    }

    /**
     * @param o 直送先カウント
     */
    public void setChokucnt(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chokucnt = new java.math.BigDecimal(o.toString());
        } else {
            this.chokucnt = null;
        }
    }

    /** 評価単価 */
    private java.math.BigDecimal hyotanka;

    /**
     * @return 評価単価
     */
    public java.math.BigDecimal getHyotanka() {
        return this.hyotanka;
    }

    /**
     * @param o 評価単価
     */
    public void setHyotanka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hyotanka = new java.math.BigDecimal(o.toString());
        } else {
            this.hyotanka = null;
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
     * 販売制御マスタ照会
     *
     * @param param1 キーコード
     * @return 販売制御マスタ
     */
    public static MHseigyo get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("keycd = :keycd");

        String sql = "SELECT * FROM M_HSEIGYO WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("keycd", param1);

        return Queries.get(sql, params, MHseigyo.class);
    }

    /**
     * 販売制御マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 販売制御マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("keycd -- :keycd");
        nameList.add("kaisibi -- :kaisibi");
        nameList.add("shuryobi -- :shuryobi");
        nameList.add("zeiritu -- :zeiritu");
        nameList.add("yuboent -- :yuboent");
        nameList.add("shusijino1 -- :shusijino1");
        nameList.add("nohinshono -- :nohinshono");
        nameList.add("setkeino -- :setkeino");
        nameList.add("getuji-yymm -- :getuji-yymm");
        nameList.add("t-juccnt -- :t-juccnt");
        nameList.add("t-maxcnt -- :t-maxcnt");
        nameList.add("chokucnt -- :chokucnt");
        nameList.add("hyotanka -- :hyotanka");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_HSEIGYO(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":keycd");
        valueList.add(":kaisibi");
        valueList.add(":shuryobi");
        valueList.add(":zeiritu");
        valueList.add(":yuboent");
        valueList.add(":shusijino1");
        valueList.add(":nohinshono");
        valueList.add(":setkeino");
        valueList.add(":getuji-yymm");
        valueList.add(":t-juccnt");
        valueList.add(":t-maxcnt");
        valueList.add(":chokucnt");
        valueList.add(":hyotanka");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 販売制御マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 販売制御マスタの登録
        String sql = "UPDATE M_HSEIGYO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("keycd = :keycd");
        setList.add("kaisibi = :kaisibi");
        setList.add("shuryobi = :shuryobi");
        setList.add("zeiritu = :zeiritu");
        setList.add("yuboent = :yuboent");
        setList.add("shusijino1 = :shusijino1");
        setList.add("nohinshono = :nohinshono");
        setList.add("setkeino = :setkeino");
        setList.add("getuji-yymm = :getuji-yymm");
        setList.add("t-juccnt = :t-juccnt");
        setList.add("t-maxcnt = :t-maxcnt");
        setList.add("chokucnt = :chokucnt");
        setList.add("hyotanka = :hyotanka");
        setList.add("filler = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 販売制御マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 販売制御マスタの削除
        String sql = "DELETE FROM M_HSEIGYO WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("keycd = :keycd");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("KEYCD", this.keycd);
        params.put("KAISIBI", this.kaisibi);
        params.put("SHURYOBI", this.shuryobi);
        params.put("ZEIRITU", this.zeiritu);
        params.put("YUBOENT", this.yuboent);
        params.put("SHUSIJINO1", this.shusijino1);
        params.put("NOHINSHONO", this.nohinshono);
        params.put("SETKEINO", this.setkeino);
        params.put("GETUJI-YYMM", this.getujiYymm);
        params.put("T-JUCCNT", this.tJuccnt);
        params.put("T-MAXCNT", this.tMaxcnt);
        params.put("CHOKUCNT", this.chokucnt);
        params.put("HYOTANKA", this.hyotanka);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
