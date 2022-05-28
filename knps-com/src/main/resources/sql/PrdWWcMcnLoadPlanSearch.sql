SELECT
      a.*
FROM
    PRD_W_WC_MCN_LOAD_PLAN a 
WHERE
    1 = 1 
    AND a.w_plan_id = :w_plan_id 
    AND TRIM (a.man_hinban) = TRIM (:man_hinban) 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND a.wc_name LIKE '%' || :wc_name || '%' 
    AND TRIM (a.ws_code) IN (:ws_code) 
    AND a.ws_name LIKE '%' || :ws_name || '%' 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND a.hum_pre_time = :hum_pre_time 
    AND a.hum_act_time = :hum_act_time 
    AND a.hum_total_time = :hum_total_time 
    AND a.mac_pre_time = :mac_pre_time 
    AND a.mac_act_time = :mac_act_time 
    AND a.mac_total_time = :mac_total_time 
    AND a.pro_nes_counts = :pro_nes_counts 
    AND a.pro_nes_counts >= :pro_nes_counts_1 
    AND a.pro_nes_counts <= :pro_nes_counts_2 
    AND a.pro_nes_weight = :pro_nes_weight 
    AND a.data_source_kbn IN (:data_source_kbn) 
    AND a.period = :period 
    AND TRIM (a.plan_no) = TRIM (:plan_no) 
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
    a.W_PLAN_ID, a.MAN_HINBAN, a.WC_CODE, a.DATA_SOURCE_KBN, a.PERIOD, a.PLAN_NO
