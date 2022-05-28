package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_TEMP_ORDER一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PchTempOrderSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchTempOrderRegistForm.class);

    /** PCH_TEMP_ORDER登録フォームのリスト */
    @Valid
    private List<PchTempOrderRegistForm> pchTempOrderGrid;

    /**
     * @return PCH_TEMP_ORDER登録フォームのリスト
     */
    public List<PchTempOrderRegistForm> getPchTempOrderGrid() {
        return pchTempOrderGrid;
    }

    /**
     * @param p PCH_TEMP_ORDER登録フォームのリスト
     */
    public void setPchTempOrderGrid(final List<PchTempOrderRegistForm> p) {
        this.pchTempOrderGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
