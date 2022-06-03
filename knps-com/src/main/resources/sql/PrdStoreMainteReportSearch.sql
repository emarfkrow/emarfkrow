SELECT
      a.*
    , (SELECT r1.GROUP_NAME FROM MST_GROUP r1 WHERE r1.GROUP_CODE = a."REP_GROUP_CODE") AS REP_GROUP_NAME
FROM
    PRD_STORE_MAINTE_REPORT a 
WHERE
    1 = 1 
    AND TRIM (a."REP_GROUP_CODE") IN (:rep_group_code) 
    AND a."GROUP_NAME" LIKE '%' || :group_name || '%' 
    AND TRIM (a."RETSU_NO") = TRIM (:retsu_no) 
    AND TRIM (a."GYO_NO") = TRIM (:gyo_no) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."REP_GROUP_CODE"
