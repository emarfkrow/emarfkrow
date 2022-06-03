package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 販売カレンダー
 *
 * @author emarfkrow
 */
public class MHcalend implements IEntity {

    /** 年月 */
    private java.math.BigDecimal yymm;

    /**
     * @return 年月
     */
    public java.math.BigDecimal getYymm() {
        return this.yymm;
    }

    /**
     * @param o 年月
     */
    public void setYymm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yymm = new java.math.BigDecimal(o.toString());
        } else {
            this.yymm = null;
        }
    }

    /** カレンダ区分 */
    private String calendkbn;

    /**
     * @return カレンダ区分
     */
    public String getCalendkbn() {
        return this.calendkbn;
    }

    /**
     * @param o カレンダ区分
     */
    public void setCalendkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.calendkbn = String.valueOf(o.toString());
        } else {
            this.calendkbn = null;
        }
    }

    /** 稼働日数 */
    private java.math.BigDecimal kadonitusu;

    /**
     * @return 稼働日数
     */
    public java.math.BigDecimal getKadonitusu() {
        return this.kadonitusu;
    }

    /**
     * @param o 稼働日数
     */
    public void setKadonitusu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kadonitusu = new java.math.BigDecimal(o.toString());
        } else {
            this.kadonitusu = null;
        }
    }

    /** 日 */
    private java.math.BigDecimal dd;

    /**
     * @return 日
     */
    public java.math.BigDecimal getDd() {
        return this.dd;
    }

    /**
     * @param o 日
     */
    public void setDd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dd = new java.math.BigDecimal(o.toString());
        } else {
            this.dd = null;
        }
    }

    /** 曜日 */
    private String youbi;

    /**
     * @return 曜日
     */
    public String getYoubi() {
        return this.youbi;
    }

    /**
     * @param o 曜日
     */
    public void setYoubi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.youbi = String.valueOf(o.toString());
        } else {
            this.youbi = null;
        }
    }

    /** 稼働区分 */
    private String kadoukbn;

    /**
     * @return 稼働区分
     */
    public String getKadoukbn() {
        return this.kadoukbn;
    }

    /**
     * @param o 稼働区分
     */
    public void setKadoukbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kadoukbn = String.valueOf(o.toString());
        } else {
            this.kadoukbn = null;
        }
    }

    /** 稼働日累計 */
    private java.math.BigDecimal kadourui;

    /**
     * @return 稼働日累計
     */
    public java.math.BigDecimal getKadourui() {
        return this.kadourui;
    }

    /**
     * @param o 稼働日累計
     */
    public void setKadourui(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kadourui = new java.math.BigDecimal(o.toString());
        } else {
            this.kadourui = null;
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
     * 販売カレンダー照会
     *
     * @param param1 年月
     * @param param2 カレンダ区分
     * @return 販売カレンダー
     */
    public static MHcalend get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"YYMM\" = :yymm");
        whereList.add("TRIM (\"CALENDKBN\") = TRIM (:calendkbn)");

        String sql = "SELECT * FROM M_HCALEND WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yymm", param1);
        params.put("calendkbn", param2);

        return Queries.get(sql, params, MHcalend.class);
    }

    /**
     * 販売カレンダー追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // カレンダ区分の採番処理
        numbering();

        // 販売カレンダーの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("yymm -- :yymm");
        nameList.add("calendkbn -- :calendkbn");
        nameList.add("kadonitusu -- :kadonitusu");
        nameList.add("dd -- :dd");
        nameList.add("youbi -- :youbi");
        nameList.add("kadoukbn -- :kadoukbn");
        nameList.add("kadourui -- :kadourui");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_HCALEND(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yymm");
        valueList.add(":calendkbn");
        valueList.add(":kadonitusu");
        valueList.add(":dd");
        valueList.add(":youbi");
        valueList.add(":kadoukbn");
        valueList.add(":kadourui");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** カレンダ区分の採番処理 */
    private void numbering() {

        if (this.calendkbn != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.CALENDKBN) IS NULL THEN 0 ELSE MAX(e.CALENDKBN) * 1 END + 1, 1, '0') AS CALENDKBN FROM M_HCALEND e WHERE e.CALENDKBN < '9'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.YYMM = :yymm");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("yymm", this.yymm);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("CALENDKBN");

        this.setCalendkbn(o);
    }

    /**
     * 販売カレンダー更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 販売カレンダーの登録
        String sql = "UPDATE M_HCALEND\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("yymm = :yymm");
        setList.add("calendkbn = :calendkbn");
        setList.add("kadonitusu = :kadonitusu");
        setList.add("dd = :dd");
        setList.add("youbi = :youbi");
        setList.add("kadoukbn = :kadoukbn");
        setList.add("kadourui = :kadourui");
        setList.add("filler = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 販売カレンダー削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 販売カレンダーの削除
        String sql = "DELETE FROM M_HCALEND WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("yymm = :yymm");
        whereList.add("TRIM (calendkbn) = TRIM (:calendkbn)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YYMM", this.yymm);
        params.put("CALENDKBN", this.calendkbn);
        params.put("KADONITUSU", this.kadonitusu);
        params.put("DD", this.dd);
        params.put("YOUBI", this.youbi);
        params.put("KADOUKBN", this.kadoukbn);
        params.put("KADOURUI", this.kadourui);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
