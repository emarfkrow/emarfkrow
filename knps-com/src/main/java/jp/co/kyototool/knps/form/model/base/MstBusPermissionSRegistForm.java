package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_BUS_PERMISSION一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstBusPermissionSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstBusPermissionRegistForm.class);

    /** MST_BUS_PERMISSION登録フォームのリスト */
    @Valid
    private List<MstBusPermissionRegistForm> mstBusPermissionGrid;

    /**
     * @return MST_BUS_PERMISSION登録フォームのリスト
     */
    public List<MstBusPermissionRegistForm> getMstBusPermissionGrid() {
        return mstBusPermissionGrid;
    }

    /**
     * @param p MST_BUS_PERMISSION登録フォームのリスト
     */
    public void setMstBusPermissionGrid(final List<MstBusPermissionRegistForm> p) {
        this.mstBusPermissionGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
