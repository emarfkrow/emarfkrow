SELECT
      a.*
FROM
    MFG_MOD_ACT_DET a 
WHERE
    1 = 1 
    AND TRIM (a."MOD_ACT_NO") = TRIM (:mod_act_no) 
    AND a."MOD_ACT_BRANCH_NO" = :mod_act_branch_no 
    AND a."MOD_ACT_ITEM" = :mod_act_item 
    AND a."ACT_DATE" = :act_date 
    AND a."ACT_DATE" >= :act_date_1 
    AND a."ACT_DATE" <= :act_date_2 
    AND TRIM (a."OPERATOR") = TRIM (:operator) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."MOD_ACT_NO", a."MOD_ACT_BRANCH_NO"
