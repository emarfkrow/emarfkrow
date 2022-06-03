package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 人事マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MJinjiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MJinjiRegistForm.class);

    /** 人事マスタ登録フォームのリスト */
    @Valid
    private List<MJinjiRegistForm> mJinjiGrid;

    /**
     * @return 人事マスタ登録フォームのリスト
     */
    public List<MJinjiRegistForm> getMJinjiGrid() {
        return mJinjiGrid;
    }

    /**
     * @param p 人事マスタ登録フォームのリスト
     */
    public void setMJinjiGrid(final List<MJinjiRegistForm> p) {
        this.mJinjiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
