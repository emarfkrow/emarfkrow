package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 原価用品目マスタ
 *
 * @author emarfkrow
 */
public class MGhinmok implements IEntity {

    /** 品番 */
    private String hinban;

    /**
     * @return 品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINBAN")
    public String getHinban() {
        return this.hinban;
    }

    /**
     * @param o 品番
     */
    public void setHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinban = String.valueOf(o.toString());
        } else {
            this.hinban = null;
        }
    }

    /** 品目コード */
    private String hincd;

    /**
     * @return 品目コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINCD")
    public String getHincd() {
        return this.hincd;
    }

    /**
     * @param o 品目コード
     */
    public void setHincd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hincd = String.valueOf(o.toString());
        } else {
            this.hincd = null;
        }
    }

    /** 品目合計単価 */
    private java.math.BigDecimal hingenka;

    /**
     * @return 品目合計単価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINGENKA")
    public java.math.BigDecimal getHingenka() {
        return this.hingenka;
    }

    /**
     * @param o 品目合計単価
     */
    public void setHingenka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hingenka = new java.math.BigDecimal(o.toString());
        } else {
            this.hingenka = null;
        }
    }

    /** データ連携日 */
    private String renkeibi;

    /**
     * @return データ連携日
     */
    @com.fasterxml.jackson.annotation.JsonProperty("RENKEIBI")
    public String getRenkeibi() {
        return this.renkeibi;
    }

    /**
     * @param o データ連携日
     */
    public void setRenkeibi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.renkeibi = String.valueOf(o.toString());
        } else {
            this.renkeibi = null;
        }
    }

    /** 処理済フラグ */
    private String shoriflg = "0";

    /**
     * @return 処理済フラグ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHORIFLG")
    public String getShoriflg() {
        return this.shoriflg;
    }

    /**
     * @param o 処理済フラグ
     */
    public void setShoriflg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shoriflg = String.valueOf(o.toString());
        } else {
            this.shoriflg = null;
        }
    }

    /**
     * 原価用品目マスタ照会
     *
     * @param param1 品番
     * @return 原価用品目マスタ
     */
    public static MGhinmok get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HINBAN\" = :hinban");

        String sql = "SELECT * FROM M_GHINMOK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", param1);

        return Queries.get(sql, params, MGhinmok.class);
    }

    /**
     * 原価用品目マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // PRD_ORDERPOINT_STATUSの登録
        if (this.prdOrderpointStatus != null) {
            this.prdOrderpointStatus.setHinban(this.getHinban());
            this.prdOrderpointStatus.insert(now, id);
        }

        // PRD_ORDERPOINT_SUMMARYの登録
        if (this.prdOrderpointSummary != null) {
            this.prdOrderpointSummary.setHinban(this.getHinban());
            this.prdOrderpointSummary.insert(now, id);
        }

        // 原価用品目マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"HINCD\" -- :hincd");
        nameList.add("\"HINGENKA\" -- :hingenka");
        nameList.add("\"RENKEIBI\" -- :renkeibi");
        nameList.add("\"SHORIFLG\" -- :shoriflg");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_GHINMOK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hinban");
        valueList.add(":hincd");
        valueList.add(":hingenka");
        valueList.add(":renkeibi");
        valueList.add(":shoriflg");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 原価用品目マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_ORDERPOINT_STATUSの登録
        if (this.prdOrderpointStatus != null) {
            prdOrderpointStatus.setHinban(this.getHinban());
            try {
                prdOrderpointStatus.insert(now, id);
            } catch (Exception e) {
                prdOrderpointStatus.update(now, id);
            }
        }

        // PRD_ORDERPOINT_SUMMARYの登録
        if (this.prdOrderpointSummary != null) {
            prdOrderpointSummary.setHinban(this.getHinban());
            try {
                prdOrderpointSummary.insert(now, id);
            } catch (Exception e) {
                prdOrderpointSummary.update(now, id);
            }
        }

        // 原価用品目マスタの登録
        String sql = "UPDATE M_GHINMOK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"HINCD\" = :hincd");
        setList.add("\"HINGENKA\" = :hingenka");
        setList.add("\"RENKEIBI\" = :renkeibi");
        setList.add("\"SHORIFLG\" = :shoriflg");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 原価用品目マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_ORDERPOINT_STATUSの削除
        if (this.prdOrderpointStatus != null) {
            this.prdOrderpointStatus.delete();
        }

        // PRD_ORDERPOINT_SUMMARYの削除
        if (this.prdOrderpointSummary != null) {
            this.prdOrderpointSummary.delete();
        }

        // 原価用品目マスタの削除
        String sql = "DELETE FROM M_GHINMOK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HINBAN\" = :hinban");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("hinban", this.hinban);
        params.put("hincd", this.hincd);
        params.put("hingenka", this.hingenka);
        params.put("renkeibi", this.renkeibi);
        params.put("shoriflg", this.shoriflg);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_ORDERPOINT_STATUS
     */
    private PrdOrderpointStatus prdOrderpointStatus;

    /**
     * @return PRD_ORDERPOINT_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdOrderpointStatus")
    public PrdOrderpointStatus getPrdOrderpointStatus() {
        return this.prdOrderpointStatus;
    }

    /**
     * @param p PRD_ORDERPOINT_STATUS
     */
    public void setPrdOrderpointStatus(final PrdOrderpointStatus p) {
        this.prdOrderpointStatus = p;
    }

    /**
     * @return PRD_ORDERPOINT_STATUS
     */
    public PrdOrderpointStatus referPrdOrderpointStatus() {
        if (this.prdOrderpointStatus == null) {
            try {
                this.prdOrderpointStatus = PrdOrderpointStatus.get(this.hinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdOrderpointStatus;
    }

    /**
     * PRD_ORDERPOINT_SUMMARY
     */
    private PrdOrderpointSummary prdOrderpointSummary;

    /**
     * @return PRD_ORDERPOINT_SUMMARY
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdOrderpointSummary")
    public PrdOrderpointSummary getPrdOrderpointSummary() {
        return this.prdOrderpointSummary;
    }

    /**
     * @param p PRD_ORDERPOINT_SUMMARY
     */
    public void setPrdOrderpointSummary(final PrdOrderpointSummary p) {
        this.prdOrderpointSummary = p;
    }

    /**
     * @return PRD_ORDERPOINT_SUMMARY
     */
    public PrdOrderpointSummary referPrdOrderpointSummary() {
        if (this.prdOrderpointSummary == null) {
            try {
                this.prdOrderpointSummary = PrdOrderpointSummary.get(this.hinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdOrderpointSummary;
    }
}
