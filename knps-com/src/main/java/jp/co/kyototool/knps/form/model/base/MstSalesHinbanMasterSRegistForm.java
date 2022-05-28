package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SALES_HINBAN_MASTER一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSalesHinbanMasterSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSalesHinbanMasterRegistForm.class);

    /** MST_SALES_HINBAN_MASTER登録フォームのリスト */
    @Valid
    private List<MstSalesHinbanMasterRegistForm> mstSalesHinbanMasterGrid;

    /**
     * @return MST_SALES_HINBAN_MASTER登録フォームのリスト
     */
    public List<MstSalesHinbanMasterRegistForm> getMstSalesHinbanMasterGrid() {
        return mstSalesHinbanMasterGrid;
    }

    /**
     * @param p MST_SALES_HINBAN_MASTER登録フォームのリスト
     */
    public void setMstSalesHinbanMasterGrid(final List<MstSalesHinbanMasterRegistForm> p) {
        this.mstSalesHinbanMasterGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
