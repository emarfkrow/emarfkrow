package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_ID登録フォーム
 *
 * @author emarfkrow
 */
public class MstIdRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstIdRegistForm.class);

    /** ID_TYPE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 0)
    private String idType;

    /**
     * @return ID_TYPE
     */
    public String getIdType() {
        return idType;
    }

    /**
     * @param p ID_TYPE
     */
    public void setIdType(final String p) {
        this.idType = p;
    }

    /** ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 0)
    private String id;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param p ID
     */
    public void setId(final String p) {
        this.id = p;
    }

    /** ID_MAX */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 0)
    private String idMax;

    /**
     * @return ID_MAX
     */
    public String getIdMax() {
        return idMax;
    }

    /**
     * @param p ID_MAX
     */
    public void setIdMax(final String p) {
        this.idMax = p;
    }

    /** ID_MIN */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 0)
    private String idMin;

    /**
     * @return ID_MIN
     */
    public String getIdMin() {
        return idMin;
    }

    /**
     * @param p ID_MIN
     */
    public void setIdMin(final String p) {
        this.idMin = p;
    }

    /** ID_COMMENT */
    @jakarta.validation.constraints.Size(max = 100)
    private String idComment;

    /**
     * @return ID_COMMENT
     */
    public String getIdComment() {
        return idComment;
    }

    /**
     * @param p ID_COMMENT
     */
    public void setIdComment(final String p) {
        this.idComment = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
