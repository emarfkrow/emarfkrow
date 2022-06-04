SELECT
      a.*
    , (SELECT r1."WC_NAME" FROM MST_WC r1 WHERE r1."WC_CODE" = a."WC_CODE") AS "WC_NAME"
    , (SELECT r2."SUP_NAME" FROM MST_SUPPLIER r2 WHERE r2."SUP_CODE" = a."SUP_CODE") AS "SUP_NAME"
FROM
    PRD_M_SUP_BUDGET_OUT a 
WHERE
    1 = 1 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ROUTING" = :routing 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND a."ORDER_COUNTS" = :order_counts 
    AND a."ORDER_COUNTS" >= :order_counts_1 
    AND a."ORDER_COUNTS" <= :order_counts_2 
    AND a."ORDER_UNIT" = :order_unit 
    AND a."ORDER_UNIT" >= :order_unit_1 
    AND a."ORDER_UNIT" <= :order_unit_2 
    AND a."ORDER_AMOUNT" = :order_amount 
    AND a."ORDER_AMOUNT" >= :order_amount_1 
    AND a."ORDER_AMOUNT" <= :order_amount_2 
    AND a."ITEM_KBN" IN (:item_kbn) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."YYYY", a."MM", a."HINBAN", a."ROUTING"
