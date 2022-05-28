SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    PRD_DAILY_PRO_PLAN_PCH a 
WHERE
    1 = 1 
    AND TRIM (a.pch_order_no) = TRIM (:pch_order_no) 
    AND TRIM (a.child_plan_no) = TRIM (:child_plan_no) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.nes_counts = :nes_counts 
    AND a.nes_counts >= :nes_counts_1 
    AND a.nes_counts <= :nes_counts_2 
    AND a.sup_code IN (:sup_code) 
    AND a.order_counts = :order_counts 
    AND a.order_counts >= :order_counts_1 
    AND a.order_counts <= :order_counts_2 
    AND a.order_limit_date = :order_limit_date 
    AND a.order_limit_date >= :order_limit_date_1 
    AND a.order_limit_date <= :order_limit_date_2 
    AND a.period = :period 
    AND a.pch_order_status = :pch_order_status 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.PCH_ORDER_NO
