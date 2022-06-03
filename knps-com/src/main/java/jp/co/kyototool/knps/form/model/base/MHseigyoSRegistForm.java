package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 販売制御マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MHseigyoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHseigyoRegistForm.class);

    /** 販売制御マスタ登録フォームのリスト */
    @Valid
    private List<MHseigyoRegistForm> mHseigyoGrid;

    /**
     * @return 販売制御マスタ登録フォームのリスト
     */
    public List<MHseigyoRegistForm> getMHseigyoGrid() {
        return mHseigyoGrid;
    }

    /**
     * @param p 販売制御マスタ登録フォームのリスト
     */
    public void setMHseigyoGrid(final List<MHseigyoRegistForm> p) {
        this.mHseigyoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
