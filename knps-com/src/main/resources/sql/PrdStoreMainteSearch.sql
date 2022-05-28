SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
    , (SELECT r2.LOCATION_NAME FROM MST_LOCATION r2 WHERE r2.LOCATION_CODE = a.LOCATION_CODE) AS LOCATION_NAME
FROM
    PRD_STORE_MAINTE a 
WHERE
    1 = 1 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.routing = :routing 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND TRIM (a.location_code) IN (:location_code) 
    AND a.lot_size = :lot_size 
    AND a.kanban_acc_counts = :kanban_acc_counts 
    AND a.kanban_acc_counts >= :kanban_acc_counts_1 
    AND a.kanban_acc_counts <= :kanban_acc_counts_2 
    AND a.pl_counts = :pl_counts 
    AND a.pl_counts >= :pl_counts_1 
    AND a.pl_counts <= :pl_counts_2 
    AND a.kanban_counts = :kanban_counts 
    AND a.kanban_counts >= :kanban_counts_1 
    AND a.kanban_counts <= :kanban_counts_2 
    AND a.fit_pos = :fit_pos 
    AND TRIM (a.kanban_id) = TRIM (:kanban_id) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.YYYY, a.MM, a.HINBAN, a.ROUTING
