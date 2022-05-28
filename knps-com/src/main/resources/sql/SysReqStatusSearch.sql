SELECT
      a.*
    , (SELECT r1.EMP_NAME FROM MST_EMP r1 WHERE r1.EMP_CODE = a.REQ_EMP_CODE) AS REQ_EMP_NAME
FROM
    SYS_REQ_STATUS a 
WHERE
    1 = 1 
    AND TRIM (a.req_id) = TRIM (:req_id) 
    AND a.req_prg_name LIKE '%' || :req_prg_name || '%' 
    AND TRIM (a.req_emp_code) IN (:req_emp_code) 
    AND a.req_date = :req_date 
    AND a.req_date >= :req_date_1 
    AND a.req_date <= :req_date_2 
    AND a.req_exec_date = :req_exec_date 
    AND a.req_exec_date >= :req_exec_date_1 
    AND a.req_exec_date <= :req_exec_date_2 
    AND a.req_comp_date = :req_comp_date 
    AND a.req_comp_date >= :req_comp_date_1 
    AND a.req_comp_date <= :req_comp_date_2 
    AND a.exec_phase = :exec_phase 
    AND a.exec_status = :exec_status 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND a.params = :params 
ORDER BY
    a.REQ_ID
