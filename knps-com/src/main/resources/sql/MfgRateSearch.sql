SELECT
      a.*
FROM
    MFG_RATE a 
WHERE
    1 = 1 
    AND TRIM (a."RATE_CODE") IN (:rate_code) 
    AND a."IN_OUT_KBN" IN (:in_out_kbn) 
    AND a."RATE_KBN" IN (:rate_kbn) 
    AND a."HUM_LABOR_COST_FIRST" = :hum_labor_cost_first 
    AND a."HUM_EXPENSES_FIRST" = :hum_expenses_first 
    AND a."HUM_LABOR_COST_SECOND" = :hum_labor_cost_second 
    AND a."HUM_EXPENSES_SECOND" = :hum_expenses_second 
    AND a."MAC_LABOR_COST_FIRST" = :mac_labor_cost_first 
    AND a."MAC_EXPENSES_FIRST" = :mac_expenses_first 
    AND a."MAC_LABOR_COST_SECOND" = :mac_labor_cost_second 
    AND a."MAC_EXPENSES_SECOND" = :mac_expenses_second 
    AND a."OUT_COST_SECOND" = :out_cost_second 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."RATE_CODE"
