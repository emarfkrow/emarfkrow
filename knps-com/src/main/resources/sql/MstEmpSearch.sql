SELECT
      a.*
    , (SELECT r1.DIVISION_NAME FROM MST_DIVISION r1 WHERE r1.DIVISION_CODE = a.DIVISION_CODE) AS DIVISION_NAME
FROM
    MST_EMP a 
WHERE
    1 = 1 
    AND a.emp_code IN (:emp_code) 
    AND a.emp_name LIKE '%' || :emp_name || '%' 
    AND a.position IN (:position) 
    AND a.comp_code IN (:comp_code) 
    AND a.password = :password 
    AND a.tel_no = :tel_no 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND a.mail_address = :mail_address 
    AND a.division_code IN (:division_code) 
ORDER BY
    a.EMP_CODE
