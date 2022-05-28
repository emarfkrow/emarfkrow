package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUPPLIER_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupplierBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupplierBkRegistForm.class);

    /** MST_SUPPLIER_BK登録フォームのリスト */
    @Valid
    private List<MstSupplierBkRegistForm> mstSupplierBkGrid;

    /**
     * @return MST_SUPPLIER_BK登録フォームのリスト
     */
    public List<MstSupplierBkRegistForm> getMstSupplierBkGrid() {
        return mstSupplierBkGrid;
    }

    /**
     * @param p MST_SUPPLIER_BK登録フォームのリスト
     */
    public void setMstSupplierBkGrid(final List<MstSupplierBkRegistForm> p) {
        this.mstSupplierBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
