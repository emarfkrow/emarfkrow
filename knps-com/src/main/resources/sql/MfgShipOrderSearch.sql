SELECT
      a.*
FROM
    MFG_SHIP_ORDER a 
WHERE
    1 = 1 
    AND TRIM (a.ship_order_no) = TRIM (:ship_order_no) 
    AND TRIM (a.child_plan_no) = TRIM (:child_plan_no) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.ship_direct_counts = :ship_direct_counts 
    AND a.ship_direct_counts >= :ship_direct_counts_1 
    AND a.ship_direct_counts <= :ship_direct_counts_2 
    AND a.ship_status = :ship_status 
    AND a.ship_counts = :ship_counts 
    AND a.ship_counts >= :ship_counts_1 
    AND a.ship_counts <= :ship_counts_2 
    AND a.ship_date = :ship_date 
    AND a.ship_date >= :ship_date_1 
    AND a.ship_date <= :ship_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.SHIP_ORDER_NO
