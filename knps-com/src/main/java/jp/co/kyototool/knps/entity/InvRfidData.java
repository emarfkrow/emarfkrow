package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_RFID_DATA
 *
 * @author emarfkrow
 */
public class InvRfidData implements IEntity {

    /** TARGET_KBN */
    private String targetKbn;

    /**
     * @return TARGET_KBN
     */
    public String getTargetKbn() {
        return this.targetKbn;
    }

    /**
     * @param o TARGET_KBN
     */
    public void setTargetKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.targetKbn = String.valueOf(o.toString());
        } else {
            this.targetKbn = null;
        }
    }

    /** TID */
    private String tid;

    /**
     * @return TID
     */
    public String getTid() {
        return this.tid;
    }

    /**
     * @param o TID
     */
    public void setTid(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tid = String.valueOf(o.toString());
        } else {
            this.tid = null;
        }
    }

    /** TAG_DATA */
    private String tagData;

    /**
     * @return TAG_DATA
     */
    public String getTagData() {
        return this.tagData;
    }

    /**
     * @param o TAG_DATA
     */
    public void setTagData(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tagData = String.valueOf(o.toString());
        } else {
            this.tagData = null;
        }
    }

    /** READER_NO */
    private java.math.BigDecimal readerNo;

    /**
     * @return READER_NO
     */
    public java.math.BigDecimal getReaderNo() {
        return this.readerNo;
    }

    /**
     * @param o READER_NO
     */
    public void setReaderNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.readerNo = new java.math.BigDecimal(o.toString());
        } else {
            this.readerNo = null;
        }
    }

    /** ANTENNA_NO */
    private java.math.BigDecimal antennaNo;

    /**
     * @return ANTENNA_NO
     */
    public java.math.BigDecimal getAntennaNo() {
        return this.antennaNo;
    }

    /**
     * @param o ANTENNA_NO
     */
    public void setAntennaNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.antennaNo = new java.math.BigDecimal(o.toString());
        } else {
            this.antennaNo = null;
        }
    }

    /** SPOT_KBN */
    private String spotKbn;

    /**
     * @return SPOT_KBN
     */
    public String getSpotKbn() {
        return this.spotKbn;
    }

    /**
     * @param o SPOT_KBN
     */
    public void setSpotKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.spotKbn = String.valueOf(o.toString());
        } else {
            this.spotKbn = null;
        }
    }

    /** RECIVE_TIME */
    private String reciveTime;

    /**
     * @return RECIVE_TIME
     */
    public String getReciveTime() {
        return this.reciveTime;
    }

    /**
     * @param o RECIVE_TIME
     */
    public void setReciveTime(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.reciveTime = String.valueOf(o.toString());
        } else {
            this.reciveTime = null;
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
     * INV_RFID_DATA照会
     *
     * @return INV_RFID_DATA
     */
    public static InvRfidData get() {

        List<String> whereList = new ArrayList<String>();

        String sql = "SELECT * FROM INV_RFID_DATA WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();

        return Queries.get(sql, params, InvRfidData.class);
    }

    /**
     * INV_RFID_DATA追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // INV_RFID_DATAの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("target_kbn -- :target_kbn");
        nameList.add("tid -- :tid");
        nameList.add("tag_data -- :tag_data");
        nameList.add("reader_no -- :reader_no");
        nameList.add("antenna_no -- :antenna_no");
        nameList.add("spot_kbn -- :spot_kbn");
        nameList.add("recive_time -- :recive_time");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_RFID_DATA(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":target_kbn");
        valueList.add(":tid");
        valueList.add(":tag_data");
        valueList.add(":reader_no");
        valueList.add(":antenna_no");
        valueList.add(":spot_kbn");
        valueList.add(":recive_time");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * INV_RFID_DATA更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_RFID_DATAの登録
        String sql = "UPDATE INV_RFID_DATA\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("target_kbn = :target_kbn");
        setList.add("tid = :tid");
        setList.add("tag_data = :tag_data");
        setList.add("reader_no = :reader_no");
        setList.add("antenna_no = :antenna_no");
        setList.add("spot_kbn = :spot_kbn");
        setList.add("recive_time = :recive_time");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_RFID_DATA削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_RFID_DATAの削除
        String sql = "DELETE FROM INV_RFID_DATA WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("TARGET_KBN", this.targetKbn);
        params.put("TID", this.tid);
        params.put("TAG_DATA", this.tagData);
        params.put("READER_NO", this.readerNo);
        params.put("ANTENNA_NO", this.antennaNo);
        params.put("SPOT_KBN", this.spotKbn);
        params.put("RECIVE_TIME", this.reciveTime);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
