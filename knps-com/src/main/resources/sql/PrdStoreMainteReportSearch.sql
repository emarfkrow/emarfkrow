SELECT
      a.*
    , (SELECT r1.GROUP_NAME FROM MST_GROUP r1 WHERE r1.GROUP_CODE = a.REP_GROUP_CODE) AS REP_GROUP_NAME
FROM
    PRD_STORE_MAINTE_REPORT a 
WHERE
    1 = 1 
    AND a.rep_group_code IN (:rep_group_code) 
    AND a.group_name LIKE '%' || :group_name || '%' 
    AND TRIM (a.retsu_no) = TRIM (:retsu_no) 
    AND TRIM (a.gyo_no) = TRIM (:gyo_no) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.REP_GROUP_CODE
