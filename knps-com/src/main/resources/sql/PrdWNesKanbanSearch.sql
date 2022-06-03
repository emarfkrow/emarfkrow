SELECT
      a.*
FROM
    PRD_W_NES_KANBAN a 
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
    AND a."LOT_SIZE" = :lot_size 
    AND a."ACC_COUNTS" = :acc_counts 
    AND a."ACC_COUNTS" >= :acc_counts_1 
    AND a."ACC_COUNTS" <= :acc_counts_2 
    AND a."COUNTS" = :counts 
ORDER BY
    a."PRO_HINBAN", a."ROUTING", a."ROUTING_DEF_GROUP"
