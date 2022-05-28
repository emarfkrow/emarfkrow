SELECT
      a.*
FROM
    PRD_MONTH_ROUTING a 
WHERE
    1 = 1 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND a.routing_group = :routing_group 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.HINBAN, a.YYYY, a.MM
