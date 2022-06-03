package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * バーコードマスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MBarcdSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MBarcdRegistForm.class);

    /** バーコードマスタ登録フォームのリスト */
    @Valid
    private List<MBarcdRegistForm> mBarcdGrid;

    /**
     * @return バーコードマスタ登録フォームのリスト
     */
    public List<MBarcdRegistForm> getMBarcdGrid() {
        return mBarcdGrid;
    }

    /**
     * @param p バーコードマスタ登録フォームのリスト
     */
    public void setMBarcdGrid(final List<MBarcdRegistForm> p) {
        this.mBarcdGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
