package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 国名マスタ一覧登録フォーム
 *
 * @author emarfkrow
 */
public class MKunimeiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MKunimeiRegistForm.class);

    /** 国名マスタ登録フォームのリスト */
    @Valid
    private List<MKunimeiRegistForm> mKunimeiGrid;

    /**
     * @return 国名マスタ登録フォームのリスト
     */
    public List<MKunimeiRegistForm> getMKunimeiGrid() {
        return mKunimeiGrid;
    }

    /**
     * @param p 国名マスタ登録フォームのリスト
     */
    public void setMKunimeiGrid(final List<MKunimeiRegistForm> p) {
        this.mKunimeiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("not overridden in subclasses.");
    }

}
