SELECT
      a.*
    , (SELECT r1.UNIT_NAME FROM MST_UNIT r1 WHERE r1.UNIT_CODE = a.UNIT_CODE) AS UNIT_NAME
    , (SELECT r2.TAX_NAME FROM MST_TAX r2 WHERE r2.TAX_CODE = a.TAX_CODE) AS TAX_NAME
    , (SELECT r3.ACCOUNT_NAME FROM MST_ACCOUNT_CODE r3 WHERE r3.ACCOUNT_CODE = a.ACCOUNT_CODE) AS ACCOUNT_NAME
FROM
    PCH_PAY_ACT_HED a 
WHERE
    1 = 1 
    AND TRIM (a.pay_no) = TRIM (:pay_no) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.item = :item 
    AND a.supply_kbn IN (:supply_kbn) 
    AND TRIM (a.from_pay) = TRIM (:from_pay) 
    AND TRIM (a.to_pay) = TRIM (:to_pay) 
    AND TRIM (a.unit_code) IN (:unit_code) 
    AND TRIM (a.tax_code) IN (:tax_code) 
    AND a.tax_cal_code IN (:tax_cal_code) 
    AND TRIM (a.account_code) IN (:account_code) 
    AND TRIM (a.supply_no) = TRIM (:supply_no) 
    AND TRIM (a.ship_order_no) = TRIM (:ship_order_no) 
    AND a.pay_date = :pay_date 
    AND a.pay_date >= :pay_date_1 
    AND a.pay_date <= :pay_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.PAY_NO
