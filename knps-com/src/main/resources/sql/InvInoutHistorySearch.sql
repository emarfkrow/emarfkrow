SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
FROM
    INV_INOUT_HISTORY a 
WHERE
    1 = 1 
    AND a."ACTION_DATE" = :action_date 
    AND a."ACTION_DATE" >= :action_date_1 
    AND a."ACTION_DATE" <= :action_date_2 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."IN_OUT_COUNTS" = :in_out_counts 
    AND a."IN_OUT_COUNTS" >= :in_out_counts_1 
    AND a."IN_OUT_COUNTS" <= :in_out_counts_2 
    AND a."IN_OUT_KBN" IN (:in_out_kbn) 
    AND TRIM (a."FROM_PAY") = TRIM (:from_pay) 
    AND TRIM (a."TO_PAY") = TRIM (:to_pay) 
    AND a."REQ_NAME" LIKE '%' || :req_name || '%' 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."ACTION_DATE", a."HINBAN", a."IN_OUT_COUNTS", a."IN_OUT_KBN"
