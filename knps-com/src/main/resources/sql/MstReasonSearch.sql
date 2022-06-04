SELECT
      a.*
FROM
    MST_REASON a 
WHERE
    1 = 1 
    AND TRIM (a."REASON_CODE") IN (:reason_code) 
    AND a."REASON_NAME" LIKE '%' || :reason_name || '%' 
    AND a."REASON_KBN" IN (:reason_kbn) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
ORDER BY
    a."REASON_CODE"
