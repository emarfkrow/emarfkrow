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
    public abstract String join(String[] array);

    /**
     * @param s 対象文字列
     * @return yyyy/mm/dd hh:mm:ss.SSSにキャストするSQL
     */
    public abstract String toTimestamp(String s);

    /**
     * @param columnName カラム名
     * @return 引用符付きの文字列
     */
    public abstract String quoted(String columnName);

    /**
     * @param columnName カラム名
     * @return エスケープ引用符付きの文字列
     */
    public abstract String quoteEscaped(String columnName);

    /**
     * @param rawSql 発行するSQL
     * @return ID列を付加したSQL
     */
    public abstract String addIdColumn(String rawSql);

}
