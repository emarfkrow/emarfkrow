package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MST_PROC登録フォーム
 *
 * @author emarfkrow
 */
public class MstProcRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MstProcRegistForm.class);

    /** ROUTING_CODE */
    @jakarta.validation.constraints.Size(max = 10)
    private String routingCode;

    /**
     * @return ROUTING_CODE
     */
    public String getRoutingCode() {
        return routingCode;
    }

    /**
     * @param p ROUTING_CODE
     */
    public void setRoutingCode(final String p) {
        this.routingCode = p;
    }

    /** ROUTING_NAME */
    @jakarta.validation.constraints.Size(max = 30)
    private String routingName;

    /**
     * @return ROUTING_NAME
     */
    public String getRoutingName() {
        return routingName;
    }

    /**
     * @param p ROUTING_NAME
     */
    public void setRoutingName(final String p) {
        this.routingName = p;
    }

    /** ROUTING_NAME_SHT */
    @jakarta.validation.constraints.Size(max = 16)
    private String routingNameSht;

    /**
     * @return ROUTING_NAME_SHT
     */
    public String getRoutingNameSht() {
        return routingNameSht;
    }

    /**
     * @param p ROUTING_NAME_SHT
     */
    public void setRoutingNameSht(final String p) {
        this.routingNameSht = p;
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

    /** EXCEL_COLOR_INDEX */
    @jakarta.validation.constraints.Size(max = 2)
    private String excelColorIndex;

    /**
     * @return EXCEL_COLOR_INDEX
     */
    public String getExcelColorIndex() {
        return excelColorIndex;
    }

    /**
     * @param p EXCEL_COLOR_INDEX
     */
    public void setExcelColorIndex(final String p) {
        this.excelColorIndex = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
