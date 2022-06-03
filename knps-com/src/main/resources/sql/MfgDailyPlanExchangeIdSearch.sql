SELECT
      a.*
FROM
    MFG_DAILY_PLAN_EXCHANGE_ID a 
WHERE
    1 = 1 
    AND TRIM (a."EXCHANGE_ID") = TRIM (:exchange_id) 
    AND TRIM (a."PRO_NO") = TRIM (:pro_no) 
    AND TRIM (a."ID_TYPE") = TRIM (:id_type) 
ORDER BY
    a."EXCHANGE_ID"
