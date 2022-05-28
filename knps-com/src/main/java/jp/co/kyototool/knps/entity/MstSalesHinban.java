package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SALES_HINBAN
 *
 * @author emarfkrow
 */
public class MstSalesHinban implements IEntity {

    /** SALES_HINBAN */
    private String salesHinban;

    /**
     * @return SALES_HINBAN
     */
    public String getSalesHinban() {
        return this.salesHinban;
    }

    /**
     * @param o SALES_HINBAN
     */
    public void setSalesHinban(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.salesHinban = String.valueOf(o.toString());
        } else {
            this.salesHinban = null;
        }
    }

    /** COMP_KBN */
    private java.math.BigDecimal compKbn;

    /**
     * @return COMP_KBN
     */
    public java.math.BigDecimal getCompKbn() {
        return this.compKbn;
    }

    /**
     * @param o COMP_KBN
     */
    public void setCompKbn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.compKbn = new java.math.BigDecimal(o.toString());
        } else {
            this.compKbn = null;
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

    /** DELETE_FLAG */
    private java.math.BigDecimal deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public java.math.BigDecimal getDeleteFlag() {
        return this.deleteFlag;
    }

    /**
     * @param o DELETE_FLAG
     */
    public void setDeleteFlag(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.deleteFlag = new java.math.BigDecimal(o.toString());
        } else {
            this.deleteFlag = null;
        }
    }

    /**
     * MST_SALES_HINBAN照会
     *
     * @param param1 SALES_HINBAN
     * @return MST_SALES_HINBAN
     */
    public static MstSalesHinban get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (sales_hinban) = TRIM (:sales_hinban)");

        String sql = "SELECT * FROM MST_SALES_HINBAN WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sales_hinban", param1);

        return Queries.get(sql, params, MstSalesHinban.class);
    }

    /**
     * MST_SALES_HINBAN追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // SALES_HINBANの採番処理
        numbering();

        // INV_SALES_INVENTORYの登録
        if (this.invSalesInventorys != null) {
            for (InvSalesInventory invSalesInventory : this.invSalesInventorys) {
                invSalesInventory.setSalesHinban(this.getSalesHinban());
                invSalesInventory.insert(now, id);
            }
        }

        // MST_SALES_HINBAN_MASTERの登録
        if (this.mstSalesHinbanMaster != null) {
            this.mstSalesHinbanMaster.setSalesHinban(this.getSalesHinban());
            this.mstSalesHinbanMaster.insert(now, id);
        }

        // MST_SALES_HINBANの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("sales_hinban -- :sales_hinban");
        nameList.add("comp_kbn -- :comp_kbn");
        nameList.add("time_stamp_create -- :time_stamp_create");
        nameList.add("time_stamp_change -- :time_stamp_change");
        nameList.add("user_id_create -- :user_id_create");
        nameList.add("user_id_change -- :user_id_change");
        nameList.add("delete_flag -- :delete_flag");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SALES_HINBAN(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sales_hinban");
        valueList.add(":comp_kbn");
        valueList.add("TO_TIMESTAMP (:time_stamp_create, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add("TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":user_id_create");
        valueList.add(":user_id_change");
        valueList.add(":delete_flag");
        return String.join("\r\n    , ", valueList);
    }

    /** SALES_HINBANの採番処理 */
    private void numbering() {

        if (this.salesHinban != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.SALES_HINBAN) IS NULL THEN 0 ELSE MAX(e.SALES_HINBAN) * 1 END + 1, 20, '0') AS SALES_HINBAN FROM MST_SALES_HINBAN e WHERE e.SALES_HINBAN < '99999999999999999999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SALES_HINBAN");

        this.setSalesHinban(o);
    }

    /**
     * MST_SALES_HINBAN更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // INV_SALES_INVENTORYの登録
        if (this.invSalesInventorys != null) {
            for (InvSalesInventory invSalesInventory : this.invSalesInventorys) {
                invSalesInventory.setSalesHinban(this.salesHinban);
                try {
                    invSalesInventory.insert(now, id);
                } catch (Exception e) {
                    invSalesInventory.update(now, id);
                }
            }
            this.invSalesInventorys = null;
            this.referInvSalesInventorys();
            if (this.invSalesInventorys != null) {
                for (InvSalesInventory invSalesInventory : this.invSalesInventorys) {
                    if (!invSalesInventory.getTimeStampChange().equals(now)) {
                        invSalesInventory.delete();
                    }
                }
            }
        }

        // MST_SALES_HINBAN_MASTERの登録
        if (this.mstSalesHinbanMaster != null) {
            mstSalesHinbanMaster.setSalesHinban(this.getSalesHinban());
            try {
                mstSalesHinbanMaster.insert(now, id);
            } catch (Exception e) {
                mstSalesHinbanMaster.update(now, id);
            }
        }

        // MST_SALES_HINBANの登録
        String sql = "UPDATE MST_SALES_HINBAN\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("sales_hinban = :sales_hinban");
        setList.add("comp_kbn = :comp_kbn");
        setList.add("time_stamp_change = TO_TIMESTAMP (:time_stamp_change, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("user_id_change = :user_id_change");
        setList.add("delete_flag = :delete_flag");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SALES_HINBAN削除
     *
     * @return 削除件数
     */
    public int delete() {

        // INV_SALES_INVENTORYの削除
        if (this.invSalesInventorys != null) {
            for (InvSalesInventory invSalesInventory : this.invSalesInventorys) {
                invSalesInventory.delete();
            }
        }

        // MST_SALES_HINBAN_MASTERの削除
        if (this.mstSalesHinbanMaster != null) {
            this.mstSalesHinbanMaster.delete();
        }

        // MST_SALES_HINBANの削除
        String sql = "DELETE FROM MST_SALES_HINBAN WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (sales_hinban) = TRIM (:sales_hinban)");
        whereList.add("time_stamp_change = TO_TIMESTAMP ('" + this.timeStampChange + "', 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("SALES_HINBAN", this.salesHinban);
        params.put("COMP_KBN", this.compKbn);
        params.put("DELETE_FLAG", this.deleteFlag);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }

    /**
     * MST_SALES_HINBAN_MASTER
     */
    private MstSalesHinbanMaster mstSalesHinbanMaster;

    /**
     * @return MST_SALES_HINBAN_MASTER
     */
    @com.fasterxml.jackson.annotation.JsonProperty("MstSalesHinbanMaster")
    public MstSalesHinbanMaster getMstSalesHinbanMaster() {
        return this.mstSalesHinbanMaster;
    }

    /**
     * @param p MST_SALES_HINBAN_MASTER
     */
    public void setMstSalesHinbanMaster(final MstSalesHinbanMaster p) {
        this.mstSalesHinbanMaster = p;
    }

    /**
     * @return MST_SALES_HINBAN_MASTER
     */
    public MstSalesHinbanMaster referMstSalesHinbanMaster() {
        if (this.mstSalesHinbanMaster == null) {
            try {
                this.mstSalesHinbanMaster = MstSalesHinbanMaster.get(this.salesHinban);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.mstSalesHinbanMaster;
    }

    /**
     * INV_SALES_INVENTORYのリスト
     */
    private List<InvSalesInventory> invSalesInventorys;

    /**
     * @return INV_SALES_INVENTORYのリスト
     */
    @com.fasterxml.jackson.annotation.JsonProperty("InvSalesInventorys")
    public List<InvSalesInventory> getInvSalesInventorys() {
        return this.invSalesInventorys;
    }

    /**
     * @param list INV_SALES_INVENTORYのリスト
     */
    public void setInvSalesInventorys(final List<InvSalesInventory> list) {
        this.invSalesInventorys = list;
    }

    /**
     * @param invSalesInventory
     */
    public void addInvSalesInventorys(final InvSalesInventory invSalesInventory) {
        if (this.invSalesInventorys == null) {
            this.invSalesInventorys = new ArrayList<InvSalesInventory>();
        }
        this.invSalesInventorys.add(invSalesInventory);
    }

    /**
     * @return INV_SALES_INVENTORYのリスト
     */
    public List<InvSalesInventory> referInvSalesInventorys() {
        if (this.invSalesInventorys == null) {
            this.invSalesInventorys = MstSalesHinban.referInvSalesInventorys(this.salesHinban);
        }
        return this.invSalesInventorys;
    }

    /**
     * @param param1 salesHinban
     * @return List<InvSalesInventory>
     */
    public static List<InvSalesInventory> referInvSalesInventorys(final String param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("sales_hinban = :sales_hinban");

        String sql = "SELECT * FROM INV_SALES_INVENTORY WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("sales_hinban", param1);

        return Queries.select(sql, params, InvSalesInventory.class);
    }
}
