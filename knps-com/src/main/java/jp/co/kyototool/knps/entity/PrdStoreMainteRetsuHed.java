package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * PRD_STORE_MAINTE_RETSU_HED
 *
 * @author emarfkrow
 */
public class PrdStoreMainteRetsuHed implements IEntity {

    /** RETSU_NO */
    private String retsuNo;

    /**
     * @return RETSU_NO
     */
    public String getRetsuNo() {
        return this.retsuNo;
    }

    /**
     * @param o RETSU_NO
     */
    public void setRetsuNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.retsuNo = String.valueOf(o.toString());
        } else {
            this.retsuNo = null;
        }
    }

    /** RETSU_NAME */
    private String retsuName;

    /**
     * @return RETSU_NAME
     */
    public String getRetsuName() {
        return this.retsuName;
    }

    /**
     * @param o RETSU_NAME
     */
    public void setRetsuName(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.retsuName = String.valueOf(o.toString());
        } else {
            this.retsuName = null;
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
     * PRD_STORE_MAINTE_RETSU_HED照会
     *
     * @param param1 RETSU_NO
     * @return PRD_STORE_MAINTE_RETSU_HED
     */
    public static PrdStoreMainteRetsuHed get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"RETSU_NO\") = TRIM (:retsu_no)");

        String sql = "SELECT * FROM PRD_STORE_MAINTE_RETSU_HED WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("retsu_no", param1);

        return Queries.get(sql, params, PrdStoreMainteRetsuHed.class);
    }

    /**
     * PRD_STORE_MAINTE_RETSU_HED追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // RETSU_NOの採番処理
        numbering();

        // PRD_STORE_MAINTE_RETSU_DETの登録
        if (this.prdStoreMainteRetsuDets != null) {
            for (PrdStoreMainteRetsuDet prdStoreMainteRetsuDet : this.prdStoreMainteRetsuDets) {
                prdStoreMainteRetsuDet.setRetsuNo(this.getRetsuNo());
                prdStoreMainteRetsuDet.insert(now, id);
            }
        }

        // PRD_STORE_MAINTE_RETSU_HEDの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("retsu_no -- :retsu_no");
        nameList.add("retsu_name -- :retsu_name");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO PRD_STORE_MAINTE_RETSU_HED(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":retsu_no");
        valueList.add(":retsu_name");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        return String.join("\r\n    , ", valueList);
    }

    /** RETSU_NOの採番処理 */
    private void numbering() {

        if (this.retsuNo != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.RETSU_NO) IS NULL THEN 0 ELSE MAX(e.RETSU_NO) * 1 END + 1, 3, '0') AS RETSU_NO FROM PRD_STORE_MAINTE_RETSU_HED e WHERE e.RETSU_NO < '999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("RETSU_NO");

        this.setRetsuNo(o);
    }

    /**
     * PRD_STORE_MAINTE_RETSU_HED更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // PRD_STORE_MAINTE_RETSU_DETの登録
        if (this.prdStoreMainteRetsuDets != null) {
            for (PrdStoreMainteRetsuDet prdStoreMainteRetsuDet : this.prdStoreMainteRetsuDets) {
                prdStoreMainteRetsuDet.setRetsuNo(this.retsuNo);
                try {
                    prdStoreMainteRetsuDet.insert(now, id);
                } catch (Exception e) {
                    prdStoreMainteRetsuDet.update(now, id);
                }
            }
            this.prdStoreMainteRetsuDets = null;
            this.referPrdStoreMainteRetsuDets();
            if (this.prdStoreMainteRetsuDets != null) {
                for (PrdStoreMainteRetsuDet prdStoreMainteRetsuDet : this.prdStoreMainteRetsuDets) {
                    if (!prdStoreMainteRetsuDet.getTimeStampChange().equals(now)) {
                        prdStoreMainteRetsuDet.delete();
                    }
                }
            }
        }

        // PRD_STORE_MAINTE_RETSU_HEDの登録
        String sql = "UPDATE PRD_STORE_MAINTE_RETSU_HED\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("retsu_no = :retsu_no");
        setList.add("retsu_name = :retsu_name");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * PRD_STORE_MAINTE_RETSU_HED削除
     *
     * @return 削除件数
     */
    public int delete() {

        // PRD_STORE_MAINTE_RETSU_DETの削除
        if (this.prdStoreMainteRetsuDets != null) {
            for (PrdStoreMainteRetsuDet prdStoreMainteRetsuDet : this.prdStoreMainteRetsuDets) {
                prdStoreMainteRetsuDet.delete();
            }
        }

        // PRD_STORE_MAINTE_RETSU_HEDの削除
        String sql = "DELETE FROM PRD_STORE_MAINTE_RETSU_HED WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (retsu_no) = TRIM (:retsu_no)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("RETSU_NO", this.retsuNo);
        params.put("RETSU_NAME", this.retsuName);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * PRD_STORE_MAINTE_RETSU_DETのリスト
     */
    private List<PrdStoreMainteRetsuDet> prdStoreMainteRetsuDets;

    /**
     * @return PRD_STORE_MAINTE_RETSU_DETのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("PrdStoreMainteRetsuDets")
    public List<PrdStoreMainteRetsuDet> getPrdStoreMainteRetsuDets() {
        return this.prdStoreMainteRetsuDets;
    }

    /**
     * @param list PRD_STORE_MAINTE_RETSU_DETのリスト
     */
    public void setPrdStoreMainteRetsuDets(final List<PrdStoreMainteRetsuDet> list) {
        this.prdStoreMainteRetsuDets = list;
    }

    /**
     * @param prdStoreMainteRetsuDet
     */
    public void addPrdStoreMainteRetsuDets(final PrdStoreMainteRetsuDet prdStoreMainteRetsuDet) {
        if (this.prdStoreMainteRetsuDets == null) {
            this.prdStoreMainteRetsuDets = new ArrayList<PrdStoreMainteRetsuDet>();
        }
        this.prdStoreMainteRetsuDets.add(prdStoreMainteRetsuDet);
    }

    /**
     * @return PRD_STORE_MAINTE_RETSU_DETのリスト
     */
    public List<PrdStoreMainteRetsuDet> referPrdStoreMainteRetsuDets() {
        if (this.prdStoreMainteRetsuDets == null) {
            this.prdStoreMainteRetsuDets = PrdStoreMainteRetsuHed.referPrdStoreMainteRetsuDets(this.retsuNo);
        }
        return this.prdStoreMainteRetsuDets;
    }

    /**
     * @param param1 retsuNo
     * @return List<PrdStoreMainteRetsuDet>
     */
    public static List<PrdStoreMainteRetsuDet> referPrdStoreMainteRetsuDets(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("retsu_no = :retsu_no");

        String sql = "SELECT * FROM PRD_STORE_MAINTE_RETSU_DET WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("retsu_no", param1);

        return Queries.select(sql, params, PrdStoreMainteRetsuDet.class);
    }
}
