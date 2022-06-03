SELECT
      a.*
FROM
    PRD_M_PRO_NES_COUNTS a 
WHERE
    1 = 1 
    AND TRIM (a."PRO_HINBAN") = TRIM (:pro_hinban) 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND a."PRO_NES_COUNTS" = :pro_nes_counts 
    AND a."PRO_NES_COUNTS" >= :pro_nes_counts_1 
    AND a."PRO_NES_COUNTS" <= :pro_nes_counts_2 
    AND a."PRO_ADJ_COUNTS" = :pro_adj_counts 
    AND a."PRO_ADJ_COUNTS" >= :pro_adj_counts_1 
    AND a."PRO_ADJ_COUNTS" <= :pro_adj_counts_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."PRO_HINBAN", a."YYYY", a."MM"
