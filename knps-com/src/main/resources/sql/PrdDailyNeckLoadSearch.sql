SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a."WC_CODE") AS WC_NAME
FROM
    PRD_DAILY_NECK_LOAD a 
WHERE
    1 = 1 
    AND TRIM (a."PRO_NO") = TRIM (:pro_no) 
    AND a."BRANCH_NO" = :branch_no 
    AND a."LOAD_DATE" = :load_date 
    AND a."LOAD_DATE" >= :load_date_1 
    AND a."LOAD_DATE" <= :load_date_2 
    AND a."LOAD_TIME" = :load_time 
    AND a."LOAD_OVER_TIME" = :load_over_time 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
ORDER BY
    a."PRO_NO", a."BRANCH_NO"
