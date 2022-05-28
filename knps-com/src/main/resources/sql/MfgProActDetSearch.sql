SELECT
      a.*
FROM
    MFG_PRO_ACT_DET a 
WHERE
    1 = 1 
    AND TRIM (a.pro_no) = TRIM (:pro_no) 
    AND a.pro_routing_branch = :pro_routing_branch 
    AND a.pro_act_branch_no = :pro_act_branch_no 
    AND a.act_item = :act_item 
    AND a.act_date = :act_date 
    AND a.act_date >= :act_date_1 
    AND a.act_date <= :act_date_2 
    AND TRIM (a.cause_code) IN (:cause_code) 
    AND TRIM (a.operator) = TRIM (:operator) 
    AND a.last_routing = :last_routing 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.PRO_NO, a.PRO_ROUTING_BRANCH, a.PRO_ACT_BRANCH_NO
