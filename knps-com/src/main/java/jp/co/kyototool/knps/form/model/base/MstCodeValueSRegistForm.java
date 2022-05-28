package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_CODE_VALUE一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstCodeValueSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstCodeValueRegistForm.class);

    /** MST_CODE_VALUE登録フォームのリスト */
    @Valid
    private List<MstCodeValueRegistForm> mstCodeValueGrid;

    /**
     * @return MST_CODE_VALUE登録フォームのリスト
     */
    public List<MstCodeValueRegistForm> getMstCodeValueGrid() {
        return mstCodeValueGrid;
    }

    /**
     * @param p MST_CODE_VALUE登録フォームのリスト
     */
    public void setMstCodeValueGrid(final List<MstCodeValueRegistForm> p) {
        this.mstCodeValueGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
