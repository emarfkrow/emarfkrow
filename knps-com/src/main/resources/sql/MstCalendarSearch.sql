SELECT
      a.*
FROM
    MST_CALENDAR a 
WHERE
    1 = 1 
    AND a."SERIAL_DAY" = :serial_day 
    AND CASE WHEN a."WORKING_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."WORKING_FLAG") END IN (:working_flag) 
    AND a."DAY_OF_WEEK" = :day_of_week 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
    AND a."N_WORKING" = :n_working 
ORDER BY
    a."SERIAL_DAY"
