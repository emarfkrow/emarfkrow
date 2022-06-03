package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 国名マスタ
 *
 * @author emarfkrow
 */
public class MKunimei implements IEntity {

    /** 国際地域コード */
    private String kokusaicd;

    /**
     * @return 国際地域コード
     */
    public String getKokusaicd() {
        return this.kokusaicd;
    }

    /**
     * @param o 国際地域コード
     */
    public void setKokusaicd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kokusaicd = String.valueOf(o.toString());
        } else {
            this.kokusaicd = null;
        }
    }

    /** 国コード */
    private String kunicd;

    /**
     * @return 国コード
     */
    public String getKunicd() {
        return this.kunicd;
    }

    /**
     * @param o 国コード
     */
    public void setKunicd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kunicd = String.valueOf(o.toString());
        } else {
            this.kunicd = null;
        }
    }

    /** 原産国表示名 */
    private String gensankoku;

    /**
     * @return 原産国表示名
     */
    public String getGensankoku() {
        return this.gensankoku;
    }

    /**
     * @param o 原産国表示名
     */
    public void setGensankoku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gensankoku = String.valueOf(o.toString());
        } else {
            this.gensankoku = null;
        }
    }

    /** 国名 */
    private String kunimei;

    /**
     * @return 国名
     */
    public String getKunimei() {
        return this.kunimei;
    }

    /**
     * @param o 国名
     */
    public void setKunimei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kunimei = String.valueOf(o.toString());
        } else {
            this.kunimei = null;
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
     * 国名マスタ照会
     *
     * @param param1 国際地域コード
     * @param param2 国コード
     * @return 国名マスタ
     */
    public static MKunimei get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"KOKUSAICD\") = TRIM (:kokusaicd)");
        whereList.add("TRIM (\"KUNICD\") = TRIM (:kunicd)");

        String sql = "SELECT * FROM M_KUNIMEI WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("kokusaicd", param1);
        params.put("kunicd", param2);

        return Queries.get(sql, params, MKunimei.class);
    }

    /**
     * 国名マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 国コードの採番処理
        numbering();

        // 国名マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("kokusaicd -- :kokusaicd");
        nameList.add("kunicd -- :kunicd");
        nameList.add("gensankoku -- :gensankoku");
        nameList.add("kunimei -- :kunimei");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_KUNIMEI(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":kokusaicd");
        valueList.add(":kunicd");
        valueList.add(":gensankoku");
        valueList.add(":kunimei");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 国コードの採番処理 */
    private void numbering() {

        if (this.kunicd != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.KUNICD) IS NULL THEN 0 ELSE MAX(e.KUNICD) * 1 END + 1, 2, '0') AS KUNICD FROM M_KUNIMEI e WHERE e.KUNICD < '99'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.KOKUSAICD = :kokusaicd");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("kokusaicd", this.kokusaicd);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("KUNICD");

        this.setKunicd(o);
    }

    /**
     * 国名マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 国名マスタの登録
        String sql = "UPDATE M_KUNIMEI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("kokusaicd = :kokusaicd");
        setList.add("kunicd = :kunicd");
        setList.add("gensankoku = :gensankoku");
        setList.add("kunimei = :kunimei");
        setList.add("filler = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 国名マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 国名マスタの削除
        String sql = "DELETE FROM M_KUNIMEI WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (kokusaicd) = TRIM (:kokusaicd)");
        whereList.add("TRIM (kunicd) = TRIM (:kunicd)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("KOKUSAICD", this.kokusaicd);
        params.put("KUNICD", this.kunicd);
        params.put("GENSANKOKU", this.gensankoku);
        params.put("KUNIMEI", this.kunimei);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
