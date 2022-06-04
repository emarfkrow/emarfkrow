SELECT
      a.*
FROM
    PCH_INSPECTION_LIST a 
WHERE
    1 = 1 
    AND TRIM (a."TARGET_DATE") = TRIM (:target_date) 
    AND a."TARGET_DATE" >= :target_date_1 
    AND a."TARGET_DATE" <= :target_date_2 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND a."SUP_NAME" LIKE '%' || :sup_name || '%' 
    AND TRIM (a."ORDER_NO") = TRIM (:order_no) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ITEM" = :item 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND a."MEMO" = :memo 
    AND a."SUM_INSPECT_COUNTS" = :sum_inspect_counts 
    AND a."SUM_INSPECT_COUNTS" >= :sum_inspect_counts_1 
    AND a."SUM_INSPECT_COUNTS" <= :sum_inspect_counts_2 
    AND a."INSPECT_UNIT" = :inspect_unit 
    AND a."INSPECT_UNIT" >= :inspect_unit_1 
    AND a."INSPECT_UNIT" <= :inspect_unit_2 
    AND a."ACCEPT_DATE" = :accept_date 
    AND a."ACCEPT_DATE" >= :accept_date_1 
    AND a."ACCEPT_DATE" <= :accept_date_2 
    AND a."SUM_INSPECT_AMOUNT" = :sum_inspect_amount 
    AND a."SUM_INSPECT_AMOUNT" >= :sum_inspect_amount_1 
    AND a."SUM_INSPECT_AMOUNT" <= :sum_inspect_amount_2 
    AND a."SUM_TAX_AMOUNT" = :sum_tax_amount 
    AND a."SUM_TAX_AMOUNT" >= :sum_tax_amount_1 
    AND a."SUM_TAX_AMOUNT" <= :sum_tax_amount_2 
    AND a."SUM_AMOUNT" = :sum_amount 
    AND a."SUM_AMOUNT" >= :sum_amount_1 
    AND a."SUM_AMOUNT" <= :sum_amount_2 
    AND a."SEND_INSPECT_LIST" = :send_inspect_list 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."ISSHIKI_UNIT_F" IS NULL THEN '0' ELSE TO_CHAR (a."ISSHIKI_UNIT_F") END IN (:isshiki_unit_f) 
ORDER BY
    a."ORDER_NO", a."TARGET_DATE", a."SUP_CODE"
