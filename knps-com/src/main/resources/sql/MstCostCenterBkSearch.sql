SELECT
      a.*
    , (SELECT r2.SUP_NAME FROM MST_SUPPLIER r2 WHERE r2.SUP_CODE = a."SUP_CODE") AS SUP_NAME
FROM
    MST_COST_CENTER_BK a 
WHERE
    1 = 1 
    AND TRIM (a."YY") = TRIM (:yy) 
    AND TRIM (a."COST_CENTER_CODE") IN (:cost_center_code) 
    AND a."COST_CENTER_NAME" LIKE '%' || :cost_center_name || '%' 
    AND a."IN_OUT_KBN" IN (:in_out_kbn) 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND a."COST_RATE_KBN" IN (:cost_rate_kbn) 
    AND TRIM (a."COST_RATE_CODE") IN (:cost_rate_code) 
    AND a."COST_COLLECT" = :cost_collect 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
ORDER BY
    a."COST_CENTER_CODE", a."YY"
