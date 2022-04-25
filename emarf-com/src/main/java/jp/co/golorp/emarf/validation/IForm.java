package jp.co.golorp.emarf.validation;

import java.util.Map;

import jp.co.golorp.emarf.process.BaseProcess;

/**
 * Validation用Formのマーカインタフェース
 *
 * @author toshiyuki
 *
 */
public interface IForm {

    /**
     * @param errors
     * @param baseProcess
     */
    void validate(Map<String, String> errors, BaseProcess baseProcess);

}
