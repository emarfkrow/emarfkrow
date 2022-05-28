SELECT
      a.*
FROM
    MST_ACT_GATHER_PAT a 
WHERE
    1 = 1 
    AND TRIM (a.act_gather_pat_no) = TRIM (:act_gather_pat_no) 
    AND a.in_pre_start = :in_pre_start 
    AND a.in_pre_end = :in_pre_end 
    AND a.proc_end = :proc_end 
    AND a.proc_stop = :proc_stop 
    AND a.proc_cancel = :proc_cancel 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.ACT_GATHER_PAT_NO
