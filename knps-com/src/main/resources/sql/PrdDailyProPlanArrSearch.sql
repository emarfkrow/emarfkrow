SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a."WC_CODE") AS WC_NAME
    , (SELECT r2.WC_NAME FROM MST_WC r2 WHERE r2.WC_CODE = a."OPE_WC_CODE") AS OPE_WC_NAME
FROM
    PRD_DAILY_PRO_PLAN_ARR a 
WHERE
    1 = 1 
    AND TRIM (a."PRO_NO") = TRIM (:pro_no) 
    AND TRIM (a."CHILD_PLAN_NO") = TRIM (:child_plan_no) 
    AND a."ROUTING" = :routing 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND a."MAC_LOAD_KBN" IN (:mac_load_kbn) 
    AND a."HUM_PRE_TIME" = :hum_pre_time 
    AND a."HUM_ACT_TIME" = :hum_act_time 
    AND a."MAC_PRE_TIME" = :mac_pre_time 
    AND a."MAC_ACT_TIME" = :mac_act_time 
    AND a."COMMENT1" = :comment1 
    AND a."COMMENT2" = :comment2 
    AND a."UNIT_WEIGHT" = :unit_weight 
    AND CASE WHEN a."NECK_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.NECK_FLAG) END IN (:neck_flag) 
    AND TRIM (a."NEXT_ROUT_PRO_NO") = TRIM (:next_rout_pro_no) 
    AND a."INITIAL_BEG_DATE" = :initial_beg_date 
    AND a."INITIAL_BEG_DATE" >= :initial_beg_date_1 
    AND a."INITIAL_BEG_DATE" <= :initial_beg_date_2 
    AND a."INITIAL_END_DATE" = :initial_end_date 
    AND a."INITIAL_END_DATE" >= :initial_end_date_1 
    AND a."INITIAL_END_DATE" <= :initial_end_date_2 
    AND a."BEG_DATE" = :beg_date 
    AND a."BEG_DATE" >= :beg_date_1 
    AND a."BEG_DATE" <= :beg_date_2 
    AND a."END_DATE" = :end_date 
    AND a."END_DATE" >= :end_date_1 
    AND a."END_DATE" <= :end_date_2 
    AND a."START_DATE" = :start_date 
    AND a."START_DATE" >= :start_date_1 
    AND a."START_DATE" <= :start_date_2 
    AND a."COMP_DATE" = :comp_date 
    AND a."COMP_DATE" >= :comp_date_1 
    AND a."COMP_DATE" <= :comp_date_2 
    AND TRIM (a."OPE_WC_CODE") IN (:ope_wc_code) 
    AND a."PRO_STATUS" = :pro_status 
    AND a."DEL_CAN_DATE" = :del_can_date 
    AND a."DEL_CAN_DATE" >= :del_can_date_1 
    AND a."DEL_CAN_DATE" <= :del_can_date_2 
    AND CASE WHEN a."EXP_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.EXP_FLAG) END IN (:exp_flag) 
    AND CASE WHEN a."VISIBLE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.VISIBLE_FLAG) END IN (:visible_flag) 
    AND CASE WHEN a."SUP_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.SUP_FLAG) END IN (:sup_flag) 
    AND a."SHORT_NO" = :short_no 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
    AND CASE WHEN a."NYUKO_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.NYUKO_FLAG) END IN (:nyuko_flag) 
ORDER BY
    a."PRO_NO"
