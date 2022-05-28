SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    MST_SUP_UNITPRICE_BK a 
WHERE
    1 = 1 
    AND TRIM (a.yy) = TRIM (:yy) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND TRIM (a.sup_code) IN (:sup_code) 
    AND TRIM (a.subinv_code) IN (:subinv_code) 
    AND a.procure_lt = :procure_lt 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND CASE WHEN a.musho_hacchu_f IS NULL THEN '0' ELSE TO_CHAR (a.musho_hacchu_f) END IN (:musho_hacchu_f) 
ORDER BY
    a.HINBAN, a.SUP_CODE, a.YY
