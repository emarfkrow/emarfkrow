package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * INV_SURVEY_RESULT_LOC
 *
 * @author emarfkrow
 */
public class InvSurveyResultLoc implements IEntity {

    /** LOCATION_CODE */
    private String locationCode;

    /**
     * @return LOCATION_CODE
     */
    public String getLocationCode() {
        return this.locationCode;
    }

    /**
     * @param o LOCATION_CODE
     */
    public void setLocationCode(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.locationCode = String.valueOf(o.toString());
        } else {
            this.locationCode = null;
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

    /** HINBAN */
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return this.hinban;
    }

    /**
     * @param o HINBAN
     */
    public void setHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.hinban = String.valueOf(o.toString());
        } else {
            this.hinban = null;
        }
    }

    /** STOCK */
    private java.math.BigDecimal stock;

    /**
     * @return STOCK
     */
    public java.math.BigDecimal getStock() {
        return this.stock;
    }

    /**
     * @param o STOCK
     */
    public void setStock(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.stock = new java.math.BigDecimal(o.toString());
        } else {
            this.stock = null;
        }
    }

    /** DECISION_KBN */
    private java.math.BigDecimal decisionKbn;

    /**
     * @return DECISION_KBN
     */
    public java.math.BigDecimal getDecisionKbn() {
        return this.decisionKbn;
    }

    /**
     * @param o DECISION_KBN
     */
    public void setDecisionKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.decisionKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.decisionKbn = null;
        }
    }

    /** ENTRY_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime entryDate;

    /**
     * @return ENTRY_DATE
     */
    public java.time.LocalDateTime getEntryDate() {
        return this.entryDate;
    }

    /**
     * @param o ENTRY_DATE
     */
    public void setEntryDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.entryDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.entryDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entryDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.entryDate = null;
        }
    }

    /** REGISTRANT */
    private String registrant;

    /**
     * @return REGISTRANT
     */
    public String getRegistrant() {
        return this.registrant;
    }

    /**
     * @param o REGISTRANT
     */
    public void setRegistrant(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.registrant = String.valueOf(o.toString());
        } else {
            this.registrant = null;
        }
    }

    /** OUTPUT_STATUS */
    private java.math.BigDecimal outputStatus;

    /**
     * @return OUTPUT_STATUS
     */
    public java.math.BigDecimal getOutputStatus() {
        return this.outputStatus;
    }

    /**
     * @param o OUTPUT_STATUS
     */
    public void setOutputStatus(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.outputStatus = new java.math.BigDecimal(o.toString());
        } else {
            this.outputStatus = null;
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

    /** SHUKEI_TANI_MEI */
    private String shukeiTaniMei;

    /**
     * @return SHUKEI_TANI_MEI
     */
    public String getShukeiTaniMei() {
        return this.shukeiTaniMei;
    }

    /**
     * @param o SHUKEI_TANI_MEI
     */
    public void setShukeiTaniMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shukeiTaniMei = String.valueOf(o.toString());
        } else {
            this.shukeiTaniMei = null;
        }
    }

    /**
     * INV_SURVEY_RESULT_LOC照会
     *
     * @param param1 LOCATION_CODE
     * @return INV_SURVEY_RESULT_LOC
     */
    public static InvSurveyResultLoc get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"LOCATION_CODE\") = TRIM (:location_code)");

        String sql = "SELECT * FROM INV_SURVEY_RESULT_LOC WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("location_code", param1);

        return Queries.get(sql, params, InvSurveyResultLoc.class);
    }

    /**
     * INV_SURVEY_RESULT_LOC追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // LOCATION_CODEの採番処理
        numbering();

        // INV_INVENTORYの登録
        if (this.invInventorys != null) {
            for (InvInventory invInventory : this.invInventorys) {
                invInventory.setLocationCode(this.getLocationCode());
                invInventory.insert(now, id);
            }
        }

        // INV_SURVEY_RESULT_OTHERの登録
        if (this.invSurveyResultOthers != null) {
            for (InvSurveyResultOther invSurveyResultOther : this.invSurveyResultOthers) {
                invSurveyResultOther.setLocationCode(this.getLocationCode());
                invSurveyResultOther.insert(now, id);
            }
        }

        // MST_LOCATIONの登録
        if (this.mstLocation != null) {
            this.mstLocation.setLocationCode(this.getLocationCode());
            this.mstLocation.insert(now, id);
        }

        // INV_SURVEY_RESULT_LOCの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("location_code -- :location_code");
        nameList.add("yyyy -- :yyyy");
        nameList.add("mm -- :mm");
        nameList.add("hinban -- :hinban");
        nameList.add("stock -- :stock");
        nameList.add("decision_kbn -- :decision_kbn");
        nameList.add("entry_date -- :entry_date");
        nameList.add("registrant -- :registrant");
        nameList.add("output_status -- :output_status");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("shukei_tani_mei -- :shukei_tani_mei");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO INV_SURVEY_RESULT_LOC(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":location_code");
        valueList.add(":yyyy");
        valueList.add(":mm");
        valueList.add(":hinban");
        valueList.add(":stock");
        valueList.add(":decision_kbn");
        valueList.add("TO_TIMESTAMP (:entry_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":registrant");
        valueList.add(":output_status");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":shukei_tani_mei");
        return String.join("\r\n    , ", valueList);
    }

    /** LOCATION_CODEの採番処理 */
    private void numbering() {

        if (this.locationCode != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.LOCATION_CODE) IS NULL THEN 0 ELSE MAX(e.LOCATION_CODE) * 1 END + 1, 10, '0') AS LOCATION_CODE FROM INV_SURVEY_RESULT_LOC e WHERE e.LOCATION_CODE < '9999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("LOCATION_CODE");

        this.setLocationCode(o);
    }

    /**
     * INV_SURVEY_RESULT_LOC更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_INVENTORYの登録
        if (this.invInventorys != null) {
            for (InvInventory invInventory : this.invInventorys) {
                invInventory.setLocationCode(this.locationCode);
                try {
                    invInventory.insert(now, id);
                } catch (Exception e) {
                    invInventory.update(now, id);
                }
            }
            this.invInventorys = null;
            this.referInvInventorys();
            if (this.invInventorys != null) {
                for (InvInventory invInventory : this.invInventorys) {
                    if (!invInventory.getTimeStampChange().equals(now)) {
                        invInventory.delete();
                    }
                }
            }
        }

        // INV_SURVEY_RESULT_OTHERの登録
        if (this.invSurveyResultOthers != null) {
            for (InvSurveyResultOther invSurveyResultOther : this.invSurveyResultOthers) {
                invSurveyResultOther.setLocationCode(this.locationCode);
                try {
                    invSurveyResultOther.insert(now, id);
                } catch (Exception e) {
                    invSurveyResultOther.update(now, id);
                }
            }
            this.invSurveyResultOthers = null;
            this.referInvSurveyResultOthers();
            if (this.invSurveyResultOthers != null) {
                for (InvSurveyResultOther invSurveyResultOther : this.invSurveyResultOthers) {
                    if (!invSurveyResultOther.getTimeStampChange().equals(now)) {
                        invSurveyResultOther.delete();
                    }
                }
            }
        }

        // MST_LOCATIONの登録
        if (this.mstLocation != null) {
            mstLocation.setLocationCode(this.getLocationCode());
            try {
                mstLocation.insert(now, id);
            } catch (Exception e) {
                mstLocation.update(now, id);
            }
        }

        // INV_SURVEY_RESULT_LOCの登録
        String sql = "UPDATE INV_SURVEY_RESULT_LOC\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("location_code = :location_code");
        setList.add("yyyy = :yyyy");
        setList.add("mm = :mm");
        setList.add("hinban = :hinban");
        setList.add("stock = :stock");
        setList.add("decision_kbn = :decision_kbn");
        setList.add("entry_date = TO_TIMESTAMP (:entry_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("registrant = :registrant");
        setList.add("output_status = :output_status");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("shukei_tani_mei = :shukei_tani_mei");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * INV_SURVEY_RESULT_LOC削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_INVENTORYの削除
        if (this.invInventorys != null) {
            for (InvInventory invInventory : this.invInventorys) {
                invInventory.delete();
            }
        }

        // INV_SURVEY_RESULT_OTHERの削除
        if (this.invSurveyResultOthers != null) {
            for (InvSurveyResultOther invSurveyResultOther : this.invSurveyResultOthers) {
                invSurveyResultOther.delete();
            }
        }

        // MST_LOCATIONの削除
        if (this.mstLocation != null) {
            this.mstLocation.delete();
        }

        // INV_SURVEY_RESULT_LOCの削除
        String sql = "DELETE FROM INV_SURVEY_RESULT_LOC WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (location_code) = TRIM (:location_code)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("LOCATION_CODE", this.locationCode);
        params.put("YYYY", this.yyyy);
        params.put("MM", this.mm);
        params.put("HINBAN", this.hinban);
        params.put("STOCK", this.stock);
        params.put("DECISION_KBN", this.decisionKbn);
        params.put("ENTRY_DATE", this.entryDate);
        params.put("REGISTRANT", this.registrant);
        params.put("OUTPUT_STATUS", this.outputStatus);
        params.put("SHUKEI_TANI_MEI", this.shukeiTaniMei);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MST_LOCATION
     */
    private MstLocation mstLocation;

    /**
     * @return MST_LOCATION
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstLocation")
    public MstLocation getMstLocation() {
        return this.mstLocation;
    }

    /**
     * @param p MST_LOCATION
     */
    public void setMstLocation(final MstLocation p) {
        this.mstLocation = p;
    }

    /**
     * @return MST_LOCATION
     */
    public MstLocation referMstLocation() {
        if (this.mstLocation == null) {
            try {
                this.mstLocation = MstLocation.get(this.locationCode);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mstLocation;
    }

    /**
     * INV_INVENTORYのリスト
     */
    private List<InvInventory> invInventorys;

    /**
     * @return INV_INVENTORYのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("InvInventorys")
    public List<InvInventory> getInvInventorys() {
        return this.invInventorys;
    }

    /**
     * @param list INV_INVENTORYのリスト
     */
    public void setInvInventorys(final List<InvInventory> list) {
        this.invInventorys = list;
    }

    /**
     * @param invInventory
     */
    public void addInvInventorys(final InvInventory invInventory) {
        if (this.invInventorys == null) {
            this.invInventorys = new ArrayList<InvInventory>();
        }
        this.invInventorys.add(invInventory);
    }

    /**
     * @return INV_INVENTORYのリスト
     */
    public List<InvInventory> referInvInventorys() {
        if (this.invInventorys == null) {
            this.invInventorys = InvSurveyResultLoc.referInvInventorys(this.locationCode);
        }
        return this.invInventorys;
    }

    /**
     * @param param1 locationCode
     * @return List<InvInventory>
     */
    public static List<InvInventory> referInvInventorys(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("location_code = :location_code");

        String sql = "SELECT * FROM INV_INVENTORY WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("location_code", param1);

        return Queries.select(sql, params, InvInventory.class);
    }

    /**
     * INV_SURVEY_RESULT_OTHERのリスト
     */
    private List<InvSurveyResultOther> invSurveyResultOthers;

    /**
     * @return INV_SURVEY_RESULT_OTHERのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("InvSurveyResultOthers")
    public List<InvSurveyResultOther> getInvSurveyResultOthers() {
        return this.invSurveyResultOthers;
    }

    /**
     * @param list INV_SURVEY_RESULT_OTHERのリスト
     */
    public void setInvSurveyResultOthers(final List<InvSurveyResultOther> list) {
        this.invSurveyResultOthers = list;
    }

    /**
     * @param invSurveyResultOther
     */
    public void addInvSurveyResultOthers(final InvSurveyResultOther invSurveyResultOther) {
        if (this.invSurveyResultOthers == null) {
            this.invSurveyResultOthers = new ArrayList<InvSurveyResultOther>();
        }
        this.invSurveyResultOthers.add(invSurveyResultOther);
    }

    /**
     * @return INV_SURVEY_RESULT_OTHERのリスト
     */
    public List<InvSurveyResultOther> referInvSurveyResultOthers() {
        if (this.invSurveyResultOthers == null) {
            this.invSurveyResultOthers = InvSurveyResultLoc.referInvSurveyResultOthers(this.locationCode);
        }
        return this.invSurveyResultOthers;
    }

    /**
     * @param param1 locationCode
     * @return List<InvSurveyResultOther>
     */
    public static List<InvSurveyResultOther> referInvSurveyResultOthers(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("location_code = :location_code");

        String sql = "SELECT * FROM INV_SURVEY_RESULT_OTHER WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("location_code", param1);

        return Queries.select(sql, params, InvSurveyResultOther.class);
    }
}
