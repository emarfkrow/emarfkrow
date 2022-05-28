package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_CODE一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstCodeSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstCodeRegistForm.class);

    /** MST_CODE登録フォームのリスト */
    @Valid
    private List<MstCodeRegistForm> mstCodeGrid;

    /**
     * @return MST_CODE登録フォームのリスト
     */
    public List<MstCodeRegistForm> getMstCodeGrid() {
        return mstCodeGrid;
    }

    /**
     * @param p MST_CODE登録フォームのリスト
     */
    public void setMstCodeGrid(final List<MstCodeRegistForm> p) {
        this.mstCodeGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
