package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 仕向先マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MSimukeRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSimukeRegistForm.class);

    /** 仕向けコード */
    @jakarta.validation.constraints.Size(max = 3)
    private String simukecd;

    /**
     * @return 仕向けコード
     */
    public String getSimukecd() {
        return simukecd;
    }

    /**
     * @param p 仕向けコード
     */
    public void setSimukecd(final String p) {
        this.simukecd = p;
    }

    /** 仕向け先名 */
    @jakarta.validation.constraints.Size(max = 20)
    private String simukemei;

    /**
     * @return 仕向け先名
     */
    public String getSimukemei() {
        return simukemei;
    }

    /**
     * @param p 仕向け先名
     */
    public void setSimukemei(final String p) {
        this.simukemei = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 17)
    private String filler;

    /**
     * @return 予備領域
     */
    public String getFiller() {
        return filler;
    }

    /**
     * @param p 予備領域
     */
    public void setFiller(final String p) {
        this.filler = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
