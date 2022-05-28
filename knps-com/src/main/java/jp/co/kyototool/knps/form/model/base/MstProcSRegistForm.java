package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_PROC一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstProcSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstProcRegistForm.class);

    /** MST_PROC登録フォームのリスト */
    @Valid
    private List<MstProcRegistForm> mstProcGrid;

    /**
     * @return MST_PROC登録フォームのリスト
     */
    public List<MstProcRegistForm> getMstProcGrid() {
        return mstProcGrid;
    }

    /**
     * @param p MST_PROC登録フォームのリスト
     */
    public void setMstProcGrid(final List<MstProcRegistForm> p) {
        this.mstProcGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
