package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_PHASE
 *
 * @author emarfkrow
 */
public class MstPhase implements IEntity {

    /** PHASE */
    private java.math.BigDecimal phase;

    /**
     * @return PHASE
     */
    public java.math.BigDecimal getPhase() {
        return this.phase;
    }

    /**
     * @param o PHASE
     */
    public void setPhase(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.phase = new java.math.BigDecimal(o.toString());
        } else {
            this.phase = null;
        }
    }

    /** YY */
    private java.math.BigDecimal yy;

    /**
     * @return YY
     */
    public java.math.BigDecimal getYy() {
        return this.yy;
    }

    /**
     * @param o YY
     */
    public void setYy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yy = new java.math.BigDecimal(o.toString());
        } else {
            this.yy = null;
        }
    }

    /** PHASE_FROM */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime phaseFrom;

    /**
     * @return PHASE_FROM
     */
    public java.time.LocalDateTime getPhaseFrom() {
        return this.phaseFrom;
    }

    /**
     * @param o PHASE_FROM
     */
    public void setPhaseFrom(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.phaseFrom = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.phaseFrom = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.phaseFrom = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.phaseFrom = null;
        }
    }

    /** PHASE_TO */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime phaseTo;

    /**
     * @return PHASE_TO
     */
    public java.time.LocalDateTime getPhaseTo() {
        return this.phaseTo;
    }

    /**
     * @param o PHASE_TO
     */
    public void setPhaseTo(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.phaseTo = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.phaseTo = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.phaseTo = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.phaseTo = null;
        }
    }

    /**
     * MST_PHASE照会
     *
     * @param param1 PHASE
     * @return MST_PHASE
     */
    public static MstPhase get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"PHASE\" = :phase");

        String sql = "SELECT * FROM MST_PHASE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("phase", param1);

        return Queries.get(sql, params, MstPhase.class);
    }

    /**
     * MST_PHASE追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_PHASEの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"PHASE\" -- :phase");
        nameList.add("\"YY\" -- :yy");
        nameList.add("\"PHASE_FROM\" -- :phase_from");
        nameList.add("\"PHASE_TO\" -- :phase_to");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_PHASE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":phase");
        valueList.add(":yy");
        valueList.add("TO_TIMESTAMP (:phase_from, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:phase_to, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_PHASE更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_PHASEの登録
        String sql = "UPDATE MST_PHASE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"PHASE\" = :phase");
        setList.add("\"YY\" = :yy");
        setList.add("\"PHASE_FROM\" = TO_TIMESTAMP (:phase_from, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"PHASE_TO\" = TO_TIMESTAMP (:phase_to, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_PHASE削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_PHASEの削除
        String sql = "DELETE FROM MST_PHASE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"PHASE\" = :phase");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("phase", this.phase);
        params.put("yy", this.yy);
        params.put("phase_from", this.phaseFrom);
        params.put("phase_to", this.phaseTo);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
