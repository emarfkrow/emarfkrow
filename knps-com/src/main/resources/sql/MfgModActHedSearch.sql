SELECT
      a.*
    , (SELECT r1."WC_NAME" FROM MST_WC r1 WHERE r1."WC_CODE" = a."WC_CODE") AS "WC_NAME"
FROM
    MFG_MOD_ACT_HED a 
WHERE
    1 = 1 
    AND TRIM (a."MOD_ACT_NO") = TRIM (:mod_act_no) 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND a."MOD_KIND" = :mod_kind 
    AND a."AMOUNT_TIME" = :amount_time 
    AND a."ACT_MOD_TIME" = :act_mod_time 
    AND a."EXP_TIME" = :exp_time 
    AND a."MOD_COUNTS" = :mod_counts 
    AND a."MOD_COUNTS" >= :mod_counts_1 
    AND a."MOD_COUNTS" <= :mod_counts_2 
    AND a."ACT_MOD_COUNTS" = :act_mod_counts 
    AND a."ACT_MOD_COUNTS" >= :act_mod_counts_1 
    AND a."ACT_MOD_COUNTS" <= :act_mod_counts_2 
    AND TRIM (a."MEMO") = TRIM (:memo) 
    AND a."MOD_STATUS" = :mod_status 
    AND CASE WHEN a."EXP_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."EXP_FLAG") END IN (:exp_flag) 
    AND a."BEG_DATE" = :beg_date 
    AND a."BEG_DATE" >= :beg_date_1 
    AND a."BEG_DATE" <= :beg_date_2 
    AND a."END_DATE" = :end_date 
    AND a."END_DATE" >= :end_date_1 
    AND a."END_DATE" <= :end_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."MOD_ACT_NO"
