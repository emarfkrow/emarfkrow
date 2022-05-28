package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_TEMP_ORDER_EST_FILE一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PchTempOrderEstFileSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchTempOrderEstFileRegistForm.class);

    /** PCH_TEMP_ORDER_EST_FILE登録フォームのリスト */
    @Valid
    private List<PchTempOrderEstFileRegistForm> pchTempOrderEstFileGrid;

    /**
     * @return PCH_TEMP_ORDER_EST_FILE登録フォームのリスト
     */
    public List<PchTempOrderEstFileRegistForm> getPchTempOrderEstFileGrid() {
        return pchTempOrderEstFileGrid;
    }

    /**
     * @param p PCH_TEMP_ORDER_EST_FILE登録フォームのリスト
     */
    public void setPchTempOrderEstFileGrid(final List<PchTempOrderEstFileRegistForm> p) {
        this.pchTempOrderEstFileGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
