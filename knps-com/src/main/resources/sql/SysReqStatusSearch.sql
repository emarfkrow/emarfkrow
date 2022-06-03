SELECT
      a.*
    , (SELECT r1.EMP_NAME FROM MST_EMP r1 WHERE r1.EMP_CODE = a."REQ_EMP_CODE") AS REQ_EMP_NAME
FROM
    SYS_REQ_STATUS a 
WHERE
    1 = 1 
    AND TRIM (a."REQ_ID") = TRIM (:req_id) 
    AND a."REQ_PRG_NAME" LIKE '%' || :req_prg_name || '%' 
    AND TRIM (a."REQ_EMP_CODE") IN (:req_emp_code) 
    AND a."REQ_DATE" = :req_date 
    AND a."REQ_DATE" >= :req_date_1 
    AND a."REQ_DATE" <= :req_date_2 
    AND a."REQ_EXEC_DATE" = :req_exec_date 
    AND a."REQ_EXEC_DATE" >= :req_exec_date_1 
    AND a."REQ_EXEC_DATE" <= :req_exec_date_2 
    AND a."REQ_COMP_DATE" = :req_comp_date 
    AND a."REQ_COMP_DATE" >= :req_comp_date_1 
    AND a."REQ_COMP_DATE" <= :req_comp_date_2 
    AND a."EXEC_PHASE" = :exec_phase 
    AND a."EXEC_STATUS" = :exec_status 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND a."PARAMS" = :params 
ORDER BY
    a."REQ_ID"
