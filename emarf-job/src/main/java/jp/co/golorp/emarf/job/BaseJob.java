package jp.co.golorp.emarf.job;

import java.time.LocalDateTime;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.sql.Connections;

/**
 * バッチ基底クラス
 *
 * @author toshiyuki
 *
 */
public abstract class BaseJob extends BaseProcess {

    /**
     * logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(BaseJob.class);

    /**
     * 事前処理
     *
     * @param args
     */
    public void run(final String[] args) {

        Calendar begin = Calendar.getInstance();

        try {

            LOG.info("<<<run>>> " + this.getClass().getName());

            String simpleName = this.getClass().getSimpleName();
            String id = simpleName.replaceFirst("Job$", "");
            this.running(jp.co.golorp.emarf.time.LocalDateTime.now(), id, args);
            Connections.commit();

        } catch (AppError e) {

            LOG.error(e.getMessage(), e);
            Connections.rollback();

        } catch (SysError e) {

            LOG.error(e.getMessage(), e);
            Connections.rollback();

        } catch (Exception e) {

            LOG.error(e.getMessage(), e);
            Connections.rollback();

        } finally {

            Connections.close();

            Calendar end = Calendar.getInstance();
            long millis = end.getTimeInMillis() - begin.getTimeInMillis();
            LOG.info("<<<end>>> " + this.getClass().getName() + " in " + millis + " millis.");
        }
    }

    /**
     * 主処理
     *
     * @param now
     * @param id
     * @param args
     */
    public abstract void running(LocalDateTime now, String id, String[] args);

}
