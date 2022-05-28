package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_TEMP_SUPPLIER一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstTempSupplierSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstTempSupplierRegistForm.class);

    /** MST_TEMP_SUPPLIER登録フォームのリスト */
    @Valid
    private List<MstTempSupplierRegistForm> mstTempSupplierGrid;

    /**
     * @return MST_TEMP_SUPPLIER登録フォームのリスト
     */
    public List<MstTempSupplierRegistForm> getMstTempSupplierGrid() {
        return mstTempSupplierGrid;
    }

    /**
     * @param p MST_TEMP_SUPPLIER登録フォームのリスト
     */
    public void setMstTempSupplierGrid(final List<MstTempSupplierRegistForm> p) {
        this.mstTempSupplierGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
