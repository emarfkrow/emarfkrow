package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_COMPONENT_SALES登録フォーム
 *
 * @author emarfkrow
 */
public class MstComponentSalesRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstComponentSalesRegistForm.class);

    /** COMP_HINBAN_PARENT */
    @jakarta.validation.constraints.Size(max = 20)
    private String compHinbanParent;

    /**
     * @return COMP_HINBAN_PARENT
     */
    public String getCompHinbanParent() {
        return compHinbanParent;
    }

    /**
     * @param p COMP_HINBAN_PARENT
     */
    public void setCompHinbanParent(final String p) {
        this.compHinbanParent = p;
    }

    /** COMP_HINBAN_CHILD */
    @jakarta.validation.constraints.Size(max = 20)
    private String compHinbanChild;

    /**
     * @return COMP_HINBAN_CHILD
     */
    public String getCompHinbanChild() {
        return compHinbanChild;
    }

    /**
     * @param p COMP_HINBAN_CHILD
     */
    public void setCompHinbanChild(final String p) {
        this.compHinbanChild = p;
    }

    /** SET_NUMBER */
    @jakarta.validation.constraints.Size(max = 3)
    private String setNumber;

    /**
     * @return SET_NUMBER
     */
    public String getSetNumber() {
        return setNumber;
    }

    /**
     * @param p SET_NUMBER
     */
    public void setSetNumber(final String p) {
        this.setNumber = p;
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

    /** PROVISIONS_KBN */
    @jakarta.validation.constraints.Size(max = 1)
    private String provisionsKbn;

    /**
     * @return PROVISIONS_KBN
     */
    public String getProvisionsKbn() {
        return provisionsKbn;
    }

    /**
     * @param p PROVISIONS_KBN
     */
    public void setProvisionsKbn(final String p) {
        this.provisionsKbn = p;
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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
