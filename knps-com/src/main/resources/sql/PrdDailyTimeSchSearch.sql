SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    PRD_DAILY_TIME_SCH a 
WHERE
    1 = 1 
    AND a.layout_date = :layout_date 
    AND a.layout_date >= :layout_date_1 
    AND a.layout_date <= :layout_date_2 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND a.layout_in_time = :layout_in_time 
    AND a.change_stat = :change_stat 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.LAYOUT_DATE, a.WC_CODE
