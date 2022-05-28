SELECT
      a.*
    , (SELECT r1.DIVISION_NAME FROM MST_DIVISION r1 WHERE r1.DIVISION_CODE = a.DIVISION_CODE) AS DIVISION_NAME
FROM
    MST_GROUP a 
WHERE
    1 = 1 
    AND a.group_code IN (:group_code) 
    AND a.group_name LIKE '%' || :group_name || '%' 
    AND a.admin_code IN (:admin_code) 
    AND a.division_code IN (:division_code) 
    AND a.individual_counts = :individual_counts 
    AND a.individual_counts >= :individual_counts_1 
    AND a.individual_counts <= :individual_counts_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.GROUP_CODE
