package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_COMPANY一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstCompanySRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstCompanyRegistForm.class);

    /** MST_COMPANY登録フォームのリスト */
    @Valid
    private List<MstCompanyRegistForm> mstCompanyGrid;

    /**
     * @return MST_COMPANY登録フォームのリスト
     */
    public List<MstCompanyRegistForm> getMstCompanyGrid() {
        return mstCompanyGrid;
    }

    /**
     * @param p MST_COMPANY登録フォームのリスト
     */
    public void setMstCompanyGrid(final List<MstCompanyRegistForm> p) {
        this.mstCompanyGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
