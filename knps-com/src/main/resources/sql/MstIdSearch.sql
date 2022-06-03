SELECT
      a.*
FROM
    MST_ID a 
WHERE
    1 = 1 
    AND a."ID_TYPE" = :id_type 
    AND a."ID" = :id 
    AND a."ID_MAX" = :id_max 
    AND a."ID_MIN" = :id_min 
    AND a."ID_COMMENT" = :id_comment 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
ORDER BY
    a."ID_TYPE"
