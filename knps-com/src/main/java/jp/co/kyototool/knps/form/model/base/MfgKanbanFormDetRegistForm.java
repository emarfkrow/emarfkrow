package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_FORM_DET登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanFormDetRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanFormDetRegistForm.class);

    /** KANBAN_FORM_DEF_NAME */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String kanbanFormDefName;

    /**
     * @return KANBAN_FORM_DEF_NAME
     */
    public String getKanbanFormDefName() {
        return kanbanFormDefName;
    }

    /**
     * @param p KANBAN_FORM_DEF_NAME
     */
    public void setKanbanFormDefName(final String p) {
        this.kanbanFormDefName = p;
    }

    /** EXCEL_CELL_NAME */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String excelCellName;

    /**
     * @return EXCEL_CELL_NAME
     */
    public String getExcelCellName() {
        return excelCellName;
    }

    /**
     * @param p EXCEL_CELL_NAME
     */
    public void setExcelCellName(final String p) {
        this.excelCellName = p;
    }

    /** BASIC_OR_TUNNNEL_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String basicOrTunnnelFlg;

    /**
     * @return BASIC_OR_TUNNNEL_FLG
     */
    public String getBasicOrTunnnelFlg() {
        return basicOrTunnnelFlg;
    }

    /**
     * @param p BASIC_OR_TUNNNEL_FLG
     */
    public void setBasicOrTunnnelFlg(final String p) {
        this.basicOrTunnnelFlg = p;
    }

    /** DISP_ORDER */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 3)
    private String dispOrder;

    /**
     * @return DISP_ORDER
     */
    public String getDispOrder() {
        return dispOrder;
    }

    /**
     * @param p DISP_ORDER
     */
    public void setDispOrder(final String p) {
        this.dispOrder = p;
    }

    /** ITEM_CODE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 3)
    private String itemCode;

    /**
     * @return ITEM_CODE
     */
    public String getItemCode() {
        return itemCode;
    }

    /**
     * @param p ITEM_CODE
     */
    public void setItemCode(final String p) {
        this.itemCode = p;
    }

    /** VALID_FLG */
    @jakarta.validation.constraints.Size(max = 3)
    private String validFlg;

    /**
     * @return VALID_FLG
     */
    public String getValidFlg() {
        return validFlg;
    }

    /**
     * @param p VALID_FLG
     */
    public void setValidFlg(final String p) {
        this.validFlg = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
