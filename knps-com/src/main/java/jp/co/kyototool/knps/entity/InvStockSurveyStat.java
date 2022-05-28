package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_STOCK_SURVEY_STAT
 *
 * @author emarfkrow
 */
public class InvStockSurveyStat implements IEntity {

    /** REC_NO */
    private String recNo;

    /**
     * @return REC_NO
     */
    public String getRecNo() {
        return this.recNo;
    }

    /**
     * @param o REC_NO
     */
    public void setRecNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.recNo = String.valueOf(o.toString());
        } else {
            this.recNo = null;
        }
    }

    /** YYYY */
    private String yyyy;

    /**
     * @return YYYY
     */
    public String getYyyy() {
        return this.yyyy;
    }

    /**
     * @param o YYYY
     */
    public void setYyyy(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.yyyy = String.valueOf(o.toString());
        } else {
            this.yyyy = null;
        }
    }

    /** MM */
    private String mm;

    /**
     * @return MM
     */
    public String getMm() {
        return this.mm;
    }

    /**
     * @param o MM
     */
    public void setMm(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.mm = String.valueOf(o.toString());
        } else {
            this.mm = null;
        }
    }

    /** SURVEY_STAT */
    private java.math.BigDecimal surveyStat;

    /**
     * @return SURVEY_STAT
     */
    public java.math.BigDecimal getSurveyStat() {
        return this.surveyStat;
    }

    /**
     * @param o SURVEY_STAT
     */
    public void setSurveyStat(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.surveyStat = new java.math.BigDecimal(o.toString());
        } else {
            this.surveyStat = null;
        }
    }

    /** DEVELOP_PRODUCTS_STAT */
    private java.math.BigDecimal developProductsStat;

    /**
     * @return DEVELOP_PRODUCTS_STAT
     */
    public java.math.BigDecimal getDevelopProductsStat() {
        return this.developProductsStat;
    }

    /**
     * @param o DEVELOP_PRODUCTS_STAT
     */
    public void setDevelopProductsStat(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.developProductsStat = new java.math.BigDecimal(o.toString());
        } else {
            this.developProductsStat = null;
        }
    }

    /** DEVELOP_PARTS_STAT */
    private java.math.BigDecimal developPartsStat;

    /**
     * @return DEVELOP_PARTS_STAT
     */
    public java.math.BigDecimal getDevelopPartsStat() {
        return this.developPartsStat;
    }

    /**
     * @param o DEVELOP_PARTS_STAT
     */
    public void setDevelopPartsStat(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.developPartsStat = new java.math.BigDecimal(o.toString());
        } else {
            this.developPartsStat = null;
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
     * INV_STOCK_SURVEY_STAT照会
     *
     * @param param1 REC_NO
     * @return INV_STOCK_SURVEY_STAT
     */
    public static InvStockSurveyStat get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (rec_no) = TRIM (:rec_no)");

        String sql = "SELECT * FROM INV_STOCK_SURVEY_STAT WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("rec_no", param1);

        return Queries.get(sql, params, InvStockSurveyStat.class);
    }

    /**
     * INV_STOCK_SURVEY_STAT追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // REC_NOの採番処理
        numbering();

        // PRD_ORDERPOINT_CONDITIONの登録
        if (this.prdOrderpointCondition != null) {
            this.prdOrderpointCondition.setRecNo(this.getRecNo());
            this.prdOrderpointCondition.insert(now, id);
        }

        // PRD_PRE_STATUS_HEADの登録
        if (this.prdPreStatusHead != null) {
            this.prdPreStatusHead.setRecNo(this.getRecNo());
            this.prdPreStatusHead.insert(now, id);
        }

        // SYS_CLOSE_STATUSの登録
        if (this.sysCloseStatus != null) {
            this.sysCloseStatus.setRecNo(this.getRecNo());
            this.sysCloseStatus.insert(now, id);
        }

        // INV_STOCK_SURVEY_STATの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("rec_no -- :rec_no");
        nameList.add("yyyy -- :yyyy");
        nameList.add("mm -- :mm");
        nameList.add("survey_stat -- :survey_stat");
        nameList.add("develop_products_stat -- :develop_products_stat");
        nameList.add("develop_parts_stat -- :develop_parts_stat");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_STOCK_SURVEY_STAT(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":rec_no");
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":survey_stat");
        valueList.add(":develop_products_stat");
        valueList.add(":develop_parts_stat");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** REC_NOの採番処理 */
    private void numbering() {

        if (this.recNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.REC_NO) IS NULL THEN 0 ELSE MAX(e.REC_NO) * 1 END + 1, 3, '0') AS REC_NO FROM INV_STOCK_SURVEY_STAT e WHERE e.REC_NO < '999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("REC_NO");

        this.setRecNo(o);
    }

    /**
     * INV_STOCK_SURVEY_STAT更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_ORDERPOINT_CONDITIONの登録
        if (this.prdOrderpointCondition != null) {
            prdOrderpointCondition.setRecNo(this.getRecNo());
            try {
                prdOrderpointCondition.insert(now, id);
            } catch (Exception e) {
                prdOrderpointCondition.update(now, id);
            }
        }

        // PRD_PRE_STATUS_HEADの登録
        if (this.prdPreStatusHead != null) {
            prdPreStatusHead.setRecNo(this.getRecNo());
            try {
                prdPreStatusHead.insert(now, id);
            } catch (Exception e) {
                prdPreStatusHead.update(now, id);
            }
        }

        // SYS_CLOSE_STATUSの登録
        if (this.sysCloseStatus != null) {
            sysCloseStatus.setRecNo(this.getRecNo());
            try {
                sysCloseStatus.insert(now, id);
            } catch (Exception e) {
                sysCloseStatus.update(now, id);
            }
        }

        // INV_STOCK_SURVEY_STATの登録
        String sql = "UPDATE INV_STOCK_SURVEY_STAT\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("rec_no = :rec_no");
        setList.add("yyyy = :yyyy");
        setList.add("mm = :mm");
        setList.add("survey_stat = :survey_stat");
        setList.add("develop_products_stat = :develop_products_stat");
        setList.add("develop_parts_stat = :develop_parts_stat");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_STOCK_SURVEY_STAT削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_ORDERPOINT_CONDITIONの削除
        if (this.prdOrderpointCondition != null) {
            this.prdOrderpointCondition.delete();
        }

        // PRD_PRE_STATUS_HEADの削除
        if (this.prdPreStatusHead != null) {
            this.prdPreStatusHead.delete();
        }

        // SYS_CLOSE_STATUSの削除
        if (this.sysCloseStatus != null) {
            this.sysCloseStatus.delete();
        }

        // INV_STOCK_SURVEY_STATの削除
        String sql = "DELETE FROM INV_STOCK_SURVEY_STAT WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (rec_no) = TRIM (:rec_no)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("REC_NO", this.recNo);
        params.put("YYYY", this.yyyy);
        params.put("MM", this.mm);
        params.put("SURVEY_STAT", this.surveyStat);
        params.put("DEVELOP_PRODUCTS_STAT", this.developProductsStat);
        params.put("DEVELOP_PARTS_STAT", this.developPartsStat);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_ORDERPOINT_CONDITION
     */
    private PrdOrderpointCondition prdOrderpointCondition;

    /**
     * @return PRD_ORDERPOINT_CONDITION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdOrderpointCondition")
    public PrdOrderpointCondition getPrdOrderpointCondition() {
        return this.prdOrderpointCondition;
    }

    /**
     * @param p PRD_ORDERPOINT_CONDITION
     */
    public void setPrdOrderpointCondition(final PrdOrderpointCondition p) {
        this.prdOrderpointCondition = p;
    }

    /**
     * @return PRD_ORDERPOINT_CONDITION
     */
    public PrdOrderpointCondition referPrdOrderpointCondition() {
        if (this.prdOrderpointCondition == null) {
            try {
                this.prdOrderpointCondition = PrdOrderpointCondition.get(this.recNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdOrderpointCondition;
    }

    /**
     * PRD_PRE_STATUS_HEAD
     */
    private PrdPreStatusHead prdPreStatusHead;

    /**
     * @return PRD_PRE_STATUS_HEAD
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdPreStatusHead")
    public PrdPreStatusHead getPrdPreStatusHead() {
        return this.prdPreStatusHead;
    }

    /**
     * @param p PRD_PRE_STATUS_HEAD
     */
    public void setPrdPreStatusHead(final PrdPreStatusHead p) {
        this.prdPreStatusHead = p;
    }

    /**
     * @return PRD_PRE_STATUS_HEAD
     */
    public PrdPreStatusHead referPrdPreStatusHead() {
        if (this.prdPreStatusHead == null) {
            try {
                this.prdPreStatusHead = PrdPreStatusHead.get(this.recNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.prdPreStatusHead;
    }

    /**
     * SYS_CLOSE_STATUS
     */
    private SysCloseStatus sysCloseStatus;

    /**
     * @return SYS_CLOSE_STATUS
     */
    @com.fasterxml.jackson.annotation.JsonProperty("SysCloseStatus")
    public SysCloseStatus getSysCloseStatus() {
        return this.sysCloseStatus;
    }

    /**
     * @param p SYS_CLOSE_STATUS
     */
    public void setSysCloseStatus(final SysCloseStatus p) {
        this.sysCloseStatus = p;
    }

    /**
     * @return SYS_CLOSE_STATUS
     */
    public SysCloseStatus referSysCloseStatus() {
        if (this.sysCloseStatus == null) {
            try {
                this.sysCloseStatus = SysCloseStatus.get(this.recNo);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.sysCloseStatus;
    }
}
