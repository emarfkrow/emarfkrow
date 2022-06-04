SELECT
      a.*
    , (SELECT r1."WC_NAME" FROM MST_WC r1 WHERE r1."WC_CODE" = a."WC_CODE") AS "WC_NAME"
    , (SELECT r2."LOCATION_NAME" FROM MST_LOCATION r2 WHERE r2."LOCATION_CODE" = a."LOCATION_CODE") AS "LOCATION_NAME"
FROM
    PRD_STORE_MAINTE a 
WHERE
    1 = 1 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ROUTING" = :routing 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND TRIM (a."LOCATION_CODE") IN (:location_code) 
    AND a."LOT_SIZE" = :lot_size 
    AND a."KANBAN_ACC_COUNTS" = :kanban_acc_counts 
    AND a."KANBAN_ACC_COUNTS" >= :kanban_acc_counts_1 
    AND a."KANBAN_ACC_COUNTS" <= :kanban_acc_counts_2 
    AND a."PL_COUNTS" = :pl_counts 
    AND a."PL_COUNTS" >= :pl_counts_1 
    AND a."PL_COUNTS" <= :pl_counts_2 
    AND a."KANBAN_COUNTS" = :kanban_counts 
    AND a."KANBAN_COUNTS" >= :kanban_counts_1 
    AND a."KANBAN_COUNTS" <= :kanban_counts_2 
    AND a."FIT_POS" = :fit_pos 
    AND TRIM (a."KANBAN_ID") = TRIM (:kanban_id) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."YYYY", a."MM", a."HINBAN", a."ROUTING"
