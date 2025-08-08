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

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * テーブル情報
 *
 * @author golorp
 */
public class TableInfo {

    /** テーブル名 */
    private String name;

    /** コメント */
    private String remarks;

    /** 主キーカラム名のリスト */
    private List<String> primaryKeys = new ArrayList<String>();

    /** ユニークインデクスカラム名のセット */
    private List<String> uniqueIndexColumns = new ArrayList<String>();

    /** 主キーでないカラム名のリスト */
    private List<String> nonPrimaryKeys = new ArrayList<String>();

    /** カラム名：カラム情報のマップ */
    private Map<String, ColumnInfo> columns = new LinkedHashMap<String, ColumnInfo>();

    /** 親テーブルのリスト */
    private List<TableInfo> parents = new ArrayList<TableInfo>();

    /** 子テーブルのリスト */
    private List<TableInfo> children = new ArrayList<TableInfo>();

    /** 履歴テーブル */
    private TableInfo history;

    /** 自身が履歴テーブルならtrue */
    private boolean isHistory;

    /** 兄弟テーブルのリスト */
    private List<TableInfo> brothers = new ArrayList<TableInfo>();

    /** 自身が兄弟テーブルならtrue */
    private boolean isBrother;

    //    /** 依存レベル */
    //    private int dependLevel;

    /** VIEWならtrue */
    private boolean isView;

    /** 変換VIEWならtrue */
    private boolean isConvView;

    /** 自身が参照先ならtrue */
    private boolean isRefer;

    /** 組合せモデルならtrue */
    private List<TableInfo> comboInfos = new ArrayList<TableInfo>();

    /** 制約テーブル */
    private TableInfo stintInfo;

    /** 統合先テーブル */
    private TableInfo mergeTo;

    /** 統合元テーブル */
    private List<TableInfo> mergeFroms = new ArrayList<TableInfo>();

    /** 転生先テーブル */
    private TableInfo rebornTo;

    /** 転生元テーブル */
    private TableInfo rebornFrom;

    /** 派生先テーブル */
    private List<TableInfo> deriveTos = new ArrayList<TableInfo>();

    /** 派生元テーブル */
    private List<TableInfo> deriveFroms = new ArrayList<TableInfo>();

    /** 選抜先テーブル */
    private List<TableInfo> choosers = new ArrayList<TableInfo>();

    /** 選抜元テーブル */
    private List<TableInfo> choices = new ArrayList<TableInfo>();

    /** 集約先テーブル */
    private TableInfo summaryTo;

    /** 集約元テーブル */
    private List<TableInfo> summaryOfs = new ArrayList<TableInfo>();

    /**
     * @return boolean
     */
    public boolean isConvView() {
        return isConvView;
    }

    /**
     * @param p
     */
    public void setConvView(final boolean p) {
        this.isConvView = p;
    }

    /**
     * @return summaryTo
     */
    public TableInfo getSummaryTo() {
        return summaryTo;
    }

    /**
     * @param p セットする summaryTo
     */
    public void setSummaryTo(final TableInfo p) {
        this.summaryTo = p;
    }

    /**
     * @return summaryOfs
     */
    public List<TableInfo> getSummaryOfs() {
        return summaryOfs;
    }

    /**
     * @param p セットする summaryOfs
     */
    public void setSummaryOfs(final List<TableInfo> p) {
        this.summaryOfs = p;
    }

    /**
     * @return テーブル名
     */
    public String getName() {
        return name;
    }

    /**
     * @param p テーブル名
     */
    public void setName(final String p) {
        this.name = p;
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
     * @return 主キーカラム名のリスト
     */
    public List<String> getPrimaryKeys() {
        return primaryKeys;
    }

    /**
     * @param p 主キーカラム名のリスト
     */
    public void setPrimaryKeys(final List<String> p) {
        this.primaryKeys = p;
    }

    /** @return ユニークインデクスカラム名のセット */
    public List<String> getUniqueIndexColumns() {
        return uniqueIndexColumns;
    }

    /** @param p ユニークインデクスカラム名のセット */
    public void setUniqueIndexColumns(final List<String> p) {
        this.uniqueIndexColumns = p;
    }

    /**
     * @return 主キーでないカラム名のリスト
     */
    public List<String> getNonPrimaryKeys() {
        return nonPrimaryKeys;
    }

    /**
     * @param p 主キーでないカラム名のリスト
     */
    public void setNonPrimaryKeys(final List<String> p) {
        this.nonPrimaryKeys = p;
    }

    /**
     * @return カラム名：カラム情報のマップ
     */
    public Map<String, ColumnInfo> getColumns() {
        return columns;
    }

    /**
     * @param p カラム名：カラム情報のマップ
     */
    public void setColumns(final Map<String, ColumnInfo> p) {
        this.columns = p;
    }

    /**
     * @return 親テーブルのリスト
     */
    public List<TableInfo> getParents() {
        return parents;
    }

    /**
     * @param p
     */
    public void setParents(final List<TableInfo> p) {
        this.parents = p;
    }

    /**
     * @return 子テーブルのリスト
     */
    public List<TableInfo> getChildren() {
        return children;
    }

    /**
     * @param p 子テーブルのリスト
     */
    public void setChildren(final List<TableInfo> p) {
        this.children = p;
    }

    /**
     * @return 履歴テーブル
     */
    public TableInfo getHistory() {
        return history;
    }

    /**
     * @param p 履歴テーブル
     */
    public void setHistory(final TableInfo p) {
        this.history = p;
    }

    /**
     * @return 自身が履歴テーブルならtrue
     */
    public boolean isHistory() {
        return isHistory;
    }

    /**
     * @param p 自身が履歴テーブルならtrue
     */
    public void setHistory(final boolean p) {
        this.isHistory = p;
    }

    /**
     * @return 弟テーブルのリスト
     */
    public List<TableInfo> getBrothers() {
        return brothers;
    }

    /**
     * @param p 弟テーブルのリスト
     */
    public void setBrothers(final List<TableInfo> p) {
        this.brothers = p;
    }

    /**
     * @return 自身が兄弟テーブルならtrue
     */
    public boolean isBrother() {
        return isBrother;
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

    /**
     * @param p セットする isBrother
     */
    public void setBrother(final boolean p) {
        this.isBrother = p;
    }

    /**
     * @return VIEWならtrue
     */
    public boolean isView() {
        return isView;
    }

    /**
     * @param p
     */
    public void setView(final boolean p) {
        this.isView = p;
    }

    /**
     * @return mergeTo
     */
    public TableInfo getMergeTo() {
        return mergeTo;
    }

    /**
     * @param p セットする mergeTo
     */
    public void setMergeTo(final TableInfo p) {
        this.mergeTo = p;
    }

    /**
     * @return mergeFroms
     */
    public List<TableInfo> getMergeFroms() {
        return mergeFroms;
    }

    /**
     * @param p セットする mergeFroms
     */
    public void setMergeFroms(final List<TableInfo> p) {
        this.mergeFroms = p;
    }

    /**
     * @return TableInfo
     */
    public TableInfo getRebornTo() {
        return rebornTo;
    }

    /**
     * @param p
     */
    public void setRebornTo(final TableInfo p) {
        this.rebornTo = p;
    }

    /**
     * @return rebornFrom
     */
    public TableInfo getRebornFrom() {
        return rebornFrom;
    }

    /**
     * @param p セットする rebornFroms
     */
    public void setRebornFrom(final TableInfo p) {
        this.rebornFrom = p;
    }

    /**
     * @return List<TableInfo>
     */
    public List<TableInfo> getDeriveTos() {
        return deriveTos;
    }

    /**
     * @param p
     */
    public void setDeriveTos(final List<TableInfo> p) {
        this.deriveTos = p;
    }

    /**
     * @return deriveFroms
     */
    public List<TableInfo> getDeriveFroms() {
        return deriveFroms;
    }

    /**
     * @param p セットする deriveFroms
     */
    public void setDeriveFroms(final List<TableInfo> p) {
        this.deriveFroms = p;
    }

    /**
     * @return choosers
     */
    public List<TableInfo> getChoosers() {
        return choosers;
    }

    /**
     * @param p セットする choosers
     */
    public void setChoosers(final List<TableInfo> p) {
        this.choosers = p;
    }

    /**
     * @return choices
     */
    public List<TableInfo> getChoices() {
        return choices;
    }

    /**
     * @param p セットする choices
     */
    public void setChoices(final List<TableInfo> p) {
        this.choices = p;
    }

    /**
     * @return 組合せテーブルのリスト
     */
    public List<TableInfo> getComboInfos() {
        return comboInfos;
    }

    /**
     * @param p 組合せテーブルのリスト
     */
    public void setComboInfos(final List<TableInfo> p) {
        this.comboInfos = p;
    }

    /**
     * @return stintInfo
     */
    public TableInfo getStintInfo() {
        return stintInfo;
    }

    /**
     * @param p セットする stintInfo
     */
    public void setStintInfo(final TableInfo p) {
        this.stintInfo = p;
    }

    /**
     * @return boolean
     */
    public boolean isRefer() {
        return isRefer;
    }

    /**
     * @param p
     */
    public void setRefer(final boolean p) {
        this.isRefer = p;
    }

}
