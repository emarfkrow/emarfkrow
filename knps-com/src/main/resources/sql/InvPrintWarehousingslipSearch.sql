SELECT
      a.*
    , (SELECT r1.EMP_NAME FROM MST_EMP r1 WHERE r1.EMP_CODE = a.EMP_CODE) AS EMP_NAME
FROM
    INV_PRINT_WAREHOUSINGSLIP a 
WHERE
    1 = 1 
    AND a.emp_code IN (:emp_code) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.kanban_acc_counts = :kanban_acc_counts 
    AND a.kanban_acc_counts >= :kanban_acc_counts_1 
    AND a.kanban_acc_counts <= :kanban_acc_counts_2 
    AND a.kanban_counts = :kanban_counts 
    AND a.kanban_counts >= :kanban_counts_1 
    AND a.kanban_counts <= :kanban_counts_2 
    AND a.host_n_kbn IN (:host_n_kbn) 
    AND a.print_kbn IN (:print_kbn) 
    AND TRIM (a.req_id) = TRIM (:req_id) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.HINBAN, a.EMP_CODE
