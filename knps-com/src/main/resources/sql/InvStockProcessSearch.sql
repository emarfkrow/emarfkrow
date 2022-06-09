SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
FROM
    INV_STOCK_PROCESS a 
WHERE
    1 = 1 
    AND a."LOCATION_CODE" IN (:location_code) 
    AND a."HINBAN" = :hinban 
    AND a."STOCK" = :stock 
    AND a."LAST_IN_OUT_DATE" = :last_in_out_date 
    AND a."LAST_IN_OUT_DATE" >= :last_in_out_date_1 
    AND a."LAST_IN_OUT_DATE" <= :last_in_out_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."LOCATION_CODE", a."HINBAN"
