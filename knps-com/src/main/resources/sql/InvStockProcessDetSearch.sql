SELECT
      a.*
    , (SELECT r1.LOCATION_NAME FROM MST_LOCATION r1 WHERE r1.LOCATION_CODE = a.LOCATION_CODE) AS LOCATION_NAME
FROM
    INV_STOCK_PROCESS_DET a 
WHERE
    1 = 1 
    AND a.location_code IN (:location_code) 
    AND a.hinban = :hinban 
    AND TRIM (a.in_out_ymd) = TRIM (:in_out_ymd) 
    AND a.in_out_ymd >= :in_out_ymd_1 
    AND a.in_out_ymd <= :in_out_ymd_2 
    AND a.in_out_seq = :in_out_seq 
    AND a.routing_group = :routing_group 
    AND a.ope_detail = :ope_detail 
    AND a.in_out_kb IN (:in_out_kb) 
    AND a.in_out_qt = :in_out_qt 
    AND a.in_out_qt >= :in_out_qt_1 
    AND a.in_out_qt <= :in_out_qt_2 
    AND a.inv_cmt = :inv_cmt 
    AND TRIM (a.child_plan_no) = TRIM (:child_plan_no) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.LOCATION_CODE, a.HINBAN, a.IN_OUT_YMD, a.IN_OUT_SEQ
