SELECT
      a.*
FROM
    MST_COMPANY a 
WHERE
    1 = 1 
    AND a.company_code IN (:company_code) 
    AND a.company_name LIKE '%' || :company_name || '%' 
    AND a.admin_code IN (:admin_code) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.COMPANY_CODE
