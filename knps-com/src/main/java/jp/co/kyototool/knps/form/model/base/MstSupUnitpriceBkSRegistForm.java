package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SUP_UNITPRICE_BK一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstSupUnitpriceBkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSupUnitpriceBkRegistForm.class);

    /** MST_SUP_UNITPRICE_BK登録フォームのリスト */
    @Valid
    private List<MstSupUnitpriceBkRegistForm> mstSupUnitpriceBkGrid;

    /**
     * @return MST_SUP_UNITPRICE_BK登録フォームのリスト
     */
    public List<MstSupUnitpriceBkRegistForm> getMstSupUnitpriceBkGrid() {
        return mstSupUnitpriceBkGrid;
    }

    /**
     * @param p MST_SUP_UNITPRICE_BK登録フォームのリスト
     */
    public void setMstSupUnitpriceBkGrid(final List<MstSupUnitpriceBkRegistForm> p) {
        this.mstSupUnitpriceBkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
