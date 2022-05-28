SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
    , (SELECT r2.WC_NAME FROM MST_WC r2 WHERE r2.WC_CODE = a.OPE_WC_CODE) AS OPE_WC_NAME
FROM
    PRD_DAILY_PRO_PLAN_ARR a 
WHERE
    1 = 1 
    AND TRIM (a.pro_no) = TRIM (:pro_no) 
    AND TRIM (a.child_plan_no) = TRIM (:child_plan_no) 
    AND a.routing = :routing 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND a.mac_load_kbn IN (:mac_load_kbn) 
    AND a.hum_pre_time = :hum_pre_time 
    AND a.hum_act_time = :hum_act_time 
    AND a.mac_pre_time = :mac_pre_time 
    AND a.mac_act_time = :mac_act_time 
    AND a.comment1 = :comment1 
    AND a.comment2 = :comment2 
    AND a.unit_weight = :unit_weight 
    AND CASE WHEN a.neck_flag IS NULL THEN '0' ELSE TO_CHAR (a.neck_flag) END IN (:neck_flag) 
    AND TRIM (a.next_rout_pro_no) = TRIM (:next_rout_pro_no) 
    AND a.initial_beg_date = :initial_beg_date 
    AND a.initial_beg_date >= :initial_beg_date_1 
    AND a.initial_beg_date <= :initial_beg_date_2 
    AND a.initial_end_date = :initial_end_date 
    AND a.initial_end_date >= :initial_end_date_1 
    AND a.initial_end_date <= :initial_end_date_2 
    AND a.beg_date = :beg_date 
    AND a.beg_date >= :beg_date_1 
    AND a.beg_date <= :beg_date_2 
    AND a.end_date = :end_date 
    AND a.end_date >= :end_date_1 
    AND a.end_date <= :end_date_2 
    AND a.start_date = :start_date 
    AND a.start_date >= :start_date_1 
    AND a.start_date <= :start_date_2 
    AND a.comp_date = :comp_date 
    AND a.comp_date >= :comp_date_1 
    AND a.comp_date <= :comp_date_2 
    AND TRIM (a.ope_wc_code) IN (:ope_wc_code) 
    AND a.pro_status = :pro_status 
    AND a.del_can_date = :del_can_date 
    AND a.del_can_date >= :del_can_date_1 
    AND a.del_can_date <= :del_can_date_2 
    AND CASE WHEN a.exp_flag IS NULL THEN '0' ELSE TO_CHAR (a.exp_flag) END IN (:exp_flag) 
    AND CASE WHEN a.visible_flag IS NULL THEN '0' ELSE TO_CHAR (a.visible_flag) END IN (:visible_flag) 
    AND CASE WHEN a.sup_flag IS NULL THEN '0' ELSE TO_CHAR (a.sup_flag) END IN (:sup_flag) 
    AND a.short_no = :short_no 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND CASE WHEN a.nyuko_flag IS NULL THEN '0' ELSE TO_CHAR (a.nyuko_flag) END IN (:nyuko_flag) 
ORDER BY
    a.PRO_NO
