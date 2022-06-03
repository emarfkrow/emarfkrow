SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a."SUP_CODE") AS SUP_NAME
FROM
    PRD_DAILY_PRO_PLAN_PCH a 
WHERE
    1 = 1 
    AND TRIM (a."PCH_ORDER_NO") = TRIM (:pch_order_no) 
    AND TRIM (a."CHILD_PLAN_NO") = TRIM (:child_plan_no) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."NES_COUNTS" = :nes_counts 
    AND a."NES_COUNTS" >= :nes_counts_1 
    AND a."NES_COUNTS" <= :nes_counts_2 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND a."ORDER_COUNTS" = :order_counts 
    AND a."ORDER_COUNTS" >= :order_counts_1 
    AND a."ORDER_COUNTS" <= :order_counts_2 
    AND a."ORDER_LIMIT_DATE" = :order_limit_date 
    AND a."ORDER_LIMIT_DATE" >= :order_limit_date_1 
    AND a."ORDER_LIMIT_DATE" <= :order_limit_date_2 
    AND a."PERIOD" = :period 
    AND a."PCH_ORDER_STATUS" = :pch_order_status 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."PCH_ORDER_NO"
