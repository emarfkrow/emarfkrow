SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
    , (SELECT r2.SUP_NAME FROM MST_SUPPLIER r2 WHERE r2.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    MFG_TOTAL_COST_REG_LINE_M_Q a 
WHERE
    1 = 1 
    AND TRIM (a.yy) = TRIM (:yy) 
    AND a.pro_group_no = :pro_group_no 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.routing = :routing 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND TRIM (a.sup_code) IN (:sup_code) 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND a.last_routing_kbn IN (:last_routing_kbn) 
    AND CASE WHEN a.total_cost_target_flag IS NULL THEN '0' ELSE TO_CHAR (a.total_cost_target_flag) END IN (:total_cost_target_flag) 
    AND a.cost_rate_kbn IN (:cost_rate_kbn) 
    AND a.unit_cost_first = :unit_cost_first 
    AND a.unit_cost_second = :unit_cost_second 
    AND a.total_unit_cost = :total_unit_cost 
    AND a.sum_cost_first = :sum_cost_first 
    AND a.sum_cost_second = :sum_cost_second 
    AND a.total_sum_cost = :total_sum_cost 
    AND a.ope_counts = :ope_counts 
    AND a.ope_counts >= :ope_counts_1 
    AND a.ope_counts <= :ope_counts_2 
    AND a.ope_amounts = :ope_amounts 
    AND a.unit_weight = :unit_weight 
    AND a.ope_time = :ope_time 
    AND a.hum_pre_time = :hum_pre_time 
    AND a.hum_act_time = :hum_act_time 
    AND a.mac_pre_time = :mac_pre_time 
    AND a.mac_act_time = :mac_act_time 
    AND a.sum_unit_supply = :sum_unit_supply 
    AND a.materials_cost = :materials_cost 
    AND a.hum_labor_cost_first = :hum_labor_cost_first 
    AND a.hum_expenses_first = :hum_expenses_first 
    AND a.hum_labor_cost_second = :hum_labor_cost_second 
    AND a.hum_expenses_second = :hum_expenses_second 
    AND a.mac_labor_cost_first = :mac_labor_cost_first 
    AND a.mac_expenses_first = :mac_expenses_first 
    AND a.mac_labor_cost_second = :mac_labor_cost_second 
    AND a.mac_expenses_second = :mac_expenses_second 
    AND a.data_source_kbn IN (:data_source_kbn) 
    AND a.t_unit_cost_first = :t_unit_cost_first 
    AND a.t_unit_cost_second = :t_unit_cost_second 
    AND a.t_total_unit_cost = :t_total_unit_cost 
    AND a.t_sum_cost_first = :t_sum_cost_first 
    AND a.t_sum_cost_second = :t_sum_cost_second 
    AND a.t_total_sum_cost = :t_total_sum_cost 
    AND a.t_ope_counts = :t_ope_counts 
    AND a.t_ope_counts >= :t_ope_counts_1 
    AND a.t_ope_counts <= :t_ope_counts_2 
    AND a.t_ope_amounts = :t_ope_amounts 
    AND a.t_unit_weight = :t_unit_weight 
    AND a.t_ope_time = :t_ope_time 
    AND a.t_hum_pre_time = :t_hum_pre_time 
    AND a.t_hum_act_time = :t_hum_act_time 
    AND a.t_mac_pre_time = :t_mac_pre_time 
    AND a.t_mac_act_time = :t_mac_act_time 
    AND a.t_sum_unit_supply = :t_sum_unit_supply 
    AND a.t_materials_cost = :t_materials_cost 
    AND a.t_hum_labor_cost_first = :t_hum_labor_cost_first 
    AND a.t_hum_expenses_first = :t_hum_expenses_first 
    AND a.t_hum_labor_cost_second = :t_hum_labor_cost_second 
    AND a.t_hum_expenses_second = :t_hum_expenses_second 
    AND a.t_mac_labor_cost_first = :t_mac_labor_cost_first 
    AND a.t_mac_expenses_first = :t_mac_expenses_first 
    AND a.t_mac_labor_cost_second = :t_mac_labor_cost_second 
    AND a.t_mac_expenses_second = :t_mac_expenses_second 
    AND a.t_data_source_kbn IN (:t_data_source_kbn) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.HINBAN, a.PRO_GROUP_NO, a.ROUTING, a.YY, a.MM
