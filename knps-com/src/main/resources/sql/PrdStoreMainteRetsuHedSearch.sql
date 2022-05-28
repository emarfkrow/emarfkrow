SELECT
      a.*
FROM
    PRD_STORE_MAINTE_RETSU_HED a 
WHERE
    1 = 1 
    AND TRIM (a.retsu_no) = TRIM (:retsu_no) 
    AND a.retsu_name LIKE '%' || :retsu_name || '%' 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.RETSU_NO
