SELECT
      a.*
FROM
    M_SETKOSE a 
WHERE
    1 = 1 
    AND TRIM (a.set_hinban) = TRIM (:set_hinban) 
    AND TRIM (a.set_khinban) = TRIM (:set_khinban) 
    AND TRIM (a.dltflg) = TRIM (:dltflg) 
    AND a.setinzu = :setinzu 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.SET-HINBAN, a.SET-KHINBAN
