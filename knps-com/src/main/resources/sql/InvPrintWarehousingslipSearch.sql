SELECT
      a.*
    , (SELECT r1."EMP_NAME" FROM MST_EMP r1 WHERE r1."EMP_CODE" = a."EMP_CODE") AS "EMP_NAME"
    , (SELECT r2."ITEM" FROM MST_HINBAN r2 WHERE r2."HINBAN" = a."HINBAN") AS "ITEM"
FROM
    INV_PRINT_WAREHOUSINGSLIP a 
WHERE
    1 = 1 
    AND TRIM (a."EMP_CODE") IN (:emp_code) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."KANBAN_ACC_COUNTS" = :kanban_acc_counts 
    AND a."KANBAN_ACC_COUNTS" >= :kanban_acc_counts_1 
    AND a."KANBAN_ACC_COUNTS" <= :kanban_acc_counts_2 
    AND a."KANBAN_COUNTS" = :kanban_counts 
    AND a."KANBAN_COUNTS" >= :kanban_counts_1 
    AND a."KANBAN_COUNTS" <= :kanban_counts_2 
    AND a."HOST_N_KBN" IN (:host_n_kbn) 
    AND a."PRINT_KBN" IN (:print_kbn) 
    AND TRIM (a."REQ_ID") = TRIM (:req_id) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."HINBAN", a."EMP_CODE"
