SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
FROM
    PCH_PROD_TOTAL_INF a 
WHERE
    1 = 1 
    AND TRIM (a."CLOSE_DATE") = TRIM (:close_date) 
    AND a."CLOSE_DATE" >= :close_date_1 
    AND a."CLOSE_DATE" <= :close_date_2 
    AND a."ROUTING_GROUP" = :routing_group 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ROUTING" = :routing 
    AND a."TOTAL_COUNTS" = :total_counts 
    AND a."TOTAL_COUNTS" >= :total_counts_1 
    AND a."TOTAL_COUNTS" <= :total_counts_2 
    AND a."TOTAL_AMOUNT" = :total_amount 
    AND a."TOTAL_AMOUNT" >= :total_amount_1 
    AND a."TOTAL_AMOUNT" <= :total_amount_2 
    AND a."SUM_SUPPLY" = :sum_supply 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."HINBAN", a."ROUTING_GROUP", a."ROUTING", a."CLOSE_DATE"
