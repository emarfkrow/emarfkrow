SELECT
      a.*
FROM
    PCH_PAY_ACT_DET a 
WHERE
    1 = 1 
    AND TRIM (a.pay_no) = TRIM (:pay_no) 
    AND a.pay_branch_no = :pay_branch_no 
    AND a.pay_counts = :pay_counts 
    AND a.pay_counts >= :pay_counts_1 
    AND a.pay_counts <= :pay_counts_2 
    AND a.unit_price = :unit_price 
    AND a.amount = :amount 
    AND a.tax_amount = :tax_amount 
    AND a.tax_amount >= :tax_amount_1 
    AND a.tax_amount <= :tax_amount_2 
    AND a.memo = :memo 
    AND a.close_date = :close_date 
    AND a.close_date >= :close_date_1 
    AND a.close_date <= :close_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.PAY_NO, a.PAY_BRANCH_NO
