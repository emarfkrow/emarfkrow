package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 販売カレンダー一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MHcalendSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHcalendRegistForm.class);

    /** 販売カレンダー登録フォームのリスト */
    @Valid
    private List<MHcalendRegistForm> mHcalendGrid;

    /**
     * @return 販売カレンダー登録フォームのリスト
     */
    public List<MHcalendRegistForm> getMHcalendGrid() {
        return mHcalendGrid;
    }

    /**
     * @param p 販売カレンダー登録フォームのリスト
     */
    public void setMHcalendGrid(final List<MHcalendRegistForm> p) {
        this.mHcalendGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
