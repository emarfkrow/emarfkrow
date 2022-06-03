SELECT
      a.*
    , (SELECT r1.SUB_INV_NAME FROM MST_SUBINV r1 WHERE r1.SUB_INV_CODE = a."SUB_INV_CODE") AS SUB_INV_NAME
    , (SELECT r2.SUP_NAME FROM MST_SUPPLIER r2 WHERE r2.SUP_CODE = a."RECEIPT_SUP_CODE") AS RECEIPT_SUP_NAME
FROM
    INV_STOCK_TOOL_MNG_DET a 
WHERE
    1 = 1 
    AND a."STOCK_MANAGEMENT_SECTION" = :stock_management_section 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."SUB_INV_CODE") IN (:sub_inv_code) 
    AND a."IN_OUT_DATE" = :in_out_date 
    AND a."IN_OUT_DATE" >= :in_out_date_1 
    AND a."IN_OUT_DATE" <= :in_out_date_2 
    AND a."STOCK_BRANCH_NUMBER" = :stock_branch_number 
    AND a."IN_OUT_STATUS" = :in_out_status 
    AND TRIM (a."RECEIPT_SUP_CODE") IN (:receipt_sup_code) 
    AND a."STOCK" = :stock 
    AND a."INV_COMMENT" = :inv_comment 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."HINBAN", a."SUB_INV_CODE", a."STOCK_MANAGEMENT_SECTION", a."IN_OUT_DATE", a."STOCK_BRANCH_NUMBER"
