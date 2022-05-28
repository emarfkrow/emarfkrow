package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_STORE_MAINTE_RETSU_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdStoreMainteRetsuDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdStoreMainteRetsuDetRegistForm.class);

    /** PRD_STORE_MAINTE_RETSU_DET登録フォームのリスト */
    @Valid
    private List<PrdStoreMainteRetsuDetRegistForm> prdStoreMainteRetsuDetGrid;

    /**
     * @return PRD_STORE_MAINTE_RETSU_DET登録フォームのリスト
     */
    public List<PrdStoreMainteRetsuDetRegistForm> getPrdStoreMainteRetsuDetGrid() {
        return prdStoreMainteRetsuDetGrid;
    }

    /**
     * @param p PRD_STORE_MAINTE_RETSU_DET登録フォームのリスト
     */
    public void setPrdStoreMainteRetsuDetGrid(final List<PrdStoreMainteRetsuDetRegistForm> p) {
        this.prdStoreMainteRetsuDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
