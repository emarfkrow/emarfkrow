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

package jp.co.golorp.emarf.sql;

import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;

import jp.co.golorp.emarf.util.MapList;

/**
 * データソース毎実装のインタフェース
 *
 * @author golorp
 */
public abstract class DataSourcesAssist {

    /**
     * @param metaData
     * @param schemaPattern
     * @return ResultSet
     * @throws SQLException
     */
    public abstract ResultSet getTables(DatabaseMetaData metaData, String schemaPattern) throws SQLException;

    /**
     * @param metaData
     * @param schemaPattern
     * @param tableNamePattern
     * @return ResultSet
     * @throws SQLException
     */
    public abstract ResultSet getColumns(DatabaseMetaData metaData, String schemaPattern, String tableNamePattern)
            throws SQLException;

    /**
     * @param metaData
     * @param schemaPattern
     * @param tableName
     * @return ResultSet
     * @throws SQLException
     */
    protected abstract ResultSet getPrimaryKeys(DatabaseMetaData metaData, String schemaPattern, String tableName)
            throws SQLException;

    /**
     * @param tableName テーブル名
     * @return テーブルコメント
     * @throws Exception
     */
    protected abstract String getTableComment(String tableName);

    /**
     * @param tableName テーブル名
     * @param columnName カラム名
     * @return カラムコメント
     * @throws Exception
     */
    protected abstract String getColumnComment(String tableName, String columnName);

    /**
     * @param tableName テーブル名
     * @return 複数のユニークインデクスについての列情報
     */
    protected abstract MapList getUniqueIndexes(String tableName);

    /**
     * @param array 文字列配列
     * @return 文字列を結合するSQL
     */
    public abstract String joinedSQL(String[] array);

    /**
     * @param s カラム物理名
     * @return yyyy/mm/ddにキャストするSQL
     */
    public abstract String toDateSQL(String s);

    /**
     * @param s カラム物理名
     * @return 日時にキャストするSQL
     */
    public abstract String toDateTimeSQL(String s);

    /**
     * @param s カラム物理名
     * @return ミリ秒タイムスタンプにキャストするSQL
     */
    public abstract String toTimestampSQL(String s);

    /**
     * @param s カラム物理名
     * @return yyyy/mm/ddを文字列にキャストするSQL
     */
    public abstract String date2CharSQL(String s);

    /**
     * @param s 対象文字列
     * @return 1970/01/01 HH24:MI:SS.sssを文字列にキャストするSQL
     */
    public abstract String time2CharSQL(String s);

    /**
     * @param s 対象文字列
     * @return yyyy/mm/dd hh:mm:ssを文字列にキャストするSQL
     */
    public abstract String dateTime2CharSQL(String s);

    /**
     * @param s 対象文字列
     * @return yyyy/mm/dd hh:mm:ss.SSSを文字列にキャストするSQL
     */
    public abstract String timestamp2CharSQL(String s);

    /**
     * @param s カラム物理名
     * @param format フォーマット文字列
     * @return タイムスタンプをフォーマットするSQL
     */
    public abstract String formatedSQL(String s, String format);

    /**
     * @param columnName カラム物理名
     * @return 引用符付きの文字列
     */
    public abstract String quotedSQL(String columnName);

    /**
     * @param columnName カラム物理名
     * @return 引用符をエスケープ済みの文字列
     */
    public abstract String quoteEscapedSQL(String columnName);

    /**
     * @param sql 発行するSQL
     * @return ID列を付加したSQL
     */
    public abstract String addIdColumn(String sql);

    /**
     * @param sql  発行するSQL
     * @param rows ページ行数
     * @param page ページ番号
     * @return ページ繰りしたSQL
     */
    public abstract String getPagedSql(String sql, Integer rows, Integer page);

    /**
     * @param columnName カラム名
     * @return 全半角スペースのトリムSQL文字列
     */
    public abstract String trimedSQL(String columnName);

    /**
     * @param columnName
     * @param d
     * @return String
     */
    public abstract String dateAdd(String columnName, int d);

    /**
     * @param columnName
     * @return String
     */
    public abstract String nvlSysdate(String columnName);

    /**
     * @param columnName
     * @return String
     */
    public abstract String nvlZero(String columnName);

    /**
     * @return String
     */
    public abstract String sysDate();

    /**
     * @return String
     */
    public abstract String sysTimestamp();

    /**
     * @param columns
     * @return int
     * @throws SQLException
     */
    public abstract int getColumnSize(ResultSet columns) throws SQLException;

}
