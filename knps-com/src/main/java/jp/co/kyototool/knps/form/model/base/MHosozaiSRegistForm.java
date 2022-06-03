package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 包装材マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MHosozaiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHosozaiRegistForm.class);

    /** 包装材マスタ登録フォームのリスト */
    @Valid
    private List<MHosozaiRegistForm> mHosozaiGrid;

    /**
     * @return 包装材マスタ登録フォームのリスト
     */
    public List<MHosozaiRegistForm> getMHosozaiGrid() {
        return mHosozaiGrid;
    }

    /**
     * @param p 包装材マスタ登録フォームのリスト
     */
    public void setMHosozaiGrid(final List<MHosozaiRegistForm> p) {
        this.mHosozaiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
