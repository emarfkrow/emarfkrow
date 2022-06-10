package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 契約単価マスタ
 *
 * @author emarfkrow
 */
public class MKtanka implements IEntity {

    /** 本社コード */
    private java.math.BigDecimal honshacd;

    /**
     * @return 本社コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HONSHACD")
    public java.math.BigDecimal getHonshacd() {
        return this.honshacd;
    }

    /**
     * @param o 本社コード
     */
    public void setHonshacd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.honshacd = new java.math.BigDecimal(o.toString());
        } else {
            this.honshacd = null;
        }
    }

    /** 社外品番 */
    private String shagaiHinban;

    /**
     * @return 社外品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHAGAI-HINBAN")
    public String getShagaiHinban() {
        return this.shagaiHinban;
    }

    /**
     * @param o 社外品番
     */
    public void setShagaiHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shagaiHinban = String.valueOf(o.toString());
        } else {
            this.shagaiHinban = null;
        }
    }

    /** 契約単価開始日 */
    private java.math.BigDecimal kkaisibi;

    /**
     * @return 契約単価開始日
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KKAISIBI")
    public java.math.BigDecimal getKkaisibi() {
        return this.kkaisibi;
    }

    /**
     * @param o 契約単価開始日
     */
    public void setKkaisibi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kkaisibi = new java.math.BigDecimal(o.toString());
        } else {
            this.kkaisibi = null;
        }
    }

    /** 契約単価終了日 */
    private java.math.BigDecimal kshuryobi;

    /**
     * @return 契約単価終了日
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KSHURYOBI")
    public java.math.BigDecimal getKshuryobi() {
        return this.kshuryobi;
    }

    /**
     * @param o 契約単価終了日
     */
    public void setKshuryobi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kshuryobi = new java.math.BigDecimal(o.toString());
        } else {
            this.kshuryobi = null;
        }
    }

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

    /** 契約単価 */
    private java.math.BigDecimal keiyakuTanka;

    /**
     * @return 契約単価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KEIYAKU-TANKA")
    public java.math.BigDecimal getKeiyakuTanka() {
        return this.keiyakuTanka;
    }

    /**
     * @param o 契約単価
     */
    public void setKeiyakuTanka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.keiyakuTanka = new java.math.BigDecimal(o.toString());
        } else {
            this.keiyakuTanka = null;
        }
    }

    /** 商品区分 */
    private String shohinkbn;

    /**
     * @return 商品区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SHOHINKBN")
    public String getShohinkbn() {
        return this.shohinkbn;
    }

    /**
     * @param o 商品区分
     */
    public void setShohinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shohinkbn = String.valueOf(o.toString());
        } else {
            this.shohinkbn = null;
        }
    }

    /** 価格体系区分 */
    private String kakakukbn;

    /**
     * @return 価格体系区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAKAKUKBN")
    public String getKakakukbn() {
        return this.kakakukbn;
    }

    /**
     * @param o 価格体系区分
     */
    public void setKakakukbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kakakukbn = String.valueOf(o.toString());
        } else {
            this.kakakukbn = null;
        }
    }

    /**
     * 契約単価マスタ照会
     *
     * @param param1 本社コード
     * @param param2 社外品番
     * @return 契約単価マスタ
     */
    public static MKtanka get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HONSHACD\" = :honshacd");
        whereList.add("\"SHAGAI-HINBAN\" = :shagai_hinban");

        String sql = "SELECT * FROM M_KTANKA WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("honshacd", param1);
        params.put("shagai_hinban", param2);

        return Queries.get(sql, params, MKtanka.class);
    }

    /**
     * 契約単価マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 契約単価マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"HONSHACD\" -- :honshacd");
        nameList.add("\"SHAGAI-HINBAN\" -- :shagai_hinban");
        nameList.add("\"KKAISIBI\" -- :kkaisibi");
        nameList.add("\"KSHURYOBI\" -- :kshuryobi");
        nameList.add("\"HHINBAN\" -- :hhinban");
        nameList.add("\"KEIYAKU-TANKA\" -- :keiyaku_tanka");
        nameList.add("\"SHOHINKBN\" -- :shohinkbn");
        nameList.add("\"KAKAKUKBN\" -- :kakakukbn");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_KTANKA(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":honshacd");
        valueList.add(":shagai_hinban");
        valueList.add(":kkaisibi");
        valueList.add(":kshuryobi");
        valueList.add(":hhinban");
        valueList.add(":keiyaku_tanka");
        valueList.add(":shohinkbn");
        valueList.add(":kakakukbn");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 契約単価マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 契約単価マスタの登録
        String sql = "UPDATE M_KTANKA\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"HONSHACD\" = :honshacd");
        setList.add("\"SHAGAI-HINBAN\" = :shagai_hinban");
        setList.add("\"KKAISIBI\" = :kkaisibi");
        setList.add("\"KSHURYOBI\" = :kshuryobi");
        setList.add("\"HHINBAN\" = :hhinban");
        setList.add("\"KEIYAKU-TANKA\" = :keiyaku_tanka");
        setList.add("\"SHOHINKBN\" = :shohinkbn");
        setList.add("\"KAKAKUKBN\" = :kakakukbn");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 契約単価マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 契約単価マスタの削除
        String sql = "DELETE FROM M_KTANKA WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"HONSHACD\" = :honshacd");
        whereList.add("\"SHAGAI-HINBAN\" = :shagai_hinban");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("honshacd", this.honshacd);
        params.put("shagai_hinban", this.shagaiHinban);
        params.put("kkaisibi", this.kkaisibi);
        params.put("kshuryobi", this.kshuryobi);
        params.put("hhinban", this.hhinban);
        params.put("keiyaku_tanka", this.keiyakuTanka);
        params.put("shohinkbn", this.shohinkbn);
        params.put("kakakukbn", this.kakakukbn);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
