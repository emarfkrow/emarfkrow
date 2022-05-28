SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    MST_ROUTING_BK a 
WHERE
    1 = 1 
    AND TRIM (a.yy) = TRIM (:yy) 
    AND TRIM (a.man_hinban) = TRIM (:man_hinban) 
    AND a.routing_group = :routing_group 
    AND a.routing = :routing 
    AND a.neck_routing = :neck_routing 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND a.hum_pre_time = :hum_pre_time 
    AND a.hum_act_time = :hum_act_time 
    AND a.mac_pre_time = :mac_pre_time 
    AND a.mac_act_time = :mac_act_time 
    AND a.comment1 = :comment1 
    AND a.comment2 = :comment2 
    AND a.lot_size = :lot_size 
    AND a.acc_counts = :acc_counts 
    AND a.acc_counts >= :acc_counts_1 
    AND a.acc_counts <= :acc_counts_2 
    AND a.unit_weight = :unit_weight 
    AND a.store_kbn IN (:store_kbn) 
    AND TRIM (a.store_no) = TRIM (:store_no) 
    AND a.inspect_lane_kbn IN (:inspect_lane_kbn) 
    AND a.inspect_kbn IN (:inspect_kbn) 
    AND TRIM (a.subinv_code) IN (:subinv_code) 
    AND a.hum_pre_time_kbn IN (:hum_pre_time_kbn) 
    AND a.hum_act_time_kbn IN (:hum_act_time_kbn) 
    AND a.mac_pre_time_kbn IN (:mac_pre_time_kbn) 
    AND a.mac_act_time_kbn IN (:mac_act_time_kbn) 
    AND CASE WHEN a.supply_flag IS NULL THEN '0' ELSE TO_CHAR (a.supply_flag) END IN (:supply_flag) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.musho_hacchu_f IS NULL THEN '0' ELSE TO_CHAR (a.musho_hacchu_f) END IN (:musho_hacchu_f) 
ORDER BY
    a.MAN_HINBAN, a.ROUTING_GROUP, a.ROUTING, a.YY
