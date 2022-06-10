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
    @com.fasterxml.jackson.annotation.JsonProperty("HHINBAN")
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
    @com.fasterxml.jackson.annotation.JsonProperty("HINMEI")
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
    @com.fasterxml.jackson.annotation.JsonProperty("BARCODE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("FREE1")
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
    @com.fasterxml.jackson.annotation.JsonProperty("FREE2")
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
    @com.fasterxml.jackson.annotation.JsonProperty("FREE3")
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

    /**
     * バーコードマスタ照会
     *
     * @param param1 販売品番
     * @return バーコードマスタ
     */
    public static MBarcd get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HHINBAN\" = :hhinban");

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

        // バーコードマスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HHINBAN\" -- :hhinban");
        nameList.add("\"HINMEI\" -- :hinmei");
        nameList.add("\"BARCODE\" -- :barcode");
        nameList.add("\"FREE1\" -- :free1");
        nameList.add("\"FREE2\" -- :free2");
        nameList.add("\"FREE3\" -- :free3");
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
        return String.join("\r\n    , ", valueList);
    }

    /**
     * バーコードマスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // バーコードマスタの登録
        String sql = "UPDATE M_BARCD\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HHINBAN\" = :hhinban");
        setList.add("\"HINMEI\" = :hinmei");
        setList.add("\"BARCODE\" = :barcode");
        setList.add("\"FREE1\" = :free1");
        setList.add("\"FREE2\" = :free2");
        setList.add("\"FREE3\" = :free3");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * バーコードマスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // バーコードマスタの削除
        String sql = "DELETE FROM M_BARCD WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HHINBAN\" = :hhinban");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", this.hhinban);
        params.put("hinmei", this.hinmei);
        params.put("barcode", this.barcode);
        params.put("free1", this.free1);
        params.put("free2", this.free2);
        params.put("free3", this.free3);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
