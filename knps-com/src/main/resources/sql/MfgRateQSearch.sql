SELECT
      a.*
FROM
    MFG_RATE_Q a 
WHERE
    1 = 1 
    AND TRIM (a.rate_code) IN (:rate_code) 
    AND a.in_out_kbn IN (:in_out_kbn) 
    AND a.rate_kbn IN (:rate_kbn) 
    AND a.hum_labor_cost_first = :hum_labor_cost_first 
    AND a.hum_expenses_first = :hum_expenses_first 
    AND a.hum_labor_cost_second = :hum_labor_cost_second 
    AND a.hum_expenses_second = :hum_expenses_second 
    AND a.mac_labor_cost_first = :mac_labor_cost_first 
    AND a.mac_expenses_first = :mac_expenses_first 
    AND a.mac_labor_cost_second = :mac_labor_cost_second 
    AND a.mac_expenses_second = :mac_expenses_second 
    AND a.out_cost_second = :out_cost_second 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.RATE_CODE
