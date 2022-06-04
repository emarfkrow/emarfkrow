SELECT
      a.*
FROM
    MST_COMPANY a 
WHERE
    1 = 1 
    AND TRIM (a."COMPANY_CODE") IN (:company_code) 
    AND a."COMPANY_NAME" LIKE '%' || :company_name || '%' 
    AND TRIM (a."ADMIN_CODE") IN (:admin_code) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
ORDER BY
    a."COMPANY_CODE"
