SELECT
      a.*
    , (SELECT r1.GROUP_NAME FROM MST_GROUP r1 WHERE r1.GROUP_CODE = a.GROUP_CODE) AS GROUP_NAME
FROM
    MST_TEAM a 
WHERE
    1 = 1 
    AND TRIM (a.team_code) IN (:team_code) 
    AND a.team_name LIKE '%' || :team_name || '%' 
    AND TRIM (a.admin_code) IN (:admin_code) 
    AND TRIM (a.group_code) IN (:group_code) 
    AND a.individual_counts = :individual_counts 
    AND a.individual_counts >= :individual_counts_1 
    AND a.individual_counts <= :individual_counts_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.TEAM_CODE
