SELECT
      a.*
FROM
    PCH_ACCEPT_ACT_DET a 
WHERE
    1 = 1 
    AND TRIM (a."ACT_NO") = TRIM (:act_no) 
    AND a."ACT_BRANCH_NO" = :act_branch_no 
    AND a."INSPECT_COUNTS" = :inspect_counts 
    AND a."INSPECT_COUNTS" >= :inspect_counts_1 
    AND a."INSPECT_COUNTS" <= :inspect_counts_2 
    AND a."INSPECT_UNIT" = :inspect_unit 
    AND a."INSPECT_UNIT" >= :inspect_unit_1 
    AND a."INSPECT_UNIT" <= :inspect_unit_2 
    AND a."AMOUNT" = :amount 
    AND a."TAX_AMOUNT" = :tax_amount 
    AND a."TAX_AMOUNT" >= :tax_amount_1 
    AND a."TAX_AMOUNT" <= :tax_amount_2 
    AND a."CHECK_ISSUE_DATE" = :check_issue_date 
    AND a."CHECK_ISSUE_DATE" >= :check_issue_date_1 
    AND a."CHECK_ISSUE_DATE" <= :check_issue_date_2 
    AND TRIM (a."CHECK_LIST_NO") = TRIM (:check_list_no) 
    AND TRIM (a."CHECK_ISSUE_OPE") = TRIM (:check_issue_ope) 
    AND CASE WHEN a."CHECK_FLG" IS NULL THEN '0' ELSE TO_CHAR (a.CHECK_FLG) END IN (:check_flg) 
    AND a."CHECK_COMP_DATE" = :check_comp_date 
    AND a."CHECK_COMP_DATE" >= :check_comp_date_1 
    AND a."CHECK_COMP_DATE" <= :check_comp_date_2 
    AND TRIM (a."CHECK_COMP_OPE") = TRIM (:check_comp_ope) 
    AND a."CLOSE_DATE" = :close_date 
    AND a."CLOSE_DATE" >= :close_date_1 
    AND a."CLOSE_DATE" <= :close_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."INSPECT_ISSHIKI_UNIT_F" IS NULL THEN '0' ELSE TO_CHAR (a.INSPECT_ISSHIKI_UNIT_F) END IN (:inspect_isshiki_unit_f) 
    AND a."INSPECT_ISSHIKI_COUNTS" = :inspect_isshiki_counts 
    AND a."INSPECT_ISSHIKI_COUNTS" >= :inspect_isshiki_counts_1 
    AND a."INSPECT_ISSHIKI_COUNTS" <= :inspect_isshiki_counts_2 
    AND a."INSPECT_ISSHIKI_UNIT" = :inspect_isshiki_unit 
    AND a."INSPECT_ISSHIKI_UNIT" >= :inspect_isshiki_unit_1 
    AND a."INSPECT_ISSHIKI_UNIT" <= :inspect_isshiki_unit_2 
ORDER BY
    a."ACT_NO", a."ACT_BRANCH_NO"
