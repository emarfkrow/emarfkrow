SELECT
      a.*
FROM
    SYS_REQ_LOCK_STATUS a 
WHERE
    1 = 1 
    AND TRIM (a."GAMEN_ID") = TRIM (:gamen_id) 
    AND TRIM (a."USER_ID") = TRIM (:user_id) 
    AND a."LOCK_DATE" = :lock_date 
    AND a."LOCK_DATE" >= :lock_date_1 
    AND a."LOCK_DATE" <= :lock_date_2 
ORDER BY
    a."GAMEN_ID"
