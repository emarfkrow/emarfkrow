SELECT
      a.*
FROM
    MST_CALENDAR a 
WHERE
    1 = 1 
    AND a.serial_day = :serial_day 
    AND CASE WHEN a.working_flag IS NULL THEN '0' ELSE TO_CHAR (a.working_flag) END IN (:working_flag) 
    AND a.day_of_week = :day_of_week 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND a.n_working = :n_working 
ORDER BY
    a.SERIAL_DAY
