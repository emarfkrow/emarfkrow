SELECT
      a.*
    , (SELECT r1.UNIT_NAME FROM MST_UNIT r1 WHERE r1.UNIT_CODE = a.UNIT_CODE) AS UNIT_NAME
FROM
    MFG_ORDER_HINBAN_DEPLOY a 
WHERE
    1 = 1 
    AND TRIM (a.reqid) = TRIM (:reqid) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND TRIM (a.delivery_date) = TRIM (:delivery_date) 
    AND a.delivery_date >= :delivery_date_1 
    AND a.delivery_date <= :delivery_date_2 
    AND a.unit_code IN (:unit_code) 
    AND a.counts = :counts 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.REQID, a.HINBAN, a.DELIVERY_DATE
