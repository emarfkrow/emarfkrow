SELECT
      a.*
    , (SELECT r1."EMP_NAME" FROM MST_EMP r1 WHERE r1."EMP_CODE" = a."IRAI_EMP_CODE") AS "IRAI_EMP_NAME"
    , (SELECT r2."SUP_NAME" FROM MST_SUPPLIER r2 WHERE r2."SUP_CODE" = a."SUP_CODE") AS "SUP_NAME"
    , (SELECT r3."TEMP_SUP_NAME" FROM MST_TEMP_SUPPLIER r3 WHERE r3."TEMP_SUP_CODE" = a."TEMP_SUP_CODE") AS "TEMP_SUP_NAME"
    , (SELECT r4."EMP_NAME" FROM MST_EMP r4 WHERE r4."EMP_CODE" = a."PAY_IRAI_EMP_CODE") AS "PAY_IRAI_EMP_NAME"
FROM
    PCH_TEMP_ORDER a 
WHERE
    1 = 1 
    AND TRIM (a."TEMP_ORDER_NO") = TRIM (:temp_order_no) 
    AND a."IRAI_DT" = :irai_dt 
    AND a."IRAI_DT" >= :irai_dt_1 
    AND a."IRAI_DT" <= :irai_dt_2 
    AND a."IRAI_EMP_CODE" IN (:irai_emp_code) 
    AND a."SUP_CODE" IN (:sup_code) 
    AND a."TEMP_SUP_CODE" IN (:temp_sup_code) 
    AND a."MEMO" = :memo 
    AND a."PAY_IRAI_DT" = :pay_irai_dt 
    AND a."PAY_IRAI_DT" >= :pay_irai_dt_1 
    AND a."PAY_IRAI_DT" <= :pay_irai_dt_2 
    AND a."PAY_IRAI_EMP_CODE" IN (:pay_irai_emp_code) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."TEMP_ORDER_NO"
