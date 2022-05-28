SELECT
      a.*
FROM
    MST_ID a 
WHERE
    1 = 1 
    AND a.id_type = :id_type 
    AND a.id = :id 
    AND a.id_max = :id_max 
    AND a.id_min = :id_min 
    AND a.id_comment = :id_comment 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
ORDER BY
    a.ID_TYPE
