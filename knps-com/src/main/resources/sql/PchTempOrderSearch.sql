SELECT
      a.*
    , (SELECT r1.EMP_NAME FROM MST_EMP r1 WHERE r1.EMP_CODE = a.IRAI_EMP_CODE) AS IRAI_EMP_NAME
    , (SELECT r2.SUP_NAME FROM MST_SUPPLIER r2 WHERE r2.SUP_CODE = a.SUP_CODE) AS SUP_NAME
    , (SELECT r3.TEMP_SUP_NAME FROM MST_TEMP_SUPPLIER r3 WHERE r3.TEMP_SUP_CODE = a.TEMP_SUP_CODE) AS TEMP_SUP_NAME
    , (SELECT r4.EMP_NAME FROM MST_EMP r4 WHERE r4.EMP_CODE = a.PAY_IRAI_EMP_CODE) AS PAY_IRAI_EMP_NAME
FROM
    PCH_TEMP_ORDER a 
WHERE
    1 = 1 
    AND TRIM (a.temp_order_no) = TRIM (:temp_order_no) 
    AND a.irai_dt = :irai_dt 
    AND a.irai_dt >= :irai_dt_1 
    AND a.irai_dt <= :irai_dt_2 
    AND a.irai_emp_code IN (:irai_emp_code) 
    AND a.sup_code IN (:sup_code) 
    AND a.temp_sup_code IN (:temp_sup_code) 
    AND a.memo = :memo 
    AND a.pay_irai_dt = :pay_irai_dt 
    AND a.pay_irai_dt >= :pay_irai_dt_1 
    AND a.pay_irai_dt <= :pay_irai_dt_2 
    AND a.pay_irai_emp_code IN (:pay_irai_emp_code) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.TEMP_ORDER_NO
