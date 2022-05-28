SELECT
      a.*
FROM
    MST_ROUTING_DEF a 
WHERE
    1 = 1 
    AND TRIM (a.man_hinban) = TRIM (:man_hinban) 
    AND a.routing_group = :routing_group 
    AND CASE WHEN a.permission_flag IS NULL THEN '0' ELSE TO_CHAR (a.permission_flag) END IN (:permission_flag) 
    AND CASE WHEN a.usable_flag IS NULL THEN '0' ELSE TO_CHAR (a.usable_flag) END IN (:usable_flag) 
    AND a.max_routing = :max_routing 
    AND a.copy_source_group = :copy_source_group 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.MAN_HINBAN, a.ROUTING_GROUP
