SELECT
      a.*
FROM
    MFG_KANBAN_HED a 
WHERE
    1 = 1 
    AND a."ROUTING_GROUP" = :routing_group 
    AND TRIM (a."MAN_HINBAN") = TRIM (:man_hinban) 
    AND a."ROUTING" = :routing 
    AND TRIM (a."KANBAN_ID_CURRENT") = TRIM (:kanban_id_current) 
    AND TRIM (a."KANBAN_ID_NEXT") = TRIM (:kanban_id_next) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND a."FOR_ROUTING" = :for_routing 
ORDER BY
    a."MAN_HINBAN", a."ROUTING_GROUP", a."ROUTING"
