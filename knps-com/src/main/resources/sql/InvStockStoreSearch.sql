SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
FROM
    INV_STOCK_STORE a 
WHERE
    1 = 1 
    AND a."HINBAN" = :hinban 
    AND a."STORE_NO" = :store_no 
    AND a."COUNTS" = :counts 
    AND a."HAKO_SU" = :hako_su 
    AND a."STOCK" = :stock 
    AND a."TOTAL_SUM_COST" = :total_sum_cost 
    AND a."AMOUNT" = :amount 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."HINBAN", a."STORE_NO"
