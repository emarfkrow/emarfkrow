SELECT
      a.*
    , (SELECT r1.SUB_INV_NAME FROM MST_SUBINV r1 WHERE r1.SUB_INV_CODE = a.SUB_INV_CODE) AS SUB_INV_NAME
    , (SELECT r2.SUP_NAME FROM MST_SUPPLIER r2 WHERE r2.SUP_CODE = a.RECEIPT_SUP_CODE) AS RECEIPT_SUP_NAME
FROM
    INV_MTRL_INOUT_HISTORY a 
WHERE
    1 = 1 
    AND a.stock_management_section = :stock_management_section 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND TRIM (a.sub_inv_code) IN (:sub_inv_code) 
    AND a.in_out_date = :in_out_date 
    AND a.in_out_date >= :in_out_date_1 
    AND a.in_out_date <= :in_out_date_2 
    AND a.stock_branch_number = :stock_branch_number 
    AND TRIM (a.act_no) = TRIM (:act_no) 
    AND a.act_branch_no = :act_branch_no 
    AND TRIM (a.order_no) = TRIM (:order_no) 
    AND TRIM (a.pro_no) = TRIM (:pro_no) 
    AND a.in_out_status = :in_out_status 
    AND TRIM (a.receipt_sup_code) IN (:receipt_sup_code) 
    AND TRIM (a.issue_hinban) = TRIM (:issue_hinban) 
    AND a.stock = :stock 
    AND a.good_counts = :good_counts 
    AND a.good_counts >= :good_counts_1 
    AND a.good_counts <= :good_counts_2 
    AND a.master_counts = :master_counts 
    AND a.master_counts >= :master_counts_1 
    AND a.master_counts <= :master_counts_2 
    AND a.amount_used_phi = :amount_used_phi 
    AND a.amount_used_length = :amount_used_length 
    AND a.inv_comment = :inv_comment 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.HINBAN, a.SUB_INV_CODE, a.STOCK_MANAGEMENT_SECTION, a.IN_OUT_DATE, a.STOCK_BRANCH_NUMBER
