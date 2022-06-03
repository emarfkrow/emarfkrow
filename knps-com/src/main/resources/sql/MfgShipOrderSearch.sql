SELECT
      a.*
FROM
    MFG_SHIP_ORDER a 
WHERE
    1 = 1 
    AND TRIM (a."SHIP_ORDER_NO") = TRIM (:ship_order_no) 
    AND TRIM (a."CHILD_PLAN_NO") = TRIM (:child_plan_no) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."SHIP_DIRECT_COUNTS" = :ship_direct_counts 
    AND a."SHIP_DIRECT_COUNTS" >= :ship_direct_counts_1 
    AND a."SHIP_DIRECT_COUNTS" <= :ship_direct_counts_2 
    AND a."SHIP_STATUS" = :ship_status 
    AND a."SHIP_COUNTS" = :ship_counts 
    AND a."SHIP_COUNTS" >= :ship_counts_1 
    AND a."SHIP_COUNTS" <= :ship_counts_2 
    AND a."SHIP_DATE" = :ship_date 
    AND a."SHIP_DATE" >= :ship_date_1 
    AND a."SHIP_DATE" <= :ship_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."SHIP_ORDER_NO"
