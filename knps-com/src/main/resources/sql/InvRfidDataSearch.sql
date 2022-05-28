SELECT
      a.*
FROM
    INV_RFID_DATA a 
WHERE
    1 = 1 
    AND a.target_kbn IN (:target_kbn) 
    AND TRIM (a.tid) = TRIM (:tid) 
    AND TRIM (a.tag_data) = TRIM (:tag_data) 
    AND a.reader_no = :reader_no 
    AND a.antenna_no = :antenna_no 
    AND a.spot_kbn IN (:spot_kbn) 
    AND TRIM (a.recive_time) = TRIM (:recive_time) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    1
    , 2
    , 3
    , 4
    , 5
    , 6
    , 7
    , 8
    , 9
    , 10
    , 11
