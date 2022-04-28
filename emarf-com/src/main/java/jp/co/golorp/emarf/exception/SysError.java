package jp.co.golorp.emarf.exception;

import jp.co.golorp.emarf.util.Messages;

/**
 * システムエラー
 *
 * @author toshiyuki
 *
 */
public class SysError extends RuntimeException {

    /**
     * @param msgId
     */
    public SysError(final String msgId) {
        super(Messages.get(msgId));
    }

    /**
     * @param msgId
     * @param strings
     */
    public SysError(final String msgId, final String... strings) {
        super(Messages.get(msgId, strings));
    }

    /**
     * @param e Exception
     */
    public SysError(final Exception e) {
        super(e);
    }

}
