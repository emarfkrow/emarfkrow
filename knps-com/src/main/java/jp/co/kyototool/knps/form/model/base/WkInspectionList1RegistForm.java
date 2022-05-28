package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * WK_INSPECTION_LIST1登録フォーム
 *
 * @author emarfkrow
 */
public class WkInspectionList1RegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(WkInspectionList1RegistForm.class);

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
