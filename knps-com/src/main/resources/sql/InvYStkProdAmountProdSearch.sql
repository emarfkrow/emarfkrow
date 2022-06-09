SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."PRO_HINBAN") AS "PRO_ITEM"
FROM
    INV_Y_STK_PROD_AMOUNT_PROD a 
WHERE
    1 = 1 
    AND TRIM (a."PRO_HINBAN") = TRIM (:pro_hinban) 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND a."NES_COUNTS" = :nes_counts 
    AND a."NES_COUNTS" >= :nes_counts_1 
    AND a."NES_COUNTS" <= :nes_counts_2 
    AND a."STAN_COSTS" = :stan_costs 
    AND TRIM (a."SHIKAKE_KBN") IN (:shikake_kbn) 
    AND a."PRO_LT" = :pro_lt 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."PRO_HINBAN", a."YYYY", a."MM"
