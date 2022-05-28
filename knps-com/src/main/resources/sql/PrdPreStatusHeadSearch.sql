SELECT
      a.*
FROM
    PRD_PRE_STATUS_HEAD a 
WHERE
    1 = 1 
    AND TRIM (a.rec_no) = TRIM (:rec_no) 
    AND TRIM (a.current_year_y) = TRIM (:current_year_y) 
    AND a.current_year_y >= :current_year_y_1 
    AND a.current_year_y <= :current_year_y_2 
    AND TRIM (a.current_year_m) = TRIM (:current_year_m) 
    AND a.current_year_m >= :current_year_m_1 
    AND a.current_year_m <= :current_year_m_2 
    AND TRIM (a.current_month_m) = TRIM (:current_month_m) 
    AND a.current_month_m >= :current_month_m_1 
    AND a.current_month_m <= :current_month_m_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.REC_NO
