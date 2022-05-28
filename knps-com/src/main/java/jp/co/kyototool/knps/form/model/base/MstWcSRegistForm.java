package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_WC一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstWcSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstWcRegistForm.class);

    /** MST_WC登録フォームのリスト */
    @Valid
    private List<MstWcRegistForm> mstWcGrid;

    /**
     * @return MST_WC登録フォームのリスト
     */
    public List<MstWcRegistForm> getMstWcGrid() {
        return mstWcGrid;
    }

    /**
     * @param p MST_WC登録フォームのリスト
     */
    public void setMstWcGrid(final List<MstWcRegistForm> p) {
        this.mstWcGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
