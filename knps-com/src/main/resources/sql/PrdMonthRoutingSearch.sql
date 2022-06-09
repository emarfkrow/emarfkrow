SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
FROM
    PRD_MONTH_ROUTING a 
WHERE
    1 = 1 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND a."ROUTING_GROUP" = :routing_group 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."HINBAN", a."YYYY", a."MM"
