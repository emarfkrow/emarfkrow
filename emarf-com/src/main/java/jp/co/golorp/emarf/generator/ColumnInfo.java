/*
Copyright 2022 golorp

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package jp.co.golorp.emarf.generator;

/**
 * カラム情報
 *
 * @author golorp
 */
public class ColumnInfo {

    /** カラム名 */
    private String columnName;

    /** 取得したタイプ名 */
    private String typeName;

    /** タイプ名から変換したデータ型 */
    private String dataType;

    /** サイズ */
    private int columnSize;

    /** 桁数制限 */
    private Integer maxLength;

    /**
     * @return maxLength
     */
    public Integer getMaxLength() {
        return maxLength;
    }

    /**
     * @param p
     */
    public void setMaxLength(final Integer p) {
        this.maxLength = p;
    }

    /** 小数桁数 */
    private int decimalDigits;

    /** null可なら「1」 */
    private int nullable;

    /** コメント */
    private String remarks;

    /** 主キーならtrue */
    private boolean isPk;

    /** ユニークインデクスならtrue */
    private boolean isUnique;

    /** @return ユニークインデクスならtrue */
    public boolean isUnique() {
        return isUnique;
    }

    /** @param p ユニークインデクスならtrue */
    public void setUnique(final boolean p) {
        this.isUnique = p;
    }

    /** 採番キーならtrue */
    private boolean isNumbering;

    /** 参照先テーブル */
    private TableInfo referInfo;

    /**
     * @return カラム名
     */
    public String getColumnName() {
        return columnName;
    }

    /**
     * @param p カラム名
     */
    public void setColumnName(final String p) {
        this.columnName = p;
    }

    /**
     * @return 取得したタイプ名
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param p 取得したタイプ名
     */
    public void setTypeName(final String p) {
        this.typeName = p;
    }

    /**
     * @return タイプ名から変換したデータ型
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * @param p タイプ名から変換したデータ型
     */
    public void setDataType(final String p) {
        this.dataType = p;
    }

    /**
     * @return サイズ
     */
    public int getColumnSize() {
        return columnSize;
    }

    /**
     * @param p サイズ
     */
    public void setColumnSize(final int p) {
        this.columnSize = p;
    }

    /**
     * @return 小数桁数
     */
    public int getDecimalDigits() {
        return decimalDigits;
    }

    /**
     * @param p 小数桁数
     */
    public void setDecimalDigits(final int p) {
        this.decimalDigits = p;
    }

    /**
     * @return null可なら「1」
     */
    public int getNullable() {
        return nullable;
    }

    /**
     * @param p null可なら「1」
     */
    public void setNullable(final int p) {
        this.nullable = p;
    }

    /**
     * @return コメント
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * @param p コメント
     */
    public void setRemarks(final String p) {
        this.remarks = p;
    }

    /**
     * @return 主キーならtrue
     */
    public boolean isPk() {
        return isPk;
    }

    /**
     * @param p 主キーならtrue
     */
    public void setPk(final boolean p) {
        this.isPk = p;
    }

    /**
     * @return 採番キーならtrue
     */
    public boolean isNumbering() {
        return isNumbering;
    }

    /**
     * @param p 採番キーならtrue
     */
    public void setNumbering(final boolean p) {
        this.isNumbering = p;
    }

    /**
     * @return 参照先テーブル
     */
    public TableInfo getReferInfo() {
        return referInfo;
    }

    /**
     * @param p 参照先テーブル
     */
    public void setReferInfo(final TableInfo p) {
        this.referInfo = p;
    }

}
