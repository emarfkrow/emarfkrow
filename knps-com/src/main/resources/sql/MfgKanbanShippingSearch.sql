SELECT
      a.*
FROM
    MFG_KANBAN_SHIPPING a 
WHERE
    1 = 1 
    AND TRIM (a."KANBAN_ID") = TRIM (:kanban_id) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."FOR_PRO_CODE") IN (:for_pro_code) 
    AND TRIM (a."FOR_PRO_LOCATION_CODE") IN (:for_pro_location_code) 
    AND a."KANBAN_ACC_COUNTS" = :kanban_acc_counts 
    AND a."KANBAN_ACC_COUNTS" >= :kanban_acc_counts_1 
    AND a."KANBAN_ACC_COUNTS" <= :kanban_acc_counts_2 
    AND a."COUNTS" = :counts 
ORDER BY
    a."KANBAN_ID", a."HINBAN"
