SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a.SUP_CODE) AS SUP_NAME
    , (SELECT r2.UNIT_NAME FROM MST_UNIT r2 WHERE r2.UNIT_CODE = a.UNIT_CODE) AS UNIT_NAME
    , (SELECT r3.TAX_NAME FROM MST_TAX r3 WHERE r3.TAX_CODE = a.TAX_CODE) AS TAX_NAME
    , (SELECT r4.ACCOUNT_NAME FROM MST_ACCOUNT_CODE r4 WHERE r4.ACCOUNT_CODE = a.ACCOUNT_CODE) AS ACCOUNT_NAME
FROM
    PCH_ACCEPT_ACT_HED a 
WHERE
    1 = 1 
    AND TRIM (a.act_no) = TRIM (:act_no) 
    AND a.sup_code IN (:sup_code) 
    AND TRIM (a.order_no) = TRIM (:order_no) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.item = :item 
    AND a.accept_date = :accept_date 
    AND a.accept_date >= :accept_date_1 
    AND a.accept_date <= :accept_date_2 
    AND a.unit_code IN (:unit_code) 
    AND a.tax_code IN (:tax_code) 
    AND a.tax_cal_code IN (:tax_cal_code) 
    AND a.subinv_code IN (:subinv_code) 
    AND a.account_code IN (:account_code) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.ACT_NO
