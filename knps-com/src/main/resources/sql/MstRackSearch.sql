SELECT
      a.*
FROM
    MST_RACK a 
WHERE
    1 = 1 
    AND TRIM (a."MAN_HINBAN") = TRIM (:man_hinban) 
    AND a."RACK_NAME" LIKE '%' || :rack_name || '%' 
    AND a."KAKESU" = :kakesu 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
ORDER BY
    a."MAN_HINBAN"
