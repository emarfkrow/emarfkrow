package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * セール品目マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MSalehinSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSalehinRegistForm.class);

    /** セール品目マスタ登録フォームのリスト */
    @Valid
    private List<MSalehinRegistForm> mSalehinGrid;

    /**
     * @return セール品目マスタ登録フォームのリスト
     */
    public List<MSalehinRegistForm> getMSalehinGrid() {
        return mSalehinGrid;
    }

    /**
     * @param p セール品目マスタ登録フォームのリスト
     */
    public void setMSalehinGrid(final List<MSalehinRegistForm> p) {
        this.mSalehinGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
