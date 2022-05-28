SELECT
      a.*
FROM
    MST_BUTTON a 
WHERE
    1 = 1 
    AND a.gamen_id = :gamen_id 
    AND a.btn_id = :btn_id 
    AND a.btn_name LIKE '%' || :btn_name || '%' 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.BTN_ID
