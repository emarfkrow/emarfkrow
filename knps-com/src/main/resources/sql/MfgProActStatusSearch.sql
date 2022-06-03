SELECT
      a.*
FROM
    MFG_PRO_ACT_STATUS a 
WHERE
    1 = 1 
    AND TRIM (a."CHILD_PLAN_NO") = TRIM (:child_plan_no) 
    AND TRIM (a."PRO_NO") = TRIM (:pro_no) 
    AND a."ACT_STATUS" = :act_status 
    AND TRIM (a."USER_ID") = TRIM (:user_id) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
ORDER BY
    a."CHILD_PLAN_NO"
