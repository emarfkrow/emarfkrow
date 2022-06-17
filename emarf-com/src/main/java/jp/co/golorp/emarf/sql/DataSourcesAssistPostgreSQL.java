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

/**
 * PostgreSQL用データソース実装
 *
 * @author golorp
 */
public final class DataSourcesAssistPostgreSQL extends DataSourcesAssist {

    @Override
    protected String getTableComment(final String tableName) {
        return null;
    }

    @Override
    protected String getColumnComment(final String tableName, final String columnName) {
        return null;
    }

    @Override
    public String join(final String[] array) {
        return null;
    }

    @Override
    public String toTimestamp(final String lowerColumn) {
        return null;
    }

    @Override
    public String quoted(final String columnName) {
        return null;
    }

    @Override
    public String quoteEscaped(final String columnName) {
        return null;
    }

}
