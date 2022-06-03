package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 契約単価マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MKtankaSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MKtankaRegistForm.class);

    /** 契約単価マスタ登録フォームのリスト */
    @Valid
    private List<MKtankaRegistForm> mKtankaGrid;

    /**
     * @return 契約単価マスタ登録フォームのリスト
     */
    public List<MKtankaRegistForm> getMKtankaGrid() {
        return mKtankaGrid;
    }

    /**
     * @param p 契約単価マスタ登録フォームのリスト
     */
    public void setMKtankaGrid(final List<MKtankaRegistForm> p) {
        this.mKtankaGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
