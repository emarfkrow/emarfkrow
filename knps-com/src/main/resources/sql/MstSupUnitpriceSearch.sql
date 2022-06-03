SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a."SUP_CODE") AS SUP_NAME
FROM
    MST_SUP_UNITPRICE a 
WHERE
    1 = 1 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND TRIM (a."SUBINV_CODE") IN (:subinv_code) 
    AND a."PROCURE_LT" = :procure_lt 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
    AND CASE WHEN a."MUSHO_HACCHU_F" IS NULL THEN '0' ELSE TO_CHAR (a.MUSHO_HACCHU_F) END IN (:musho_hacchu_f) 
ORDER BY
    a."HINBAN", a."SUP_CODE"
