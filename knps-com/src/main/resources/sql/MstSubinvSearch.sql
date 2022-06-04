SELECT
      a.*
    , (SELECT r1."SUP_NAME" FROM MST_SUPPLIER r1 WHERE r1."SUP_CODE" = a."SUP_CODE") AS "SUP_NAME"
FROM
    MST_SUBINV a 
WHERE
    1 = 1 
    AND TRIM (a."SUB_INV_CODE") IN (:sub_inv_code) 
    AND a."SUB_INV_NAME" LIKE '%' || :sub_inv_name || '%' 
    AND a."MANAGE_KBN" IN (:manage_kbn) 
    AND a."IN_OUT_KBN" IN (:in_out_kbn) 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
ORDER BY
    a."SUB_INV_CODE"
