SELECT
      a.*
FROM
    MST_EMP a 
WHERE
    1 = 1 
    AND TRIM (a."EMP_CODE") IN (:emp_code) 
    AND a."EMP_NAME" LIKE '%' || :emp_name || '%' 
    AND a."POSITION" IN (:position) 
    AND a."COMP_CODE" IN (:comp_code) 
    AND a."PASSWORD" = :password 
    AND a."TEL_NO" = :tel_no 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
    AND a."MAIL_ADDRESS" = :mail_address 
    AND TRIM (a."DIVISION_CODE") IN (:division_code) 
ORDER BY
    a."EMP_CODE"
