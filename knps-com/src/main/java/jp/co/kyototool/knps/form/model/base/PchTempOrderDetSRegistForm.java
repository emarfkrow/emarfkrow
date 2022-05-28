package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_TEMP_ORDER_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PchTempOrderDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchTempOrderDetRegistForm.class);

    /** PCH_TEMP_ORDER_DET登録フォームのリスト */
    @Valid
    private List<PchTempOrderDetRegistForm> pchTempOrderDetGrid;

    /**
     * @return PCH_TEMP_ORDER_DET登録フォームのリスト
     */
    public List<PchTempOrderDetRegistForm> getPchTempOrderDetGrid() {
        return pchTempOrderDetGrid;
    }

    /**
     * @param p PCH_TEMP_ORDER_DET登録フォームのリスト
     */
    public void setPchTempOrderDetGrid(final List<PchTempOrderDetRegistForm> p) {
        this.pchTempOrderDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
