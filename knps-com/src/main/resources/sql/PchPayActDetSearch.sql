SELECT
      a.*
FROM
    PCH_PAY_ACT_DET a 
WHERE
    1 = 1 
    AND TRIM (a."PAY_NO") = TRIM (:pay_no) 
    AND a."PAY_BRANCH_NO" = :pay_branch_no 
    AND a."PAY_COUNTS" = :pay_counts 
    AND a."PAY_COUNTS" >= :pay_counts_1 
    AND a."PAY_COUNTS" <= :pay_counts_2 
    AND a."UNIT_PRICE" = :unit_price 
    AND a."AMOUNT" = :amount 
    AND a."TAX_AMOUNT" = :tax_amount 
    AND a."TAX_AMOUNT" >= :tax_amount_1 
    AND a."TAX_AMOUNT" <= :tax_amount_2 
    AND a."MEMO" = :memo 
    AND a."CLOSE_DATE" = :close_date 
    AND a."CLOSE_DATE" >= :close_date_1 
    AND a."CLOSE_DATE" <= :close_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."PAY_NO", a."PAY_BRANCH_NO"
