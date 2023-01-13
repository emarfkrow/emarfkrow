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

package jp.co.golorp.emarf.job;

import java.time.LocalDateTime;
import java.util.Calendar;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.exception.SysError;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.sql.Connections;
import jp.co.golorp.emarf.time.DateTimeUtil;

/**
 * バッチ基底クラス
 *
 * @author golorp
 */
public abstract class BaseJob extends BaseProcess {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(BaseJob.class);

    /**
     * 事前処理
     *
     * @param args 起動引数
     */
    public void run(final String[] args) {

        Calendar begin = Calendar.getInstance();

        try {

            LOG.info("<<<run>>> " + this.getClass().getName());

            String simpleName = this.getClass().getSimpleName();
            String id = simpleName.replaceFirst("Job$", "");
            this.running(DateTimeUtil.now(), id, args);
            Connections.commit();

        } catch (AppError e) {

            LOG.error(e.getMessage(), e);
            Connections.rollback();

        } catch (SysError e) {

            sendErrorMail(e.getCause());

            LOG.error(e.getMessage(), e);
            Connections.rollback();

        } catch (Exception e) {

            sendErrorMail(e);

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
     * @param now システム日時
     * @param id 起動ID
     * @param args 起動引数
     */
    public abstract void running(LocalDateTime now, String id, String[] args);

}
