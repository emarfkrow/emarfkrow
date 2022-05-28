SELECT
      a.*
    , (SELECT r1.STORE_MAN_MEI FROM MST_STORE_MAN r1 WHERE r1.STORE_MAN_ID = a.STORE_MAN_ID) AS STORE_MAN_MEI
FROM
    MST_ANTENNA a 
WHERE
    1 = 1 
    AND a.reader_no = :reader_no 
    AND a.antenna_no = :antenna_no 
    AND a.store_man_id = :store_man_id 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.READER_NO, a.ANTENNA_NO
