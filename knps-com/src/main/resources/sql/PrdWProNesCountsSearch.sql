SELECT
      a.*
    , (SELECT r1.EMP_NAME FROM MST_EMP r1 WHERE r1.EMP_CODE = a.EMP_CODE) AS EMP_NAME
FROM
    PRD_W_PRO_NES_COUNTS a 
WHERE
    1 = 1 
    AND a.prd_w_pro_nes_counts_key = :prd_w_pro_nes_counts_key 
    AND TRIM (a.pro_hinban) = TRIM (:pro_hinban) 
    AND a.scheduled_date = :scheduled_date 
    AND a.scheduled_date >= :scheduled_date_1 
    AND a.scheduled_date <= :scheduled_date_2 
    AND a.pro_nes_counts = :pro_nes_counts 
    AND a.pro_nes_counts >= :pro_nes_counts_1 
    AND a.pro_nes_counts <= :pro_nes_counts_2 
    AND a.pro_nes_comment = :pro_nes_comment 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND a.emp_code IN (:emp_code) 
ORDER BY
    a.PRD_W_PRO_NES_COUNTS_KEY
