package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PCH_PAY_ACT_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PchPayActDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PchPayActDetRegistForm.class);

    /** PCH_PAY_ACT_DET登録フォームのリスト */
    @Valid
    private List<PchPayActDetRegistForm> pchPayActDetGrid;

    /**
     * @return PCH_PAY_ACT_DET登録フォームのリスト
     */
    public List<PchPayActDetRegistForm> getPchPayActDetGrid() {
        return pchPayActDetGrid;
    }

    /**
     * @param p PCH_PAY_ACT_DET登録フォームのリスト
     */
    public void setPchPayActDetGrid(final List<PchPayActDetRegistForm> p) {
        this.pchPayActDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
