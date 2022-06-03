SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a."SUP_CODE") AS SUP_NAME
FROM
    MST_SUP_UNITPRICE_DETAIL_HS a 
WHERE
    1 = 1 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND a."MIN_ORDER" = :min_order 
    AND a."STAN_COUNTS" = :stan_counts 
    AND a."STAN_COUNTS" >= :stan_counts_1 
    AND a."STAN_COUNTS" <= :stan_counts_2 
    AND a."ORDER_UNIT" = :order_unit 
    AND a."ORDER_UNIT" >= :order_unit_1 
    AND a."ORDER_UNIT" <= :order_unit_2 
    AND CASE WHEN a."STANDARD_UNITPRICE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.STANDARD_UNITPRICE_FLAG) END IN (:standard_unitprice_flag) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
    AND TRIM (a."GAIKA_KB") IN (:gaika_kb) 
    AND a."GAIKA_TK" = :gaika_tk 
ORDER BY
    a."HINBAN", a."SUP_CODE", a."MIN_ORDER", a."TIME_STAMP_CHANGE"
