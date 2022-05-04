package jp.co.golorp.emarf.generator;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TableInfo {

    /** TABLE_NAME */
    private String tableName;

    /** REMARKS */
    private String remarks;

    /** 主キーカラム名のリスト */
    private List<String> primaryKeys = new ArrayList<String>();

    /** 主キーカラム名のリスト */
    private List<String> nonPrimaryKeys = new ArrayList<String>();

    /** ColumnInfoのリスト */
    private Map<String, ColumnInfo> columnInfos = new LinkedHashMap<String, ColumnInfo>();

    /** 子テーブルのリスト */
    private List<TableInfo> childInfos = new ArrayList<TableInfo>();

    /** 履歴テーブル */
    private TableInfo historyInfo;

    /** 自身が履歴テーブルか */
    private boolean isHistory;

    /** 兄弟テーブルのリスト */
    private List<TableInfo> brosInfos = new ArrayList<TableInfo>();

    /** 自身が兄弟テーブルか */
    private boolean isBrother;

    //    /** 依存レベル */
    //    private int dependLevel;

    /**
     * @return tableName
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * @param p
     */
    public void setTableName(final String p) {
        this.tableName = p;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param p
     */
    public void setRemarks(final String p) {
        this.remarks = p;
    }

    /**
     * @return primaryKeys
     */
    public List<String> getPrimaryKeys() {
        return primaryKeys;
    }

    /**
     * @param p
     */
    public void setPrimaryKeys(final List<String> p) {
        this.primaryKeys = p;
    }

    /**
     * @return nonPrimaryKeys
     */
    public List<String> getNonPrimaryKeys() {
        return nonPrimaryKeys;
    }

    /**
     * @param p
     */
    public void setNonPrimaryKeys(final List<String> p) {
        this.nonPrimaryKeys = p;
    }

    /**
     * @return columnInfos
     */
    public Map<String, ColumnInfo> getColumnInfos() {
        return columnInfos;
    }

    /**
     * @param p
     */
    public void setColumnInfos(final Map<String, ColumnInfo> p) {
        this.columnInfos = p;
    }

    /**
     * @return childInfos
     */
    public List<TableInfo> getChildInfos() {
        return childInfos;
    }

    /**
     * @param p
     */
    public void setChildInfos(final List<TableInfo> p) {
        this.childInfos = p;
    }

    /**
     * @return TableInfo
     */
    public TableInfo getHistoryInfo() {
        return historyInfo;
    }

    /**
     * @param p
     */
    public void setHistoryInfo(final TableInfo p) {
        this.historyInfo = p;
    }

    /**
     * @return boolean
     */
    public boolean isHistory() {
        return isHistory;
    }

    /**
     * @param p
     */
    public void setHistory(final boolean p) {
        this.isHistory = p;
    }

    /**
     * @return List<TableInfo>
     */
    public List<TableInfo> getBrosInfos() {
        return brosInfos;
    }

    /**
     * @param p
     */
    public void setBrosInfos(final List<TableInfo> p) {
        this.brosInfos = p;
    }

    /**
     * @return boolean
     */
    public boolean isBrother() {
        return isBrother;
    }

    /**
     * @param p
     */
    public void setBrother(final boolean p) {
        this.isBrother = p;
    }

    //    /**
    //     * @return relianceLevel
    //     */
    //    public int getDependLevel() {
    //        return dependLevel;
    //    }
    //
    //    /**
    //     * @param p
    //     */
    //    public void setDependLevel(final int p) {
    //        this.dependLevel = p;
    //    }

}
