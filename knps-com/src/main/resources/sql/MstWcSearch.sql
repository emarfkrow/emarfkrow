SELECT
      a.*
    , (SELECT r1.ROUTING_NAME FROM MST_PROC r1 WHERE r1.ROUTING_CODE = a.ROUTING_CODE) AS ROUTING_NAME
    , (SELECT r2.WS_NAME FROM MST_WS r2 WHERE r2.WS_CODE = a.WS_CODE) AS WS_NAME
    , (SELECT r3.COST_CENTER_NAME FROM MST_COST_CENTER r3 WHERE r3.COST_CENTER_CODE = a.COST_CENTER_CODE) AS COST_CENTER_NAME
    , (SELECT r4.SUB_INV_NAME FROM MST_SUBINV r4 WHERE r4.SUB_INV_CODE = a.SUB_INV_CODE) AS SUB_INV_NAME
FROM
    MST_WC a 
WHERE
    1 = 1 
    AND a.wc_code IN (:wc_code) 
    AND a.wc_name LIKE '%' || :wc_name || '%' 
    AND a.norm_lt = :norm_lt 
    AND a.mac_norm_ability = :mac_norm_ability 
    AND a.mac_max_ability = :mac_max_ability 
    AND a.mac_counts = :mac_counts 
    AND a.mac_counts >= :mac_counts_1 
    AND a.mac_counts <= :mac_counts_2 
    AND TRIM (a.act_gather_pat_no) = TRIM (:act_gather_pat_no) 
    AND TRIM (a.ope_form_pat_no) = TRIM (:ope_form_pat_no) 
    AND a.delay_alert_days = :delay_alert_days 
    AND TRIM (a.ato_control) = TRIM (:ato_control) 
    AND a.routing_code IN (:routing_code) 
    AND a.in_out_kbn IN (:in_out_kbn) 
    AND a.ws_code IN (:ws_code) 
    AND a.cost_center_code IN (:cost_center_code) 
    AND a.neck_kbn IN (:neck_kbn) 
    AND a.sub_inv_code IN (:sub_inv_code) 
    AND a.stock_control = :stock_control 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND a.st_alert_ratio = :st_alert_ratio 
    AND a.act_input_type = :act_input_type 
    AND CASE WHEN a.nichiji_shime_f IS NULL THEN '0' ELSE TO_CHAR (a.nichiji_shime_f) END IN (:nichiji_shime_f) 
ORDER BY
    a.WC_CODE
