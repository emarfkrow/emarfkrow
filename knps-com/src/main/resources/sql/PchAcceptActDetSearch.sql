SELECT
      a.*
FROM
    PCH_ACCEPT_ACT_DET a 
WHERE
    1 = 1 
    AND TRIM (a.act_no) = TRIM (:act_no) 
    AND a.act_branch_no = :act_branch_no 
    AND a.inspect_counts = :inspect_counts 
    AND a.inspect_counts >= :inspect_counts_1 
    AND a.inspect_counts <= :inspect_counts_2 
    AND a.inspect_unit = :inspect_unit 
    AND a.inspect_unit >= :inspect_unit_1 
    AND a.inspect_unit <= :inspect_unit_2 
    AND a.amount = :amount 
    AND a.tax_amount = :tax_amount 
    AND a.tax_amount >= :tax_amount_1 
    AND a.tax_amount <= :tax_amount_2 
    AND a.check_issue_date = :check_issue_date 
    AND a.check_issue_date >= :check_issue_date_1 
    AND a.check_issue_date <= :check_issue_date_2 
    AND TRIM (a.check_list_no) = TRIM (:check_list_no) 
    AND TRIM (a.check_issue_ope) = TRIM (:check_issue_ope) 
    AND CASE WHEN a.check_flg IS NULL THEN '0' ELSE TO_CHAR (a.check_flg) END IN (:check_flg) 
    AND a.check_comp_date = :check_comp_date 
    AND a.check_comp_date >= :check_comp_date_1 
    AND a.check_comp_date <= :check_comp_date_2 
    AND TRIM (a.check_comp_ope) = TRIM (:check_comp_ope) 
    AND a.close_date = :close_date 
    AND a.close_date >= :close_date_1 
    AND a.close_date <= :close_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.inspect_isshiki_unit_f IS NULL THEN '0' ELSE TO_CHAR (a.inspect_isshiki_unit_f) END IN (:inspect_isshiki_unit_f) 
    AND a.inspect_isshiki_counts = :inspect_isshiki_counts 
    AND a.inspect_isshiki_counts >= :inspect_isshiki_counts_1 
    AND a.inspect_isshiki_counts <= :inspect_isshiki_counts_2 
    AND a.inspect_isshiki_unit = :inspect_isshiki_unit 
    AND a.inspect_isshiki_unit >= :inspect_isshiki_unit_1 
    AND a.inspect_isshiki_unit <= :inspect_isshiki_unit_2 
ORDER BY
    a.ACT_NO, a.ACT_BRANCH_NO
