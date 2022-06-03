SELECT
      a.*
FROM
    PRD_ORDERPOINT_CONDITION a 
WHERE
    1 = 1 
    AND TRIM (a."REC_NO") = TRIM (:rec_no) 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND a."OPE_DAYS" = :ope_days 
    AND a."LAST_PROCESS_DATE" = :last_process_date 
    AND a."LAST_PROCESS_DATE" >= :last_process_date_1 
    AND a."LAST_PROCESS_DATE" <= :last_process_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."REC_NO"
