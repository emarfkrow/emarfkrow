package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_STORE_MAINTE_GYO_DET登録フォーム
 *
 * @author emarfkrow
 */
public class PrdStoreMainteGyoDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdStoreMainteGyoDetRegistForm.class);

    /** GYO_NO */
    @jakarta.validation.constraints.Size(max = 3)
    private String gyoNo;

    /**
     * @return GYO_NO
     */
    public String getGyoNo() {
        return gyoNo;
    }

    /**
     * @param p GYO_NO
     */
    public void setGyoNo(final String p) {
        this.gyoNo = p;
    }

    /** GYO_POS */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 4)
    private String gyoPos;

    /**
     * @return GYO_POS
     */
    public String getGyoPos() {
        return gyoPos;
    }

    /**
     * @param p GYO_POS
     */
    public void setGyoPos(final String p) {
        this.gyoPos = p;
    }

    /** HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return hinban;
    }

    /**
     * @param p HINBAN
     */
    public void setHinban(final String p) {
        this.hinban = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
