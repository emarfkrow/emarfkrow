package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_DIVISION一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstDivisionSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstDivisionRegistForm.class);

    /** MST_DIVISION登録フォームのリスト */
    @Valid
    private List<MstDivisionRegistForm> mstDivisionGrid;

    /**
     * @return MST_DIVISION登録フォームのリスト
     */
    public List<MstDivisionRegistForm> getMstDivisionGrid() {
        return mstDivisionGrid;
    }

    /**
     * @param p MST_DIVISION登録フォームのリスト
     */
    public void setMstDivisionGrid(final List<MstDivisionRegistForm> p) {
        this.mstDivisionGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
