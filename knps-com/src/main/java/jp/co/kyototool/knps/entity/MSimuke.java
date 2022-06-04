package jp.co.kyototool.knps.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 仕向先マスタ
 *
 * @author emarfkrow
 */
public class MSimuke implements IEntity {

    /** 仕向けコード */
    private String simukecd;

    /**
     * @return 仕向けコード
     */
    public String getSimukecd() {
        return this.simukecd;
    }

    /**
     * @param o 仕向けコード
     */
    public void setSimukecd(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.simukecd = String.valueOf(o.toString());
        } else {
            this.simukecd = null;
        }
    }

    /** 仕向け先名 */
    private String simukemei;

    /**
     * @return 仕向け先名
     */
    public String getSimukemei() {
        return this.simukemei;
    }

    /**
     * @param o 仕向け先名
     */
    public void setSimukemei(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.simukemei = String.valueOf(o.toString());
        } else {
            this.simukemei = null;
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
     * 仕向先マスタ照会
     *
     * @param param1 仕向けコード
     * @return 仕向先マスタ
     */
    public static MSimuke get(final Object param1) {

        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SIMUKECD\") = TRIM (:simukecd)");

        String sql = "SELECT * FROM M_SIMUKE WHERE " + String.join(" AND ", whereList);

        Map<String, Object> params = new HashMap<String, Object>();
        params.put("simukecd", param1);

        return Queries.get(sql, params, MSimuke.class);
    }

    /**
     * 仕向先マスタ追加
     *
     * @param now システム日時
     * @param id 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String id) {

        // 仕向けコードの採番処理
        numbering();

        // 仕向先マスタの登録
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"SIMUKECD\" -- :simukecd");
        nameList.add("\"SIMUKEMEI\" -- :simukemei");
        nameList.add("\"FILLER\" -- :filler");
        String name = String.join("\r\n    , ", nameList);

        String sql = "INSERT INTO M_SIMUKE(\r\n      " + name + "\r\n) VALUES (\r\n      " + getValues() + "\r\n)";

        Map<String, Object> params = toMap(now, id);

        return Queries.regist(sql, params);
    }

    private String getValues() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":simukecd");
        valueList.add(":simukemei");
        valueList.add(":filler");
        return String.join("\r\n    , ", valueList);
    }

    /** 仕向けコードの採番処理 */
    private void numbering() {

        if (this.simukecd != null) {
            return;
        }

        String sql = "SELECT LPAD (CASE WHEN MAX(e.\"SIMUKECD\") IS NULL THEN 0 ELSE MAX(e.\"SIMUKECD\") * 1 END + 1, 3, '0') AS \"SIMUKECD\" FROM M_SIMUKE e WHERE e.\"SIMUKECD\" < '999'";

        Map<String, Object> params = new HashMap<String, Object>();

        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, params);
        Object o = mapList.get(0).get("SIMUKECD");

        this.setSimukecd(o);
    }

    /**
     * 仕向先マスタ更新
     *
     * @param now システム日時
     * @param id 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String id) {

        // 仕向先マスタの登録
        String sql = "UPDATE M_SIMUKE\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        Map<String, Object> params = toMap(now, id);
        return Queries.regist(sql, params);
    }

    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"SIMUKECD\" = :simukecd");
        setList.add("\"SIMUKEMEI\" = :simukemei");
        setList.add("\"FILLER\" = :filler");
        String set = String.join("\r\n    , ", setList);
        return set;
    }

    /**
     * 仕向先マスタ削除
     *
     * @return 削除件数
     */
    public int delete() {

        // 仕向先マスタの削除
        String sql = "DELETE FROM M_SIMUKE WHERE " + getWhere();

        Map<String, Object> params = toMap(null, null);

        return Queries.regist(sql, params);
    }

    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("TRIM (\"SIMUKECD\") = TRIM (:simukecd)");
        return String.join(" AND ", whereList);
    }

    private Map<String, Object> toMap(final LocalDateTime now, final String id) {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("simukecd", this.simukecd);
        params.put("simukemei", this.simukemei);
        params.put("filler", this.filler);
        params.put("time_stamp_create", now);
        params.put("user_id_create", id);
        params.put("time_stamp_change", now);
        params.put("user_id_change", id);
        return params;
    }
}
