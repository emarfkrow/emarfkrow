SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
    , (SELECT r2."SUB_INV_NAME" FROM MST_SUBINV r2 WHERE r2."SUB_INV_CODE" = a."SUB_INV_CODE") AS "SUB_INV_NAME"
    , (SELECT r3."ITEM" FROM MST_HINBAN r3 WHERE r3."HINBAN" = a."ISSUE_HINBAN") AS "ISSUE_ITEM"
FROM
    INV_MTRL_INOUT_HISTORY a 
WHERE
    1 = 1 
    AND a."STOCK_MANAGEMENT_SECTION" = :stock_management_section 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."SUB_INV_CODE") IN (:sub_inv_code) 
    AND a."IN_OUT_DATE" = :in_out_date 
    AND a."IN_OUT_DATE" >= :in_out_date_1 
    AND a."IN_OUT_DATE" <= :in_out_date_2 
    AND a."STOCK_BRANCH_NUMBER" = :stock_branch_number 
    AND TRIM (a."ACT_NO") = TRIM (:act_no) 
    AND a."ACT_BRANCH_NO" = :act_branch_no 
    AND TRIM (a."ORDER_NO") = TRIM (:order_no) 
    AND TRIM (a."PRO_NO") = TRIM (:pro_no) 
    AND a."IN_OUT_STATUS" = :in_out_status 
    AND TRIM (a."RECEIPT_SUP_CODE") IN (:receipt_sup_code) 
    AND TRIM (a."ISSUE_HINBAN") = TRIM (:issue_hinban) 
    AND a."STOCK" = :stock 
    AND a."GOOD_COUNTS" = :good_counts 
    AND a."GOOD_COUNTS" >= :good_counts_1 
    AND a."GOOD_COUNTS" <= :good_counts_2 
    AND a."MASTER_COUNTS" = :master_counts 
    AND a."MASTER_COUNTS" >= :master_counts_1 
    AND a."MASTER_COUNTS" <= :master_counts_2 
    AND a."AMOUNT_USED_PHI" = :amount_used_phi 
    AND a."AMOUNT_USED_LENGTH" = :amount_used_length 
    AND a."INV_COMMENT" = :inv_comment 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."HINBAN", a."SUB_INV_CODE", a."STOCK_MANAGEMENT_SECTION", a."IN_OUT_DATE", a."STOCK_BRANCH_NUMBER"
