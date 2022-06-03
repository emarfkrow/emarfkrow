SELECT
      a.*
FROM
    MFG_KANBAN_STATUS a 
WHERE
    1 = 1 
    AND TRIM (a."KANBAN_ID") = TRIM (:kanban_id) 
    AND a."SERIAL_NO" = :serial_no 
    AND a."KANBAN_PRINT_STATUS" = :kanban_print_status 
    AND a."KANBAN_STATUS" = :kanban_status 
    AND a."RE_ISSUE_COUNTS" = :re_issue_counts 
    AND a."RE_ISSUE_COUNTS" >= :re_issue_counts_1 
    AND a."RE_ISSUE_COUNTS" <= :re_issue_counts_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."KANBAN_ID", a."SERIAL_NO"
