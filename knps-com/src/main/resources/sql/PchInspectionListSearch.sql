SELECT
      a.*
FROM
    PCH_INSPECTION_LIST a 
WHERE
    1 = 1 
    AND TRIM (a.target_date) = TRIM (:target_date) 
    AND a.target_date >= :target_date_1 
    AND a.target_date <= :target_date_2 
    AND a.sup_code IN (:sup_code) 
    AND a.sup_name LIKE '%' || :sup_name || '%' 
    AND TRIM (a.order_no) = TRIM (:order_no) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.item = :item 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND a.memo = :memo 
    AND a.sum_inspect_counts = :sum_inspect_counts 
    AND a.sum_inspect_counts >= :sum_inspect_counts_1 
    AND a.sum_inspect_counts <= :sum_inspect_counts_2 
    AND a.inspect_unit = :inspect_unit 
    AND a.inspect_unit >= :inspect_unit_1 
    AND a.inspect_unit <= :inspect_unit_2 
    AND a.accept_date = :accept_date 
    AND a.accept_date >= :accept_date_1 
    AND a.accept_date <= :accept_date_2 
    AND a.sum_inspect_amount = :sum_inspect_amount 
    AND a.sum_inspect_amount >= :sum_inspect_amount_1 
    AND a.sum_inspect_amount <= :sum_inspect_amount_2 
    AND a.sum_tax_amount = :sum_tax_amount 
    AND a.sum_tax_amount >= :sum_tax_amount_1 
    AND a.sum_tax_amount <= :sum_tax_amount_2 
    AND a.sum_amount = :sum_amount 
    AND a.sum_amount >= :sum_amount_1 
    AND a.sum_amount <= :sum_amount_2 
    AND a.send_inspect_list = :send_inspect_list 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.isshiki_unit_f IS NULL THEN '0' ELSE TO_CHAR (a.isshiki_unit_f) END IN (:isshiki_unit_f) 
ORDER BY
    a.ORDER_NO, a.TARGET_DATE, a.SUP_CODE
