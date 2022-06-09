SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
    , (SELECT r2."WC_NAME" FROM MST_WC r2 WHERE r2."WC_CODE" = a."WC_CODE") AS "WC_NAME"
    , (SELECT r3."SUP_NAME" FROM MST_SUPPLIER r3 WHERE r3."SUP_CODE" = a."SUP_CODE") AS "SUP_NAME"
FROM
    MFG_TOTAL_COST_REG_LINE_Y2 a 
WHERE
    1 = 1 
    AND TRIM (a."YY") = TRIM (:yy) 
    AND a."PRO_GROUP_NO" = :pro_group_no 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ROUTING" = :routing 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND a."LAST_ROUTING_KBN" IN (:last_routing_kbn) 
    AND CASE WHEN a."TOTAL_COST_TARGET_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."TOTAL_COST_TARGET_FLAG") END IN (:total_cost_target_flag) 
    AND a."COST_RATE_KBN" IN (:cost_rate_kbn) 
    AND a."UNIT_COST_FIRST" = :unit_cost_first 
    AND a."UNIT_COST_SECOND" = :unit_cost_second 
    AND a."TOTAL_UNIT_COST" = :total_unit_cost 
    AND a."SUM_COST_FIRST" = :sum_cost_first 
    AND a."SUM_COST_SECOND" = :sum_cost_second 
    AND a."TOTAL_SUM_COST" = :total_sum_cost 
    AND a."OPE_COUNTS" = :ope_counts 
    AND a."OPE_COUNTS" >= :ope_counts_1 
    AND a."OPE_COUNTS" <= :ope_counts_2 
    AND a."OPE_AMOUNTS" = :ope_amounts 
    AND a."UNIT_WEIGHT" = :unit_weight 
    AND a."OPE_TIME" = :ope_time 
    AND a."HUM_PRE_TIME" = :hum_pre_time 
    AND a."HUM_ACT_TIME" = :hum_act_time 
    AND a."MAC_PRE_TIME" = :mac_pre_time 
    AND a."MAC_ACT_TIME" = :mac_act_time 
    AND a."SUM_UNIT_SUPPLY" = :sum_unit_supply 
    AND a."MATERIALS_COST" = :materials_cost 
    AND a."HUM_LABOR_COST_FIRST" = :hum_labor_cost_first 
    AND a."HUM_EXPENSES_FIRST" = :hum_expenses_first 
    AND a."HUM_LABOR_COST_SECOND" = :hum_labor_cost_second 
    AND a."HUM_EXPENSES_SECOND" = :hum_expenses_second 
    AND a."MAC_LABOR_COST_FIRST" = :mac_labor_cost_first 
    AND a."MAC_EXPENSES_FIRST" = :mac_expenses_first 
    AND a."MAC_LABOR_COST_SECOND" = :mac_labor_cost_second 
    AND a."MAC_EXPENSES_SECOND" = :mac_expenses_second 
    AND a."DATA_SOURCE_KBN" IN (:data_source_kbn) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."HINBAN", a."YY", a."PRO_GROUP_NO", a."ROUTING"
