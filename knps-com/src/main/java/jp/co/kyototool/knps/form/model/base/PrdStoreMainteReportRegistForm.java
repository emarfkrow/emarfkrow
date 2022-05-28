package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * PRD_STORE_MAINTE_REPORT登録フォーム
 *
 * @author emarfkrow
 */
public class PrdStoreMainteReportRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(PrdStoreMainteReportRegistForm.class);

    /** REP_GROUP_CODE */
    @jakarta.validation.constraints.Size(max = 2)
    private String repGroupCode;

    /**
     * @return REP_GROUP_CODE
     */
    public String getRepGroupCode() {
        return repGroupCode;
    }

    /**
     * @param p REP_GROUP_CODE
     */
    public void setRepGroupCode(final String p) {
        this.repGroupCode = p;
    }

    /** GROUP_NAME */
    @jakarta.validation.constraints.Size(max = 20)
    private String groupName;

    /**
     * @return GROUP_NAME
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * @param p GROUP_NAME
     */
    public void setGroupName(final String p) {
        this.groupName = p;
    }

    /** RETSU_NO */
    @jakarta.validation.constraints.Size(max = 3)
    private String retsuNo;

    /**
     * @return RETSU_NO
     */
    public String getRetsuNo() {
        return retsuNo;
    }

    /**
     * @param p RETSU_NO
     */
    public void setRetsuNo(final String p) {
        this.retsuNo = p;
    }

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

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
