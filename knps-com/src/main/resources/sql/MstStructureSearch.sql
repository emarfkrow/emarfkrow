SELECT
      a.*
FROM
    MST_STRUCTURE a 
WHERE
    1 = 1 
    AND TRIM (a."MAN_HINBAN") = TRIM (:man_hinban) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."COUNTS" = :counts 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
    AND CASE WHEN a."BOZAI_F" IS NULL THEN '0' ELSE TO_CHAR (a.BOZAI_F) END IN (:bozai_f) 
ORDER BY
    a."MAN_HINBAN", a."HINBAN"
