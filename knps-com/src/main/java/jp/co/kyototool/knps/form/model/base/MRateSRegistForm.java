package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 為替レートマスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MRateSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MRateRegistForm.class);

    /** 為替レートマスタ登録フォームのリスト */
    @Valid
    private List<MRateRegistForm> mRateGrid;

    /**
     * @return 為替レートマスタ登録フォームのリスト
     */
    public List<MRateRegistForm> getMRateGrid() {
        return mRateGrid;
    }

    /**
     * @param p 為替レートマスタ登録フォームのリスト
     */
    public void setMRateGrid(final List<MRateRegistForm> p) {
        this.mRateGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
