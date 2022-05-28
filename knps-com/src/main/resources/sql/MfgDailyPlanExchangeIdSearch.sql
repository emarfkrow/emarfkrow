SELECT
      a.*
FROM
    MFG_DAILY_PLAN_EXCHANGE_ID a 
WHERE
    1 = 1 
    AND TRIM (a.exchange_id) = TRIM (:exchange_id) 
    AND TRIM (a.pro_no) = TRIM (:pro_no) 
    AND TRIM (a.id_type) = TRIM (:id_type) 
ORDER BY
    a.EXCHANGE_ID
