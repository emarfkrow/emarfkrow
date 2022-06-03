package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_CODE
 *
 * @author emarfkrow
 */
public class MstCode implements IEntity {

    /** CODE_NM */
    private String codeNm;

    /**
     * @return CODE_NM
     */
    public String getCodeNm() {
        return this.codeNm;
    }

    /**
     * @param o CODE_NM
     */
    public void setCodeNm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.codeNm = String.valueOf(o.toString());
        } else {
            this.codeNm = null;
        }
    }

    /** CODE_MEI */
    private String codeMei;

    /**
     * @return CODE_MEI
     */
    public String getCodeMei() {
        return this.codeMei;
    }

    /**
     * @param o CODE_MEI
     */
    public void setCodeMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.codeMei = String.valueOf(o.toString());
        } else {
            this.codeMei = null;
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
     * MST_CODE照会
     *
     * @param param1 CODE_NM
     * @return MST_CODE
     */
    public static MstCode get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"CODE_NM\" = :code_nm");

        String sql = "SELECT * FROM MST_CODE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("code_nm", param1);

        return Queries.get(sql, params, MstCode.class);
    }

    /**
     * MST_CODE追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_CODE_VALUEの登録
        if (this.mstCodeValues != null) {
            for (MstCodeValue mstCodeValue : this.mstCodeValues) {
                mstCodeValue.setCodeNm(this.getCodeNm());
                mstCodeValue.insert(now, id);
            }
        }

        // MST_CODEの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("code_nm -- :code_nm");
        nameList.add("code_mei -- :code_mei");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_CODE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":code_nm");
        valueList.add(":code_mei");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_CODE更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_CODE_VALUEの登録
        if (this.mstCodeValues != null) {
            for (MstCodeValue mstCodeValue : this.mstCodeValues) {
                mstCodeValue.setCodeNm(this.codeNm);
                try {
                    mstCodeValue.insert(now, id);
                } catch (Exception e) {
                    mstCodeValue.update(now, id);
                }
            }
            this.mstCodeValues = null;
            this.referMstCodeValues();
            if (this.mstCodeValues != null) {
                for (MstCodeValue mstCodeValue : this.mstCodeValues) {
                    if (!mstCodeValue.getTimeStampChange().equals(now)) {
                        mstCodeValue.delete();
                    }
                }
            }
        }

        // MST_CODEの登録
        String sql = "UPDATE MST_CODE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("code_nm = :code_nm");
        setList.add("code_mei = :code_mei");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_CODE削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_CODE_VALUEの削除
        if (this.mstCodeValues != null) {
            for (MstCodeValue mstCodeValue : this.mstCodeValues) {
                mstCodeValue.delete();
            }
        }

        // MST_CODEの削除
        String sql = "DELETE FROM MST_CODE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("code_nm = :code_nm");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("CODE_NM", this.codeNm);
        params.put("CODE_MEI", this.codeMei);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MST_CODE_VALUEのリスト
     */
    private List<MstCodeValue> mstCodeValues;

    /**
     * @return MST_CODE_VALUEのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstCodeValues")
    public List<MstCodeValue> getMstCodeValues() {
        return this.mstCodeValues;
    }

    /**
     * @param list MST_CODE_VALUEのリスト
     */
    public void setMstCodeValues(final List<MstCodeValue> list) {
        this.mstCodeValues = list;
    }

    /**
     * @param mstCodeValue
     */
    public void addMstCodeValues(final MstCodeValue mstCodeValue) {
        if (this.mstCodeValues == null) {
            this.mstCodeValues = new ArrayList<MstCodeValue>();
        }
        this.mstCodeValues.add(mstCodeValue);
    }

    /**
     * @return MST_CODE_VALUEのリスト
     */
    public List<MstCodeValue> referMstCodeValues() {
        if (this.mstCodeValues == null) {
            this.mstCodeValues = MstCode.referMstCodeValues(this.codeNm);
        }
        return this.mstCodeValues;
    }

    /**
     * @param param1 codeNm
     * @return List<MstCodeValue>
     */
    public static List<MstCodeValue> referMstCodeValues(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("code_nm = :code_nm");

        String sql = "SELECT * FROM MST_CODE_VALUE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("code_nm", param1);

        return Queries.select(sql, params, MstCodeValue.class);
    }
}
