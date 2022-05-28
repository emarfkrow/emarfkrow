SELECT
      a.*
    , (SELECT r1.ROUTING_NAME FROM MST_PROC r1 WHERE r1.ROUTING_CODE = a.NECK_ROUTING_CODE) AS NECK_ROUTING_NAME
    , (SELECT r2.LOCATION_NAME FROM MST_LOCATION r2 WHERE r2.LOCATION_CODE = a.FOR_PRO_LOCATION_CODE) AS FOR_PRO_LOCATION_NAME
    , (SELECT r3.LOCATION_NAME FROM MST_LOCATION r3 WHERE r3.LOCATION_CODE = a.PRO_LOCATION_CODE) AS PRO_LOCATION_NAME
FROM
    MFG_KANBAN_DET a 
WHERE
    1 = 1 
    AND TRIM (a.kanban_id) = TRIM (:kanban_id) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.neck_routing_code IN (:neck_routing_code) 
    AND a.for_pro_code IN (:for_pro_code) 
    AND a.for_pro_location_code IN (:for_pro_location_code) 
    AND a.pro_code IN (:pro_code) 
    AND a.pro_location_code IN (:pro_location_code) 
    AND TRIM (a.comment1) = TRIM (:comment1) 
    AND TRIM (a.comment2) = TRIM (:comment2) 
    AND a.routing1 = :routing1 
    AND TRIM (a.tunnel_pro_code1) = TRIM (:tunnel_pro_code1) 
    AND a.routing2 = :routing2 
    AND TRIM (a.tunnel_pro_code2) = TRIM (:tunnel_pro_code2) 
    AND a.routing3 = :routing3 
    AND TRIM (a.tunnel_pro_code3) = TRIM (:tunnel_pro_code3) 
    AND a.routing4 = :routing4 
    AND TRIM (a.tunnel_pro_code4) = TRIM (:tunnel_pro_code4) 
    AND a.routing5 = :routing5 
    AND TRIM (a.tunnel_pro_code5) = TRIM (:tunnel_pro_code5) 
    AND a.kanban_acc_counts = :kanban_acc_counts 
    AND a.kanban_acc_counts >= :kanban_acc_counts_1 
    AND a.kanban_acc_counts <= :kanban_acc_counts_2 
    AND a.lot_size = :lot_size 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.KANBAN_ID
