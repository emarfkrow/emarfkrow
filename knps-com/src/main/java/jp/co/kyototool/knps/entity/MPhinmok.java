package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 部品マスタ
 *
 * @author emarfkrow
 */
public class MPhinmok implements IEntity {

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

    /** 部品名カナ */
    private String phinmeik;

    /**
     * @return 部品名カナ
     */
    public String getPhinmeik() {
        return this.phinmeik;
    }

    /**
     * @param o 部品名カナ
     */
    public void setPhinmeik(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.phinmeik = String.valueOf(o.toString());
        } else {
            this.phinmeik = null;
        }
    }

    /** 生産品番 */
    private String hinban;

    /**
     * @return 生産品番
     */
    public String getHinban() {
        return this.hinban;
    }

    /**
     * @param o 生産品番
     */
    public void setHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinban = String.valueOf(o.toString());
        } else {
            this.hinban = null;
        }
    }

    /** 部品価格 */
    private java.math.BigDecimal pKakaku;

    /**
     * @return 部品価格
     */
    public java.math.BigDecimal getPKakaku() {
        return this.pKakaku;
    }

    /**
     * @param o 部品価格
     */
    public void setPKakaku(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.pKakaku = new java.math.BigDecimal(o.toString());
        } else {
            this.pKakaku = null;
        }
    }

    /** 部品原価 */
    private java.math.BigDecimal pGenka;

    /**
     * @return 部品原価
     */
    public java.math.BigDecimal getPGenka() {
        return this.pGenka;
    }

    /**
     * @param o 部品原価
     */
    public void setPGenka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.pGenka = new java.math.BigDecimal(o.toString());
        } else {
            this.pGenka = null;
        }
    }

    /** 部品区分 */
    private String pKbn;

    /**
     * @return 部品区分
     */
    public String getPKbn() {
        return this.pKbn;
    }

    /**
     * @param o 部品区分
     */
    public void setPKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.pKbn = String.valueOf(o.toString());
        } else {
            this.pKbn = null;
        }
    }

    /** 期首残高 */
    private java.math.BigDecimal kishuzan;

    /**
     * @return 期首残高
     */
    public java.math.BigDecimal getKishuzan() {
        return this.kishuzan;
    }

    /**
     * @param o 期首残高
     */
    public void setKishuzan(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kishuzan = new java.math.BigDecimal(o.toString());
        } else {
            this.kishuzan = null;
        }
    }

    /** 基準在庫 */
    private java.math.BigDecimal kijyunzaiko;

    /**
     * @return 基準在庫
     */
    public java.math.BigDecimal getKijyunzaiko() {
        return this.kijyunzaiko;
    }

    /**
     * @param o 基準在庫
     */
    public void setKijyunzaiko(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.kijyunzaiko = new java.math.BigDecimal(o.toString());
        } else {
            this.kijyunzaiko = null;
        }
    }

    /** 発注点 */
    private java.math.BigDecimal hachuten;

    /**
     * @return 発注点
     */
    public java.math.BigDecimal getHachuten() {
        return this.hachuten;
    }

    /**
     * @param o 発注点
     */
    public void setHachuten(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hachuten = new java.math.BigDecimal(o.toString());
        } else {
            this.hachuten = null;
        }
    }

    /** 登録区分 */
    private String tourokukbn;

    /**
     * @return 登録区分
     */
    public String getTourokukbn() {
        return this.tourokukbn;
    }

    /**
     * @param o 登録区分
     */
    public void setTourokukbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tourokukbn = String.valueOf(o.toString());
        } else {
            this.tourokukbn = null;
        }
    }

    /** 伝票提出区分 */
    private String denpyotkbn;

    /**
     * @return 伝票提出区分
     */
    public String getDenpyotkbn() {
        return this.denpyotkbn;
    }

    /**
     * @param o 伝票提出区分
     */
    public void setDenpyotkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.denpyotkbn = String.valueOf(o.toString());
        } else {
            this.denpyotkbn = null;
        }
    }

    /** 受注禁止区分 */
    private String jukinkbn;

    /**
     * @return 受注禁止区分
     */
    public String getJukinkbn() {
        return this.jukinkbn;
    }

    /**
     * @param o 受注禁止区分
     */
    public void setJukinkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.jukinkbn = String.valueOf(o.toString());
        } else {
            this.jukinkbn = null;
        }
    }

    /** 削除区分 */
    private java.math.BigDecimal dltflg;

    /**
     * @return 削除区分
     */
    public java.math.BigDecimal getDltflg() {
        return this.dltflg;
    }

    /**
     * @param o 削除区分
     */
    public void setDltflg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dltflg = new java.math.BigDecimal(o.toString());
        } else {
            this.dltflg = null;
        }
    }

    /** 更新日 */
    private java.math.BigDecimal upddate;

    /**
     * @return 更新日
     */
    public java.math.BigDecimal getUpddate() {
        return this.upddate;
    }

    /**
     * @param o 更新日
     */
    public void setUpddate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.upddate = new java.math.BigDecimal(o.toString());
        } else {
            this.upddate = null;
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
     * 部品マスタ照会
     *
     * @param param1 部品品番
     * @return 部品マスタ
     */
    public static MPhinmok get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PHINBAN\") = TRIM (:phinban)");

        String sql = "SELECT * FROM M_PHINMOK WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("phinban", param1);

        return Queries.get(sql, params, MPhinmok.class);
    }

    /**
     * 部品マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 部品品番の採番処理
        numbering();

        // 部品マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PHINBAN\" -- :phinban");
        nameList.add("\"PHINMEI\" -- :phinmei");
        nameList.add("\"PHINMEIK\" -- :phinmeik");
        nameList.add("\"HINBAN\" -- :hinban");
        nameList.add("\"P-KAKAKU\" -- :p_kakaku");
        nameList.add("\"P-GENKA\" -- :p_genka");
        nameList.add("\"P-KBN\" -- :p_kbn");
        nameList.add("\"KISHUZAN\" -- :kishuzan");
        nameList.add("\"KIJYUNZAIKO\" -- :kijyunzaiko");
        nameList.add("\"HACHUTEN\" -- :hachuten");
        nameList.add("\"TOUROKUKBN\" -- :tourokukbn");
        nameList.add("\"DENPYOTKBN\" -- :denpyotkbn");
        nameList.add("\"JUKINKBN\" -- :jukinkbn");
        nameList.add("\"DLTFLG\" -- :dltflg");
        nameList.add("\"UPDDATE\" -- :upddate");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_PHINMOK(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":phinban");
        valueList.add(":phinmei");
        valueList.add(":phinmeik");
        valueList.add(":hinban");
        valueList.add(":p_kakaku");
        valueList.add(":p_genka");
        valueList.add(":p_kbn");
        valueList.add(":kishuzan");
        valueList.add(":kijyunzaiko");
        valueList.add(":hachuten");
        valueList.add(":tourokukbn");
        valueList.add(":denpyotkbn");
        valueList.add(":jukinkbn");
        valueList.add(":dltflg");
        valueList.add(":upddate");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 部品品番の採番処理 */
    private void numbering() {

        if (this.phinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"PHINBAN\") IS NULL THEN 0 ELSE MAX(e.\"PHINBAN\") * 1 END + 1, 20, '0') AS \"PHINBAN\" FROM M_PHINMOK e WHERE e.\"PHINBAN\" < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("PHINBAN");

        this.setPhinban(o);
    }

    /**
     * 部品マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 部品マスタの登録
        String sql = "UPDATE M_PHINMOK\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PHINBAN\" = :phinban");
        setList.add("\"PHINMEI\" = :phinmei");
        setList.add("\"PHINMEIK\" = :phinmeik");
        setList.add("\"HINBAN\" = :hinban");
        setList.add("\"P-KAKAKU\" = :p_kakaku");
        setList.add("\"P-GENKA\" = :p_genka");
        setList.add("\"P-KBN\" = :p_kbn");
        setList.add("\"KISHUZAN\" = :kishuzan");
        setList.add("\"KIJYUNZAIKO\" = :kijyunzaiko");
        setList.add("\"HACHUTEN\" = :hachuten");
        setList.add("\"TOUROKUKBN\" = :tourokukbn");
        setList.add("\"DENPYOTKBN\" = :denpyotkbn");
        setList.add("\"JUKINKBN\" = :jukinkbn");
        setList.add("\"DLTFLG\" = :dltflg");
        setList.add("\"UPDDATE\" = :upddate");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 部品マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 部品マスタの削除
        String sql = "DELETE FROM M_PHINMOK WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"PHINBAN\") = TRIM (:phinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("phinban", this.phinban);
        params.put("phinmei", this.phinmei);
        params.put("phinmeik", this.phinmeik);
        params.put("hinban", this.hinban);
        params.put("p_kakaku", this.pKakaku);
        params.put("p_genka", this.pGenka);
        params.put("p_kbn", this.pKbn);
        params.put("kishuzan", this.kishuzan);
        params.put("kijyunzaiko", this.kijyunzaiko);
        params.put("hachuten", this.hachuten);
        params.put("tourokukbn", this.tourokukbn);
        params.put("denpyotkbn", this.denpyotkbn);
        params.put("jukinkbn", this.jukinkbn);
        params.put("dltflg", this.dltflg);
        params.put("upddate", this.upddate);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
