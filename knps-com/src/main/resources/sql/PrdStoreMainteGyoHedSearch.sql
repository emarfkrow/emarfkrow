SELECT
      a.*
FROM
    PRD_STORE_MAINTE_GYO_HED a 
WHERE
    1 = 1 
    AND TRIM (a.gyo_no) = TRIM (:gyo_no) 
    AND a.gyo_name LIKE '%' || :gyo_name || '%' 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.GYO_NO
