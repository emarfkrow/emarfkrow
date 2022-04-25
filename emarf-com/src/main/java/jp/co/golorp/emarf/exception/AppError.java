package jp.co.golorp.emarf.exception;

import java.util.LinkedHashMap;
import java.util.Map;

import jp.co.golorp.emarf.util.Messages;

/**
 * アプリケーションエラー
 *
 * @author fukuo
 *
 */
public class AppError extends RuntimeException {

    /**
     *
     */
    private Map<String, String> errors = new LinkedHashMap<String, String>();

    /**
     * @return Map
     */
    public Map<String, String> getErrors() {
        return errors;
    }

    /**
     * @param map
     */
    public void setErrors(final Map<String, String> map) {
        this.errors = map;
    }

    /**
     * @param map
     */
    public AppError(final Map<String, String> map) {
        super();
        this.errors = map;
    }

    /**
     * @param msgId
     */
    public AppError(final String msgId) {
        super(Messages.get(msgId));
    }

    /**
     * @param msgId
     * @param strings
     */
    public AppError(final String msgId, final String... strings) {
        super(Messages.get(msgId, strings));
    }

}
