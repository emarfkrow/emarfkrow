package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_OPE_DETAIL登録フォーム
 *
 * @author emarfkrow
 */
public class MstOpeDetailRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstOpeDetailRegistForm.class);

    /** OPE_DETAIL */
    @jakarta.validation.constraints.Size(max = 10)
    private String opeDetail;

    /**
     * @return OPE_DETAIL
     */
    public String getOpeDetail() {
        return opeDetail;
    }

    /**
     * @param p OPE_DETAIL
     */
    public void setOpeDetail(final String p) {
        this.opeDetail = p;
    }

    /** OPE_DETAIL_NAME */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 20)
    private String opeDetailName;

    /**
     * @return OPE_DETAIL_NAME
     */
    public String getOpeDetailName() {
        return opeDetailName;
    }

    /**
     * @param p OPE_DETAIL_NAME
     */
    public void setOpeDetailName(final String p) {
        this.opeDetailName = p;
    }

    /** OPE_DETAIL_COMMENT */
    @jakarta.validation.constraints.Size(max = 100)
    private String opeDetailComment;

    /**
     * @return OPE_DETAIL_COMMENT
     */
    public String getOpeDetailComment() {
        return opeDetailComment;
    }

    /**
     * @param p OPE_DETAIL_COMMENT
     */
    public void setOpeDetailComment(final String p) {
        this.opeDetailComment = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
