SELECT
      a.*
FROM
    SYS_CLOSE_STATUS a 
WHERE
    1 = 1 
    AND TRIM (a."REC_NO") = TRIM (:rec_no) 
    AND TRIM (a."DAIRY_CLOSE_TARGET_DATE") = TRIM (:dairy_close_target_date) 
    AND a."DAIRY_CLOSE_TARGET_DATE" >= :dairy_close_target_date_1 
    AND a."DAIRY_CLOSE_TARGET_DATE" <= :dairy_close_target_date_2 
    AND a."DAIRY_CLOSE_STATUS" = :dairy_close_status 
    AND a."DAIRY_CLOSE_DATE" = :dairy_close_date 
    AND a."DAIRY_CLOSE_DATE" >= :dairy_close_date_1 
    AND a."DAIRY_CLOSE_DATE" <= :dairy_close_date_2 
    AND TRIM (a."MONTHRY_CLOSE_TARGET_DATE") = TRIM (:monthry_close_target_date) 
    AND a."MONTHRY_CLOSE_TARGET_DATE" >= :monthry_close_target_date_1 
    AND a."MONTHRY_CLOSE_TARGET_DATE" <= :monthry_close_target_date_2 
    AND a."MONTHRY_CLOSE_STATUS" = :monthry_close_status 
    AND a."MONTHRY_CLOSE_DATE" = :monthry_close_date 
    AND a."MONTHRY_CLOSE_DATE" >= :monthry_close_date_1 
    AND a."MONTHRY_CLOSE_DATE" <= :monthry_close_date_2 
    AND TRIM (a."MONTHRY_SETTLE_TARGET_DATE") = TRIM (:monthry_settle_target_date) 
    AND a."MONTHRY_SETTLE_TARGET_DATE" >= :monthry_settle_target_date_1 
    AND a."MONTHRY_SETTLE_TARGET_DATE" <= :monthry_settle_target_date_2 
    AND a."MONTHRY_SETTLE_STATUS" = :monthry_settle_status 
    AND a."MONTHRY_SETTLE_DATE" = :monthry_settle_date 
    AND a."MONTHRY_SETTLE_DATE" >= :monthry_settle_date_1 
    AND a."MONTHRY_SETTLE_DATE" <= :monthry_settle_date_2 
    AND a."MONTHRY_SETTLE_COST_FIXED" = :monthry_settle_cost_fixed 
    AND TRIM (a."ANNUAL_SETTLE_TARGET_DATE") = TRIM (:annual_settle_target_date) 
    AND a."ANNUAL_SETTLE_TARGET_DATE" >= :annual_settle_target_date_1 
    AND a."ANNUAL_SETTLE_TARGET_DATE" <= :annual_settle_target_date_2 
    AND a."ANNUAL_SETTLE_STATUS" = :annual_settle_status 
    AND a."ANNUAL_SETTLE_DATE" = :annual_settle_date 
    AND a."ANNUAL_SETTLE_DATE" >= :annual_settle_date_1 
    AND a."ANNUAL_SETTLE_DATE" <= :annual_settle_date_2 
    AND a."ANNUAL_SETTLE_COST_FIXED" = :annual_settle_cost_fixed 
    AND CASE WHEN a."MASTER_COPY_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.MASTER_COPY_FLAG) END IN (:master_copy_flag) 
    AND a."MASTER_COPY_DATE" = :master_copy_date 
    AND a."MASTER_COPY_DATE" >= :master_copy_date_1 
    AND a."MASTER_COPY_DATE" <= :master_copy_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND TRIM (a."QUARTER_SETTLE_TARGET_DATE") = TRIM (:quarter_settle_target_date) 
    AND a."QUARTER_SETTLE_TARGET_DATE" >= :quarter_settle_target_date_1 
    AND a."QUARTER_SETTLE_TARGET_DATE" <= :quarter_settle_target_date_2 
    AND a."QUARTER_SETTLE_STATUS" = :quarter_settle_status 
    AND a."QUARTER_SETTLE_DATE" = :quarter_settle_date 
    AND a."QUARTER_SETTLE_DATE" >= :quarter_settle_date_1 
    AND a."QUARTER_SETTLE_DATE" <= :quarter_settle_date_2 
    AND a."QUARTER_SETTLE_COST_FIXED" = :quarter_settle_cost_fixed 
ORDER BY
    a."REC_NO"
