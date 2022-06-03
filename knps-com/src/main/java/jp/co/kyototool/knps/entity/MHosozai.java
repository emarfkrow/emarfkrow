package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 包装材マスタ
 *
 * @author emarfkrow
 */
public class MHosozai implements IEntity {

    /** 包装品番 */
    private String hosoHinban;

    /**
     * @return 包装品番
     */
    public String getHosoHinban() {
        return this.hosoHinban;
    }

    /**
     * @param o 包装品番
     */
    public void setHosoHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoHinban = String.valueOf(o.toString());
        } else {
            this.hosoHinban = null;
        }
    }

    /** 包装品名 */
    private String hosoHinmei;

    /**
     * @return 包装品名
     */
    public String getHosoHinmei() {
        return this.hosoHinmei;
    }

    /**
     * @param o 包装品名
     */
    public void setHosoHinmei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoHinmei = String.valueOf(o.toString());
        } else {
            this.hosoHinmei = null;
        }
    }

    /** 包装品名略称 */
    private String hosoHinmeiRyaku;

    /**
     * @return 包装品名略称
     */
    public String getHosoHinmeiRyaku() {
        return this.hosoHinmeiRyaku;
    }

    /**
     * @param o 包装品名略称
     */
    public void setHosoHinmeiRyaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoHinmeiRyaku = String.valueOf(o.toString());
        } else {
            this.hosoHinmeiRyaku = null;
        }
    }

    /** 包装サイズ */
    private String hosoSize;

    /**
     * @return 包装サイズ
     */
    public String getHosoSize() {
        return this.hosoSize;
    }

    /**
     * @param o 包装サイズ
     */
    public void setHosoSize(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoSize = String.valueOf(o.toString());
        } else {
            this.hosoSize = null;
        }
    }

    /** 包装単価 */
    private java.math.BigDecimal hosoTanka;

    /**
     * @return 包装単価
     */
    public java.math.BigDecimal getHosoTanka() {
        return this.hosoTanka;
    }

    /**
     * @param o 包装単価
     */
    public void setHosoTanka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoTanka = new java.math.BigDecimal(o.toString());
        } else {
            this.hosoTanka = null;
        }
    }

    /** 包装材質コード */
    private String hosoZaicode;

    /**
     * @return 包装材質コード
     */
    public String getHosoZaicode() {
        return this.hosoZaicode;
    }

    /**
     * @param o 包装材質コード
     */
    public void setHosoZaicode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoZaicode = String.valueOf(o.toString());
        } else {
            this.hosoZaicode = null;
        }
    }

    /** 包装重量 */
    private java.math.BigDecimal hosoWeight;

    /**
     * @return 包装重量
     */
    public java.math.BigDecimal getHosoWeight() {
        return this.hosoWeight;
    }

    /**
     * @param o 包装重量
     */
    public void setHosoWeight(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hosoWeight = new java.math.BigDecimal(o.toString());
        } else {
            this.hosoWeight = null;
        }
    }

    /** 作成日付 */
    private java.math.BigDecimal makedate;

    /**
     * @return 作成日付
     */
    public java.math.BigDecimal getMakedate() {
        return this.makedate;
    }

    /**
     * @param o 作成日付
     */
    public void setMakedate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.makedate = new java.math.BigDecimal(o.toString());
        } else {
            this.makedate = null;
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
     * 包装材マスタ照会
     *
     * @param param1 包装品番
     * @return 包装材マスタ
     */
    public static MHosozai get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"HOSO-HINBAN\") = TRIM (:hoso_hinban)");

        String sql = "SELECT * FROM M_HOSOZAI WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hoso_hinban", param1);

        return Queries.get(sql, params, MHosozai.class);
    }

    /**
     * 包装材マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 包装品番の採番処理
        numbering();

        // 包装材マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("hoso_hinban -- :hoso_hinban");
        nameList.add("hoso_hinmei -- :hoso_hinmei");
        nameList.add("hoso_hinmei_ryaku -- :hoso_hinmei_ryaku");
        nameList.add("hoso_size -- :hoso_size");
        nameList.add("hoso_tanka -- :hoso_tanka");
        nameList.add("hoso_zaicode -- :hoso_zaicode");
        nameList.add("hoso_weight -- :hoso_weight");
        nameList.add("makedate -- :makedate");
        nameList.add("upddate -- :upddate");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_HOSOZAI(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hoso-hinban");
        valueList.add(":hoso-hinmei");
        valueList.add(":hoso-hinmei-ryaku");
        valueList.add(":hoso-size");
        valueList.add(":hoso-tanka");
        valueList.add(":hoso-zaicode");
        valueList.add(":hoso-weight");
        valueList.add(":makedate");
        valueList.add(":upddate");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 包装品番の採番処理 */
    private void numbering() {

        if (this.hosoHinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.HOSO-HINBAN) IS NULL THEN 0 ELSE MAX(e.HOSO-HINBAN) * 1 END + 1, 25, '0') AS HOSO-HINBAN FROM M_HOSOZAI e WHERE e.HOSO-HINBAN < '9999999999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("HOSO-HINBAN");

        this.setHosoHinban(o);
    }

    /**
     * 包装材マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 包装材マスタの登録
        String sql = "UPDATE M_HOSOZAI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("hoso-hinban = :hoso-hinban");
        setList.add("hoso-hinmei = :hoso-hinmei");
        setList.add("hoso-hinmei-ryaku = :hoso-hinmei-ryaku");
        setList.add("hoso-size = :hoso-size");
        setList.add("hoso-tanka = :hoso-tanka");
        setList.add("hoso-zaicode = :hoso-zaicode");
        setList.add("hoso-weight = :hoso-weight");
        setList.add("makedate = :makedate");
        setList.add("upddate = :upddate");
        setList.add("filler = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 包装材マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 包装材マスタの削除
        String sql = "DELETE FROM M_HOSOZAI WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hoso-hinban) = TRIM (:hoso-hinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("HOSO-HINBAN", this.hosoHinban);
        params.put("HOSO-HINMEI", this.hosoHinmei);
        params.put("HOSO-HINMEI-RYAKU", this.hosoHinmeiRyaku);
        params.put("HOSO-SIZE", this.hosoSize);
        params.put("HOSO-TANKA", this.hosoTanka);
        params.put("HOSO-ZAICODE", this.hosoZaicode);
        params.put("HOSO-WEIGHT", this.hosoWeight);
        params.put("MAKEDATE", this.makedate);
        params.put("UPDDATE", this.upddate);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
