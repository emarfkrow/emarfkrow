package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ANTENNA一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MstAntennaSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstAntennaRegistForm.class);

    /** MST_ANTENNA登録フォームのリスト */
    @Valid
    private List<MstAntennaRegistForm> mstAntennaGrid;

    /**
     * @return MST_ANTENNA登録フォームのリスト
     */
    public List<MstAntennaRegistForm> getMstAntennaGrid() {
        return mstAntennaGrid;
    }

    /**
     * @param p MST_ANTENNA登録フォームのリスト
     */
    public void setMstAntennaGrid(final List<MstAntennaRegistForm> p) {
        this.mstAntennaGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
