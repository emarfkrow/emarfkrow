SELECT
      a.*
FROM
    MST_OPE_FORM a 
WHERE
    1 = 1 
    AND TRIM (a."PATTERN_NO") = TRIM (:pattern_no) 
    AND TRIM (a."F_CHOKU_START") = TRIM (:f_choku_start) 
    AND TRIM (a."F_CHOKU_END") = TRIM (:f_choku_end) 
    AND TRIM (a."F_CHOKU_START_DED") = TRIM (:f_choku_start_ded) 
    AND TRIM (a."F_CHOKU_END_DED") = TRIM (:f_choku_end_ded) 
    AND TRIM (a."S_CHOKU_START_DED") = TRIM (:s_choku_start_ded) 
    AND TRIM (a."S_CHOKU_END_DED") = TRIM (:s_choku_end_ded) 
    AND TRIM (a."T_CHOKU_START_DED") = TRIM (:t_choku_start_ded) 
    AND TRIM (a."T_CHOKU_END_DED") = TRIM (:t_choku_end_ded) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
ORDER BY
    a."PATTERN_NO"
