SELECT
      a.*
FROM
    MST_STRUCTURE_BK_YM a 
WHERE
    1 = 1 
    AND TRIM (a.yy) = TRIM (:yy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND TRIM (a.man_hinban) = TRIM (:man_hinban) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.counts = :counts 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.YY, a.MM, a.MAN_HINBAN, a.HINBAN
