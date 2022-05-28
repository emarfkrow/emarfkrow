package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_SET_CONSTITUTION登録フォーム
 *
 * @author emarfkrow
 */
public class MstSetConstitutionRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstSetConstitutionRegistForm.class);

    /** SET_HINBAN */
    @jakarta.validation.constraints.Size(max = 20)
    private String setHinban;

    /**
     * @return SET_HINBAN
     */
    public String getSetHinban() {
        return setHinban;
    }

    /**
     * @param p SET_HINBAN
     */
    public void setSetHinban(final String p) {
        this.setHinban = p;
    }

    /** SET_CHILD_HINBAN */
    @jakarta.validation.constraints.Size(max = 20)
    private String setChildHinban;

    /**
     * @return SET_CHILD_HINBAN
     */
    public String getSetChildHinban() {
        return setChildHinban;
    }

    /**
     * @param p SET_CHILD_HINBAN
     */
    public void setSetChildHinban(final String p) {
        this.setChildHinban = p;
    }

    /** DELETE_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteFlag;

    /**
     * @return DELETE_FLAG
     */
    public String getDeleteFlag() {
        return deleteFlag;
    }

    /**
     * @param p DELETE_FLAG
     */
    public void setDeleteFlag(final String p) {
        this.deleteFlag = p;
    }

    /** BOTTOM_FLAG */
    @jakarta.validation.constraints.Size(max = 1)
    private String bottomFlag;

    /**
     * @return BOTTOM_FLAG
     */
    public String getBottomFlag() {
        return bottomFlag;
    }

    /**
     * @param p BOTTOM_FLAG
     */
    public void setBottomFlag(final String p) {
        this.bottomFlag = p;
    }

    /** SET_COUNT */
    @jakarta.validation.constraints.Size(max = 3)
    private String setCount;

    /**
     * @return SET_COUNT
     */
    public String getSetCount() {
        return setCount;
    }

    /**
     * @param p SET_COUNT
     */
    public void setSetCount(final String p) {
        this.setCount = p;
    }

    /** GRATIS_SUPPLY_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String gratisSupplyKbn;

    /**
     * @return GRATIS_SUPPLY_KBN
     */
    public String getGratisSupplyKbn() {
        return gratisSupplyKbn;
    }

    /**
     * @param p GRATIS_SUPPLY_KBN
     */
    public void setGratisSupplyKbn(final String p) {
        this.gratisSupplyKbn = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
