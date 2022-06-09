SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."PRO_HINBAN") AS "PRO_ITEM"
FROM
    PRD_W_NES_KANBAN_OLD a 
WHERE
    1 = 1 
    AND TRIM (a."PRO_HINBAN") = TRIM (:pro_hinban) 
    AND TRIM (a."STORE_WC") = TRIM (:store_wc) 
    AND a."ROUTING" = :routing 
    AND a."ROUTING_DEF_GROUP" = :routing_def_group 
    AND TRIM (a."STORE_OPE_DETAIL") = TRIM (:store_ope_detail) 
    AND a."PRO_NES_COUNTS" = :pro_nes_counts 
    AND a."PRO_NES_COUNTS" >= :pro_nes_counts_1 
    AND a."PRO_NES_COUNTS" <= :pro_nes_counts_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."PRO_HINBAN", a."ROUTING", a."ROUTING_DEF_GROUP"
