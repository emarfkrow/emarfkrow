SELECT
      a.*
    , (SELECT r1."WC_NAME" FROM MST_WC r1 WHERE r1."WC_CODE" = a."WC_CODE") AS "WC_NAME"
FROM
    MST_PROD_UNITPRICE a 
WHERE
    1 = 1 
    AND a."ROUTING_GROUP" = :routing_group 
    AND TRIM (a."MAN_HINBAN") = TRIM (:man_hinban) 
    AND a."ROUTING" = :routing 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND a."MIN_ORDER" = :min_order 
    AND a."STAN_COUNTS" = :stan_counts 
    AND a."STAN_COUNTS" >= :stan_counts_1 
    AND a."STAN_COUNTS" <= :stan_counts_2 
    AND a."ORDER_UNIT" = :order_unit 
    AND a."ORDER_UNIT" >= :order_unit_1 
    AND a."ORDER_UNIT" <= :order_unit_2 
    AND CASE WHEN a."STANDARD_UNITPRICE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."STANDARD_UNITPRICE_FLAG") END IN (:standard_unitprice_flag) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
    AND TRIM (a."GAIKA_KB") IN (:gaika_kb) 
    AND a."GAIKA_TK" = :gaika_tk 
    AND CASE WHEN a."ISSHIKI_UNIT_F" IS NULL THEN '0' ELSE TO_CHAR (a."ISSHIKI_UNIT_F") END IN (:isshiki_unit_f) 
    AND a."MIN_ORDER_AMOUNT" = :min_order_amount 
    AND a."MIN_ORDER_AMOUNT" >= :min_order_amount_1 
    AND a."MIN_ORDER_AMOUNT" <= :min_order_amount_2 
ORDER BY
    a."MAN_HINBAN", a."ROUTING_GROUP", a."ROUTING", a."WC_CODE", a."MIN_ORDER"
