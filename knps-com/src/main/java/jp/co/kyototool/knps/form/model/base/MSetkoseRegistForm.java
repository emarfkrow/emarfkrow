package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * セット構成マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MSetkoseRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MSetkoseRegistForm.class);

    /** セット品番 */
    @jakarta.validation.constraints.Size(max = 20)
    private String setHinban;

    /**
     * @return セット品番
     */
    public String getSetHinban() {
        return setHinban;
    }

    /**
     * @param p セット品番
     */
    public void setSetHinban(final String p) {
        this.setHinban = p;
    }

    /** セット子品番 */
    @jakarta.validation.constraints.Size(max = 20)
    private String setKhinban;

    /**
     * @return セット子品番
     */
    public String getSetKhinban() {
        return setKhinban;
    }

    /**
     * @param p セット子品番
     */
    public void setSetKhinban(final String p) {
        this.setKhinban = p;
    }

    /** 削除フラグ */
    @jakarta.validation.constraints.Size(max = 1)
    private String dltflg;

    /**
     * @return 削除フラグ
     */
    public String getDltflg() {
        return dltflg;
    }

    /**
     * @param p 削除フラグ
     */
    public void setDltflg(final String p) {
        this.dltflg = p;
    }

    /** ボトムフラグ */
    @jakarta.validation.constraints.Size(max = 1)
    private String botm;

    /**
     * @return ボトムフラグ
     */
    public String getBotm() {
        return botm;
    }

    /**
     * @param p ボトムフラグ
     */
    public void setBotm(final String p) {
        this.botm = p;
    }

    /** セット員数 */
    @jakarta.validation.constraints.Size(max = 3)
    private String setinzu;

    /**
     * @return セット員数
     */
    public String getSetinzu() {
        return setinzu;
    }

    /**
     * @param p セット員数
     */
    public void setSetinzu(final String p) {
        this.setinzu = p;
    }

    /** 無償支給区分 */
    @jakarta.validation.constraints.Size(max = 1)
    private String mushokbn;

    /**
     * @return 無償支給区分
     */
    public String getMushokbn() {
        return mushokbn;
    }

    /**
     * @param p 無償支給区分
     */
    public void setMushokbn(final String p) {
        this.mushokbn = p;
    }

    /** 予備領域 */
    @jakarta.validation.constraints.Size(max = 34)
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
