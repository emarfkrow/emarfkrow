package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 仮セット構成マスタ
 *
 * @author emarfkrow
 */
public class MSetkari implements IEntity {

    /** セット品番 */
    private String setHinban;

    /**
     * @return セット品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SET-HINBAN")
    public String getSetHinban() {
        return this.setHinban;
    }

    /**
     * @param o セット品番
     */
    public void setSetHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setHinban = String.valueOf(o.toString());
        } else {
            this.setHinban = null;
        }
    }

    /** セット子品番 */
    private String setKhinban;

    /**
     * @return セット子品番
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SET-KHINBAN")
    public String getSetKhinban() {
        return this.setKhinban;
    }

    /**
     * @param o セット子品番
     */
    public void setSetKhinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setKhinban = String.valueOf(o.toString());
        } else {
            this.setKhinban = null;
        }
    }

    /** 得意先コード */
    private java.math.BigDecimal tokucd;

    /**
     * @return 得意先コード
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TOKUCD")
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

    /** 品名 */
    private String hinmei;

    /**
     * @return 品名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("HINMEI")
    public String getHinmei() {
        return this.hinmei;
    }

    /**
     * @param o 品名
     */
    public void setHinmei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinmei = String.valueOf(o.toString());
        } else {
            this.hinmei = null;
        }
    }

    /** 子品名 */
    private String koHinmei;

    /**
     * @return 子品名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KO-HINMEI")
    public String getKoHinmei() {
        return this.koHinmei;
    }

    /**
     * @param o 子品名
     */
    public void setKoHinmei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koHinmei = String.valueOf(o.toString());
        } else {
            this.koHinmei = null;
        }
    }

    /** セット区分 */
    private String setkbn;

    /**
     * @return セット区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SETKBN")
    public String getSetkbn() {
        return this.setkbn;
    }

    /**
     * @param o セット区分
     */
    public void setSetkbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setkbn = String.valueOf(o.toString());
        } else {
            this.setkbn = null;
        }
    }

    /** セット員数 */
    private java.math.BigDecimal setinzu;

    /**
     * @return セット員数
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SETINZU")
    public java.math.BigDecimal getSetinzu() {
        return this.setinzu;
    }

    /**
     * @param o セット員数
     */
    public void setSetinzu(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.setinzu = new java.math.BigDecimal(o.toString());
        } else {
            this.setinzu = null;
        }
    }

    /** 子単価 */
    private java.math.BigDecimal koTanka;

    /**
     * @return 子単価
     */
    @com.fasterxml.jackson.annotation.JsonProperty("KO-TANKA")
    public java.math.BigDecimal getKoTanka() {
        return this.koTanka;
    }

    /**
     * @param o 子単価
     */
    public void setKoTanka(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koTanka = new java.math.BigDecimal(o.toString());
        } else {
            this.koTanka = null;
        }
    }

    /** 無償支給区分 */
    private String mushokbn;

    /**
     * @return 無償支給区分
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MUSHOKBN")
    public String getMushokbn() {
        return this.mushokbn;
    }

    /**
     * @param o 無償支給区分
     */
    public void setMushokbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mushokbn = String.valueOf(o.toString());
        } else {
            this.mushokbn = null;
        }
    }

    /** 略得意先名 */
    private String rtokumei;

    /**
     * @return 略得意先名
     */
    @com.fasterxml.jackson.annotation.JsonProperty("RTOKUMEI")
    public String getRtokumei() {
        return this.rtokumei;
    }

    /**
     * @param o 略得意先名
     */
    public void setRtokumei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.rtokumei = String.valueOf(o.toString());
        } else {
            this.rtokumei = null;
        }
    }

    /**
     * 仮セット構成マスタ照会
     *
     * @param param1 セット品番
     * @param param2 セット子品番
     * @return 仮セット構成マスタ
     */
    public static MSetkari get(final Object param1, final Object param2) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SET-HINBAN\" = :set_hinban");
        whereList.add("\"SET-KHINBAN\" = :set_khinban");

        String sql = "SELECT * FROM M_SETKARI WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("set_hinban", param1);
        params.put("set_khinban", param2);

        return Queries.get(sql, params, MSetkari.class);
    }

    /**
     * 仮セット構成マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // セット構成マスタの登録
        if (this.mSetkose != null) {
            this.mSetkose.setSetHinban(this.getSetHinban());
            this.mSetkose.setSetKhinban(this.getSetKhinban());
            this.mSetkose.insert(now, id);
        }

        // 仮セット構成マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"SET-HINBAN\" -- :set_hinban");
        nameList.add("\"SET-KHINBAN\" -- :set_khinban");
        nameList.add("\"TOKUCD\" -- :tokucd");
        nameList.add("\"HINMEI\" -- :hinmei");
        nameList.add("\"KO-HINMEI\" -- :ko_hinmei");
        nameList.add("\"SETKBN\" -- :setkbn");
        nameList.add("\"SETINZU\" -- :setinzu");
        nameList.add("\"KO-TANKA\" -- :ko_tanka");
        nameList.add("\"MUSHOKBN\" -- :mushokbn");
        nameList.add("\"RTOKUMEI\" -- :rtokumei");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_SETKARI(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":set_hinban");
        valueList.add(":set_khinban");
        valueList.add(":tokucd");
        valueList.add(":hinmei");
        valueList.add(":ko_hinmei");
        valueList.add(":setkbn");
        valueList.add(":setinzu");
        valueList.add(":ko_tanka");
        valueList.add(":mushokbn");
        valueList.add(":rtokumei");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 仮セット構成マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // セット構成マスタの登録
        if (this.mSetkose != null) {
            mSetkose.setSetHinban(this.getSetHinban());
            mSetkose.setSetKhinban(this.getSetKhinban());
            try {
                mSetkose.insert(now, id);
            } catch (Exception e) {
                mSetkose.update(now, id);
            }
        }

        // 仮セット構成マスタの登録
        String sql = "UPDATE M_SETKARI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"SET-HINBAN\" = :set_hinban");
        setList.add("\"SET-KHINBAN\" = :set_khinban");
        setList.add("\"TOKUCD\" = :tokucd");
        setList.add("\"HINMEI\" = :hinmei");
        setList.add("\"KO-HINMEI\" = :ko_hinmei");
        setList.add("\"SETKBN\" = :setkbn");
        setList.add("\"SETINZU\" = :setinzu");
        setList.add("\"KO-TANKA\" = :ko_tanka");
        setList.add("\"MUSHOKBN\" = :mushokbn");
        setList.add("\"RTOKUMEI\" = :rtokumei");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 仮セット構成マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // セット構成マスタの削除
        if (this.mSetkose != null) {
            this.mSetkose.delete();
        }

        // 仮セット構成マスタの削除
        String sql = "DELETE FROM M_SETKARI WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SET-HINBAN\" = :set_hinban");
        whereList.add("\"SET-KHINBAN\" = :set_khinban");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("set_hinban", this.setHinban);
        params.put("set_khinban", this.setKhinban);
        params.put("tokucd", this.tokucd);
        params.put("hinmei", this.hinmei);
        params.put("ko_hinmei", this.koHinmei);
        params.put("setkbn", this.setkbn);
        params.put("setinzu", this.setinzu);
        params.put("ko_tanka", this.koTanka);
        params.put("mushokbn", this.mushokbn);
        params.put("rtokumei", this.rtokumei);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * セット構成マスタ
     */
    private MSetkose mSetkose;

    /**
     * @return セット構成マスタ
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MSetkose")
    public MSetkose getMSetkose() {
        return this.mSetkose;
    }

    /**
     * @param p セット構成マスタ
     */
    public void setMSetkose(final MSetkose p) {
        this.mSetkose = p;
    }

    /**
     * @return セット構成マスタ
     */
    public MSetkose referMSetkose() {
        if (this.mSetkose == null) {
            try {
                this.mSetkose = MSetkose.get(this.setHinban, this.setKhinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mSetkose;
    }
}
