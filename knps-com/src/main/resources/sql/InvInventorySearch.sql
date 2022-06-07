SELECT
      a.*
    , (SELECT r1."REASON_NAME" FROM MST_REASON r1 WHERE r1."REASON_CODE" = a."REASON_CODE") AS "REASON_NAME"
FROM
    INV_INVENTORY a 
WHERE
    1 = 1 
    AND TRIM (a."LOCATION_CODE") IN (:location_code) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."GOOD_STOCK" = :good_stock 
    AND a."BAD_STOCK" = :bad_stock 
    AND a."LATEST_IN_DATE" = :latest_in_date 
    AND a."LATEST_IN_DATE" >= :latest_in_date_1 
    AND a."LATEST_IN_DATE" <= :latest_in_date_2 
    AND a."LATEST_OUT_DATE" = :latest_out_date 
    AND a."LATEST_OUT_DATE" >= :latest_out_date_1 
    AND a."LATEST_OUT_DATE" <= :latest_out_date_2 
    AND a."REMAINS_KBN" IN (:remains_kbn) 
    AND TRIM (a."REASON_CODE") IN (:reason_code) 
    AND a."NOTE" = :note 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."LOCATION_CODE", a."HINBAN"
