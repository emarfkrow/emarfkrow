package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 直送先マスタ
 *
 * @author emarfkrow
 */
public class MChoku implements IEntity {

    /** 直送先コード */
    private java.math.BigDecimal chokucd;

    /**
     * @return 直送先コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CHOKUCD")
    public java.math.BigDecimal getChokucd() {
        return this.chokucd;
    }

    /**
     * @param o 直送先コード
     */
    public void setChokucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chokucd = new java.math.BigDecimal(o.toString());
        } else {
            this.chokucd = null;
        }
    }

    /** 直送先名１ */
    private String chokumei1;

    /**
     * @return 直送先名１
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CHOKUMEI1")
    public String getChokumei1() {
        return this.chokumei1;
    }

    /**
     * @param o 直送先名１
     */
    public void setChokumei1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chokumei1 = String.valueOf(o.toString());
        } else {
            this.chokumei1 = null;
        }
    }

    /** 直送先名２ */
    private String chokumei2;

    /**
     * @return 直送先名２
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CHOKUMEI2")
    public String getChokumei2() {
        return this.chokumei2;
    }

    /**
     * @param o 直送先名２
     */
    public void setChokumei2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chokumei2 = String.valueOf(o.toString());
        } else {
            this.chokumei2 = null;
        }
    }

    /** 略直送先名 */
    private String rchokumei;

    /**
     * @return 略直送先名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("RCHOKUMEI")
    public String getRchokumei() {
        return this.rchokumei;
    }

    /**
     * @param o 略直送先名
     */
    public void setRchokumei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rchokumei = String.valueOf(o.toString());
        } else {
            this.rchokumei = null;
        }
    }

    /** 直送先住所１ */
    private String chokuJusho1;

    /**
     * @return 直送先住所１
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CHOKU-JUSHO1")
    public String getChokuJusho1() {
        return this.chokuJusho1;
    }

    /**
     * @param o 直送先住所１
     */
    public void setChokuJusho1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chokuJusho1 = String.valueOf(o.toString());
        } else {
            this.chokuJusho1 = null;
        }
    }

    /** 直送先住所２ */
    private String chokuJusho2;

    /**
     * @return 直送先住所２
     */
    @com.fasterxml.jackson.annotation.JsonProperty("CHOKU-JUSHO2")
    public String getChokuJusho2() {
        return this.chokuJusho2;
    }

    /**
     * @param o 直送先住所２
     */
    public void setChokuJusho2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.chokuJusho2 = String.valueOf(o.toString());
        } else {
            this.chokuJusho2 = null;
        }
    }

    /** 郵便番号 */
    private String ubinno;

    /**
     * @return 郵便番号
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UBINNO")
    public String getUbinno() {
        return this.ubinno;
    }

    /**
     * @param o 郵便番号
     */
    public void setUbinno(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ubinno = String.valueOf(o.toString());
        } else {
            this.ubinno = null;
        }
    }

    /** 電話番号 */
    private String telno;

    /**
     * @return 電話番号
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TELNO")
    public String getTelno() {
        return this.telno;
    }

    /**
     * @param o 電話番号
     */
    public void setTelno(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.telno = String.valueOf(o.toString());
        } else {
            this.telno = null;
        }
    }

    /** マスター登録日 */
    private java.math.BigDecimal tourokubi;

    /**
     * @return マスター登録日
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOUROKUBI")
    public java.math.BigDecimal getTourokubi() {
        return this.tourokubi;
    }

    /**
     * @param o マスター登録日
     */
    public void setTourokubi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tourokubi = new java.math.BigDecimal(o.toString());
        } else {
            this.tourokubi = null;
        }
    }

    /** カナ直送先名 */
    private String kchokumei;

    /**
     * @return カナ直送先名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KCHOKUMEI")
    public String getKchokumei() {
        return this.kchokumei;
    }

    /**
     * @param o カナ直送先名
     */
    public void setKchokumei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kchokumei = String.valueOf(o.toString());
        } else {
            this.kchokumei = null;
        }
    }

    /** 市町村コード */
    private String sichocd;

    /**
     * @return 市町村コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SICHOCD")
    public String getSichocd() {
        return this.sichocd;
    }

    /**
     * @param o 市町村コード
     */
    public void setSichocd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sichocd = String.valueOf(o.toString());
        } else {
            this.sichocd = null;
        }
    }

    /** ＦＡＸ番号 */
    private String faxno;

    /**
     * @return ＦＡＸ番号
     */
    @com.fasterxml.jackson.annotation.JsonProperty("FAXNO")
    public String getFaxno() {
        return this.faxno;
    }

    /**
     * @param o ＦＡＸ番号
     */
    public void setFaxno(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.faxno = String.valueOf(o.toString());
        } else {
            this.faxno = null;
        }
    }

    /** 注文自動取消区分 */
    private String torikesiKbn;

    /**
     * @return 注文自動取消区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TORIKESI-KBN")
    public String getTorikesiKbn() {
        return this.torikesiKbn;
    }

    /**
     * @param o 注文自動取消区分
     */
    public void setTorikesiKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.torikesiKbn = String.valueOf(o.toString());
        } else {
            this.torikesiKbn = null;
        }
    }

    /** 運送会社コード */
    private String unsocd;

    /**
     * @return 運送会社コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UNSOCD")
    public String getUnsocd() {
        return this.unsocd;
    }

    /**
     * @param o 運送会社コード
     */
    public void setUnsocd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.unsocd = String.valueOf(o.toString());
        } else {
            this.unsocd = null;
        }
    }

    /** 地区コード */
    private String tikucd;

    /**
     * @return 地区コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TIKUCD")
    public String getTikucd() {
        return this.tikucd;
    }

    /**
     * @param o 地区コード
     */
    public void setTikucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tikucd = String.valueOf(o.toString());
        } else {
            this.tikucd = null;
        }
    }

    /** 都道府県コード */
    private String todofukencd;

    /**
     * @return 都道府県コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TODOFUKENCD")
    public String getTodofukencd() {
        return this.todofukencd;
    }

    /**
     * @param o 都道府県コード
     */
    public void setTodofukencd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.todofukencd = String.valueOf(o.toString());
        } else {
            this.todofukencd = null;
        }
    }

    /** 更新禁止区分 */
    private String updnkinkbn;

    /**
     * @return 更新禁止区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDNKINKBN")
    public String getUpdnkinkbn() {
        return this.updnkinkbn;
    }

    /**
     * @param o 更新禁止区分
     */
    public void setUpdnkinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updnkinkbn = String.valueOf(o.toString());
        } else {
            this.updnkinkbn = null;
        }
    }

    /**
     * 直送先マスタ照会
     *
     * @param param1 直送先コード
     * @return 直送先マスタ
     */
    public static MChoku get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"CHOKUCD\" = :chokucd");

        String sql = "SELECT * FROM M_CHOKU WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("chokucd", param1);

        return Queries.get(sql, params, MChoku.class);
    }

    /**
     * 直送先マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 直送先マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"CHOKUCD\" -- :chokucd");
        nameList.add("\"CHOKUMEI1\" -- :chokumei1");
        nameList.add("\"CHOKUMEI2\" -- :chokumei2");
        nameList.add("\"RCHOKUMEI\" -- :rchokumei");
        nameList.add("\"CHOKU-JUSHO1\" -- :choku_jusho1");
        nameList.add("\"CHOKU-JUSHO2\" -- :choku_jusho2");
        nameList.add("\"UBINNO\" -- :ubinno");
        nameList.add("\"TELNO\" -- :telno");
        nameList.add("\"TOUROKUBI\" -- :tourokubi");
        nameList.add("\"KCHOKUMEI\" -- :kchokumei");
        nameList.add("\"SICHOCD\" -- :sichocd");
        nameList.add("\"FAXNO\" -- :faxno");
        nameList.add("\"TORIKESI-KBN\" -- :torikesi_kbn");
        nameList.add("\"UNSOCD\" -- :unsocd");
        nameList.add("\"TIKUCD\" -- :tikucd");
        nameList.add("\"TODOFUKENCD\" -- :todofukencd");
        nameList.add("\"UPDNKINKBN\" -- :updnkinkbn");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_CHOKU(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":chokucd");
        valueList.add(":chokumei1");
        valueList.add(":chokumei2");
        valueList.add(":rchokumei");
        valueList.add(":choku_jusho1");
        valueList.add(":choku_jusho2");
        valueList.add(":ubinno");
        valueList.add(":telno");
        valueList.add(":tourokubi");
        valueList.add(":kchokumei");
        valueList.add(":sichocd");
        valueList.add(":faxno");
        valueList.add(":torikesi_kbn");
        valueList.add(":unsocd");
        valueList.add(":tikucd");
        valueList.add(":todofukencd");
        valueList.add(":updnkinkbn");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 直送先マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 直送先マスタの登録
        String sql = "UPDATE M_CHOKU\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"CHOKUCD\" = :chokucd");
        setList.add("\"CHOKUMEI1\" = :chokumei1");
        setList.add("\"CHOKUMEI2\" = :chokumei2");
        setList.add("\"RCHOKUMEI\" = :rchokumei");
        setList.add("\"CHOKU-JUSHO1\" = :choku_jusho1");
        setList.add("\"CHOKU-JUSHO2\" = :choku_jusho2");
        setList.add("\"UBINNO\" = :ubinno");
        setList.add("\"TELNO\" = :telno");
        setList.add("\"TOUROKUBI\" = :tourokubi");
        setList.add("\"KCHOKUMEI\" = :kchokumei");
        setList.add("\"SICHOCD\" = :sichocd");
        setList.add("\"FAXNO\" = :faxno");
        setList.add("\"TORIKESI-KBN\" = :torikesi_kbn");
        setList.add("\"UNSOCD\" = :unsocd");
        setList.add("\"TIKUCD\" = :tikucd");
        setList.add("\"TODOFUKENCD\" = :todofukencd");
        setList.add("\"UPDNKINKBN\" = :updnkinkbn");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 直送先マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 直送先マスタの削除
        String sql = "DELETE FROM M_CHOKU WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"CHOKUCD\" = :chokucd");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("chokucd", this.chokucd);
        params.put("chokumei1", this.chokumei1);
        params.put("chokumei2", this.chokumei2);
        params.put("rchokumei", this.rchokumei);
        params.put("choku_jusho1", this.chokuJusho1);
        params.put("choku_jusho2", this.chokuJusho2);
        params.put("ubinno", this.ubinno);
        params.put("telno", this.telno);
        params.put("tourokubi", this.tourokubi);
        params.put("kchokumei", this.kchokumei);
        params.put("sichocd", this.sichocd);
        params.put("faxno", this.faxno);
        params.put("torikesi_kbn", this.torikesiKbn);
        params.put("unsocd", this.unsocd);
        params.put("tikucd", this.tikucd);
        params.put("todofukencd", this.todofukencd);
        params.put("updnkinkbn", this.updnkinkbn);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
