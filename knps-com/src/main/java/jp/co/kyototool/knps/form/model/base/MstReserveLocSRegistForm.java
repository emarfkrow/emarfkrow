package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_RESERVE_LOC一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstReserveLocSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstReserveLocRegistForm.class);

    /** MST_RESERVE_LOC登録フォームのリスト */
    @Valid
    private List<MstReserveLocRegistForm> mstReserveLocGrid;

    /**
     * @return MST_RESERVE_LOC登録フォームのリスト
     */
    public List<MstReserveLocRegistForm> getMstReserveLocGrid() {
        return mstReserveLocGrid;
    }

    /**
     * @param p MST_RESERVE_LOC登録フォームのリスト
     */
    public void setMstReserveLocGrid(final List<MstReserveLocRegistForm> p) {
        this.mstReserveLocGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
