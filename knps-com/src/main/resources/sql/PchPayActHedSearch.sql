SELECT
      a.*
    , (SELECT r2."UNIT_NAME" FROM MST_UNIT r2 WHERE r2."UNIT_CODE" = a."UNIT_CODE") AS "UNIT_NAME"
    , (SELECT r3."TAX_NAME" FROM MST_TAX r3 WHERE r3."TAX_CODE" = a."TAX_CODE") AS "TAX_NAME"
    , (SELECT r4."ACCOUNT_NAME" FROM MST_ACCOUNT_CODE r4 WHERE r4."ACCOUNT_CODE" = a."ACCOUNT_CODE") AS "ACCOUNT_NAME"
FROM
    PCH_PAY_ACT_HED a 
WHERE
    1 = 1 
    AND TRIM (a."PAY_NO") = TRIM (:pay_no) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ITEM" = :item 
    AND a."SUPPLY_KBN" IN (:supply_kbn) 
    AND TRIM (a."FROM_PAY") = TRIM (:from_pay) 
    AND TRIM (a."TO_PAY") = TRIM (:to_pay) 
    AND TRIM (a."UNIT_CODE") IN (:unit_code) 
    AND TRIM (a."TAX_CODE") IN (:tax_code) 
    AND a."TAX_CAL_CODE" IN (:tax_cal_code) 
    AND TRIM (a."ACCOUNT_CODE") IN (:account_code) 
    AND TRIM (a."SUPPLY_NO") = TRIM (:supply_no) 
    AND TRIM (a."SHIP_ORDER_NO") = TRIM (:ship_order_no) 
    AND a."PAY_DATE" = :pay_date 
    AND a."PAY_DATE" >= :pay_date_1 
    AND a."PAY_DATE" <= :pay_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."PAY_NO"
