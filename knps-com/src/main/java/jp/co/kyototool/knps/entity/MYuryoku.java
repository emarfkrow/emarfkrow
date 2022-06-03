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

    /** カナ有力店名 */
    private String kyuryokumei;

    /**
     * @return カナ有力店名
     */
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

    /** 営業所区分 */
    private String eigyokbn;

    /**
     * @return 営業所区分
     */
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
        nameList.add("yuryocd -- :yuryocd");
        nameList.add("ryuryokumei -- :ryuryokumei");
        nameList.add("yuryomei1 -- :yuryomei1");
        nameList.add("yuryomei2 -- :yuryomei2");
        nameList.add("yuryoku_jusho1 -- :yuryoku_jusho1");
        nameList.add("yuryoku_jusho2 -- :yuryoku_jusho2");
        nameList.add("ubinno -- :ubinno");
        nameList.add("telno -- :telno");
        nameList.add("faxno -- :faxno");
        nameList.add("yuryokukbn -- :yuryokukbn");
        nameList.add("tourokubi -- :tourokubi");
        nameList.add("kyuryokumei -- :kyuryokumei");
        nameList.add("ki -- :ki");
        nameList.add("kami_konyu -- :kami_konyu");
        nameList.add("kami_siharai -- :kami_siharai");
        nameList.add("kami_yuboritu -- :kami_yuboritu");
        nameList.add("kami_tasseikbn -- :kami_tasseikbn");
        nameList.add("simo_konyu -- :simo_konyu");
        nameList.add("simo_siharai -- :simo_siharai");
        nameList.add("simo_yuboritu -- :simo_yuboritu");
        nameList.add("simo_tasseikbn -- :simo_tasseikbn");
        nameList.add("yutenkaikbn -- :yutenkaikbn");
        nameList.add("torihiki_kbn -- :torihiki_kbn");
        nameList.add("gyoshu_kbn -- :gyoshu_kbn");
        nameList.add("sichocd -- :sichocd");
        nameList.add("faxkbn -- :faxkbn");
        nameList.add("ritukbn -- :ritukbn");
        nameList.add("unsocd -- :unsocd");
        nameList.add("tikucd -- :tikucd");
        nameList.add("todofukencd -- :todofukencd");
        nameList.add("eigyokbn -- :eigyokbn");
        nameList.add("yuryoku_rank -- :yuryoku_rank");
        nameList.add("stkbn -- :stkbn");
        nameList.add("filler -- :filler");
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
        valueList.add(":yuryoku-jusho1");
        valueList.add(":yuryoku-jusho2");
        valueList.add(":ubinno");
        valueList.add(":telno");
        valueList.add(":faxno");
        valueList.add(":yuryokukbn");
        valueList.add(":tourokubi");
        valueList.add(":kyuryokumei");
        valueList.add(":ki");
        valueList.add(":kami-konyu");
        valueList.add(":kami-siharai");
        valueList.add(":kami-yuboritu");
        valueList.add(":kami-tasseikbn");
        valueList.add(":simo-konyu");
        valueList.add(":simo-siharai");
        valueList.add(":simo-yuboritu");
        valueList.add(":simo-tasseikbn");
        valueList.add(":yutenkaikbn");
        valueList.add(":torihiki-kbn");
        valueList.add(":gyoshu-kbn");
        valueList.add(":sichocd");
        valueList.add(":faxkbn");
        valueList.add(":ritukbn");
        valueList.add(":unsocd");
        valueList.add(":tikucd");
        valueList.add(":todofukencd");
        valueList.add(":eigyokbn");
        valueList.add(":yuryoku-rank");
        valueList.add(":stkbn");
        valueList.add(":filler");
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
        setList.add("yuryocd = :yuryocd");
        setList.add("ryuryokumei = :ryuryokumei");
        setList.add("yuryomei1 = :yuryomei1");
        setList.add("yuryomei2 = :yuryomei2");
        setList.add("yuryoku-jusho1 = :yuryoku-jusho1");
        setList.add("yuryoku-jusho2 = :yuryoku-jusho2");
        setList.add("ubinno = :ubinno");
        setList.add("telno = :telno");
        setList.add("faxno = :faxno");
        setList.add("yuryokukbn = :yuryokukbn");
        setList.add("tourokubi = :tourokubi");
        setList.add("kyuryokumei = :kyuryokumei");
        setList.add("ki = :ki");
        setList.add("kami-konyu = :kami-konyu");
        setList.add("kami-siharai = :kami-siharai");
        setList.add("kami-yuboritu = :kami-yuboritu");
        setList.add("kami-tasseikbn = :kami-tasseikbn");
        setList.add("simo-konyu = :simo-konyu");
        setList.add("simo-siharai = :simo-siharai");
        setList.add("simo-yuboritu = :simo-yuboritu");
        setList.add("simo-tasseikbn = :simo-tasseikbn");
        setList.add("yutenkaikbn = :yutenkaikbn");
        setList.add("torihiki-kbn = :torihiki-kbn");
        setList.add("gyoshu-kbn = :gyoshu-kbn");
        setList.add("sichocd = :sichocd");
        setList.add("faxkbn = :faxkbn");
        setList.add("ritukbn = :ritukbn");
        setList.add("unsocd = :unsocd");
        setList.add("tikucd = :tikucd");
        setList.add("todofukencd = :todofukencd");
        setList.add("eigyokbn = :eigyokbn");
        setList.add("yuryoku-rank = :yuryoku-rank");
        setList.add("stkbn = :stkbn");
        setList.add("filler = :filler");
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
        whereList.add("yuryocd = :yuryocd");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YURYOCD", this.yuryocd);
        params.put("RYURYOKUMEI", this.ryuryokumei);
        params.put("YURYOMEI1", this.yuryomei1);
        params.put("YURYOMEI2", this.yuryomei2);
        params.put("YURYOKU-JUSHO1", this.yuryokuJusho1);
        params.put("YURYOKU-JUSHO2", this.yuryokuJusho2);
        params.put("UBINNO", this.ubinno);
        params.put("TELNO", this.telno);
        params.put("FAXNO", this.faxno);
        params.put("YURYOKUKBN", this.yuryokukbn);
        params.put("TOUROKUBI", this.tourokubi);
        params.put("KYURYOKUMEI", this.kyuryokumei);
        params.put("KI", this.ki);
        params.put("KAMI-KONYU", this.kamiKonyu);
        params.put("KAMI-SIHARAI", this.kamiSiharai);
        params.put("KAMI-YUBORITU", this.kamiYuboritu);
        params.put("KAMI-TASSEIKBN", this.kamiTasseikbn);
        params.put("SIMO-KONYU", this.simoKonyu);
        params.put("SIMO-SIHARAI", this.simoSiharai);
        params.put("SIMO-YUBORITU", this.simoYuboritu);
        params.put("SIMO-TASSEIKBN", this.simoTasseikbn);
        params.put("YUTENKAIKBN", this.yutenkaikbn);
        params.put("TORIHIKI-KBN", this.torihikiKbn);
        params.put("GYOSHU-KBN", this.gyoshuKbn);
        params.put("SICHOCD", this.sichocd);
        params.put("FAXKBN", this.faxkbn);
        params.put("RITUKBN", this.ritukbn);
        params.put("UNSOCD", this.unsocd);
        params.put("TIKUCD", this.tikucd);
        params.put("TODOFUKENCD", this.todofukencd);
        params.put("EIGYOKBN", this.eigyokbn);
        params.put("YURYOKU-RANK", this.yuryokuRank);
        params.put("STKBN", this.stkbn);
        params.put("FILLER", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
