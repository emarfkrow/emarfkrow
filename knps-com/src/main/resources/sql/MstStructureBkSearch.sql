SELECT
      a.*
FROM
    MST_STRUCTURE_BK a 
WHERE
    1 = 1 
    AND TRIM (a.yy) = TRIM (:yy) 
    AND TRIM (a.man_hinban) = TRIM (:man_hinban) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.counts = :counts 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND CASE WHEN a.bozai_f IS NULL THEN '0' ELSE TO_CHAR (a.bozai_f) END IN (:bozai_f) 
ORDER BY
    a.MAN_HINBAN, a.HINBAN, a.YY
