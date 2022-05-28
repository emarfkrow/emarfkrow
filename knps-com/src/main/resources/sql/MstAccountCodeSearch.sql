SELECT
      a.*
FROM
    MST_ACCOUNT_CODE a 
WHERE
    1 = 1 
    AND a.account_code IN (:account_code) 
    AND a.account_name LIKE '%' || :account_name || '%' 
    AND a.expense_kbn1 = :expense_kbn1 
    AND a.expense_kbn2 = :expense_kbn2 
    AND a.expense_kbn3 = :expense_kbn3 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.ACCOUNT_CODE
