SELECT
      a.*
FROM
    PRD_SALES_TARGET_YEAR a 
WHERE
    1 = 1 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND a.file_id = :file_id 
    AND TRIM (a.sales_hinban) = TRIM (:sales_hinban) 
    AND a.sales_target_counts = :sales_target_counts 
    AND a.sales_target_counts >= :sales_target_counts_1 
    AND a.sales_target_counts <= :sales_target_counts_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.YYYY, a.MM, a.FILE_ID, a.SALES_HINBAN
