package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * MST_SALES_TAX
 *
 * @author emarfkrow
 */
public class MstSalesTax implements IEntity {

    /** START_DATE */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime startDate;

    /**
     * @return START_DATE
     */
    public java.time.LocalDateTime getStartDate() {
        return this.startDate;
    }

    /**
     * @param o START_DATE
     */
    public void setStartDate(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.startDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.startDate = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.startDate = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.startDate = null;
        }
    }

    /** SALSE_TAX */
    private java.math.BigDecimal salseTax;

    /**
     * @return SALSE_TAX
     */
    public java.math.BigDecimal getSalseTax() {
        return this.salseTax;
    }

    /**
     * @param o SALSE_TAX
     */
    public void setSalseTax(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.salseTax = new java.math.BigDecimal(o.toString());
        } else {
            this.salseTax = null;
        }
    }

    /**
     * MST_SALES_TAX照会
     *
     * @param param1 START_DATE
     * @return MST_SALES_TAX
     */
    public static MstSalesTax get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"START_DATE\" = :start_date");

        String sql = "SELECT * FROM MST_SALES_TAX WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("start_date", param1);

        return Queries.get(sql, params, MstSalesTax.class);
    }

    /**
     * MST_SALES_TAX追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // MST_SALES_TAXの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"START_DATE\" -- :start_date");
        nameList.add("\"SALSE_TAX\" -- :salse_tax");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO MST_SALES_TAX(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add("TO_TIMESTAMP (:start_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        valueList.add(":salse_tax");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * MST_SALES_TAX更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // MST_SALES_TAXの登録
        String sql = "UPDATE MST_SALES_TAX\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"START_DATE\" = TO_TIMESTAMP (:start_date, 'YYYY-MM-DD\"T\"HH24:MI:SS.FF3')");
        setList.add("\"SALSE_TAX\" = :salse_tax");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * MST_SALES_TAX削除
     *
     * @return 削除件数
     */
    public int delete() {

        // MST_SALES_TAXの削除
        String sql = "DELETE FROM MST_SALES_TAX WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"START_DATE\" = :start_date");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("start_date", this.startDate);
        params.put("salse_tax", this.salseTax);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
