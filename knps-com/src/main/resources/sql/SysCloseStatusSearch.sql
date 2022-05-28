SELECT
      a.*
FROM
    SYS_CLOSE_STATUS a 
WHERE
    1 = 1 
    AND TRIM (a.rec_no) = TRIM (:rec_no) 
    AND TRIM (a.dairy_close_target_date) = TRIM (:dairy_close_target_date) 
    AND a.dairy_close_target_date >= :dairy_close_target_date_1 
    AND a.dairy_close_target_date <= :dairy_close_target_date_2 
    AND a.dairy_close_status = :dairy_close_status 
    AND a.dairy_close_date = :dairy_close_date 
    AND a.dairy_close_date >= :dairy_close_date_1 
    AND a.dairy_close_date <= :dairy_close_date_2 
    AND TRIM (a.monthry_close_target_date) = TRIM (:monthry_close_target_date) 
    AND a.monthry_close_target_date >= :monthry_close_target_date_1 
    AND a.monthry_close_target_date <= :monthry_close_target_date_2 
    AND a.monthry_close_status = :monthry_close_status 
    AND a.monthry_close_date = :monthry_close_date 
    AND a.monthry_close_date >= :monthry_close_date_1 
    AND a.monthry_close_date <= :monthry_close_date_2 
    AND TRIM (a.monthry_settle_target_date) = TRIM (:monthry_settle_target_date) 
    AND a.monthry_settle_target_date >= :monthry_settle_target_date_1 
    AND a.monthry_settle_target_date <= :monthry_settle_target_date_2 
    AND a.monthry_settle_status = :monthry_settle_status 
    AND a.monthry_settle_date = :monthry_settle_date 
    AND a.monthry_settle_date >= :monthry_settle_date_1 
    AND a.monthry_settle_date <= :monthry_settle_date_2 
    AND a.monthry_settle_cost_fixed = :monthry_settle_cost_fixed 
    AND TRIM (a.annual_settle_target_date) = TRIM (:annual_settle_target_date) 
    AND a.annual_settle_target_date >= :annual_settle_target_date_1 
    AND a.annual_settle_target_date <= :annual_settle_target_date_2 
    AND a.annual_settle_status = :annual_settle_status 
    AND a.annual_settle_date = :annual_settle_date 
    AND a.annual_settle_date >= :annual_settle_date_1 
    AND a.annual_settle_date <= :annual_settle_date_2 
    AND a.annual_settle_cost_fixed = :annual_settle_cost_fixed 
    AND CASE WHEN a.master_copy_flag IS NULL THEN '0' ELSE TO_CHAR (a.master_copy_flag) END IN (:master_copy_flag) 
    AND a.master_copy_date = :master_copy_date 
    AND a.master_copy_date >= :master_copy_date_1 
    AND a.master_copy_date <= :master_copy_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND TRIM (a.quarter_settle_target_date) = TRIM (:quarter_settle_target_date) 
    AND a.quarter_settle_target_date >= :quarter_settle_target_date_1 
    AND a.quarter_settle_target_date <= :quarter_settle_target_date_2 
    AND a.quarter_settle_status = :quarter_settle_status 
    AND a.quarter_settle_date = :quarter_settle_date 
    AND a.quarter_settle_date >= :quarter_settle_date_1 
    AND a.quarter_settle_date <= :quarter_settle_date_2 
    AND a.quarter_settle_cost_fixed = :quarter_settle_cost_fixed 
ORDER BY
    a.REC_NO
