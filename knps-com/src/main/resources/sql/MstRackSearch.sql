SELECT
      a.*
FROM
    MST_RACK a 
WHERE
    1 = 1 
    AND TRIM (a.man_hinban) = TRIM (:man_hinban) 
    AND a.rack_name LIKE '%' || :rack_name || '%' 
    AND a.kakesu = :kakesu 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.MAN_HINBAN
