package jp.co.kyototool.knps.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * MFG_KANBAN_FORM_HED登録フォーム
 *
 * @author emarfkrow
 */
public class MfgKanbanFormHedRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MfgKanbanFormHedRegistForm.class);

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

    /** KANBAN_TEMPLATE_NAME */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String kanbanTemplateName;

    /**
     * @return KANBAN_TEMPLATE_NAME
     */
    public String getKanbanTemplateName() {
        return kanbanTemplateName;
    }

    /**
     * @param p KANBAN_TEMPLATE_NAME
     */
    public void setKanbanTemplateName(final String p) {
        this.kanbanTemplateName = p;
    }

    /** SELF_PROC_AFTER_TUNNEL_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String selfProcAfterTunnelFlg;

    /**
     * @return SELF_PROC_AFTER_TUNNEL_FLG
     */
    public String getSelfProcAfterTunnelFlg() {
        return selfProcAfterTunnelFlg;
    }

    /**
     * @param p SELF_PROC_AFTER_TUNNEL_FLG
     */
    public void setSelfProcAfterTunnelFlg(final String p) {
        this.selfProcAfterTunnelFlg = p;
    }

    /** OUTPUT_PER_PAGE */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String outputPerPage;

    /**
     * @return OUTPUT_PER_PAGE
     */
    public String getOutputPerPage() {
        return outputPerPage;
    }

    /**
     * @param p OUTPUT_PER_PAGE
     */
    public void setOutputPerPage(final String p) {
        this.outputPerPage = p;
    }

    /** AUTO_SHAPE_FLG */
    @jakarta.validation.constraints.Size(max = 1)
    private String autoShapeFlg;

    /**
     * @return AUTO_SHAPE_FLG
     */
    public String getAutoShapeFlg() {
        return autoShapeFlg;
    }

    /**
     * @param p AUTO_SHAPE_FLG
     */
    public void setAutoShapeFlg(final String p) {
        this.autoShapeFlg = p;
    }

    /** MFG_KANBAN_FORM_DET */
    @jakarta.validation.Valid
    private List<MfgKanbanFormDetRegistForm> mfgKanbanFormDetGrid;

    /**
     * @return MFG_KANBAN_FORM_DET
     */
    public List<MfgKanbanFormDetRegistForm> getMfgKanbanFormDetGrid() {
        return mfgKanbanFormDetGrid;
    }

    /**
     * @param p
     */
    public void setMfgKanbanFormDetGrid(final List<MfgKanbanFormDetRegistForm> p) {
        this.mfgKanbanFormDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
