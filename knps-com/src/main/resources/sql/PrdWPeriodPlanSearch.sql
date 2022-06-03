SELECT
      a.*
FROM
    PRD_W_PERIOD_PLAN a 
WHERE
    1 = 1 
    AND a."W_PLAN_ID" = :w_plan_id 
    AND a."DATE_OF_PROC" = :date_of_proc 
    AND a."BEG_DATE" = :beg_date 
    AND a."BEG_DATE" >= :beg_date_1 
    AND a."BEG_DATE" <= :beg_date_2 
    AND a."END_DATE" = :end_date 
    AND a."END_DATE" >= :end_date_1 
    AND a."END_DATE" <= :end_date_2 
    AND a."PROC_STATUS" = :proc_status 
    AND a."RESULT_PROC_STATUS" = :result_proc_status 
    AND a."PLAN_COMMENT" = :plan_comment 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."W_PLAN_ID"
