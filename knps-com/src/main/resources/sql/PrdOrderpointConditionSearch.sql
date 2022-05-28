SELECT
      a.*
FROM
    PRD_ORDERPOINT_CONDITION a 
WHERE
    1 = 1 
    AND TRIM (a.rec_no) = TRIM (:rec_no) 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND a.ope_days = :ope_days 
    AND a.last_process_date = :last_process_date 
    AND a.last_process_date >= :last_process_date_1 
    AND a.last_process_date <= :last_process_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.REC_NO
