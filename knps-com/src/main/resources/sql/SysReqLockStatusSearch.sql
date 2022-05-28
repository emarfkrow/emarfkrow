SELECT
      a.*
FROM
    SYS_REQ_LOCK_STATUS a 
WHERE
    1 = 1 
    AND TRIM (a.gamen_id) = TRIM (:gamen_id) 
    AND TRIM (a.user_id) = TRIM (:user_id) 
    AND a.lock_date = :lock_date 
    AND a.lock_date >= :lock_date_1 
    AND a.lock_date <= :lock_date_2 
ORDER BY
    a.GAMEN_ID
