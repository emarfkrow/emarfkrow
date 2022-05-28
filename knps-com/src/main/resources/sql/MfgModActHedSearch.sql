SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    MFG_MOD_ACT_HED a 
WHERE
    1 = 1 
    AND TRIM (a.mod_act_no) = TRIM (:mod_act_no) 
    AND a.wc_code IN (:wc_code) 
    AND a.mod_kind = :mod_kind 
    AND a.amount_time = :amount_time 
    AND a.act_mod_time = :act_mod_time 
    AND a.exp_time = :exp_time 
    AND a.mod_counts = :mod_counts 
    AND a.mod_counts >= :mod_counts_1 
    AND a.mod_counts <= :mod_counts_2 
    AND a.act_mod_counts = :act_mod_counts 
    AND a.act_mod_counts >= :act_mod_counts_1 
    AND a.act_mod_counts <= :act_mod_counts_2 
    AND TRIM (a.memo) = TRIM (:memo) 
    AND a.mod_status = :mod_status 
    AND CASE WHEN a.exp_flag IS NULL THEN '0' ELSE TO_CHAR (a.exp_flag) END IN (:exp_flag) 
    AND a.beg_date = :beg_date 
    AND a.beg_date >= :beg_date_1 
    AND a.beg_date <= :beg_date_2 
    AND a.end_date = :end_date 
    AND a.end_date >= :end_date_1 
    AND a.end_date <= :end_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.MOD_ACT_NO
