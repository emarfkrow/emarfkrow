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
        whereList.add("TRIM (\"HHINBAN\") = TRIM (:hhinban)");

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
}
