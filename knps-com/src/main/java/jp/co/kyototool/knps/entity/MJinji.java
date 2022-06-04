package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 人事マスタ
 *
 * @author emarfkrow
 */
public class MJinji implements IEntity {

    /** 社員番号 */
    private java.math.BigDecimal shainNo;

    /**
     * @return 社員番号
     */
    public java.math.BigDecimal getShainNo() {
        return this.shainNo;
    }

    /**
     * @param o 社員番号
     */
    public void setShainNo(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shainNo = new java.math.BigDecimal(o.toString());
        } else {
            this.shainNo = null;
        }
    }

    /** 社員名 */
    private String shainMei;

    /**
     * @return 社員名
     */
    public String getShainMei() {
        return this.shainMei;
    }

    /**
     * @param o 社員名
     */
    public void setShainMei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shainMei = String.valueOf(o.toString());
        } else {
            this.shainMei = null;
        }
    }

    /** 人事所属コード */
    private java.math.BigDecimal jinjiShozokucd;

    /**
     * @return 人事所属コード
     */
    public java.math.BigDecimal getJinjiShozokucd() {
        return this.jinjiShozokucd;
    }

    /**
     * @param o 人事所属コード
     */
    public void setJinjiShozokucd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.jinjiShozokucd = new java.math.BigDecimal(o.toString());
        } else {
            this.jinjiShozokucd = null;
        }
    }

    /** 予備領域 */
    private String filler;

    /**
     * @return 予備領域
     */
    public String getFiller() {
        return this.filler;
    }

    /**
     * @param o 予備領域
     */
    public void setFiller(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.filler = String.valueOf(o.toString());
        } else {
            this.filler = null;
        }
    }

    /**
     * 人事マスタ照会
     *
     * @param param1 社員番号
     * @return 人事マスタ
     */
    public static MJinji get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SHAIN-NO\" = :shain_no");

        String sql = "SELECT * FROM M_JINJI WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("shain_no", param1);

        return Queries.get(sql, params, MJinji.class);
    }

    /**
     * 人事マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 人事マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"SHAIN-NO\" -- :shain_no");
        nameList.add("\"SHAIN-MEI\" -- :shain_mei");
        nameList.add("\"JINJI-SHOZOKUCD\" -- :jinji_shozokucd");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_JINJI(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":shain-no");
        valueList.add(":shain-mei");
        valueList.add(":jinji-shozokucd");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 人事マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 人事マスタの登録
        String sql = "UPDATE M_JINJI\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"SHAIN-NO\" = :shain_no");
        setList.add("\"SHAIN-MEI\" = :shain_mei");
        setList.add("\"JINJI-SHOZOKUCD\" = :jinji_shozokucd");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 人事マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 人事マスタの削除
        String sql = "DELETE FROM M_JINJI WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SHAIN-NO\" = :shain_no");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("shain_no", this.shainNo);
        params.put("shain_mei", this.shainMei);
        params.put("jinji_shozokucd", this.jinjiShozokucd);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
