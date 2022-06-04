package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * ＳＫ品番マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MSkhinRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSkhinRegistForm.class);

    /** 販売品番 */
    @jakarta.validation.constraints.Size(max = 20)
    private String hhinban;

    /**
     * @return 販売品番
     */
    public String getHhinban() {
        return hhinban;
    }

    /**
     * @param p 販売品番
     */
    public void setHhinban(final String p) {
        this.hhinban = p;
    }

    /** ＳＫ区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String skkbn;

    /**
     * @return ＳＫ区分
     */
    public String getSkkbn() {
        return skkbn;
    }

    /**
     * @param p ＳＫ区分
     */
    public void setSkkbn(final String p) {
        this.skkbn = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
