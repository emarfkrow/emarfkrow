package jp.co.golorp.emarf.sql;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.exception.SysError;

/**
 * スレッド内のコネクション管理クラス
 * @author toshiyuki
 *
 */
public final class ThreadLocalConnection extends ThreadLocal<Connection> {

    /**
     * logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(ThreadLocalConnection.class);

    @Override
    protected Connection initialValue() {
        try {
            DataSource ds = DataSources.get();
            Connection cn = ds.getConnection();
            cn.setAutoCommit(false);
            LOG.trace("ThreadLocalConnection initialized.");
            return cn;
        } catch (SQLException e) {
            throw new SysError(e);
        }
    }

    @Override
    public void remove() {
        super.remove();
        LOG.trace("ThreadLocalConnection removed.");
    }

}
