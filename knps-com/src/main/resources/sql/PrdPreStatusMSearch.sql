SELECT
      a.*
FROM
    PRD_PRE_STATUS_M a 
WHERE
    1 = 1 
    AND TRIM (a."YY") = TRIM (:yy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND a."SALES_TARGET_STATUS" = :sales_target_status 
    AND a."PRD_PLAN_MAKE_STATUS" = :prd_plan_make_status 
    AND a."PRD_PLAN_FIXED_STATUS" = :prd_plan_fixed_status 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."YY", a."MM"
