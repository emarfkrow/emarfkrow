SELECT
      a.*
FROM
    PRD_PRE_STATUS_Y a 
WHERE
    1 = 1 
    AND TRIM (a.yy) = TRIM (:yy) 
    AND a.sales_target_status = :sales_target_status 
    AND a.prd_plan_make_status = :prd_plan_make_status 
    AND a.prd_plan_fixed_status = :prd_plan_fixed_status 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.YY
