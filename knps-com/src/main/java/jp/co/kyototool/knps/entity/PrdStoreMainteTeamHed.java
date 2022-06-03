package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_STORE_MAINTE_TEAM_HED
 *
 * @author emarfkrow
 */
public class PrdStoreMainteTeamHed implements IEntity {

    /** MFG_TEAM_CODE */
    private String mfgTeamCode;

    /**
     * @return MFG_TEAM_CODE
     */
    public String getMfgTeamCode() {
        return this.mfgTeamCode;
    }

    /**
     * @param o MFG_TEAM_CODE
     */
    public void setMfgTeamCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mfgTeamCode = String.valueOf(o.toString());
        } else {
            this.mfgTeamCode = null;
        }
    }

    /** MFG_TEAM_NAME */
    private String mfgTeamName;

    /**
     * @return MFG_TEAM_NAME
     */
    public String getMfgTeamName() {
        return this.mfgTeamName;
    }

    /**
     * @param o MFG_TEAM_NAME
     */
    public void setMfgTeamName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mfgTeamName = String.valueOf(o.toString());
        } else {
            this.mfgTeamName = null;
        }
    }

    /** TIME_STAMP_CREATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampCreate;

    /**
     * @return TIME_STAMP_CREATE
     */
    public java.time.LocalDateTime getTimeStampCreate() {
        return this.timeStampCreate;
    }

    /**
     * @param o TIME_STAMP_CREATE
     */
    public void setTimeStampCreate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampCreate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampCreate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampCreate = null;
        }
    }

    /** TIME_STAMP_CHANGE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime timeStampChange;

    /**
     * @return TIME_STAMP_CHANGE
     */
    public java.time.LocalDateTime getTimeStampChange() {
        return this.timeStampChange;
    }

    /**
     * @param o TIME_STAMP_CHANGE
     */
    public void setTimeStampChange(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.timeStampChange = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.timeStampChange = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.timeStampChange = null;
        }
    }

    /** USER_ID_CREATE */
    private String userIdCreate;

    /**
     * @return USER_ID_CREATE
     */
    public String getUserIdCreate() {
        return this.userIdCreate;
    }

    /**
     * @param o USER_ID_CREATE
     */
    public void setUserIdCreate(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdCreate = String.valueOf(o.toString());
        } else {
            this.userIdCreate = null;
        }
    }

    /** USER_ID_CHANGE */
    private String userIdChange;

    /**
     * @return USER_ID_CHANGE
     */
    public String getUserIdChange() {
        return this.userIdChange;
    }

    /**
     * @param o USER_ID_CHANGE
     */
    public void setUserIdChange(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.userIdChange = String.valueOf(o.toString());
        } else {
            this.userIdChange = null;
        }
    }

    /**
     * PRD_STORE_MAINTE_TEAM_HED照会
     *
     * @param param1 MFG_TEAM_CODE
     * @return PRD_STORE_MAINTE_TEAM_HED
     */
    public static PrdStoreMainteTeamHed get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"MFG_TEAM_CODE\") = TRIM (:mfg_team_code)");

        String sql = "SELECT * FROM PRD_STORE_MAINTE_TEAM_HED WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("mfg_team_code", param1);

        return Queries.get(sql, params, PrdStoreMainteTeamHed.class);
    }

    /**
     * PRD_STORE_MAINTE_TEAM_HED追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MFG_TEAM_CODEの採番処理
        numbering();

        // PRD_STORE_MAINTE_TEAM_DETの登録
        if (this.prdStoreMainteTeamDets != null) {
            for (PrdStoreMainteTeamDet prdStoreMainteTeamDet : this.prdStoreMainteTeamDets) {
                prdStoreMainteTeamDet.setMfgTeamCode(this.getMfgTeamCode());
                prdStoreMainteTeamDet.insert(now, id);
            }
        }

        // PRD_STORE_MAINTE_TEAM_HEDの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("mfg_team_code -- :mfg_team_code");
        nameList.add("mfg_team_name -- :mfg_team_name");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_STORE_MAINTE_TEAM_HED(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":mfg_team_code");
        valueList.add(":mfg_team_name");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** MFG_TEAM_CODEの採番処理 */
    private void numbering() {

        if (this.mfgTeamCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.MFG_TEAM_CODE) IS NULL THEN 0 ELSE MAX(e.MFG_TEAM_CODE) * 1 END + 1, 10, '0') AS MFG_TEAM_CODE FROM PRD_STORE_MAINTE_TEAM_HED e WHERE e.MFG_TEAM_CODE < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("MFG_TEAM_CODE");

        this.setMfgTeamCode(o);
    }

    /**
     * PRD_STORE_MAINTE_TEAM_HED更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_STORE_MAINTE_TEAM_DETの登録
        if (this.prdStoreMainteTeamDets != null) {
            for (PrdStoreMainteTeamDet prdStoreMainteTeamDet : this.prdStoreMainteTeamDets) {
                prdStoreMainteTeamDet.setMfgTeamCode(this.mfgTeamCode);
                try {
                    prdStoreMainteTeamDet.insert(now, id);
                } catch (Exception e) {
                    prdStoreMainteTeamDet.update(now, id);
                }
            }
            this.prdStoreMainteTeamDets = null;
            this.referPrdStoreMainteTeamDets();
            if (this.prdStoreMainteTeamDets != null) {
                for (PrdStoreMainteTeamDet prdStoreMainteTeamDet : this.prdStoreMainteTeamDets) {
                    if (!prdStoreMainteTeamDet.getTimeStampChange().equals(now)) {
                        prdStoreMainteTeamDet.delete();
                    }
                }
            }
        }

        // PRD_STORE_MAINTE_TEAM_HEDの登録
        String sql = "UPDATE PRD_STORE_MAINTE_TEAM_HED\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("mfg_team_code = :mfg_team_code");
        setList.add("mfg_team_name = :mfg_team_name");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_STORE_MAINTE_TEAM_HED削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_STORE_MAINTE_TEAM_DETの削除
        if (this.prdStoreMainteTeamDets != null) {
            for (PrdStoreMainteTeamDet prdStoreMainteTeamDet : this.prdStoreMainteTeamDets) {
                prdStoreMainteTeamDet.delete();
            }
        }

        // PRD_STORE_MAINTE_TEAM_HEDの削除
        String sql = "DELETE FROM PRD_STORE_MAINTE_TEAM_HED WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (mfg_team_code) = TRIM (:mfg_team_code)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("MFG_TEAM_CODE", this.mfgTeamCode);
        params.put("MFG_TEAM_NAME", this.mfgTeamName);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_STORE_MAINTE_TEAM_DETのリスト
     */
    private List<PrdStoreMainteTeamDet> prdStoreMainteTeamDets;

    /**
     * @return PRD_STORE_MAINTE_TEAM_DETのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdStoreMainteTeamDets")
    public List<PrdStoreMainteTeamDet> getPrdStoreMainteTeamDets() {
        return this.prdStoreMainteTeamDets;
    }

    /**
     * @param list PRD_STORE_MAINTE_TEAM_DETのリスト
     */
    public void setPrdStoreMainteTeamDets(final List<PrdStoreMainteTeamDet> list) {
        this.prdStoreMainteTeamDets = list;
    }

    /**
     * @param prdStoreMainteTeamDet
     */
    public void addPrdStoreMainteTeamDets(final PrdStoreMainteTeamDet prdStoreMainteTeamDet) {
        if (this.prdStoreMainteTeamDets == null) {
            this.prdStoreMainteTeamDets = new ArrayList<PrdStoreMainteTeamDet>();
        }
        this.prdStoreMainteTeamDets.add(prdStoreMainteTeamDet);
    }

    /**
     * @return PRD_STORE_MAINTE_TEAM_DETのリスト
     */
    public List<PrdStoreMainteTeamDet> referPrdStoreMainteTeamDets() {
        if (this.prdStoreMainteTeamDets == null) {
            this.prdStoreMainteTeamDets = PrdStoreMainteTeamHed.referPrdStoreMainteTeamDets(this.mfgTeamCode);
        }
        return this.prdStoreMainteTeamDets;
    }

    /**
     * @param param1 mfgTeamCode
     * @return List<PrdStoreMainteTeamDet>
     */
    public static List<PrdStoreMainteTeamDet> referPrdStoreMainteTeamDets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("mfg_team_code = :mfg_team_code");

        String sql = "SELECT * FROM PRD_STORE_MAINTE_TEAM_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("mfg_team_code", param1);

        return Queries.select(sql, params, PrdStoreMainteTeamDet.class);
    }
}
