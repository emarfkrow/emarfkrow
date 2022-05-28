package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_STORE_MAINTE_GYO_HED
 *
 * @author emarfkrow
 */
public class PrdStoreMainteGyoHed implements IEntity {

    /** GYO_NO */
    private String gyoNo;

    /**
     * @return GYO_NO
     */
    public String getGyoNo() {
        return this.gyoNo;
    }

    /**
     * @param o GYO_NO
     */
    public void setGyoNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gyoNo = String.valueOf(o.toString());
        } else {
            this.gyoNo = null;
        }
    }

    /** GYO_NAME */
    private String gyoName;

    /**
     * @return GYO_NAME
     */
    public String getGyoName() {
        return this.gyoName;
    }

    /**
     * @param o GYO_NAME
     */
    public void setGyoName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.gyoName = String.valueOf(o.toString());
        } else {
            this.gyoName = null;
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
     * PRD_STORE_MAINTE_GYO_HED照会
     *
     * @param param1 GYO_NO
     * @return PRD_STORE_MAINTE_GYO_HED
     */
    public static PrdStoreMainteGyoHed get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (gyo_no) = TRIM (:gyo_no)");

        String sql = "SELECT * FROM PRD_STORE_MAINTE_GYO_HED WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("gyo_no", param1);

        return Queries.get(sql, params, PrdStoreMainteGyoHed.class);
    }

    /**
     * PRD_STORE_MAINTE_GYO_HED追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // GYO_NOの採番処理
        numbering();

        // PRD_STORE_MAINTE_GYO_DETの登録
        if (this.prdStoreMainteGyoDets != null) {
            for (PrdStoreMainteGyoDet prdStoreMainteGyoDet : this.prdStoreMainteGyoDets) {
                prdStoreMainteGyoDet.setGyoNo(this.getGyoNo());
                prdStoreMainteGyoDet.insert(now, id);
            }
        }

        // PRD_STORE_MAINTE_GYO_HEDの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("gyo_no -- :gyo_no");
        nameList.add("gyo_name -- :gyo_name");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_STORE_MAINTE_GYO_HED(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":gyo_no");
        valueList.add(":gyo_name");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** GYO_NOの採番処理 */
    private void numbering() {

        if (this.gyoNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.GYO_NO) IS NULL THEN 0 ELSE MAX(e.GYO_NO) * 1 END + 1, 3, '0') AS GYO_NO FROM PRD_STORE_MAINTE_GYO_HED e WHERE e.GYO_NO < '999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("GYO_NO");

        this.setGyoNo(o);
    }

    /**
     * PRD_STORE_MAINTE_GYO_HED更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_STORE_MAINTE_GYO_DETの登録
        if (this.prdStoreMainteGyoDets != null) {
            for (PrdStoreMainteGyoDet prdStoreMainteGyoDet : this.prdStoreMainteGyoDets) {
                prdStoreMainteGyoDet.setGyoNo(this.gyoNo);
                try {
                    prdStoreMainteGyoDet.insert(now, id);
                } catch (Exception e) {
                    prdStoreMainteGyoDet.update(now, id);
                }
            }
            this.prdStoreMainteGyoDets = null;
            this.referPrdStoreMainteGyoDets();
            if (this.prdStoreMainteGyoDets != null) {
                for (PrdStoreMainteGyoDet prdStoreMainteGyoDet : this.prdStoreMainteGyoDets) {
                    if (!prdStoreMainteGyoDet.getTimeStampChange().equals(now)) {
                        prdStoreMainteGyoDet.delete();
                    }
                }
            }
        }

        // PRD_STORE_MAINTE_GYO_HEDの登録
        String sql = "UPDATE PRD_STORE_MAINTE_GYO_HED\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("gyo_no = :gyo_no");
        setList.add("gyo_name = :gyo_name");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_STORE_MAINTE_GYO_HED削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_STORE_MAINTE_GYO_DETの削除
        if (this.prdStoreMainteGyoDets != null) {
            for (PrdStoreMainteGyoDet prdStoreMainteGyoDet : this.prdStoreMainteGyoDets) {
                prdStoreMainteGyoDet.delete();
            }
        }

        // PRD_STORE_MAINTE_GYO_HEDの削除
        String sql = "DELETE FROM PRD_STORE_MAINTE_GYO_HED WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (gyo_no) = TRIM (:gyo_no)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("GYO_NO", this.gyoNo);
        params.put("GYO_NAME", this.gyoName);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_STORE_MAINTE_GYO_DETのリスト
     */
    private List<PrdStoreMainteGyoDet> prdStoreMainteGyoDets;

    /**
     * @return PRD_STORE_MAINTE_GYO_DETのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdStoreMainteGyoDets")
    public List<PrdStoreMainteGyoDet> getPrdStoreMainteGyoDets() {
        return this.prdStoreMainteGyoDets;
    }

    /**
     * @param list PRD_STORE_MAINTE_GYO_DETのリスト
     */
    public void setPrdStoreMainteGyoDets(final List<PrdStoreMainteGyoDet> list) {
        this.prdStoreMainteGyoDets = list;
    }

    /**
     * @param prdStoreMainteGyoDet
     */
    public void addPrdStoreMainteGyoDets(final PrdStoreMainteGyoDet prdStoreMainteGyoDet) {
        if (this.prdStoreMainteGyoDets == null) {
            this.prdStoreMainteGyoDets = new ArrayList<PrdStoreMainteGyoDet>();
        }
        this.prdStoreMainteGyoDets.add(prdStoreMainteGyoDet);
    }

    /**
     * @return PRD_STORE_MAINTE_GYO_DETのリスト
     */
    public List<PrdStoreMainteGyoDet> referPrdStoreMainteGyoDets() {
        if (this.prdStoreMainteGyoDets == null) {
            this.prdStoreMainteGyoDets = PrdStoreMainteGyoHed.referPrdStoreMainteGyoDets(this.gyoNo);
        }
        return this.prdStoreMainteGyoDets;
    }

    /**
     * @param param1 gyoNo
     * @return List<PrdStoreMainteGyoDet>
     */
    public static List<PrdStoreMainteGyoDet> referPrdStoreMainteGyoDets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("gyo_no = :gyo_no");

        String sql = "SELECT * FROM PRD_STORE_MAINTE_GYO_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("gyo_no", param1);

        return Queries.select(sql, params, PrdStoreMainteGyoDet.class);
    }
}
