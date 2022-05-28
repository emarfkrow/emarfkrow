package jp.co.kyototool.knps.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * INV_WORK_MNTH_STOCK登録フォーム
 *
 * @author emarfkrow
 */
public class InvWorkMnthStockRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(InvWorkMnthStockRegistForm.class);

    /** DATA_ID */
    @jakarta.validation.constraints.Size(max = 50)
    private String dataId;

    /**
     * @return DATA_ID
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * @param p DATA_ID
     */
    public void setDataId(final String p) {
        this.dataId = p;
    }

    /** HINBAN */
    @jakarta.validation.constraints.Size(max = 25)
    private String hinban;

    /**
     * @return HINBAN
     */
    public String getHinban() {
        return hinban;
    }

    /**
     * @param p HINBAN
     */
    public void setHinban(final String p) {
        this.hinban = p;
    }

    /** ROUTING_GROUP */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String routingGroup;

    /**
     * @return ROUTING_GROUP
     */
    public String getRoutingGroup() {
        return routingGroup;
    }

    /**
     * @param p ROUTING_GROUP
     */
    public void setRoutingGroup(final String p) {
        this.routingGroup = p;
    }

    /** ROUTING */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 2)
    private String routing;

    /**
     * @return ROUTING
     */
    public String getRouting() {
        return routing;
    }

    /**
     * @param p ROUTING
     */
    public void setRouting(final String p) {
        this.routing = p;
    }

    /** SUM_LOT_SIZE */
    @jakarta.validation.constraints.Size(max = 10)
    private String sumLotSize;

    /**
     * @return SUM_LOT_SIZE
     */
    public String getSumLotSize() {
        return sumLotSize;
    }

    /**
     * @param p SUM_LOT_SIZE
     */
    public void setSumLotSize(final String p) {
        this.sumLotSize = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
