SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    PRD_M_WC_MCN_LOAD_PLAN_BK a 
WHERE
    1 = 1 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND TRIM (a.man_hinban) = TRIM (:man_hinban) 
    AND a.wc_code IN (:wc_code) 
    AND a.pro_nes_counts = :pro_nes_counts 
    AND a.pro_nes_counts >= :pro_nes_counts_1 
    AND a.pro_nes_counts <= :pro_nes_counts_2 
    AND a.hum_pre_time = :hum_pre_time 
    AND a.hum_act_time = :hum_act_time 
    AND a.mac_pre_time_in = :mac_pre_time_in 
    AND a.mac_act_time_in = :mac_act_time_in 
    AND a.mac_pre_time_out = :mac_pre_time_out 
    AND a.mac_act_time_out = :mac_act_time_out 
    AND a.mac_pre_time_kanban = :mac_pre_time_kanban 
    AND a.mac_act_time_kanban = :mac_act_time_kanban 
    AND a.comment1 = :comment1 
    AND a.comment2 = :comment2 
    AND a.unit_weight = :unit_weight 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    1
    , 2
    , 3
    , 4
    , 5
    , 6
    , 7
    , 8
    , 9
    , 10
    , 11
    , 12
    , 13
    , 14
    , 15
    , 16
    , 17
    , 18
    , 19
    , 20
