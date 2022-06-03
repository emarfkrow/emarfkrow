package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 部品マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MPhinmokSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MPhinmokRegistForm.class);

    /** 部品マスタ登録フォームのリスト */
    @Valid
    private List<MPhinmokRegistForm> mPhinmokGrid;

    /**
     * @return 部品マスタ登録フォームのリスト
     */
    public List<MPhinmokRegistForm> getMPhinmokGrid() {
        return mPhinmokGrid;
    }

    /**
     * @param p 部品マスタ登録フォームのリスト
     */
    public void setMPhinmokGrid(final List<MPhinmokRegistForm> p) {
        this.mPhinmokGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
