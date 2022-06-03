SELECT
      a.*
FROM
    MST_ACCOUNT_CODE a 
WHERE
    1 = 1 
    AND TRIM (a."ACCOUNT_CODE") IN (:account_code) 
    AND a."ACCOUNT_NAME" LIKE '%' || :account_name || '%' 
    AND a."EXPENSE_KBN1" = :expense_kbn1 
    AND a."EXPENSE_KBN2" = :expense_kbn2 
    AND a."EXPENSE_KBN3" = :expense_kbn3 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
ORDER BY
    a."ACCOUNT_CODE"
