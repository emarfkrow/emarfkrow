SELECT
      a.*
FROM
    MFG_MOD_ACT_DET a 
WHERE
    1 = 1 
    AND TRIM (a.mod_act_no) = TRIM (:mod_act_no) 
    AND a.mod_act_branch_no = :mod_act_branch_no 
    AND a.mod_act_item = :mod_act_item 
    AND a.act_date = :act_date 
    AND a.act_date >= :act_date_1 
    AND a.act_date <= :act_date_2 
    AND TRIM (a.operator) = TRIM (:operator) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.MOD_ACT_NO, a.MOD_ACT_BRANCH_NO
