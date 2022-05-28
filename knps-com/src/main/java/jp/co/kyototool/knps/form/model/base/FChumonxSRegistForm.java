package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * F_CHUMONX一覧登録フォーム
 *
 * @author emarfkrow
 */
public class FChumonxSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(FChumonxRegistForm.class);

    /** F_CHUMONX登録フォームのリスト */
    @Valid
    private List<FChumonxRegistForm> fChumonxGrid;

    /**
     * @return F_CHUMONX登録フォームのリスト
     */
    public List<FChumonxRegistForm> getFChumonxGrid() {
        return fChumonxGrid;
    }

    /**
     * @param p F_CHUMONX登録フォームのリスト
     */
    public void setFChumonxGrid(final List<FChumonxRegistForm> p) {
        this.fChumonxGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
