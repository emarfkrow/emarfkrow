SELECT
      a.*
FROM
    PRD_W_WC_MCN_LOAD_PLAN a 
WHERE
    1 = 1 
    AND a."W_PLAN_ID" = :w_plan_id 
    AND TRIM (a."MAN_HINBAN") = TRIM (:man_hinban) 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND a."WC_NAME" LIKE '%' || :wc_name || '%' 
    AND TRIM (a."WS_CODE") IN (:ws_code) 
    AND a."WS_NAME" LIKE '%' || :ws_name || '%' 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND a."HUM_PRE_TIME" = :hum_pre_time 
    AND a."HUM_ACT_TIME" = :hum_act_time 
    AND a."HUM_TOTAL_TIME" = :hum_total_time 
    AND a."MAC_PRE_TIME" = :mac_pre_time 
    AND a."MAC_ACT_TIME" = :mac_act_time 
    AND a."MAC_TOTAL_TIME" = :mac_total_time 
    AND a."PRO_NES_COUNTS" = :pro_nes_counts 
    AND a."PRO_NES_COUNTS" >= :pro_nes_counts_1 
    AND a."PRO_NES_COUNTS" <= :pro_nes_counts_2 
    AND a."PRO_NES_WEIGHT" = :pro_nes_weight 
    AND a."DATA_SOURCE_KBN" IN (:data_source_kbn) 
    AND a."PERIOD" = :period 
    AND TRIM (a."PLAN_NO") = TRIM (:plan_no) 
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
    a."W_PLAN_ID", a."MAN_HINBAN", a."WC_CODE", a."DATA_SOURCE_KBN", a."PERIOD", a."PLAN_NO"
