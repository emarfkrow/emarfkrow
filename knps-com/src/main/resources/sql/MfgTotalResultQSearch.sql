SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
    , (SELECT r2.UNIT_NAME FROM MST_UNIT r2 WHERE r2.UNIT_CODE = a.UNIT_CODE) AS UNIT_NAME
FROM
    MFG_TOTAL_RESULT_Q a 
WHERE
    1 = 1 
    AND TRIM (a.result_date) = TRIM (:result_date) 
    AND a.result_date >= :result_date_1 
    AND a.result_date <= :result_date_2 
    AND a.pro_group_no = :pro_group_no 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND TRIM (a.routing) = TRIM (:routing) 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND a.hum_pre_time = :hum_pre_time 
    AND a.hum_act_time = :hum_act_time 
    AND a.mac_pre_time = :mac_pre_time 
    AND a.mac_act_time = :mac_act_time 
    AND a.good_counts = :good_counts 
    AND a.good_counts >= :good_counts_1 
    AND a.good_counts <= :good_counts_2 
    AND a.reject_counts = :reject_counts 
    AND a.reject_counts >= :reject_counts_1 
    AND a.reject_counts <= :reject_counts_2 
    AND TRIM (a.unit_code) IN (:unit_code) 
    AND a.act_lt = :act_lt 
    AND a.act_wait_time = :act_wait_time 
    AND a.exp_wait_time = :exp_wait_time 
    AND a.exp_pre_time = :exp_pre_time 
    AND a.exp_pro_time = :exp_pro_time 
    AND a.exp_rest_time = :exp_rest_time 
    AND a.exp_choko_time = :exp_choko_time 
    AND a.exp_troub_time = :exp_troub_time 
    AND a.exp_self_mod_time = :exp_self_mod_time 
    AND a.exp_othr_mod_time = :exp_othr_mod_time 
    AND a.exp_etc_time = :exp_etc_time 
    AND a.volume_weight = :volume_weight 
    AND a.unit_weight = :unit_weight 
    AND a.end_material_weight = :end_material_weight 
    AND a.pro_counts = :pro_counts 
    AND a.pro_counts >= :pro_counts_1 
    AND a.pro_counts <= :pro_counts_2 
    AND a.last_routing = :last_routing 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.RESULT_DATE, a.PRO_GROUP_NO, a.HINBAN, a.ROUTING, a.WC_CODE, a.OPE_DETAIL
