package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SALES_HINBAN一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSalesHinbanSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSalesHinbanRegistForm.class);

    /** MST_SALES_HINBAN登録フォームのリスト */
    @Valid
    private List<MstSalesHinbanRegistForm> mstSalesHinbanGrid;

    /**
     * @return MST_SALES_HINBAN登録フォームのリスト
     */
    public List<MstSalesHinbanRegistForm> getMstSalesHinbanGrid() {
        return mstSalesHinbanGrid;
    }

    /**
     * @param p MST_SALES_HINBAN登録フォームのリスト
     */
    public void setMstSalesHinbanGrid(final List<MstSalesHinbanRegistForm> p) {
        this.mstSalesHinbanGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
