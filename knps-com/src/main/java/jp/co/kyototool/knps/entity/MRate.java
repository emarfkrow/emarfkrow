package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 為替レートマスタ
 *
 * @author emarfkrow
 */
public class MRate implements IEntity {

    /** 年 */
    private java.math.BigDecimal yy;

    /**
     * @return 年
     */
    public java.math.BigDecimal getYy() {
        return this.yy;
    }

    /**
     * @param o 年
     */
    public void setYy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yy = new java.math.BigDecimal(o.toString());
        } else {
            this.yy = null;
        }
    }

    /** 月 */
    private java.math.BigDecimal mm;

    /**
     * @return 月
     */
    public java.math.BigDecimal getMm() {
        return this.mm;
    }

    /**
     * @param o 月
     */
    public void setMm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mm = new java.math.BigDecimal(o.toString());
        } else {
            this.mm = null;
        }
    }

    /** 日 */
    private java.math.BigDecimal dd;

    /**
     * @return 日
     */
    public java.math.BigDecimal getDd() {
        return this.dd;
    }

    /**
     * @param o 日
     */
    public void setDd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.dd = new java.math.BigDecimal(o.toString());
        } else {
            this.dd = null;
        }
    }

    /** 通貨 */
    private String tuuka;

    /**
     * @return 通貨
     */
    public String getTuuka() {
        return this.tuuka;
    }

    /**
     * @param o 通貨
     */
    public void setTuuka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tuuka = String.valueOf(o.toString());
        } else {
            this.tuuka = null;
        }
    }

    /** 中値 */
    private java.math.BigDecimal ttm;

    /**
     * @return 中値
     */
    public java.math.BigDecimal getTtm() {
        return this.ttm;
    }

    /**
     * @param o 中値
     */
    public void setTtm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ttm = new java.math.BigDecimal(o.toString());
        } else {
            this.ttm = null;
        }
    }

    /** 売相場 */
    private java.math.BigDecimal tts;

    /**
     * @return 売相場
     */
    public java.math.BigDecimal getTts() {
        return this.tts;
    }

    /**
     * @param o 売相場
     */
    public void setTts(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tts = new java.math.BigDecimal(o.toString());
        } else {
            this.tts = null;
        }
    }

    /** 買相場 */
    private java.math.BigDecimal ttb;

    /**
     * @return 買相場
     */
    public java.math.BigDecimal getTtb() {
        return this.ttb;
    }

    /**
     * @param o 買相場
     */
    public void setTtb(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ttb = new java.math.BigDecimal(o.toString());
        } else {
            this.ttb = null;
        }
    }

    /** 売相場－公表レート */
    private java.math.BigDecimal ttsOrg;

    /**
     * @return 売相場－公表レート
     */
    public java.math.BigDecimal getTtsOrg() {
        return this.ttsOrg;
    }

    /**
     * @param o 売相場－公表レート
     */
    public void setTtsOrg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ttsOrg = new java.math.BigDecimal(o.toString());
        } else {
            this.ttsOrg = null;
        }
    }

    /** 買相場－公表レート */
    private java.math.BigDecimal ttbOrg;

    /**
     * @return 買相場－公表レート
     */
    public java.math.BigDecimal getTtbOrg() {
        return this.ttbOrg;
    }

    /**
     * @param o 買相場－公表レート
     */
    public void setTtbOrg(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.ttbOrg = new java.math.BigDecimal(o.toString());
        } else {
            this.ttbOrg = null;
        }
    }

    /** 最終更新日 */
    private java.math.BigDecimal lstymd;

    /**
     * @return 最終更新日
     */
    public java.math.BigDecimal getLstymd() {
        return this.lstymd;
    }

    /**
     * @param o 最終更新日
     */
    public void setLstymd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lstymd = new java.math.BigDecimal(o.toString());
        } else {
            this.lstymd = null;
        }
    }

    /** 最終更新時間 */
    private java.math.BigDecimal lsthm;

    /**
     * @return 最終更新時間
     */
    public java.math.BigDecimal getLsthm() {
        return this.lsthm;
    }

    /**
     * @param o 最終更新時間
     */
    public void setLsthm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.lsthm = new java.math.BigDecimal(o.toString());
        } else {
            this.lsthm = null;
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

    /**
     * 為替レートマスタ照会
     *
     * @param param1 年
     * @param param2 月
     * @param param3 日
     * @param param4 通貨
     * @return 為替レートマスタ
     */
    public static MRate get(final Object param1, final Object param2, final Object param3, final Object param4) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"YY\" = :yy");
        whereList.add("\"MM\" = :mm");
        whereList.add("\"DD\" = :dd");
        whereList.add("TRIM (\"TUUKA\") = TRIM (:tuuka)");

        String sql = "SELECT * FROM M_RATE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("yy", param1);
        params.put("mm", param2);
        params.put("dd", param3);
        params.put("tuuka", param4);

        return Queries.get(sql, params, MRate.class);
    }

    /**
     * 為替レートマスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 通貨の採番処理
        numbering();

        // 為替レートマスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("yy -- :yy");
        nameList.add("mm -- :mm");
        nameList.add("dd -- :dd");
        nameList.add("tuuka -- :tuuka");
        nameList.add("ttm -- :ttm");
        nameList.add("tts -- :tts");
        nameList.add("ttb -- :ttb");
        nameList.add("tts_org -- :tts_org");
        nameList.add("ttb_org -- :ttb_org");
        nameList.add("lstymd -- :lstymd");
        nameList.add("lsthm -- :lsthm");
        nameList.add("upddate -- :upddate");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_RATE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":yy");
        valueList.add(":mm");
        valueList.add(":dd");
        valueList.add(":tuuka");
        valueList.add(":ttm");
        valueList.add(":tts");
        valueList.add(":ttb");
        valueList.add(":tts-org");
        valueList.add(":ttb-org");
        valueList.add(":lstymd");
        valueList.add(":lsthm");
        valueList.add(":upddate");
        return String.join("\r\n    , ", valueList);
    }

    /** 通貨の採番処理 */
    private void numbering() {

        if (this.tuuka != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.TUUKA) IS NULL THEN 0 ELSE MAX(e.TUUKA) * 1 END + 1, 3, '0') AS TUUKA FROM M_RATE e WHERE e.TUUKA < '999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.YY = :yy");
        whereList.add("e.MM = :mm");
        whereList.add("e.DD = :dd");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("yy", this.yy);
        params.put("mm", this.mm);
        params.put("dd", this.dd);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("TUUKA");

        this.setTuuka(o);
    }

    /**
     * 為替レートマスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 為替レートマスタの登録
        String sql = "UPDATE M_RATE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("yy = :yy");
        setList.add("mm = :mm");
        setList.add("dd = :dd");
        setList.add("tuuka = :tuuka");
        setList.add("ttm = :ttm");
        setList.add("tts = :tts");
        setList.add("ttb = :ttb");
        setList.add("tts-org = :tts-org");
        setList.add("ttb-org = :ttb-org");
        setList.add("lstymd = :lstymd");
        setList.add("lsthm = :lsthm");
        setList.add("upddate = :upddate");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 為替レートマスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 為替レートマスタの削除
        String sql = "DELETE FROM M_RATE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("yy = :yy");
        whereList.add("mm = :mm");
        whereList.add("dd = :dd");
        whereList.add("TRIM (tuuka) = TRIM (:tuuka)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("YY", this.yy);
        params.put("MM", this.mm);
        params.put("DD", this.dd);
        params.put("TUUKA", this.tuuka);
        params.put("TTM", this.ttm);
        params.put("TTS", this.tts);
        params.put("TTB", this.ttb);
        params.put("TTS-ORG", this.ttsOrg);
        params.put("TTB-ORG", this.ttbOrg);
        params.put("LSTYMD", this.lstymd);
        params.put("LSTHM", this.lsthm);
        params.put("UPDDATE", this.upddate);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
