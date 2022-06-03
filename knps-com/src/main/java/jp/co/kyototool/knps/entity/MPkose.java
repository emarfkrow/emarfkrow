package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 部品構成マスタ
 *
 * @author emarfkrow
 */
public class MPkose implements IEntity {

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

    /** 販売品名 */
    private String hinmei;

    /**
     * @return 販売品名
     */
    public String getHinmei() {
        return this.hinmei;
    }

    /**
     * @param o 販売品名
     */
    public void setHinmei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinmei = String.valueOf(o.toString());
        } else {
            this.hinmei = null;
        }
    }

    /** 部品品番 */
    private String phinban;

    /**
     * @return 部品品番
     */
    public String getPhinban() {
        return this.phinban;
    }

    /**
     * @param o 部品品番
     */
    public void setPhinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.phinban = String.valueOf(o.toString());
        } else {
            this.phinban = null;
        }
    }

    /** 部品名 */
    private String phinmei;

    /**
     * @return 部品名
     */
    public String getPhinmei() {
        return this.phinmei;
    }

    /**
     * @param o 部品名
     */
    public void setPhinmei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.phinmei = String.valueOf(o.toString());
        } else {
            this.phinmei = null;
        }
    }

    /** 登録日 */
    private java.math.BigDecimal tourokubi;

    /**
     * @return 登録日
     */
    public java.math.BigDecimal getTourokubi() {
        return this.tourokubi;
    }

    /**
     * @param o 登録日
     */
    public void setTourokubi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tourokubi = new java.math.BigDecimal(o.toString());
        } else {
            this.tourokubi = null;
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
     * 部品構成マスタ照会
     *
     * @param param1 販売品番
     * @param param2 部品品番
     * @return 部品構成マスタ
     */
    public static MPkose get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hhinban) = TRIM (:hhinban)");
        whereList.add("TRIM (phinban) = TRIM (:phinban)");

        String sql = "SELECT * FROM M_PKOSE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hhinban", param1);
        params.put("phinban", param2);

        return Queries.get(sql, params, MPkose.class);
    }

    /**
     * 部品構成マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 部品品番の採番処理
        numbering();

        // 部品構成マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("hhinban -- :hhinban");
        nameList.add("hinmei -- :hinmei");
        nameList.add("phinban -- :phinban");
        nameList.add("phinmei -- :phinmei");
        nameList.add("tourokubi -- :tourokubi");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_PKOSE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hhinban");
        valueList.add(":hinmei");
        valueList.add(":phinban");
        valueList.add(":phinmei");
        valueList.add(":tourokubi");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 部品品番の採番処理 */
    private void numbering() {

        if (this.phinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.PHINBAN) IS NULL THEN 0 ELSE MAX(e.PHINBAN) * 1 END + 1, 20, '0') AS PHINBAN FROM M_PKOSE e WHERE e.PHINBAN < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.HHINBAN = :hhinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("hhinban", this.hhinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("PHINBAN");

        this.setPhinban(o);
    }

    /**
     * 部品構成マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 部品構成マスタの登録
        String sql = "UPDATE M_PKOSE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("hhinban = :hhinban");
        setList.add("hinmei = :hinmei");
        setList.add("phinban = :phinban");
        setList.add("phinmei = :phinmei");
        setList.add("tourokubi = :tourokubi");
        setList.add("filler = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 部品構成マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 部品構成マスタの削除
        String sql = "DELETE FROM M_PKOSE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (hhinban) = TRIM (:hhinban)");
        whereList.add("TRIM (phinban) = TRIM (:phinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("HHINBAN", this.hhinban);
        params.put("HINMEI", this.hinmei);
        params.put("PHINBAN", this.phinban);
        params.put("PHINMEI", this.phinmei);
        params.put("TOUROKUBI", this.tourokubi);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
