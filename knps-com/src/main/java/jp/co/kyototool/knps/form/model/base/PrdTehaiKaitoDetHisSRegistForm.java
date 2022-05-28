package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_TEHAI_KAITO_DET_HIS一覧登録フォーム
 *
 * @author emarfkrow
 */
public class PrdTehaiKaitoDetHisSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdTehaiKaitoDetHisRegistForm.class);

    /** PRD_TEHAI_KAITO_DET_HIS登録フォームのリスト */
    @Valid
    private List<PrdTehaiKaitoDetHisRegistForm> prdTehaiKaitoDetHisGrid;

    /**
     * @return PRD_TEHAI_KAITO_DET_HIS登録フォームのリスト
     */
    public List<PrdTehaiKaitoDetHisRegistForm> getPrdTehaiKaitoDetHisGrid() {
        return prdTehaiKaitoDetHisGrid;
    }

    /**
     * @param p PRD_TEHAI_KAITO_DET_HIS登録フォームのリスト
     */
    public void setPrdTehaiKaitoDetHisGrid(final List<PrdTehaiKaitoDetHisRegistForm> p) {
        this.prdTehaiKaitoDetHisGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
