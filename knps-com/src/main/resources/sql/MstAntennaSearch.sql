SELECT
      a.*
    , (SELECT r1.STORE_MAN_MEI FROM MST_STORE_MAN r1 WHERE r1.STORE_MAN_ID = a."STORE_MAN_ID") AS STORE_MAN_MEI
FROM
    MST_ANTENNA a 
WHERE
    1 = 1 
    AND a."READER_NO" = :reader_no 
    AND a."ANTENNA_NO" = :antenna_no 
    AND a."STORE_MAN_ID" = :store_man_id 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."READER_NO", a."ANTENNA_NO"
