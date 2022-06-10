SELECT
      a.*
FROM
    MST_SUP_EMP a 
WHERE
    1 = 1 
    AND TRIM (a."SUPPLIER_OPE_CODE") IN (:supplier_ope_code) 
    AND a."SUPPLIER_OPE_NAME" LIKE '%' || :supplier_ope_name || '%' 
    AND TRIM (a."EMP_CODE") IN (:emp_code) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
ORDER BY
    a."SUPPLIER_OPE_CODE"
