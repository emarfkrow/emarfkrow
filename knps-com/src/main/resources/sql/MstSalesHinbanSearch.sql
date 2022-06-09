SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."SALES_HINBAN") AS "SALES_ITEM"
FROM
    MST_SALES_HINBAN a 
WHERE
    1 = 1 
    AND TRIM (a."SALES_HINBAN") = TRIM (:sales_hinban) 
    AND a."COMP_KBN" IN (:comp_kbn) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
ORDER BY
    a."SALES_HINBAN"
