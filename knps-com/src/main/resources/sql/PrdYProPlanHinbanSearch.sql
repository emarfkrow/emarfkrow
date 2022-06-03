SELECT
      a.*
FROM
    PRD_Y_PRO_PLAN_HINBAN a 
WHERE
    1 = 1 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND TRIM (a."PRO_HINBAN") = TRIM (:pro_hinban) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ITEM_KBN" IN (:item_kbn) 
    AND TRIM (a."SHIKAKE_KBN") IN (:shikake_kbn) 
    AND a."NES_COUNTS" = :nes_counts 
    AND a."NES_COUNTS" >= :nes_counts_1 
    AND a."NES_COUNTS" <= :nes_counts_2 
    AND TRIM (a."PARENT_HINBAN") = TRIM (:parent_hinban) 
    AND a."PRO_LT" = :pro_lt 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."YYYY", a."MM", a."PRO_HINBAN", a."HINBAN"
