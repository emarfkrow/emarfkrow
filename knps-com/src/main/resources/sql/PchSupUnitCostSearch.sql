SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    PCH_SUP_UNIT_COST a 
WHERE
    1 = 1 
    AND TRIM (a.close_date) = TRIM (:close_date) 
    AND a.close_date >= :close_date_1 
    AND a.close_date <= :close_date_2 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND TRIM (a.sup_code) IN (:sup_code) 
    AND a.proprietary_total_counts = :proprietary_total_counts 
    AND a.proprietary_total_counts >= :proprietary_total_counts_1 
    AND a.proprietary_total_counts <= :proprietary_total_counts_2 
    AND a.proprietary_total_cost = :proprietary_total_cost 
    AND a.last_prch_unit_cost = :last_prch_unit_cost 
    AND TRIM (a.last_act_date) = TRIM (:last_act_date) 
    AND a.last_act_date >= :last_act_date_1 
    AND a.last_act_date <= :last_act_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND a.lower_cost_kbn IN (:lower_cost_kbn) 
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
