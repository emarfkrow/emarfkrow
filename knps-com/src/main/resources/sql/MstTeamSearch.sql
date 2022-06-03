SELECT
      a.*
    , (SELECT r1.GROUP_NAME FROM MST_GROUP r1 WHERE r1.GROUP_CODE = a."GROUP_CODE") AS GROUP_NAME
FROM
    MST_TEAM a 
WHERE
    1 = 1 
    AND TRIM (a."TEAM_CODE") IN (:team_code) 
    AND a."TEAM_NAME" LIKE '%' || :team_name || '%' 
    AND TRIM (a."ADMIN_CODE") IN (:admin_code) 
    AND TRIM (a."GROUP_CODE") IN (:group_code) 
    AND a."INDIVIDUAL_COUNTS" = :individual_counts 
    AND a."INDIVIDUAL_COUNTS" >= :individual_counts_1 
    AND a."INDIVIDUAL_COUNTS" <= :individual_counts_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
ORDER BY
    a."TEAM_CODE"
