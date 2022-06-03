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
        whereList.add("TRIM (\"SET-HINBAN\") = TRIM (:set_hinban)");
        whereList.add("TRIM (\"SET-KHINBAN\") = TRIM (:set_khinban)");

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

        // セット子品番の採番処理
        numbering();

        // セット構成マスタの登録
        if (this.mSetkose != null) {
            this.mSetkose.setSetHinban(this.getSetHinban());
            this.mSetkose.setSetKhinban(this.getSetKhinban());
            this.mSetkose.insert(now, id);
        }

        // 仮セット構成マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("set_hinban -- :set_hinban");
        nameList.add("set_khinban -- :set_khinban");
        nameList.add("tokucd -- :tokucd");
        nameList.add("hinmei -- :hinmei");
        nameList.add("ko_hinmei -- :ko_hinmei");
        nameList.add("setkbn -- :setkbn");
        nameList.add("setinzu -- :setinzu");
        nameList.add("ko_tanka -- :ko_tanka");
        nameList.add("mushokbn -- :mushokbn");
        nameList.add("rtokumei -- :rtokumei");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_SETKARI(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":set-hinban");
        valueList.add(":set-khinban");
        valueList.add(":tokucd");
        valueList.add(":hinmei");
        valueList.add(":ko-hinmei");
        valueList.add(":setkbn");
        valueList.add(":setinzu");
        valueList.add(":ko-tanka");
        valueList.add(":mushokbn");
        valueList.add(":rtokumei");
        return String.join("\r\n    , ", valueList);
    }

    /** セット子品番の採番処理 */
    private void numbering() {

        if (this.setKhinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.SET-KHINBAN) IS NULL THEN 0 ELSE MAX(e.SET-KHINBAN) * 1 END + 1, 20, '0') AS SET-KHINBAN FROM M_SETKARI e WHERE e.SET-KHINBAN < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        List<String> whereList = new ArrayList<String>();
        whereList.add("e.SET-HINBAN = :set-hinban");
        sql += " WHERE " + String.join(" AND ", whereList);

        params.put("setHinban", this.setHinban);

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SET-KHINBAN");

        this.setSetKhinban(o);
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
        setList.add("set-hinban = :set-hinban");
        setList.add("set-khinban = :set-khinban");
        setList.add("tokucd = :tokucd");
        setList.add("hinmei = :hinmei");
        setList.add("ko-hinmei = :ko-hinmei");
        setList.add("setkbn = :setkbn");
        setList.add("setinzu = :setinzu");
        setList.add("ko-tanka = :ko-tanka");
        setList.add("mushokbn = :mushokbn");
        setList.add("rtokumei = :rtokumei");
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
        whereList.add("TRIM (set-hinban) = TRIM (:set-hinban)");
        whereList.add("TRIM (set-khinban) = TRIM (:set-khinban)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SET-HINBAN", this.setHinban);
        params.put("SET-KHINBAN", this.setKhinban);
        params.put("TOKUCD", this.tokucd);
        params.put("HINMEI", this.hinmei);
        params.put("KO-HINMEI", this.koHinmei);
        params.put("SETKBN", this.setkbn);
        params.put("SETINZU", this.setinzu);
        params.put("KO-TANKA", this.koTanka);
        params.put("MUSHOKBN", this.mushokbn);
        params.put("RTOKUMEI", this.rtokumei);
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
