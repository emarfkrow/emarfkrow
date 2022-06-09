SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."PRO_HINBAN") AS "PRO_ITEM"
    , (SELECT r2."EMP_NAME" FROM MST_EMP r2 WHERE r2."EMP_CODE" = a."EMP_CODE") AS "EMP_NAME"
FROM
    PRD_W_PRO_NES_COUNTS a 
WHERE
    1 = 1 
    AND a."PRD_W_PRO_NES_COUNTS_KEY" = :prd_w_pro_nes_counts_key 
    AND TRIM (a."PRO_HINBAN") = TRIM (:pro_hinban) 
    AND a."SCHEDULED_DATE" = :scheduled_date 
    AND a."SCHEDULED_DATE" >= :scheduled_date_1 
    AND a."SCHEDULED_DATE" <= :scheduled_date_2 
    AND a."PRO_NES_COUNTS" = :pro_nes_counts 
    AND a."PRO_NES_COUNTS" >= :pro_nes_counts_1 
    AND a."PRO_NES_COUNTS" <= :pro_nes_counts_2 
    AND a."PRO_NES_COMMENT" = :pro_nes_comment 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND TRIM (a."EMP_CODE") IN (:emp_code) 
ORDER BY
    a."PRD_W_PRO_NES_COUNTS_KEY"
