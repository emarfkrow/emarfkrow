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
     * @param tableName テーブル名
     * @return テーブルコメント
     */
    protected abstract String getTableComment(String tableName);

    /**
     * @param tableName テーブル名
     * @param columnName カラム名
     * @return カラムコメント
     */
    protected abstract String getColumnComment(String tableName, String columnName);

    /**
     * @param tableName テーブル名
     * @return カラムコメント
     */
    protected abstract MapList getUniqueIndexes(String tableName);

    /**
     * @param array 文字列配列
     * @return 文字列を結合するSQL
     */
    public abstract String joinedSQL(String[] array);

    /**
     * @param s 対象文字列
     * @return yyyy/mm/ddにキャストするSQL
     */
    public abstract String toDateSQL(String s);

    /**
     * @param s 対象文字列
     * @return yyyy/mm/dd hh:mm:ssにキャストするSQL
     */
    public abstract String toDateTimeSQL(String s);

    /**
     * @param s 対象文字列
     * @return yyyy/mm/dd hh:mm:ss.SSSにキャストするSQL
     */
    public abstract String toTimestampSQL(String s);

    /**
     * @param s 対象文字列
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
     * @param s 対象文字列
     * @param format フォーマット文字列
     * @return フォーマットするSQL
     */
    public abstract String formatedSQL(String s, String format);

    /**
     * @param columnName カラム名
     * @return 引用符付きの文字列
     */
    public abstract String quotedSQL(String columnName);

    /**
     * @param columnName カラム名
     * @return エスケープ引用符付きの文字列
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
     * @param columns
     * @return int
     * @throws SQLException
     */
    public abstract int getColumnSize(ResultSet columns) throws SQLException;

}
