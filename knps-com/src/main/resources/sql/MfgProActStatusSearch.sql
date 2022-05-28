SELECT
      a.*
FROM
    MFG_PRO_ACT_STATUS a 
WHERE
    1 = 1 
    AND TRIM (a.child_plan_no) = TRIM (:child_plan_no) 
    AND TRIM (a.pro_no) = TRIM (:pro_no) 
    AND a.act_status = :act_status 
    AND TRIM (a.user_id) = TRIM (:user_id) 
    AND a.time_stamp_create = :time_stamp_create 
ORDER BY
    a.CHILD_PLAN_NO
