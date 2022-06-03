package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * セット構成マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MSetkoseSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSetkoseRegistForm.class);

    /** セット構成マスタ登録フォームのリスト */
    @Valid
    private List<MSetkoseRegistForm> mSetkoseGrid;

    /**
     * @return セット構成マスタ登録フォームのリスト
     */
    public List<MSetkoseRegistForm> getMSetkoseGrid() {
        return mSetkoseGrid;
    }

    /**
     * @param p セット構成マスタ登録フォームのリスト
     */
    public void setMSetkoseGrid(final List<MSetkoseRegistForm> p) {
        this.mSetkoseGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
