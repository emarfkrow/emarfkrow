package jp.co.kyototool.knps.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import jp.co.kyototool.knps.entity.InvStockSurveyStat;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * INV_STOCK_SURVEY_STAT照会
 *
 * @author emarfkrow
 */
public class InvStockSurveyStatGetAction extends BaseAction {

    /** INV_STOCK_SURVEY_STAT照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object recNo = postJson.get("recNo");
        if (recNo == null) {
            recNo = postJson.get("InvStockSurveyStat.recNo");
        }
        if (recNo == null) {
            return map;
        }

        InvStockSurveyStat invStockSurveyStat = InvStockSurveyStat.get(recNo);
        invStockSurveyStat.referPrdOrderpointCondition();
        invStockSurveyStat.referPrdPreStatusHead();
        invStockSurveyStat.referSysCloseStatus();
        map.put("InvStockSurveyStat", invStockSurveyStat);
        return map;
    }

}
