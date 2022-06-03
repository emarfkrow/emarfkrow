SELECT
      a.*
FROM
    MST_UNIT a 
WHERE
    1 = 1 
    AND TRIM (a."UNIT_CODE") IN (:unit_code) 
    AND a."UNIT_NAME" LIKE '%' || :unit_name || '%' 
    AND a."STAN_UNIT_KBN" IN (:stan_unit_kbn) 
    AND TRIM (a."STAN_UNIT_CODE") IN (:stan_unit_code) 
    AND a."EXCHANGE_RATE" = :exchange_rate 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
ORDER BY
    a."UNIT_CODE"
