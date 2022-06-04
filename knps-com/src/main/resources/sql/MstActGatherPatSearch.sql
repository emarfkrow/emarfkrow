SELECT
      a.*
FROM
    MST_ACT_GATHER_PAT a 
WHERE
    1 = 1 
    AND TRIM (a."ACT_GATHER_PAT_NO") = TRIM (:act_gather_pat_no) 
    AND a."IN_PRE_START" = :in_pre_start 
    AND a."IN_PRE_END" = :in_pre_end 
    AND a."PROC_END" = :proc_end 
    AND a."PROC_STOP" = :proc_stop 
    AND a."PROC_CANCEL" = :proc_cancel 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
ORDER BY
    a."ACT_GATHER_PAT_NO"
