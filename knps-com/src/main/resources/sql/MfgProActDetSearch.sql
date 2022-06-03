SELECT
      a.*
FROM
    MFG_PRO_ACT_DET a 
WHERE
    1 = 1 
    AND TRIM (a."PRO_NO") = TRIM (:pro_no) 
    AND a."PRO_ROUTING_BRANCH" = :pro_routing_branch 
    AND a."PRO_ACT_BRANCH_NO" = :pro_act_branch_no 
    AND a."ACT_ITEM" = :act_item 
    AND a."ACT_DATE" = :act_date 
    AND a."ACT_DATE" >= :act_date_1 
    AND a."ACT_DATE" <= :act_date_2 
    AND TRIM (a."CAUSE_CODE") IN (:cause_code) 
    AND TRIM (a."OPERATOR") = TRIM (:operator) 
    AND a."LAST_ROUTING" = :last_routing 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."PRO_NO", a."PRO_ROUTING_BRANCH", a."PRO_ACT_BRANCH_NO"
