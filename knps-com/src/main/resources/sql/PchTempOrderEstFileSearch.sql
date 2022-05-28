SELECT
      a.*
FROM
    PCH_TEMP_ORDER_EST_FILE a 
WHERE
    1 = 1 
    AND TRIM (a.temp_order_no) = TRIM (:temp_order_no) 
    AND a.est_file_seq = :est_file_seq 
    AND a.upload_file_nm = :upload_file_nm 
    AND a.save_file_path = :save_file_path 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.TEMP_ORDER_NO, a.EST_FILE_SEQ
