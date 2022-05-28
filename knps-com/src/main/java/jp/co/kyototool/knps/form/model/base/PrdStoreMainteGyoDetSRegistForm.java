package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_STORE_MAINTE_GYO_DET一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdStoreMainteGyoDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdStoreMainteGyoDetRegistForm.class);

    /** PRD_STORE_MAINTE_GYO_DET登録フォームのリスト */
    @Valid
    private List<PrdStoreMainteGyoDetRegistForm> prdStoreMainteGyoDetGrid;

    /**
     * @return PRD_STORE_MAINTE_GYO_DET登録フォームのリスト
     */
    public List<PrdStoreMainteGyoDetRegistForm> getPrdStoreMainteGyoDetGrid() {
        return prdStoreMainteGyoDetGrid;
    }

    /**
     * @param p PRD_STORE_MAINTE_GYO_DET登録フォームのリスト
     */
    public void setPrdStoreMainteGyoDetGrid(final List<PrdStoreMainteGyoDetRegistForm> p) {
        this.prdStoreMainteGyoDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
