SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    PCH_SUPPLY_SCH a 
WHERE
    1 = 1 
    AND TRIM (a.supply_no) = TRIM (:supply_no) 
    AND TRIM (a.supply_order_no) = TRIM (:supply_order_no) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.supply_kbn IN (:supply_kbn) 
    AND a.supply_unit = :supply_unit 
    AND a.supply_unit >= :supply_unit_1 
    AND a.supply_unit <= :supply_unit_2 
    AND a.supply_counts = :supply_counts 
    AND a.supply_counts >= :supply_counts_1 
    AND a.supply_counts <= :supply_counts_2 
    AND a.act_supply_counts = :act_supply_counts 
    AND a.act_supply_counts >= :act_supply_counts_1 
    AND a.act_supply_counts <= :act_supply_counts_2 
    AND TRIM (a.sup_code) IN (:sup_code) 
    AND a.supply_date = :supply_date 
    AND a.supply_date >= :supply_date_1 
    AND a.supply_date <= :supply_date_2 
    AND a.supply_verify_stat = :supply_verify_stat 
    AND TRIM (a.user_id_verify) = TRIM (:user_id_verify) 
    AND a.supply_issue_stat = :supply_issue_stat 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.SUPPLY_NO
