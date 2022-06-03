SELECT
      a.*
    , (SELECT r1.ROUTING_NAME FROM MST_PROC r1 WHERE r1.ROUTING_CODE = a."ROUTING_CODE") AS ROUTING_NAME
    , (SELECT r2.WS_NAME FROM MST_WS r2 WHERE r2.WS_CODE = a."WS_CODE") AS WS_NAME
    , (SELECT r3.COST_CENTER_NAME FROM MST_COST_CENTER r3 WHERE r3.COST_CENTER_CODE = a."COST_CENTER_CODE") AS COST_CENTER_NAME
    , (SELECT r4.SUB_INV_NAME FROM MST_SUBINV r4 WHERE r4.SUB_INV_CODE = a."SUB_INV_CODE") AS SUB_INV_NAME
FROM
    MST_WC a 
WHERE
    1 = 1 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND a."WC_NAME" LIKE '%' || :wc_name || '%' 
    AND a."NORM_LT" = :norm_lt 
    AND a."MAC_NORM_ABILITY" = :mac_norm_ability 
    AND a."MAC_MAX_ABILITY" = :mac_max_ability 
    AND a."MAC_COUNTS" = :mac_counts 
    AND a."MAC_COUNTS" >= :mac_counts_1 
    AND a."MAC_COUNTS" <= :mac_counts_2 
    AND TRIM (a."ACT_GATHER_PAT_NO") = TRIM (:act_gather_pat_no) 
    AND TRIM (a."OPE_FORM_PAT_NO") = TRIM (:ope_form_pat_no) 
    AND a."DELAY_ALERT_DAYS" = :delay_alert_days 
    AND TRIM (a."ATO_CONTROL") = TRIM (:ato_control) 
    AND TRIM (a."ROUTING_CODE") IN (:routing_code) 
    AND a."IN_OUT_KBN" IN (:in_out_kbn) 
    AND TRIM (a."WS_CODE") IN (:ws_code) 
    AND TRIM (a."COST_CENTER_CODE") IN (:cost_center_code) 
    AND a."NECK_KBN" IN (:neck_kbn) 
    AND TRIM (a."SUB_INV_CODE") IN (:sub_inv_code) 
    AND a."STOCK_CONTROL" = :stock_control 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
    AND a."ST_ALERT_RATIO" = :st_alert_ratio 
    AND a."ACT_INPUT_TYPE" = :act_input_type 
    AND CASE WHEN a."NICHIJI_SHIME_F" IS NULL THEN '0' ELSE TO_CHAR (a.NICHIJI_SHIME_F) END IN (:nichiji_shime_f) 
ORDER BY
    a."WC_CODE"
