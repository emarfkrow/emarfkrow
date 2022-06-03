SELECT
      a.*
FROM
    PRD_STORE_MAINTE_GYO_DET a 
WHERE
    1 = 1 
    AND TRIM (a."GYO_NO") = TRIM (:gyo_no) 
    AND a."GYO_POS" = :gyo_pos 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."GYO_NO", a."GYO_POS"
