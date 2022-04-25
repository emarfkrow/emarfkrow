package jp.co.golorp.emarf.generator;

public class ColumnInfo {

    /** COLUMN_NAME */
    private String columnName;

    /** TYPE_NAME */
    private String typeName;

    /** TYPE_NAMEを変換 */
    private String dataType;

    /** COLUMN_SIZE */
    private int columnSize;

    /** DECIMAL_DIGITS */
    private int decimalDigits;

    /** NULLABLE */
    private int nullable;

    /** REMARKS */
    private String remarks;

    /** 主キーならtrue */
    private boolean isPk;

    /** 採番キーならtrue */
    private boolean isNumbering;

    /** 参照テーブル */
    private TableInfo referInfo;

    /**
     * @return columnName
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param p
     */
    public void setColumnName(final String p) {
        this.columnName = p;
    }

    /**
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param p
     */
    public void setTypeName(final String p) {
        this.typeName = p;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * @param p
     */
    public void setDataType(final String p) {
        this.dataType = p;
    }

    /**
     * @return columnSize
     */
    public int getColumnSize() {
        return columnSize;
    }

    /**
     * @param p
     */
    public void setColumnSize(final int p) {
        this.columnSize = p;
    }

    /**
     * @return int
     */
    public int getDecimalDigits() {
        return decimalDigits;
    }

    /**
     * @param p
     */
    public void setDecimalDigits(final int p) {
        this.decimalDigits = p;
    }

    /**
     * @return int
     */
    public int getNullable() {
        return nullable;
    }

    /**
     * @param p
     */
    public void setNullable(final int p) {
        this.nullable = p;
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
     * @return 主キーか
     */
    public boolean isPk() {
        return isPk;
    }

    /**
     * @param p
     */
    public void setPk(final boolean p) {
        this.isPk = p;
    }

    /**
     * @return boolean
     */
    public boolean isNumbering() {
        return isNumbering;
    }

    /**
     * @param p
     */
    public void setNumbering(final boolean p) {
        this.isNumbering = p;
    }

    /**
     * @return 参照テーブル
     */
    public TableInfo getReferInfo() {
        return referInfo;
    }

    /**
     * @param p
     */
    public void setReferInfo(final TableInfo p) {
        this.referInfo = p;
    }

}
