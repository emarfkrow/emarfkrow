SELECT
      a.*
FROM
    PRD_KANBAN_MENTE_HISTORY a 
WHERE
    1 = 1 
    AND TRIM (a.kanban_id) = TRIM (:kanban_id) 
    AND a.serial_no = :serial_no 
    AND a.print_out_date = :print_out_date 
    AND a.print_out_date >= :print_out_date_1 
    AND a.print_out_date <= :print_out_date_2 
    AND TRIM (a.print_out_operator) = TRIM (:print_out_operator) 
    AND a.scrap_date = :scrap_date 
    AND a.scrap_date >= :scrap_date_1 
    AND a.scrap_date <= :scrap_date_2 
    AND TRIM (a.scrap_operator) = TRIM (:scrap_operator) 
    AND a.lost_date = :lost_date 
    AND a.lost_date >= :lost_date_1 
    AND a.lost_date <= :lost_date_2 
    AND TRIM (a.lost_operator) = TRIM (:lost_operator) 
    AND TRIM (a.lost_req) = TRIM (:lost_req) 
    AND TRIM (a.lost_reason) = TRIM (:lost_reason) 
    AND a.loss_scrap_date = :loss_scrap_date 
    AND a.loss_scrap_date >= :loss_scrap_date_1 
    AND a.loss_scrap_date <= :loss_scrap_date_2 
    AND TRIM (a.loss_scrap_operator) = TRIM (:loss_scrap_operator) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.KANBAN_ID, a.SERIAL_NO
