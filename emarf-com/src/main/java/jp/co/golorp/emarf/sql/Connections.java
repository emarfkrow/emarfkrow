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

import java.sql.Connection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * コネクション管理クラス
 *
 * @author golorp
 */
public final class Connections {

    /**
     * logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(Connections.class);

    /**
     * ThreadLocalConnection
     */
    private static ThreadLocalConnection threadLocalConnection = new ThreadLocalConnection();

    /**
     * プライベートコンストラクタ
     */
    private Connections() {
    }

    /**
     * @return Connection
     */
    public static Connection get() {
        Connection cn = threadLocalConnection.get();
        LOG.trace("connection get.      [" + cn + "]");
        return cn;
    }

    /**
     * commit
     */
    public static void commit() {
        try {
            Connection cn = threadLocalConnection.get();
            LOG.trace("connection commit.   [" + cn + "]");
            if (cn != null) {
                cn.commit();
            }
        } catch (Exception e) {
            LOG.trace(e.getMessage());
        }
    }

    /**
     * rollback
     */
    public static void rollback() {
        try {
            Connection cn = threadLocalConnection.get();
            LOG.trace("connection rollback. [" + cn + "]");
            if (cn != null) {
                cn.rollback();
            }
        } catch (Exception e) {
            LOG.trace(e.getMessage());
        }
    }

    /**
     * close
     */
    public static void close() {
        try {
            Connection cn = threadLocalConnection.get();
            LOG.trace("connection close.    [" + cn + "]");
            if (cn != null) {
                cn.close();
            }
        } catch (Exception e) {
            LOG.trace(e.getMessage());
        }
        threadLocalConnection.remove();
    }

}
