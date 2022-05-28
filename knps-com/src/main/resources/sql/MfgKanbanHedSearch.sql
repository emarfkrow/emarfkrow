SELECT
      a.*
FROM
    MFG_KANBAN_HED a 
WHERE
    1 = 1 
    AND a.routing_group = :routing_group 
    AND TRIM (a.man_hinban) = TRIM (:man_hinban) 
    AND a.routing = :routing 
    AND TRIM (a.kanban_id_current) = TRIM (:kanban_id_current) 
    AND TRIM (a.kanban_id_next) = TRIM (:kanban_id_next) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND a.for_routing = :for_routing 
ORDER BY
    a.MAN_HINBAN, a.ROUTING_GROUP, a.ROUTING
