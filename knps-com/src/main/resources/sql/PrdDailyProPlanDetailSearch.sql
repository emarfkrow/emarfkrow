SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
FROM
    PRD_DAILY_PRO_PLAN_DETAIL a 
WHERE
    1 = 1 
    AND TRIM (a."CHILD_PLAN_NO") = TRIM (:child_plan_no) 
    AND TRIM (a."PARENT_PLAN_NO") = TRIM (:parent_plan_no) 
    AND TRIM (a."PLAN_NO") = TRIM (:plan_no) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."LOT_SIZE" = :lot_size 
    AND a."LOT_SIZE_CHANGE" = :lot_size_change 
    AND TRIM (a."KANBAN_ID") = TRIM (:kanban_id) 
    AND a."SERIAL_NO" = :serial_no 
    AND a."ROUTING_COUNTS" = :routing_counts 
    AND a."ROUTING_COUNTS" >= :routing_counts_1 
    AND a."ROUTING_COUNTS" <= :routing_counts_2 
    AND TRIM (a."PLAN_STATUS") = TRIM (:plan_status) 
    AND a."PRO_GROUP_NO" = :pro_group_no 
    AND a."OUT_PLAN_TRANS" = :out_plan_trans 
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
    AND CASE WHEN a."PCH_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."PCH_FLAG") END IN (:pch_flag) 
    AND a."PRINT_ORDER" = :print_order 
    AND a."SHORT_NO" = :short_no 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
ORDER BY
    a."CHILD_PLAN_NO"
