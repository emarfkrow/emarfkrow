SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    MST_PROD_UNITPRICE_HS a 
WHERE
    1 = 1 
    AND TRIM (a.man_hinban) = TRIM (:man_hinban) 
    AND a.routing_group = :routing_group 
    AND a.routing = :routing 
    AND TRIM (a.wc_code) IN (:wc_code) 
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
    AND TRIM (a.gaika_kb) IN (:gaika_kb) 
    AND a.gaika_tk = :gaika_tk 
    AND CASE WHEN a.isshiki_unit_f IS NULL THEN '0' ELSE TO_CHAR (a.isshiki_unit_f) END IN (:isshiki_unit_f) 
    AND a.min_order_amount = :min_order_amount 
    AND a.min_order_amount >= :min_order_amount_1 
    AND a.min_order_amount <= :min_order_amount_2 
ORDER BY
    a.MAN_HINBAN, a.ROUTING_GROUP, a.ROUTING, a.WC_CODE, a.MIN_ORDER, a.TIME_STAMP_CHANGE
