package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ＳＫ品番マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MSkhinSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSkhinRegistForm.class);

    /** ＳＫ品番マスタ登録フォームのリスト */
    @Valid
    private List<MSkhinRegistForm> mSkhinGrid;

    /**
     * @return ＳＫ品番マスタ登録フォームのリスト
     */
    public List<MSkhinRegistForm> getMSkhinGrid() {
        return mSkhinGrid;
    }

    /**
     * @param p ＳＫ品番マスタ登録フォームのリスト
     */
    public void setMSkhinGrid(final List<MSkhinRegistForm> p) {
        this.mSkhinGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
