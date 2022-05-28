SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    PRD_DAILY_NECK_LOAD a 
WHERE
    1 = 1 
    AND TRIM (a.pro_no) = TRIM (:pro_no) 
    AND a.branch_no = :branch_no 
    AND a.load_date = :load_date 
    AND a.load_date >= :load_date_1 
    AND a.load_date <= :load_date_2 
    AND a.load_time = :load_time 
    AND a.load_over_time = :load_over_time 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND TRIM (a.wc_code) IN (:wc_code) 
ORDER BY
    a.PRO_NO, a.BRANCH_NO
