SELECT
      a.*
FROM
    MST_PROC a 
WHERE
    1 = 1 
    AND TRIM (a.routing_code) IN (:routing_code) 
    AND a.routing_name LIKE '%' || :routing_name || '%' 
    AND a.routing_name_sht = :routing_name_sht 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND a.excel_color_index = :excel_color_index 
ORDER BY
    a.ROUTING_CODE
