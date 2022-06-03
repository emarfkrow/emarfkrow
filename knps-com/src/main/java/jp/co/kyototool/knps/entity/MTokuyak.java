package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * ネプロス特約店マスタ
 *
 * @author emarfkrow
 */
public class MTokuyak implements IEntity {

    /** 特約店コード */
    private java.math.BigDecimal tokuyakucd;

    /**
     * @return 特約店コード
     */
    public java.math.BigDecimal getTokuyakucd() {
        return this.tokuyakucd;
    }

    /**
     * @param o 特約店コード
     */
    public void setTokuyakucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokuyakucd = new java.math.BigDecimal(o.toString());
        } else {
            this.tokuyakucd = null;
        }
    }

    /** 得意先コード */
    private java.math.BigDecimal tokucd;

    /**
     * @return 得意先コード
     */
    public java.math.BigDecimal getTokucd() {
        return this.tokucd;
    }

    /**
     * @param o 得意先コード
     */
    public void setTokucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokucd = new java.math.BigDecimal(o.toString());
        } else {
            this.tokucd = null;
        }
    }

    /** 本社特約店コード */
    private String htokuyakucd;

    /**
     * @return 本社特約店コード
     */
    public String getHtokuyakucd() {
        return this.htokuyakucd;
    }

    /**
     * @param o 本社特約店コード
     */
    public void setHtokuyakucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.htokuyakucd = String.valueOf(o.toString());
        } else {
            this.htokuyakucd = null;
        }
    }

    /** 営業区分 */
    private String eigyokbn;

    /**
     * @return 営業区分
     */
    public String getEigyokbn() {
        return this.eigyokbn;
    }

    /**
     * @param o 営業区分
     */
    public void setEigyokbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.eigyokbn = String.valueOf(o.toString());
        } else {
            this.eigyokbn = null;
        }
    }

    /** 有力店資格区分 */
    private String yuryokukbn;

    /**
     * @return 有力店資格区分
     */
    public String getYuryokukbn() {
        return this.yuryokukbn;
    }

    /**
     * @param o 有力店資格区分
     */
    public void setYuryokukbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yuryokukbn = String.valueOf(o.toString());
        } else {
            this.yuryokukbn = null;
        }
    }

    /** 業種区分 */
    private String gyoshuKbn;

    /**
     * @return 業種区分
     */
    public String getGyoshuKbn() {
        return this.gyoshuKbn;
    }

    /**
     * @param o 業種区分
     */
    public void setGyoshuKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gyoshuKbn = String.valueOf(o.toString());
        } else {
            this.gyoshuKbn = null;
        }
    }

    /** 略特約店名 */
    private String rtokuyakumei;

    /**
     * @return 略特約店名
     */
    public String getRtokuyakumei() {
        return this.rtokuyakumei;
    }

    /**
     * @param o 略特約店名
     */
    public void setRtokuyakumei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rtokuyakumei = String.valueOf(o.toString());
        } else {
            this.rtokuyakumei = null;
        }
    }

    /** 特約店名１ */
    private String tokuyakumei1;

    /**
     * @return 特約店名１
     */
    public String getTokuyakumei1() {
        return this.tokuyakumei1;
    }

    /**
     * @param o 特約店名１
     */
    public void setTokuyakumei1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokuyakumei1 = String.valueOf(o.toString());
        } else {
            this.tokuyakumei1 = null;
        }
    }

    /** 特約店名２ */
    private String tokuyakumei2;

    /**
     * @return 特約店名２
     */
    public String getTokuyakumei2() {
        return this.tokuyakumei2;
    }

    /**
     * @param o 特約店名２
     */
    public void setTokuyakumei2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokuyakumei2 = String.valueOf(o.toString());
        } else {
            this.tokuyakumei2 = null;
        }
    }

    /** 特約店住所１ */
    private String tokuyakuJusho1;

    /**
     * @return 特約店住所１
     */
    public String getTokuyakuJusho1() {
        return this.tokuyakuJusho1;
    }

    /**
     * @param o 特約店住所１
     */
    public void setTokuyakuJusho1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokuyakuJusho1 = String.valueOf(o.toString());
        } else {
            this.tokuyakuJusho1 = null;
        }
    }

    /** 特約店住所２ */
    private String tokuyakuJusho2;

    /**
     * @return 特約店住所２
     */
    public String getTokuyakuJusho2() {
        return this.tokuyakuJusho2;
    }

    /**
     * @param o 特約店住所２
     */
    public void setTokuyakuJusho2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tokuyakuJusho2 = String.valueOf(o.toString());
        } else {
            this.tokuyakuJusho2 = null;
        }
    }

    /** カナ特約店名 */
    private String ktokuyakumei;

    /**
     * @return カナ特約店名
     */
    public String getKtokuyakumei() {
        return this.ktokuyakumei;
    }

    /**
     * @param o カナ特約店名
     */
    public void setKtokuyakumei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ktokuyakumei = String.valueOf(o.toString());
        } else {
            this.ktokuyakumei = null;
        }
    }

    /** 郵便番号 */
    private String ubinno;

    /**
     * @return 郵便番号
     */
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

    /** ＦＡＸ番号 */
    private String faxno;

    /**
     * @return ＦＡＸ番号
     */
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

    /** マスター登録日 */
    private java.math.BigDecimal tourokubi;

    /**
     * @return マスター登録日
     */
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

    /** 取引停止区分 */
    private String torihikiKbn;

    /**
     * @return 取引停止区分
     */
    public String getTorihikiKbn() {
        return this.torihikiKbn;
    }

    /**
     * @param o 取引停止区分
     */
    public void setTorihikiKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.torihikiKbn = String.valueOf(o.toString());
        } else {
            this.torihikiKbn = null;
        }
    }

    /** ネプロス今期受注金額 */
    private java.math.BigDecimal konNpjuchukin;

    /**
     * @return ネプロス今期受注金額
     */
    public java.math.BigDecimal getKonNpjuchukin() {
        return this.konNpjuchukin;
    }

    /**
     * @param o ネプロス今期受注金額
     */
    public void setKonNpjuchukin(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.konNpjuchukin = new java.math.BigDecimal(o.toString());
        } else {
            this.konNpjuchukin = null;
        }
    }

    /** ネプロス今期出荷金額 */
    private java.math.BigDecimal konNpshukka;

    /**
     * @return ネプロス今期出荷金額
     */
    public java.math.BigDecimal getKonNpshukka() {
        return this.konNpshukka;
    }

    /**
     * @param o ネプロス今期出荷金額
     */
    public void setKonNpshukka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.konNpshukka = new java.math.BigDecimal(o.toString());
        } else {
            this.konNpshukka = null;
        }
    }

    /** ネプロス前期受注金額 */
    private java.math.BigDecimal zenNpjuchukin;

    /**
     * @return ネプロス前期受注金額
     */
    public java.math.BigDecimal getZenNpjuchukin() {
        return this.zenNpjuchukin;
    }

    /**
     * @param o ネプロス前期受注金額
     */
    public void setZenNpjuchukin(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zenNpjuchukin = new java.math.BigDecimal(o.toString());
        } else {
            this.zenNpjuchukin = null;
        }
    }

    /** ネプロス前期出荷金額 */
    private java.math.BigDecimal zenNpshukka;

    /**
     * @return ネプロス前期出荷金額
     */
    public java.math.BigDecimal getZenNpshukka() {
        return this.zenNpshukka;
    }

    /**
     * @param o ネプロス前期出荷金額
     */
    public void setZenNpshukka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.zenNpshukka = new java.math.BigDecimal(o.toString());
        } else {
            this.zenNpshukka = null;
        }
    }

    /** 市町村コード */
    private String sichocd;

    /**
     * @return 市町村コード
     */
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

    /** ＦＡＸ区分 */
    private String faxkbn;

    /**
     * @return ＦＡＸ区分
     */
    public String getFaxkbn() {
        return this.faxkbn;
    }

    /**
     * @param o ＦＡＸ区分
     */
    public void setFaxkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.faxkbn = String.valueOf(o.toString());
        } else {
            this.faxkbn = null;
        }
    }

    /** 運送会社コード */
    private String unsocd;

    /**
     * @return 運送会社コード
     */
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
     * ネプロス特約店マスタ照会
     *
     * @param param1 特約店コード
     * @return ネプロス特約店マスタ
     */
    public static MTokuyak get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("tokuyakucd = :tokuyakucd");

        String sql = "SELECT * FROM M_TOKUYAK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("tokuyakucd", param1);

        return Queries.get(sql, params, MTokuyak.class);
    }

    /**
     * ネプロス特約店マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // ネプロス特約店マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("tokuyakucd -- :tokuyakucd");
        nameList.add("tokucd -- :tokucd");
        nameList.add("htokuyakucd -- :htokuyakucd");
        nameList.add("eigyokbn -- :eigyokbn");
        nameList.add("yuryokukbn -- :yuryokukbn");
        nameList.add("gyoshu-kbn -- :gyoshu-kbn");
        nameList.add("rtokuyakumei -- :rtokuyakumei");
        nameList.add("tokuyakumei1 -- :tokuyakumei1");
        nameList.add("tokuyakumei2 -- :tokuyakumei2");
        nameList.add("tokuyaku_jusho1 -- :tokuyaku_jusho1");
        nameList.add("tokuyaku_jusho2 -- :tokuyaku_jusho2");
        nameList.add("ktokuyakumei -- :ktokuyakumei");
        nameList.add("ubinno -- :ubinno");
        nameList.add("telno -- :telno");
        nameList.add("faxno -- :faxno");
        nameList.add("tourokubi -- :tourokubi");
        nameList.add("torihiki-kbn -- :torihiki-kbn");
        nameList.add("kon_npjuchukin -- :kon_npjuchukin");
        nameList.add("kon_npshukka -- :kon_npshukka");
        nameList.add("zen_npjuchukin -- :zen_npjuchukin");
        nameList.add("zen_npshukka -- :zen_npshukka");
        nameList.add("sichocd -- :sichocd");
        nameList.add("faxkbn -- :faxkbn");
        nameList.add("unsocd -- :unsocd");
        nameList.add("tikucd -- :tikucd");
        nameList.add("todofukencd -- :todofukencd");
        nameList.add("filler -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_TOKUYAK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":tokuyakucd");
        valueList.add(":tokucd");
        valueList.add(":htokuyakucd");
        valueList.add(":eigyokbn");
        valueList.add(":yuryokukbn");
        valueList.add(":gyoshu-kbn");
        valueList.add(":rtokuyakumei");
        valueList.add(":tokuyakumei1");
        valueList.add(":tokuyakumei2");
        valueList.add(":tokuyaku_jusho1");
        valueList.add(":tokuyaku_jusho2");
        valueList.add(":ktokuyakumei");
        valueList.add(":ubinno");
        valueList.add(":telno");
        valueList.add(":faxno");
        valueList.add(":tourokubi");
        valueList.add(":torihiki-kbn");
        valueList.add(":kon_npjuchukin");
        valueList.add(":kon_npshukka");
        valueList.add(":zen_npjuchukin");
        valueList.add(":zen_npshukka");
        valueList.add(":sichocd");
        valueList.add(":faxkbn");
        valueList.add(":unsocd");
        valueList.add(":tikucd");
        valueList.add(":todofukencd");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * ネプロス特約店マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // ネプロス特約店マスタの登録
        String sql = "UPDATE M_TOKUYAK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("tokuyakucd = :tokuyakucd");
        setList.add("tokucd = :tokucd");
        setList.add("htokuyakucd = :htokuyakucd");
        setList.add("eigyokbn = :eigyokbn");
        setList.add("yuryokukbn = :yuryokukbn");
        setList.add("gyoshu-kbn = :gyoshu-kbn");
        setList.add("rtokuyakumei = :rtokuyakumei");
        setList.add("tokuyakumei1 = :tokuyakumei1");
        setList.add("tokuyakumei2 = :tokuyakumei2");
        setList.add("tokuyaku_jusho1 = :tokuyaku_jusho1");
        setList.add("tokuyaku_jusho2 = :tokuyaku_jusho2");
        setList.add("ktokuyakumei = :ktokuyakumei");
        setList.add("ubinno = :ubinno");
        setList.add("telno = :telno");
        setList.add("faxno = :faxno");
        setList.add("tourokubi = :tourokubi");
        setList.add("torihiki-kbn = :torihiki-kbn");
        setList.add("kon_npjuchukin = :kon_npjuchukin");
        setList.add("kon_npshukka = :kon_npshukka");
        setList.add("zen_npjuchukin = :zen_npjuchukin");
        setList.add("zen_npshukka = :zen_npshukka");
        setList.add("sichocd = :sichocd");
        setList.add("faxkbn = :faxkbn");
        setList.add("unsocd = :unsocd");
        setList.add("tikucd = :tikucd");
        setList.add("todofukencd = :todofukencd");
        setList.add("filler = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * ネプロス特約店マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // ネプロス特約店マスタの削除
        String sql = "DELETE FROM M_TOKUYAK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("tokuyakucd = :tokuyakucd");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("TOKUYAKUCD", this.tokuyakucd);
        params.put("TOKUCD", this.tokucd);
        params.put("HTOKUYAKUCD", this.htokuyakucd);
        params.put("EIGYOKBN", this.eigyokbn);
        params.put("YURYOKUKBN", this.yuryokukbn);
        params.put("GYOSHU-KBN", this.gyoshuKbn);
        params.put("RTOKUYAKUMEI", this.rtokuyakumei);
        params.put("TOKUYAKUMEI1", this.tokuyakumei1);
        params.put("TOKUYAKUMEI2", this.tokuyakumei2);
        params.put("TOKUYAKU_JUSHO1", this.tokuyakuJusho1);
        params.put("TOKUYAKU_JUSHO2", this.tokuyakuJusho2);
        params.put("KTOKUYAKUMEI", this.ktokuyakumei);
        params.put("UBINNO", this.ubinno);
        params.put("TELNO", this.telno);
        params.put("FAXNO", this.faxno);
        params.put("TOUROKUBI", this.tourokubi);
        params.put("TORIHIKI-KBN", this.torihikiKbn);
        params.put("KON_NPJUCHUKIN", this.konNpjuchukin);
        params.put("KON_NPSHUKKA", this.konNpshukka);
        params.put("ZEN_NPJUCHUKIN", this.zenNpjuchukin);
        params.put("ZEN_NPSHUKKA", this.zenNpshukka);
        params.put("SICHOCD", this.sichocd);
        params.put("FAXKBN", this.faxkbn);
        params.put("UNSOCD", this.unsocd);
        params.put("TIKUCD", this.tikucd);
        params.put("TODOFUKENCD", this.todofukencd);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
