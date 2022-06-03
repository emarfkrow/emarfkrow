SELECT
      a.*
FROM
    PRD_KANBAN_MENTE_HISTORY a 
WHERE
    1 = 1 
    AND TRIM (a."KANBAN_ID") = TRIM (:kanban_id) 
    AND a."SERIAL_NO" = :serial_no 
    AND a."PRINT_OUT_DATE" = :print_out_date 
    AND a."PRINT_OUT_DATE" >= :print_out_date_1 
    AND a."PRINT_OUT_DATE" <= :print_out_date_2 
    AND TRIM (a."PRINT_OUT_OPERATOR") = TRIM (:print_out_operator) 
    AND a."SCRAP_DATE" = :scrap_date 
    AND a."SCRAP_DATE" >= :scrap_date_1 
    AND a."SCRAP_DATE" <= :scrap_date_2 
    AND TRIM (a."SCRAP_OPERATOR") = TRIM (:scrap_operator) 
    AND a."LOST_DATE" = :lost_date 
    AND a."LOST_DATE" >= :lost_date_1 
    AND a."LOST_DATE" <= :lost_date_2 
    AND TRIM (a."LOST_OPERATOR") = TRIM (:lost_operator) 
    AND TRIM (a."LOST_REQ") = TRIM (:lost_req) 
    AND TRIM (a."LOST_REASON") = TRIM (:lost_reason) 
    AND a."LOSS_SCRAP_DATE" = :loss_scrap_date 
    AND a."LOSS_SCRAP_DATE" >= :loss_scrap_date_1 
    AND a."LOSS_SCRAP_DATE" <= :loss_scrap_date_2 
    AND TRIM (a."LOSS_SCRAP_OPERATOR") = TRIM (:loss_scrap_operator) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."KANBAN_ID", a."SERIAL_NO"
