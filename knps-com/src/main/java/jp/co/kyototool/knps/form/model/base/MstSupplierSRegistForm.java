package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUPPLIER一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupplierSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupplierRegistForm.class);

    /** MST_SUPPLIER登録フォームのリスト */
    @Valid
    private List<MstSupplierRegistForm> mstSupplierGrid;

    /**
     * @return MST_SUPPLIER登録フォームのリスト
     */
    public List<MstSupplierRegistForm> getMstSupplierGrid() {
        return mstSupplierGrid;
    }

    /**
     * @param p MST_SUPPLIER登録フォームのリスト
     */
    public void setMstSupplierGrid(final List<MstSupplierRegistForm> p) {
        this.mstSupplierGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
