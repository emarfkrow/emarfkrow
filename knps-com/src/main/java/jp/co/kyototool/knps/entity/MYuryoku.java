package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 有力店マスタ
 *
 * @author emarfkrow
 */
public class MYuryoku implements IEntity {

    /** 有力店コード */
    private java.math.BigDecimal yuryocd;

    /**
     * @return 有力店コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YURYOCD")
    public java.math.BigDecimal getYuryocd() {
        return this.yuryocd;
    }

    /**
     * @param o 有力店コード
     */
    public void setYuryocd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yuryocd = new java.math.BigDecimal(o.toString());
        } else {
            this.yuryocd = null;
        }
    }

    /** 略有力店名 */
    private String ryuryokumei;

    /**
     * @return 略有力店名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("RYURYOKUMEI")
    public String getRyuryokumei() {
        return this.ryuryokumei;
    }

    /**
     * @param o 略有力店名
     */
    public void setRyuryokumei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ryuryokumei = String.valueOf(o.toString());
        } else {
            this.ryuryokumei = null;
        }
    }

    /** 有力店名１ */
    private String yuryomei1;

    /**
     * @return 有力店名１
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YURYOMEI1")
    public String getYuryomei1() {
        return this.yuryomei1;
    }

    /**
     * @param o 有力店名１
     */
    public void setYuryomei1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yuryomei1 = String.valueOf(o.toString());
        } else {
            this.yuryomei1 = null;
        }
    }

    /** 有力店名２ */
    private String yuryomei2;

    /**
     * @return 有力店名２
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YURYOMEI2")
    public String getYuryomei2() {
        return this.yuryomei2;
    }

    /**
     * @param o 有力店名２
     */
    public void setYuryomei2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yuryomei2 = String.valueOf(o.toString());
        } else {
            this.yuryomei2 = null;
        }
    }

    /** 有力店住所１ */
    private String yuryokuJusho1;

    /**
     * @return 有力店住所１
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YURYOKU-JUSHO1")
    public String getYuryokuJusho1() {
        return this.yuryokuJusho1;
    }

    /**
     * @param o 有力店住所１
     */
    public void setYuryokuJusho1(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yuryokuJusho1 = String.valueOf(o.toString());
        } else {
            this.yuryokuJusho1 = null;
        }
    }

    /** 有力店住所２ */
    private String yuryokuJusho2;

    /**
     * @return 有力店住所２
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YURYOKU-JUSHO2")
    public String getYuryokuJusho2() {
        return this.yuryokuJusho2;
    }

    /**
     * @param o 有力店住所２
     */
    public void setYuryokuJusho2(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yuryokuJusho2 = String.valueOf(o.toString());
        } else {
            this.yuryokuJusho2 = null;
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

    /** 有力店資格区分 */
    private String yuryokukbn;

    /**
     * @return 有力店資格区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YURYOKUKBN")
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

    /** カナ有力店名 */
    private String kyuryokumei;

    /**
     * @return カナ有力店名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KYURYOKUMEI")
    public String getKyuryokumei() {
        return this.kyuryokumei;
    }

    /**
     * @param o カナ有力店名
     */
    public void setKyuryokumei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kyuryokumei = String.valueOf(o.toString());
        } else {
            this.kyuryokumei = null;
        }
    }

    /** 期 */
    private java.math.BigDecimal ki;

    /**
     * @return 期
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KI")
    public java.math.BigDecimal getKi() {
        return this.ki;
    }

    /**
     * @param o 期
     */
    public void setKi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ki = new java.math.BigDecimal(o.toString());
        } else {
            this.ki = null;
        }
    }

    /** 上期購入額 */
    private java.math.BigDecimal kamiKonyu;

    /**
     * @return 上期購入額
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAMI-KONYU")
    public java.math.BigDecimal getKamiKonyu() {
        return this.kamiKonyu;
    }

    /**
     * @param o 上期購入額
     */
    public void setKamiKonyu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kamiKonyu = new java.math.BigDecimal(o.toString());
        } else {
            this.kamiKonyu = null;
        }
    }

    /** 上期支払対象額 */
    private java.math.BigDecimal kamiSiharai;

    /**
     * @return 上期支払対象額
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAMI-SIHARAI")
    public java.math.BigDecimal getKamiSiharai() {
        return this.kamiSiharai;
    }

    /**
     * @param o 上期支払対象額
     */
    public void setKamiSiharai(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kamiSiharai = new java.math.BigDecimal(o.toString());
        } else {
            this.kamiSiharai = null;
        }
    }

    /** 上期有ボ支払率 */
    private java.math.BigDecimal kamiYuboritu;

    /**
     * @return 上期有ボ支払率
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAMI-YUBORITU")
    public java.math.BigDecimal getKamiYuboritu() {
        return this.kamiYuboritu;
    }

    /**
     * @param o 上期有ボ支払率
     */
    public void setKamiYuboritu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kamiYuboritu = new java.math.BigDecimal(o.toString());
        } else {
            this.kamiYuboritu = null;
        }
    }

    /** 上期達成区分 */
    private String kamiTasseikbn;

    /**
     * @return 上期達成区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KAMI-TASSEIKBN")
    public String getKamiTasseikbn() {
        return this.kamiTasseikbn;
    }

    /**
     * @param o 上期達成区分
     */
    public void setKamiTasseikbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kamiTasseikbn = String.valueOf(o.toString());
        } else {
            this.kamiTasseikbn = null;
        }
    }

    /** 下期購入額 */
    private java.math.BigDecimal simoKonyu;

    /**
     * @return 下期購入額
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SIMO-KONYU")
    public java.math.BigDecimal getSimoKonyu() {
        return this.simoKonyu;
    }

    /**
     * @param o 下期購入額
     */
    public void setSimoKonyu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.simoKonyu = new java.math.BigDecimal(o.toString());
        } else {
            this.simoKonyu = null;
        }
    }

    /** 下期支払対象額 */
    private java.math.BigDecimal simoSiharai;

    /**
     * @return 下期支払対象額
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SIMO-SIHARAI")
    public java.math.BigDecimal getSimoSiharai() {
        return this.simoSiharai;
    }

    /**
     * @param o 下期支払対象額
     */
    public void setSimoSiharai(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.simoSiharai = new java.math.BigDecimal(o.toString());
        } else {
            this.simoSiharai = null;
        }
    }

    /** 下期有ボ支払率 */
    private java.math.BigDecimal simoYuboritu;

    /**
     * @return 下期有ボ支払率
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SIMO-YUBORITU")
    public java.math.BigDecimal getSimoYuboritu() {
        return this.simoYuboritu;
    }

    /**
     * @param o 下期有ボ支払率
     */
    public void setSimoYuboritu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.simoYuboritu = new java.math.BigDecimal(o.toString());
        } else {
            this.simoYuboritu = null;
        }
    }

    /** 下期達成区分 */
    private String simoTasseikbn;

    /**
     * @return 下期達成区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SIMO-TASSEIKBN")
    public String getSimoTasseikbn() {
        return this.simoTasseikbn;
    }

    /**
     * @param o 下期達成区分
     */
    public void setSimoTasseikbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.simoTasseikbn = String.valueOf(o.toString());
        } else {
            this.simoTasseikbn = null;
        }
    }

    /** 有力店会区分 */
    private String yutenkaikbn;

    /**
     * @return 有力店会区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YUTENKAIKBN")
    public String getYutenkaikbn() {
        return this.yutenkaikbn;
    }

    /**
     * @param o 有力店会区分
     */
    public void setYutenkaikbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yutenkaikbn = String.valueOf(o.toString());
        } else {
            this.yutenkaikbn = null;
        }
    }

    /** 取引停止区分 */
    private String torihikiKbn;

    /**
     * @return 取引停止区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TORIHIKI-KBN")
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

    /** 業種区分 */
    private String gyoshuKbn;

    /**
     * @return 業種区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("GYOSHU-KBN")
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

    /** ＦＡＸ区分 */
    private java.math.BigDecimal faxkbn;

    /**
     * @return ＦＡＸ区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("FAXKBN")
    public java.math.BigDecimal getFaxkbn() {
        return this.faxkbn;
    }

    /**
     * @param o ＦＡＸ区分
     */
    public void setFaxkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.faxkbn = new java.math.BigDecimal(o.toString());
        } else {
            this.faxkbn = null;
        }
    }

    /** 有ボ率区分 */
    private String ritukbn;

    /**
     * @return 有ボ率区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("RITUKBN")
    public String getRitukbn() {
        return this.ritukbn;
    }

    /**
     * @param o 有ボ率区分
     */
    public void setRitukbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ritukbn = String.valueOf(o.toString());
        } else {
            this.ritukbn = null;
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

    /** 営業所区分 */
    private String eigyokbn;

    /**
     * @return 営業所区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("EIGYOKBN")
    public String getEigyokbn() {
        return this.eigyokbn;
    }

    /**
     * @param o 営業所区分
     */
    public void setEigyokbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.eigyokbn = String.valueOf(o.toString());
        } else {
            this.eigyokbn = null;
        }
    }

    /** 有力店ランク */
    private String yuryokuRank;

    /**
     * @return 有力店ランク
     */
    @com.fasterxml.jackson.annotation.JsonProperty("YURYOKU-RANK")
    public String getYuryokuRank() {
        return this.yuryokuRank;
    }

    /**
     * @param o 有力店ランク
     */
    public void setYuryokuRank(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yuryokuRank = String.valueOf(o.toString());
        } else {
            this.yuryokuRank = null;
        }
    }

    /** 戦略店区分 */
    private String stkbn;

    /**
     * @return 戦略店区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("STKBN")
    public String getStkbn() {
        return this.stkbn;
    }

    /**
     * @param o 戦略店区分
     */
    public void setStkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stkbn = String.valueOf(o.toString());
        } else {
            this.stkbn = null;
        }
    }

    /**
     * 有力店マスタ照会
     *
     * @param param1 有力店コード
     * @return 有力店マスタ
     */
    public static MYuryoku get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"YURYOCD\" = :yuryocd");

        String sql = "SELECT * FROM M_YURYOKU WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yuryocd", param1);

        return Queries.get(sql, params, MYuryoku.class);
    }

    /**
     * 有力店マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 有力店マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"YURYOCD\" -- :yuryocd");
        nameList.add("\"RYURYOKUMEI\" -- :ryuryokumei");
        nameList.add("\"YURYOMEI1\" -- :yuryomei1");
        nameList.add("\"YURYOMEI2\" -- :yuryomei2");
        nameList.add("\"YURYOKU-JUSHO1\" -- :yuryoku_jusho1");
        nameList.add("\"YURYOKU-JUSHO2\" -- :yuryoku_jusho2");
        nameList.add("\"UBINNO\" -- :ubinno");
        nameList.add("\"TELNO\" -- :telno");
        nameList.add("\"FAXNO\" -- :faxno");
        nameList.add("\"YURYOKUKBN\" -- :yuryokukbn");
        nameList.add("\"TOUROKUBI\" -- :tourokubi");
        nameList.add("\"KYURYOKUMEI\" -- :kyuryokumei");
        nameList.add("\"KI\" -- :ki");
        nameList.add("\"KAMI-KONYU\" -- :kami_konyu");
        nameList.add("\"KAMI-SIHARAI\" -- :kami_siharai");
        nameList.add("\"KAMI-YUBORITU\" -- :kami_yuboritu");
        nameList.add("\"KAMI-TASSEIKBN\" -- :kami_tasseikbn");
        nameList.add("\"SIMO-KONYU\" -- :simo_konyu");
        nameList.add("\"SIMO-SIHARAI\" -- :simo_siharai");
        nameList.add("\"SIMO-YUBORITU\" -- :simo_yuboritu");
        nameList.add("\"SIMO-TASSEIKBN\" -- :simo_tasseikbn");
        nameList.add("\"YUTENKAIKBN\" -- :yutenkaikbn");
        nameList.add("\"TORIHIKI-KBN\" -- :torihiki_kbn");
        nameList.add("\"GYOSHU-KBN\" -- :gyoshu_kbn");
        nameList.add("\"SICHOCD\" -- :sichocd");
        nameList.add("\"FAXKBN\" -- :faxkbn");
        nameList.add("\"RITUKBN\" -- :ritukbn");
        nameList.add("\"UNSOCD\" -- :unsocd");
        nameList.add("\"TIKUCD\" -- :tikucd");
        nameList.add("\"TODOFUKENCD\" -- :todofukencd");
        nameList.add("\"EIGYOKBN\" -- :eigyokbn");
        nameList.add("\"YURYOKU-RANK\" -- :yuryoku_rank");
        nameList.add("\"STKBN\" -- :stkbn");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_YURYOKU(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yuryocd");
        valueList.add(":ryuryokumei");
        valueList.add(":yuryomei1");
        valueList.add(":yuryomei2");
        valueList.add(":yuryoku_jusho1");
        valueList.add(":yuryoku_jusho2");
        valueList.add(":ubinno");
        valueList.add(":telno");
        valueList.add(":faxno");
        valueList.add(":yuryokukbn");
        valueList.add(":tourokubi");
        valueList.add(":kyuryokumei");
        valueList.add(":ki");
        valueList.add(":kami_konyu");
        valueList.add(":kami_siharai");
        valueList.add(":kami_yuboritu");
        valueList.add(":kami_tasseikbn");
        valueList.add(":simo_konyu");
        valueList.add(":simo_siharai");
        valueList.add(":simo_yuboritu");
        valueList.add(":simo_tasseikbn");
        valueList.add(":yutenkaikbn");
        valueList.add(":torihiki_kbn");
        valueList.add(":gyoshu_kbn");
        valueList.add(":sichocd");
        valueList.add(":faxkbn");
        valueList.add(":ritukbn");
        valueList.add(":unsocd");
        valueList.add(":tikucd");
        valueList.add(":todofukencd");
        valueList.add(":eigyokbn");
        valueList.add(":yuryoku_rank");
        valueList.add(":stkbn");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 有力店マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 有力店マスタの登録
        String sql = "UPDATE M_YURYOKU\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"YURYOCD\" = :yuryocd");
        setList.add("\"RYURYOKUMEI\" = :ryuryokumei");
        setList.add("\"YURYOMEI1\" = :yuryomei1");
        setList.add("\"YURYOMEI2\" = :yuryomei2");
        setList.add("\"YURYOKU-JUSHO1\" = :yuryoku_jusho1");
        setList.add("\"YURYOKU-JUSHO2\" = :yuryoku_jusho2");
        setList.add("\"UBINNO\" = :ubinno");
        setList.add("\"TELNO\" = :telno");
        setList.add("\"FAXNO\" = :faxno");
        setList.add("\"YURYOKUKBN\" = :yuryokukbn");
        setList.add("\"TOUROKUBI\" = :tourokubi");
        setList.add("\"KYURYOKUMEI\" = :kyuryokumei");
        setList.add("\"KI\" = :ki");
        setList.add("\"KAMI-KONYU\" = :kami_konyu");
        setList.add("\"KAMI-SIHARAI\" = :kami_siharai");
        setList.add("\"KAMI-YUBORITU\" = :kami_yuboritu");
        setList.add("\"KAMI-TASSEIKBN\" = :kami_tasseikbn");
        setList.add("\"SIMO-KONYU\" = :simo_konyu");
        setList.add("\"SIMO-SIHARAI\" = :simo_siharai");
        setList.add("\"SIMO-YUBORITU\" = :simo_yuboritu");
        setList.add("\"SIMO-TASSEIKBN\" = :simo_tasseikbn");
        setList.add("\"YUTENKAIKBN\" = :yutenkaikbn");
        setList.add("\"TORIHIKI-KBN\" = :torihiki_kbn");
        setList.add("\"GYOSHU-KBN\" = :gyoshu_kbn");
        setList.add("\"SICHOCD\" = :sichocd");
        setList.add("\"FAXKBN\" = :faxkbn");
        setList.add("\"RITUKBN\" = :ritukbn");
        setList.add("\"UNSOCD\" = :unsocd");
        setList.add("\"TIKUCD\" = :tikucd");
        setList.add("\"TODOFUKENCD\" = :todofukencd");
        setList.add("\"EIGYOKBN\" = :eigyokbn");
        setList.add("\"YURYOKU-RANK\" = :yuryoku_rank");
        setList.add("\"STKBN\" = :stkbn");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 有力店マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 有力店マスタの削除
        String sql = "DELETE FROM M_YURYOKU WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"YURYOCD\" = :yuryocd");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yuryocd", this.yuryocd);
        params.put("ryuryokumei", this.ryuryokumei);
        params.put("yuryomei1", this.yuryomei1);
        params.put("yuryomei2", this.yuryomei2);
        params.put("yuryoku_jusho1", this.yuryokuJusho1);
        params.put("yuryoku_jusho2", this.yuryokuJusho2);
        params.put("ubinno", this.ubinno);
        params.put("telno", this.telno);
        params.put("faxno", this.faxno);
        params.put("yuryokukbn", this.yuryokukbn);
        params.put("tourokubi", this.tourokubi);
        params.put("kyuryokumei", this.kyuryokumei);
        params.put("ki", this.ki);
        params.put("kami_konyu", this.kamiKonyu);
        params.put("kami_siharai", this.kamiSiharai);
        params.put("kami_yuboritu", this.kamiYuboritu);
        params.put("kami_tasseikbn", this.kamiTasseikbn);
        params.put("simo_konyu", this.simoKonyu);
        params.put("simo_siharai", this.simoSiharai);
        params.put("simo_yuboritu", this.simoYuboritu);
        params.put("simo_tasseikbn", this.simoTasseikbn);
        params.put("yutenkaikbn", this.yutenkaikbn);
        params.put("torihiki_kbn", this.torihikiKbn);
        params.put("gyoshu_kbn", this.gyoshuKbn);
        params.put("sichocd", this.sichocd);
        params.put("faxkbn", this.faxkbn);
        params.put("ritukbn", this.ritukbn);
        params.put("unsocd", this.unsocd);
        params.put("tikucd", this.tikucd);
        params.put("todofukencd", this.todofukencd);
        params.put("eigyokbn", this.eigyokbn);
        params.put("yuryoku_rank", this.yuryokuRank);
        params.put("stkbn", this.stkbn);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
