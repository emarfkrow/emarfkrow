SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
    , (SELECT r2.SUP_NAME FROM MST_SUPPLIER r2 WHERE r2.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    PRD_M_PRO_PLAN_ROUTING a 
WHERE
    1 = 1 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND TRIM (a.pro_hinban) = TRIM (:pro_hinban) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.routing_group = :routing_group 
    AND a.routing = :routing 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND TRIM (a.wscode) = TRIM (:wscode) 
    AND a.in_out_kbn IN (:in_out_kbn) 
    AND TRIM (a.sup_code) IN (:sup_code) 
    AND a.nes_counts = :nes_counts 
    AND a.nes_counts >= :nes_counts_1 
    AND a.nes_counts <= :nes_counts_2 
    AND a.mac_load_kbn IN (:mac_load_kbn) 
    AND a.hum_pre_time = :hum_pre_time 
    AND a.hum_act_time = :hum_act_time 
    AND a.mac_pre_time = :mac_pre_time 
    AND a.mac_act_time = :mac_act_time 
    AND a.comment1 = :comment1 
    AND a.comment2 = :comment2 
    AND a.unit_weight = :unit_weight 
    AND a.order_unit_price = :order_unit_price 
    AND a.proc_lt = :proc_lt 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.YYYY, a.MM, a.PRO_HINBAN, a.HINBAN, a.ROUTING_GROUP, a.ROUTING
