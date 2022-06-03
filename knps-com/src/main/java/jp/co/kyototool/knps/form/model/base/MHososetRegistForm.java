package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 包装材構成マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MHososetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MHososetRegistForm.class);

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

    /** 包装品番 */
    @jakarta.validation.constraints.Size(max = 25)
    private String hosoHinban;

    /**
     * @return 包装品番
     */
    public String getHosoHinban() {
        return hosoHinban;
    }

    /**
     * @param p 包装品番
     */
    public void setHosoHinban(final String p) {
        this.hosoHinban = p;
    }

    /** 員数 */
    @jakarta.validation.constraints.Size(max = 3)
    private String inzu;

    /**
     * @return 員数
     */
    public String getInzu() {
        return inzu;
    }

    /**
     * @param p 員数
     */
    public void setInzu(final String p) {
        this.inzu = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 22)
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
