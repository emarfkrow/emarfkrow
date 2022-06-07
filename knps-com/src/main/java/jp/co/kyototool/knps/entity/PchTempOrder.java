package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PCH_TEMP_ORDER
 *
 * @author emarfkrow
 */
public class PchTempOrder implements IEntity {

    /** TEMP_ORDER_NO */
    private String tempOrderNo;

    /**
     * @return TEMP_ORDER_NO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TEMP_ORDER_NO")
    public String getTempOrderNo() {
        return this.tempOrderNo;
    }

    /**
     * @param o TEMP_ORDER_NO
     */
    public void setTempOrderNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tempOrderNo = String.valueOf(o.toString());
        } else {
            this.tempOrderNo = null;
        }
    }

    /** IRAI_DT */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime iraiDt;

    /**
     * @return IRAI_DT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("IRAI_DT")
    public java.time.LocalDateTime getIraiDt() {
        return this.iraiDt;
    }

    /**
     * @param o IRAI_DT
     */
    public void setIraiDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.iraiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.iraiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.iraiDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.iraiDt = null;
        }
    }

    /** IRAI_EMP_CODE */
    private String iraiEmpCode;

    /**
     * @return IRAI_EMP_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("IRAI_EMP_CODE")
    public String getIraiEmpCode() {
        return this.iraiEmpCode;
    }

    /**
     * @param o IRAI_EMP_CODE
     */
    public void setIraiEmpCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.iraiEmpCode = String.valueOf(o.toString());
        } else {
            this.iraiEmpCode = null;
        }
    }

    /** SUP_CODE */
    private String supCode;

    /**
     * @return SUP_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SUP_CODE")
    public String getSupCode() {
        return this.supCode;
    }

    /**
     * @param o SUP_CODE
     */
    public void setSupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.supCode = String.valueOf(o.toString());
        } else {
            this.supCode = null;
        }
    }

    /** TEMP_SUP_CODE */
    private String tempSupCode;

    /**
     * @return TEMP_SUP_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("TEMP_SUP_CODE")
    public String getTempSupCode() {
        return this.tempSupCode;
    }

    /**
     * @param o TEMP_SUP_CODE
     */
    public void setTempSupCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tempSupCode = String.valueOf(o.toString());
        } else {
            this.tempSupCode = null;
        }
    }

    /** MEMO */
    private String memo;

    /**
     * @return MEMO
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MEMO")
    public String getMemo() {
        return this.memo;
    }

    /**
     * @param o MEMO
     */
    public void setMemo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.memo = String.valueOf(o.toString());
        } else {
            this.memo = null;
        }
    }

    /** PAY_IRAI_DT */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime payIraiDt;

    /**
     * @return PAY_IRAI_DT
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PAY_IRAI_DT")
    public java.time.LocalDateTime getPayIraiDt() {
        return this.payIraiDt;
    }

    /**
     * @param o PAY_IRAI_DT
     */
    public void setPayIraiDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.payIraiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.payIraiDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.payIraiDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.payIraiDt = null;
        }
    }

    /** PAY_IRAI_EMP_CODE */
    private String payIraiEmpCode;

    /**
     * @return PAY_IRAI_EMP_CODE
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PAY_IRAI_EMP_CODE")
    public String getPayIraiEmpCode() {
        return this.payIraiEmpCode;
    }

    /**
     * @param o PAY_IRAI_EMP_CODE
     */
    public void setPayIraiEmpCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.payIraiEmpCode = String.valueOf(o.toString());
        } else {
            this.payIraiEmpCode = null;
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
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CREATE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("TIME_STAMP_CHANGE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CREATE")
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
    @com.fasterxml.jackson.annotation.JsonProperty("USER_ID_CHANGE")
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
     * PCH_TEMP_ORDER照会
     *
     * @param param1 TEMP_ORDER_NO
     * @return PCH_TEMP_ORDER
     */
    public static PchTempOrder get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"TEMP_ORDER_NO\") = TRIM (:temp_order_no)");

        String sql = "SELECT * FROM PCH_TEMP_ORDER WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("temp_order_no", param1);

        return Queries.get(sql, params, PchTempOrder.class);
    }

    /**
     * PCH_TEMP_ORDER追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // TEMP_ORDER_NOの採番処理
        numbering();

        // PCH_TEMP_ORDER_DETの登録
        if (this.pchTempOrderDets != null) {
            for (PchTempOrderDet pchTempOrderDet : this.pchTempOrderDets) {
                pchTempOrderDet.setTempOrderNo(this.getTempOrderNo());
                pchTempOrderDet.insert(now, id);
            }
        }

        // PCH_TEMP_ORDER_EST_FILEの登録
        if (this.pchTempOrderEstFiles != null) {
            for (PchTempOrderEstFile pchTempOrderEstFile : this.pchTempOrderEstFiles) {
                pchTempOrderEstFile.setTempOrderNo(this.getTempOrderNo());
                pchTempOrderEstFile.insert(now, id);
            }
        }

        // PCH_TEMP_ORDERの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"TEMP_ORDER_NO\" -- :temp_order_no");
        nameList.add("\"IRAI_DT\" -- :irai_dt");
        nameList.add("\"IRAI_EMP_CODE\" -- :irai_emp_code");
        nameList.add("\"SUP_CODE\" -- :sup_code");
        nameList.add("\"TEMP_SUP_CODE\" -- :temp_sup_code");
        nameList.add("\"MEMO\" -- :memo");
        nameList.add("\"PAY_IRAI_DT\" -- :pay_irai_dt");
        nameList.add("\"PAY_IRAI_EMP_CODE\" -- :pay_irai_emp_code");
        nameList.add("\"TIME_STAMP_CREATE\" -- :time_stamp_create");
        nameList.add("\"TIME_STAMP_CHANGE\" -- :time_stamp_change");
        nameList.add("\"USER_ID_CREATE\" -- :user_id_create");
        nameList.add("\"USER_ID_CHANGE\" -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PCH_TEMP_ORDER(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":temp_order_no");
        valueList.add("TO_TIMESTAMP (:irai_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":irai_emp_code");
        valueList.add(":sup_code");
        valueList.add(":temp_sup_code");
        valueList.add(":memo");
        valueList.add("TO_TIMESTAMP (:pay_irai_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":pay_irai_emp_code");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** TEMP_ORDER_NOの採番処理 */
    private void numbering() {

        if (this.tempOrderNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"TEMP_ORDER_NO\") IS NULL THEN 0 ELSE MAX(e.\"TEMP_ORDER_NO\") * 1 END + 1, 10, '0') AS \"TEMP_ORDER_NO\" FROM PCH_TEMP_ORDER e WHERE e.\"TEMP_ORDER_NO\" < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("TEMP_ORDER_NO");

        this.setTempOrderNo(o);
    }

    /**
     * PCH_TEMP_ORDER更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PCH_TEMP_ORDER_DETの登録
        if (this.pchTempOrderDets != null) {
            for (PchTempOrderDet pchTempOrderDet : this.pchTempOrderDets) {
                pchTempOrderDet.setTempOrderNo(this.tempOrderNo);
                try {
                    pchTempOrderDet.insert(now, id);
                } catch (Exception e) {
                    pchTempOrderDet.update(now, id);
                }
            }
            this.pchTempOrderDets = null;
            this.referPchTempOrderDets();
            if (this.pchTempOrderDets != null) {
                for (PchTempOrderDet pchTempOrderDet : this.pchTempOrderDets) {
                    if (!pchTempOrderDet.getTimeStampChange().equals(now)) {
                        pchTempOrderDet.delete();
                    }
                }
            }
        }

        // PCH_TEMP_ORDER_EST_FILEの登録
        if (this.pchTempOrderEstFiles != null) {
            for (PchTempOrderEstFile pchTempOrderEstFile : this.pchTempOrderEstFiles) {
                pchTempOrderEstFile.setTempOrderNo(this.tempOrderNo);
                try {
                    pchTempOrderEstFile.insert(now, id);
                } catch (Exception e) {
                    pchTempOrderEstFile.update(now, id);
                }
            }
            this.pchTempOrderEstFiles = null;
            this.referPchTempOrderEstFiles();
            if (this.pchTempOrderEstFiles != null) {
                for (PchTempOrderEstFile pchTempOrderEstFile : this.pchTempOrderEstFiles) {
                    if (!pchTempOrderEstFile.getTimeStampChange().equals(now)) {
                        pchTempOrderEstFile.delete();
                    }
                }
            }
        }

        // PCH_TEMP_ORDERの登録
        String sql = "UPDATE PCH_TEMP_ORDER\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"TEMP_ORDER_NO\" = :temp_order_no");
        setList.add("\"IRAI_DT\" = TO_TIMESTAMP (:irai_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"IRAI_EMP_CODE\" = :irai_emp_code");
        setList.add("\"SUP_CODE\" = :sup_code");
        setList.add("\"TEMP_SUP_CODE\" = :temp_sup_code");
        setList.add("\"MEMO\" = :memo");
        setList.add("\"PAY_IRAI_DT\" = TO_TIMESTAMP (:pay_irai_dt, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"PAY_IRAI_EMP_CODE\" = :pay_irai_emp_code");
        setList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"USER_ID_CHANGE\" = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PCH_TEMP_ORDER削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PCH_TEMP_ORDER_DETの削除
        if (this.pchTempOrderDets != null) {
            for (PchTempOrderDet pchTempOrderDet : this.pchTempOrderDets) {
                pchTempOrderDet.delete();
            }
        }

        // PCH_TEMP_ORDER_EST_FILEの削除
        if (this.pchTempOrderEstFiles != null) {
            for (PchTempOrderEstFile pchTempOrderEstFile : this.pchTempOrderEstFiles) {
                pchTempOrderEstFile.delete();
            }
        }

        // PCH_TEMP_ORDERの削除
        String sql = "DELETE FROM PCH_TEMP_ORDER WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"TEMP_ORDER_NO\") = TRIM (:temp_order_no)");
        whereList.add("\"TIME_STAMP_CHANGE\" = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("temp_order_no", this.tempOrderNo);
        params.put("irai_dt", this.iraiDt);
        params.put("irai_emp_code", this.iraiEmpCode);
        params.put("sup_code", this.supCode);
        params.put("temp_sup_code", this.tempSupCode);
        params.put("memo", this.memo);
        params.put("pay_irai_dt", this.payIraiDt);
        params.put("pay_irai_emp_code", this.payIraiEmpCode);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PCH_TEMP_ORDER_DETのリスト
     */
    private List<PchTempOrderDet> pchTempOrderDets;

    /**
     * @return PCH_TEMP_ORDER_DETのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PchTempOrderDets")
    public List<PchTempOrderDet> getPchTempOrderDets() {
        return this.pchTempOrderDets;
    }

    /**
     * @param list PCH_TEMP_ORDER_DETのリスト
     */
    public void setPchTempOrderDets(final List<PchTempOrderDet> list) {
        this.pchTempOrderDets = list;
    }

    /**
     * @param pchTempOrderDet
     */
    public void addPchTempOrderDets(final PchTempOrderDet pchTempOrderDet) {
        if (this.pchTempOrderDets == null) {
            this.pchTempOrderDets = new ArrayList<PchTempOrderDet>();
        }
        this.pchTempOrderDets.add(pchTempOrderDet);
    }

    /**
     * @return PCH_TEMP_ORDER_DETのリスト
     */
    public List<PchTempOrderDet> referPchTempOrderDets() {
        if (this.pchTempOrderDets == null) {
            this.pchTempOrderDets = PchTempOrder.referPchTempOrderDets(this.tempOrderNo);
        }
        return this.pchTempOrderDets;
    }

    /**
     * @param param1 tempOrderNo
     * @return List<PchTempOrderDet>
     */
    public static List<PchTempOrderDet> referPchTempOrderDets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("temp_order_no = :temp_order_no");

        String sql = "SELECT * FROM PCH_TEMP_ORDER_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("temp_order_no", param1);

        return Queries.select(sql, params, PchTempOrderDet.class);
    }

    /**
     * PCH_TEMP_ORDER_EST_FILEのリスト
     */
    private List<PchTempOrderEstFile> pchTempOrderEstFiles;

    /**
     * @return PCH_TEMP_ORDER_EST_FILEのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PchTempOrderEstFiles")
    public List<PchTempOrderEstFile> getPchTempOrderEstFiles() {
        return this.pchTempOrderEstFiles;
    }

    /**
     * @param list PCH_TEMP_ORDER_EST_FILEのリスト
     */
    public void setPchTempOrderEstFiles(final List<PchTempOrderEstFile> list) {
        this.pchTempOrderEstFiles = list;
    }

    /**
     * @param pchTempOrderEstFile
     */
    public void addPchTempOrderEstFiles(final PchTempOrderEstFile pchTempOrderEstFile) {
        if (this.pchTempOrderEstFiles == null) {
            this.pchTempOrderEstFiles = new ArrayList<PchTempOrderEstFile>();
        }
        this.pchTempOrderEstFiles.add(pchTempOrderEstFile);
    }

    /**
     * @return PCH_TEMP_ORDER_EST_FILEのリスト
     */
    public List<PchTempOrderEstFile> referPchTempOrderEstFiles() {
        if (this.pchTempOrderEstFiles == null) {
            this.pchTempOrderEstFiles = PchTempOrder.referPchTempOrderEstFiles(this.tempOrderNo);
        }
        return this.pchTempOrderEstFiles;
    }

    /**
     * @param param1 tempOrderNo
     * @return List<PchTempOrderEstFile>
     */
    public static List<PchTempOrderEstFile> referPchTempOrderEstFiles(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("temp_order_no = :temp_order_no");

        String sql = "SELECT * FROM PCH_TEMP_ORDER_EST_FILE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("temp_order_no", param1);

        return Queries.select(sql, params, PchTempOrderEstFile.class);
    }
}
