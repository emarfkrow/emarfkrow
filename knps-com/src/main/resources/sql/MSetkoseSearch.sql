SELECT
      a.*
FROM
    M_SETKOSE a 
WHERE
    1 = 1 
    AND TRIM (a.set_hinban) = TRIM (:set_hinban) 
    AND TRIM (a.set_khinban) = TRIM (:set_khinban) 
    AND a.dltflg = :dltflg 
    AND TRIM (a.botm) = TRIM (:botm) 
    AND a.setinzu = :setinzu 
    AND TRIM (a.mushokbn) = TRIM (:mushokbn) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.SET-HINBAN, a.SET-KHINBAN
