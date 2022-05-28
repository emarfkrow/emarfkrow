package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_CALENDAR一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstCalendarSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstCalendarRegistForm.class);

    /** MST_CALENDAR登録フォームのリスト */
    @Valid
    private List<MstCalendarRegistForm> mstCalendarGrid;

    /**
     * @return MST_CALENDAR登録フォームのリスト
     */
    public List<MstCalendarRegistForm> getMstCalendarGrid() {
        return mstCalendarGrid;
    }

    /**
     * @param p MST_CALENDAR登録フォームのリスト
     */
    public void setMstCalendarGrid(final List<MstCalendarRegistForm> p) {
        this.mstCalendarGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
