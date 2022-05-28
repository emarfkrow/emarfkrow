package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_GROUP一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstGroupSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstGroupRegistForm.class);

    /** MST_GROUP登録フォームのリスト */
    @Valid
    private List<MstGroupRegistForm> mstGroupGrid;

    /**
     * @return MST_GROUP登録フォームのリスト
     */
    public List<MstGroupRegistForm> getMstGroupGrid() {
        return mstGroupGrid;
    }

    /**
     * @param p MST_GROUP登録フォームのリスト
     */
    public void setMstGroupGrid(final List<MstGroupRegistForm> p) {
        this.mstGroupGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
