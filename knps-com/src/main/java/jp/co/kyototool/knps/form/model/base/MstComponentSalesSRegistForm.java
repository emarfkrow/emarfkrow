package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_COMPONENT_SALES一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstComponentSalesSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstComponentSalesRegistForm.class);

    /** MST_COMPONENT_SALES登録フォームのリスト */
    @Valid
    private List<MstComponentSalesRegistForm> mstComponentSalesGrid;

    /**
     * @return MST_COMPONENT_SALES登録フォームのリスト
     */
    public List<MstComponentSalesRegistForm> getMstComponentSalesGrid() {
        return mstComponentSalesGrid;
    }

    /**
     * @param p MST_COMPONENT_SALES登録フォームのリスト
     */
    public void setMstComponentSalesGrid(final List<MstComponentSalesRegistForm> p) {
        this.mstComponentSalesGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
