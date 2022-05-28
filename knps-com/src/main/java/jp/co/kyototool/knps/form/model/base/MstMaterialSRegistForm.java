package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_MATERIAL一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstMaterialSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstMaterialRegistForm.class);

    /** MST_MATERIAL登録フォームのリスト */
    @Valid
    private List<MstMaterialRegistForm> mstMaterialGrid;

    /**
     * @return MST_MATERIAL登録フォームのリスト
     */
    public List<MstMaterialRegistForm> getMstMaterialGrid() {
        return mstMaterialGrid;
    }

    /**
     * @param p MST_MATERIAL登録フォームのリスト
     */
    public void setMstMaterialGrid(final List<MstMaterialRegistForm> p) {
        this.mstMaterialGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
