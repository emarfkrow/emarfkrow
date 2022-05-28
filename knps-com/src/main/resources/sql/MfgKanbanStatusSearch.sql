SELECT
      a.*
FROM
    MFG_KANBAN_STATUS a 
WHERE
    1 = 1 
    AND TRIM (a.kanban_id) = TRIM (:kanban_id) 
    AND a.serial_no = :serial_no 
    AND a.kanban_print_status = :kanban_print_status 
    AND a.kanban_status = :kanban_status 
    AND a.re_issue_counts = :re_issue_counts 
    AND a.re_issue_counts >= :re_issue_counts_1 
    AND a.re_issue_counts <= :re_issue_counts_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.KANBAN_ID, a.SERIAL_NO
