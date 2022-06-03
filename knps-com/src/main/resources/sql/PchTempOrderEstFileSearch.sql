SELECT
      a.*
FROM
    PCH_TEMP_ORDER_EST_FILE a 
WHERE
    1 = 1 
    AND TRIM (a."TEMP_ORDER_NO") = TRIM (:temp_order_no) 
    AND a."EST_FILE_SEQ" = :est_file_seq 
    AND a."UPLOAD_FILE_NM" = :upload_file_nm 
    AND a."SAVE_FILE_PATH" = :save_file_path 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."TEMP_ORDER_NO", a."EST_FILE_SEQ"
