SELECT
      a.*
    , (SELECT r1.SUB_INV_NAME FROM MST_SUBINV r1 WHERE r1.SUB_INV_CODE = a.SUB_INV_CODE) AS SUB_INV_NAME
    , (SELECT r2.SUP_NAME FROM MST_SUPPLIER r2 WHERE r2.SUP_CODE = a.RECEIPT_SUP_CODE) AS RECEIPT_SUP_NAME
FROM
    INV_STOCK_TOOL_MNG_DET a 
WHERE
    1 = 1 
    AND a.stock_management_section = :stock_management_section 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.sub_inv_code IN (:sub_inv_code) 
    AND a.in_out_date = :in_out_date 
    AND a.in_out_date >= :in_out_date_1 
    AND a.in_out_date <= :in_out_date_2 
    AND a.stock_branch_number = :stock_branch_number 
    AND a.in_out_status = :in_out_status 
    AND a.receipt_sup_code IN (:receipt_sup_code) 
    AND a.stock = :stock 
    AND a.inv_comment = :inv_comment 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.HINBAN, a.SUB_INV_CODE, a.STOCK_MANAGEMENT_SECTION, a.IN_OUT_DATE, a.STOCK_BRANCH_NUMBER
