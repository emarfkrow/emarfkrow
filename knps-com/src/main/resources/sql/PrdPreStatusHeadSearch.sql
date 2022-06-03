SELECT
      a.*
FROM
    PRD_PRE_STATUS_HEAD a 
WHERE
    1 = 1 
    AND TRIM (a."REC_NO") = TRIM (:rec_no) 
    AND TRIM (a."CURRENT_YEAR_Y") = TRIM (:current_year_y) 
    AND a."CURRENT_YEAR_Y" >= :current_year_y_1 
    AND a."CURRENT_YEAR_Y" <= :current_year_y_2 
    AND TRIM (a."CURRENT_YEAR_M") = TRIM (:current_year_m) 
    AND a."CURRENT_YEAR_M" >= :current_year_m_1 
    AND a."CURRENT_YEAR_M" <= :current_year_m_2 
    AND TRIM (a."CURRENT_MONTH_M") = TRIM (:current_month_m) 
    AND a."CURRENT_MONTH_M" >= :current_month_m_1 
    AND a."CURRENT_MONTH_M" <= :current_month_m_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."REC_NO"
