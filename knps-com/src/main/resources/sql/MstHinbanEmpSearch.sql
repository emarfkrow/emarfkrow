SELECT
      a.*
    , (SELECT r1.EMP_NAME FROM MST_EMP r1 WHERE r1.EMP_CODE = a.EMP_CODE) AS EMP_NAME
FROM
    MST_HINBAN_EMP a 
WHERE
    1 = 1 
    AND a.hinban_ope_code IN (:hinban_ope_code) 
    AND a.hinban_ope_name LIKE '%' || :hinban_ope_name || '%' 
    AND a.emp_code IN (:emp_code) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.HINBAN_OPE_CODE
