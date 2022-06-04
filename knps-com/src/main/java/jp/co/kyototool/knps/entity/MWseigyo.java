package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * WEB制御マスタ
 *
 * @author emarfkrow
 */
public class MWseigyo implements IEntity {

    /** ＷＥＢデータ区分 */
    private java.math.BigDecimal webDatakbn;

    /**
     * @return ＷＥＢデータ区分
     */
    public java.math.BigDecimal getWebDatakbn() {
        return this.webDatakbn;
    }

    /**
     * @param o ＷＥＢデータ区分
     */
    public void setWebDatakbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.webDatakbn = new java.math.BigDecimal(o.toString());
        } else {
            this.webDatakbn = null;
        }
    }

    /** ＷＥＢ受注番号１ */
    private java.math.BigDecimal webJuchuno1;

    /**
     * @return ＷＥＢ受注番号１
     */
    public java.math.BigDecimal getWebJuchuno1() {
        return this.webJuchuno1;
    }

    /**
     * @param o ＷＥＢ受注番号１
     */
    public void setWebJuchuno1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.webJuchuno1 = new java.math.BigDecimal(o.toString());
        } else {
            this.webJuchuno1 = null;
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
     * WEB制御マスタ照会
     *
     * @param param1 ＷＥＢデータ区分
     * @return WEB制御マスタ
     */
    public static MWseigyo get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"WEB-DATAKBN\" = :web_datakbn");

        String sql = "SELECT * FROM M_WSEIGYO WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("web_datakbn", param1);

        return Queries.get(sql, params, MWseigyo.class);
    }

    /**
     * WEB制御マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // WEB制御マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"WEB-DATAKBN\" -- :web_datakbn");
        nameList.add("\"WEB-JUCHUNO1\" -- :web_juchuno1");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_WSEIGYO(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":web-datakbn");
        valueList.add(":web-juchuno1");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * WEB制御マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // WEB制御マスタの登録
        String sql = "UPDATE M_WSEIGYO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"WEB-DATAKBN\" = :web_datakbn");
        setList.add("\"WEB-JUCHUNO1\" = :web_juchuno1");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * WEB制御マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // WEB制御マスタの削除
        String sql = "DELETE FROM M_WSEIGYO WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"WEB-DATAKBN\" = :web_datakbn");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("web_datakbn", this.webDatakbn);
        params.put("web_juchuno1", this.webJuchuno1);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
