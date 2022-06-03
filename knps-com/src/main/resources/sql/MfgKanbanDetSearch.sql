SELECT
      a.*
    , (SELECT r1.ROUTING_NAME FROM MST_PROC r1 WHERE r1.ROUTING_CODE = a."NECK_ROUTING_CODE") AS NECK_ROUTING_NAME
    , (SELECT r2.LOCATION_NAME FROM MST_LOCATION r2 WHERE r2.LOCATION_CODE = a."FOR_PRO_LOCATION_CODE") AS FOR_PRO_LOCATION_NAME
    , (SELECT r3.LOCATION_NAME FROM MST_LOCATION r3 WHERE r3.LOCATION_CODE = a."PRO_LOCATION_CODE") AS PRO_LOCATION_NAME
FROM
    MFG_KANBAN_DET a 
WHERE
    1 = 1 
    AND TRIM (a."KANBAN_ID") = TRIM (:kanban_id) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."NECK_ROUTING_CODE") IN (:neck_routing_code) 
    AND TRIM (a."FOR_PRO_CODE") IN (:for_pro_code) 
    AND TRIM (a."FOR_PRO_LOCATION_CODE") IN (:for_pro_location_code) 
    AND TRIM (a."PRO_CODE") IN (:pro_code) 
    AND TRIM (a."PRO_LOCATION_CODE") IN (:pro_location_code) 
    AND TRIM (a."COMMENT1") = TRIM (:comment1) 
    AND TRIM (a."COMMENT2") = TRIM (:comment2) 
    AND a."ROUTING1" = :routing1 
    AND TRIM (a."TUNNEL_PRO_CODE1") = TRIM (:tunnel_pro_code1) 
    AND a."ROUTING2" = :routing2 
    AND TRIM (a."TUNNEL_PRO_CODE2") = TRIM (:tunnel_pro_code2) 
    AND a."ROUTING3" = :routing3 
    AND TRIM (a."TUNNEL_PRO_CODE3") = TRIM (:tunnel_pro_code3) 
    AND a."ROUTING4" = :routing4 
    AND TRIM (a."TUNNEL_PRO_CODE4") = TRIM (:tunnel_pro_code4) 
    AND a."ROUTING5" = :routing5 
    AND TRIM (a."TUNNEL_PRO_CODE5") = TRIM (:tunnel_pro_code5) 
    AND a."KANBAN_ACC_COUNTS" = :kanban_acc_counts 
    AND a."KANBAN_ACC_COUNTS" >= :kanban_acc_counts_1 
    AND a."KANBAN_ACC_COUNTS" <= :kanban_acc_counts_2 
    AND a."LOT_SIZE" = :lot_size 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."KANBAN_ID"
