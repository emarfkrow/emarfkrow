SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
FROM
    INV_STOCK_PROCESS_DET a 
WHERE
    1 = 1 
    AND a."LOCATION_CODE" IN (:location_code) 
    AND a."HINBAN" = :hinban 
    AND TRIM (a."IN_OUT_YMD") = TRIM (:in_out_ymd) 
    AND a."IN_OUT_YMD" >= :in_out_ymd_1 
    AND a."IN_OUT_YMD" <= :in_out_ymd_2 
    AND a."IN_OUT_SEQ" = :in_out_seq 
    AND a."ROUTING_GROUP" = :routing_group 
    AND a."OPE_DETAIL" = :ope_detail 
    AND a."IN_OUT_KB" IN (:in_out_kb) 
    AND a."IN_OUT_QT" = :in_out_qt 
    AND a."IN_OUT_QT" >= :in_out_qt_1 
    AND a."IN_OUT_QT" <= :in_out_qt_2 
    AND a."INV_CMT" = :inv_cmt 
    AND TRIM (a."CHILD_PLAN_NO") = TRIM (:child_plan_no) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."LOCATION_CODE", a."HINBAN", a."IN_OUT_YMD", a."IN_OUT_SEQ"
