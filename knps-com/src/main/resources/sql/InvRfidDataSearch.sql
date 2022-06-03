SELECT
      a.*
FROM
    INV_RFID_DATA a 
WHERE
    1 = 1 
    AND TRIM (a."TARGET_KBN") IN (:target_kbn) 
    AND TRIM (a."TID") = TRIM (:tid) 
    AND TRIM (a."TAG_DATA") = TRIM (:tag_data) 
    AND a."READER_NO" = :reader_no 
    AND a."ANTENNA_NO" = :antenna_no 
    AND TRIM (a."SPOT_KBN") IN (:spot_kbn) 
    AND TRIM (a."RECIVE_TIME") = TRIM (:recive_time) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
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
