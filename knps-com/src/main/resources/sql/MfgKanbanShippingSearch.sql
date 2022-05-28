SELECT
      a.*
    , (SELECT r1.LOCATION_NAME FROM MST_LOCATION r1 WHERE r1.LOCATION_CODE = a.FOR_PRO_LOCATION_CODE) AS FOR_PRO_LOCATION_NAME
FROM
    MFG_KANBAN_SHIPPING a 
WHERE
    1 = 1 
    AND TRIM (a.kanban_id) = TRIM (:kanban_id) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND TRIM (a.for_pro_code) IN (:for_pro_code) 
    AND TRIM (a.for_pro_location_code) IN (:for_pro_location_code) 
    AND a.kanban_acc_counts = :kanban_acc_counts 
    AND a.kanban_acc_counts >= :kanban_acc_counts_1 
    AND a.kanban_acc_counts <= :kanban_acc_counts_2 
    AND a.counts = :counts 
ORDER BY
    a.KANBAN_ID, a.HINBAN
