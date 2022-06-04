SELECT
      a.*
    , (SELECT r1."UNIT_NAME" FROM MST_UNIT r1 WHERE r1."UNIT_CODE" = a."UNIT_CODE") AS "UNIT_NAME"
FROM
    MFG_ORDER_HINBAN_DEPLOY a 
WHERE
    1 = 1 
    AND TRIM (a."REQID") = TRIM (:reqid) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."DELIVERY_DATE") = TRIM (:delivery_date) 
    AND a."DELIVERY_DATE" >= :delivery_date_1 
    AND a."DELIVERY_DATE" <= :delivery_date_2 
    AND TRIM (a."UNIT_CODE") IN (:unit_code) 
    AND a."COUNTS" = :counts 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."REQID", a."HINBAN", a."DELIVERY_DATE"
