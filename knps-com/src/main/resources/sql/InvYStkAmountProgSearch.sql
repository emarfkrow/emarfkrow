SELECT
      a.*
    , (SELECT r1."WC_NAME" FROM MST_WC r1 WHERE r1."WC_CODE" = a."WC_CODE") AS "WC_NAME"
FROM
    INV_Y_STK_AMOUNT_PROG a 
WHERE
    1 = 1 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ROUTING" = :routing 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND a."NES_COUNTS" = :nes_counts 
    AND a."NES_COUNTS" >= :nes_counts_1 
    AND a."NES_COUNTS" <= :nes_counts_2 
    AND a."ROU_AMOUNT" = :rou_amount 
    AND a."ROU_AMOUNT" >= :rou_amount_1 
    AND a."ROU_AMOUNT" <= :rou_amount_2 
    AND a."ROU_LT" = :rou_lt 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."YYYY", a."MM", a."HINBAN", a."ROUTING"
