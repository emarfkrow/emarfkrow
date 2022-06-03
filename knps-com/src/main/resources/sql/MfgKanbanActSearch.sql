SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a."WC_CODE") AS WC_NAME
FROM
    MFG_KANBAN_ACT a 
WHERE
    1 = 1 
    AND TRIM (a."ACT_NO") = TRIM (:act_no) 
    AND TRIM (a."KANBAN_ID") = TRIM (:kanban_id) 
    AND a."SERIAL_NO" = :serial_no 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND a."ACT_DATE" = :act_date 
    AND a."ACT_DATE" >= :act_date_1 
    AND a."ACT_DATE" <= :act_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."ACT_NO"
