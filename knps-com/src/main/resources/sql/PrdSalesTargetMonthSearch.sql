SELECT
      a.*
FROM
    PRD_SALES_TARGET_MONTH a 
WHERE
    1 = 1 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND a."FILE_ID" = :file_id 
    AND TRIM (a."SALES_HINBAN") = TRIM (:sales_hinban) 
    AND a."SALES_TARGET_COUNTS" = :sales_target_counts 
    AND a."SALES_TARGET_COUNTS" >= :sales_target_counts_1 
    AND a."SALES_TARGET_COUNTS" <= :sales_target_counts_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."YYYY", a."MM", a."FILE_ID", a."SALES_HINBAN"
