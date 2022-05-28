SELECT
      a.*
FROM
    MST_MATERIAL a 
WHERE
    1 = 1 
    AND TRIM (a.material) = TRIM (:material) 
    AND a.material_name LIKE '%' || :material_name || '%' 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.MATERIAL
