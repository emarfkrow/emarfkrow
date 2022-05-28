SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    MST_SUP_UNITPRICE_DETAIL_BK a 
WHERE
    1 = 1 
    AND TRIM (a.yy) = TRIM (:yy) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.sup_code IN (:sup_code) 
    AND a.min_order = :min_order 
    AND a.stan_counts = :stan_counts 
    AND a.stan_counts >= :stan_counts_1 
    AND a.stan_counts <= :stan_counts_2 
    AND a.order_unit = :order_unit 
    AND a.order_unit >= :order_unit_1 
    AND a.order_unit <= :order_unit_2 
    AND CASE WHEN a.standard_unitprice_flag IS NULL THEN '0' ELSE TO_CHAR (a.standard_unitprice_flag) END IN (:standard_unitprice_flag) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND a.gaika_kb IN (:gaika_kb) 
    AND a.gaika_tk = :gaika_tk 
ORDER BY
    a.HINBAN, a.SUP_CODE, a.MIN_ORDER, a.YY
