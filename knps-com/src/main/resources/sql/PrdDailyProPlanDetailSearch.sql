SELECT
      a.*
FROM
    PRD_DAILY_PRO_PLAN_DETAIL a 
WHERE
    1 = 1 
    AND TRIM (a.child_plan_no) = TRIM (:child_plan_no) 
    AND TRIM (a.parent_plan_no) = TRIM (:parent_plan_no) 
    AND TRIM (a.plan_no) = TRIM (:plan_no) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.lot_size = :lot_size 
    AND a.lot_size_change = :lot_size_change 
    AND TRIM (a.kanban_id) = TRIM (:kanban_id) 
    AND a.serial_no = :serial_no 
    AND a.routing_counts = :routing_counts 
    AND a.routing_counts >= :routing_counts_1 
    AND a.routing_counts <= :routing_counts_2 
    AND TRIM (a.plan_status) = TRIM (:plan_status) 
    AND a.pro_group_no = :pro_group_no 
    AND a.out_plan_trans = :out_plan_trans 
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
    AND CASE WHEN a.pch_flag IS NULL THEN '0' ELSE TO_CHAR (a.pch_flag) END IN (:pch_flag) 
    AND a.print_order = :print_order 
    AND a.short_no = :short_no 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.CHILD_PLAN_NO
