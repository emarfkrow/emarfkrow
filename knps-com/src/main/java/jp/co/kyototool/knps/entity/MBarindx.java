package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * バーコード管理マスタ
 *
 * @author emarfkrow
 */
public class MBarindx implements IEntity {

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

    /** バー分類追番１ */
    private java.math.BigDecimal barOiban1;

    /**
     * @return バー分類追番１
     */
    public java.math.BigDecimal getBarOiban1() {
        return this.barOiban1;
    }

    /**
     * @param o バー分類追番１
     */
    public void setBarOiban1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barOiban1 = new java.math.BigDecimal(o.toString());
        } else {
            this.barOiban1 = null;
        }
    }

    /** バー分類追番２ */
    private java.math.BigDecimal barOiban2;

    /**
     * @return バー分類追番２
     */
    public java.math.BigDecimal getBarOiban2() {
        return this.barOiban2;
    }

    /**
     * @param o バー分類追番２
     */
    public void setBarOiban2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barOiban2 = new java.math.BigDecimal(o.toString());
        } else {
            this.barOiban2 = null;
        }
    }

    /** バー分類追番３ */
    private java.math.BigDecimal barOiban3;

    /**
     * @return バー分類追番３
     */
    public java.math.BigDecimal getBarOiban3() {
        return this.barOiban3;
    }

    /**
     * @param o バー分類追番３
     */
    public void setBarOiban3(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barOiban3 = new java.math.BigDecimal(o.toString());
        } else {
            this.barOiban3 = null;
        }
    }

    /** バー分類追番４ */
    private java.math.BigDecimal barOiban4;

    /**
     * @return バー分類追番４
     */
    public java.math.BigDecimal getBarOiban4() {
        return this.barOiban4;
    }

    /**
     * @param o バー分類追番４
     */
    public void setBarOiban4(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barOiban4 = new java.math.BigDecimal(o.toString());
        } else {
            this.barOiban4 = null;
        }
    }

    /** バー分類追番５ */
    private java.math.BigDecimal barOiban5;

    /**
     * @return バー分類追番５
     */
    public java.math.BigDecimal getBarOiban5() {
        return this.barOiban5;
    }

    /**
     * @param o バー分類追番５
     */
    public void setBarOiban5(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barOiban5 = new java.math.BigDecimal(o.toString());
        } else {
            this.barOiban5 = null;
        }
    }

    /** バー分類追番６ */
    private java.math.BigDecimal barOiban6;

    /**
     * @return バー分類追番６
     */
    public java.math.BigDecimal getBarOiban6() {
        return this.barOiban6;
    }

    /**
     * @param o バー分類追番６
     */
    public void setBarOiban6(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barOiban6 = new java.math.BigDecimal(o.toString());
        } else {
            this.barOiban6 = null;
        }
    }

    /** バー分類追番７ */
    private java.math.BigDecimal barOiban7;

    /**
     * @return バー分類追番７
     */
    public java.math.BigDecimal getBarOiban7() {
        return this.barOiban7;
    }

    /**
     * @param o バー分類追番７
     */
    public void setBarOiban7(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barOiban7 = new java.math.BigDecimal(o.toString());
        } else {
            this.barOiban7 = null;
        }
    }

    /** バー分類追番８ */
    private java.math.BigDecimal barOiban8;

    /**
     * @return バー分類追番８
     */
    public java.math.BigDecimal getBarOiban8() {
        return this.barOiban8;
    }

    /**
     * @param o バー分類追番８
     */
    public void setBarOiban8(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barOiban8 = new java.math.BigDecimal(o.toString());
        } else {
            this.barOiban8 = null;
        }
    }

    /** バー分類追番９ */
    private java.math.BigDecimal barOiban9;

    /**
     * @return バー分類追番９
     */
    public java.math.BigDecimal getBarOiban9() {
        return this.barOiban9;
    }

    /**
     * @param o バー分類追番９
     */
    public void setBarOiban9(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.barOiban9 = new java.math.BigDecimal(o.toString());
        } else {
            this.barOiban9 = null;
        }
    }

    /**
     * バーコード管理マスタ照会
     *
     * @param param1 キーコード
     * @return バーコード管理マスタ
     */
    public static MBarindx get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"KEYCD\" = :keycd");

        String sql = "SELECT * FROM M_BARINDX WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("keycd", param1);

        return Queries.get(sql, params, MBarindx.class);
    }

    /**
     * バーコード管理マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // バーコード管理マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("keycd -- :keycd");
        nameList.add("bar_oiban1 -- :bar_oiban1");
        nameList.add("bar_oiban2 -- :bar_oiban2");
        nameList.add("bar_oiban3 -- :bar_oiban3");
        nameList.add("bar_oiban4 -- :bar_oiban4");
        nameList.add("bar_oiban5 -- :bar_oiban5");
        nameList.add("bar_oiban6 -- :bar_oiban6");
        nameList.add("bar_oiban7 -- :bar_oiban7");
        nameList.add("bar_oiban8 -- :bar_oiban8");
        nameList.add("bar_oiban9 -- :bar_oiban9");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_BARINDX(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":keycd");
        valueList.add(":bar-oiban1");
        valueList.add(":bar-oiban2");
        valueList.add(":bar-oiban3");
        valueList.add(":bar-oiban4");
        valueList.add(":bar-oiban5");
        valueList.add(":bar-oiban6");
        valueList.add(":bar-oiban7");
        valueList.add(":bar-oiban8");
        valueList.add(":bar-oiban9");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * バーコード管理マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // バーコード管理マスタの登録
        String sql = "UPDATE M_BARINDX\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("keycd = :keycd");
        setList.add("bar-oiban1 = :bar-oiban1");
        setList.add("bar-oiban2 = :bar-oiban2");
        setList.add("bar-oiban3 = :bar-oiban3");
        setList.add("bar-oiban4 = :bar-oiban4");
        setList.add("bar-oiban5 = :bar-oiban5");
        setList.add("bar-oiban6 = :bar-oiban6");
        setList.add("bar-oiban7 = :bar-oiban7");
        setList.add("bar-oiban8 = :bar-oiban8");
        setList.add("bar-oiban9 = :bar-oiban9");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * バーコード管理マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // バーコード管理マスタの削除
        String sql = "DELETE FROM M_BARINDX WHERE " + getWhere();

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
        params.put("BAR-OIBAN1", this.barOiban1);
        params.put("BAR-OIBAN2", this.barOiban2);
        params.put("BAR-OIBAN3", this.barOiban3);
        params.put("BAR-OIBAN4", this.barOiban4);
        params.put("BAR-OIBAN5", this.barOiban5);
        params.put("BAR-OIBAN6", this.barOiban6);
        params.put("BAR-OIBAN7", this.barOiban7);
        params.put("BAR-OIBAN8", this.barOiban8);
        params.put("BAR-OIBAN9", this.barOiban9);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
