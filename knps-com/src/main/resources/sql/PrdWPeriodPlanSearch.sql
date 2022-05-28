SELECT
      a.*
FROM
    PRD_W_PERIOD_PLAN a 
WHERE
    1 = 1 
    AND a.w_plan_id = :w_plan_id 
    AND a.date_of_proc = :date_of_proc 
    AND a.beg_date = :beg_date 
    AND a.beg_date >= :beg_date_1 
    AND a.beg_date <= :beg_date_2 
    AND a.end_date = :end_date 
    AND a.end_date >= :end_date_1 
    AND a.end_date <= :end_date_2 
    AND a.proc_status = :proc_status 
    AND a.result_proc_status = :result_proc_status 
    AND a.plan_comment = :plan_comment 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.W_PLAN_ID
