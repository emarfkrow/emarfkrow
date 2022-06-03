SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a."SUP_CODE") AS SUP_NAME
FROM
    PCH_SUP_UNIT_COST a 
WHERE
    1 = 1 
    AND TRIM (a."CLOSE_DATE") = TRIM (:close_date) 
    AND a."CLOSE_DATE" >= :close_date_1 
    AND a."CLOSE_DATE" <= :close_date_2 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND a."PROPRIETARY_TOTAL_COUNTS" = :proprietary_total_counts 
    AND a."PROPRIETARY_TOTAL_COUNTS" >= :proprietary_total_counts_1 
    AND a."PROPRIETARY_TOTAL_COUNTS" <= :proprietary_total_counts_2 
    AND a."PROPRIETARY_TOTAL_COST" = :proprietary_total_cost 
    AND a."LAST_PRCH_UNIT_COST" = :last_prch_unit_cost 
    AND TRIM (a."LAST_ACT_DATE") = TRIM (:last_act_date) 
    AND a."LAST_ACT_DATE" >= :last_act_date_1 
    AND a."LAST_ACT_DATE" <= :last_act_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND a."LOWER_COST_KBN" IN (:lower_cost_kbn) 
ORDER BY
    1
    , 2
    , 3
    , 4
    , 5
    , 6
    , 7
    , 8
    , 9
    , 10
    , 11
    , 12
