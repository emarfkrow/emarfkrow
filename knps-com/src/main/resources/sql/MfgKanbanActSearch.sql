SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    MFG_KANBAN_ACT a 
WHERE
    1 = 1 
    AND TRIM (a.act_no) = TRIM (:act_no) 
    AND TRIM (a.kanban_id) = TRIM (:kanban_id) 
    AND a.serial_no = :serial_no 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND a.act_date = :act_date 
    AND a.act_date >= :act_date_1 
    AND a.act_date <= :act_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.ACT_NO
