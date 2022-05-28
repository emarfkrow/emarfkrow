SELECT
      a.*
FROM
    MST_OPE_FORM a 
WHERE
    1 = 1 
    AND TRIM (a.pattern_no) = TRIM (:pattern_no) 
    AND TRIM (a.f_choku_start) = TRIM (:f_choku_start) 
    AND TRIM (a.f_choku_end) = TRIM (:f_choku_end) 
    AND TRIM (a.f_choku_start_ded) = TRIM (:f_choku_start_ded) 
    AND TRIM (a.f_choku_end_ded) = TRIM (:f_choku_end_ded) 
    AND TRIM (a.s_choku_start_ded) = TRIM (:s_choku_start_ded) 
    AND TRIM (a.s_choku_end_ded) = TRIM (:s_choku_end_ded) 
    AND TRIM (a.t_choku_start_ded) = TRIM (:t_choku_start_ded) 
    AND TRIM (a.t_choku_end_ded) = TRIM (:t_choku_end_ded) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.PATTERN_NO
