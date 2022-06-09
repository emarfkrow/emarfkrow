SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."MAN_HINBAN") AS "MAN_ITEM"
FROM
    MST_ROUTING_DEF_BK a 
WHERE
    1 = 1 
    AND TRIM (a."YY") = TRIM (:yy) 
    AND TRIM (a."MAN_HINBAN") = TRIM (:man_hinban) 
    AND a."ROUTING_GROUP" = :routing_group 
    AND CASE WHEN a."PERMISSION_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."PERMISSION_FLAG") END IN (:permission_flag) 
    AND CASE WHEN a."USABLE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."USABLE_FLAG") END IN (:usable_flag) 
    AND a."MAX_ROUTING" = :max_routing 
    AND a."COPY_SOURCE_GROUP" = :copy_source_group 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."MAN_HINBAN", a."ROUTING_GROUP", a."YY"
