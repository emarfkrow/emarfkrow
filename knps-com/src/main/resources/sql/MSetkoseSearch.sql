SELECT
      a.*
FROM
    M_SETKOSE a 
WHERE
    1 = 1 
    AND TRIM (a."SET-HINBAN") = TRIM (:set_hinban) 
    AND TRIM (a."SET-KHINBAN") = TRIM (:set_khinban) 
    AND a."DLTFLG" = :dltflg 
    AND TRIM (a."BOTM") = TRIM (:botm) 
    AND a."SETINZU" = :setinzu 
    AND TRIM (a."MUSHOKBN") = TRIM (:mushokbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."SET-HINBAN", a."SET-KHINBAN"
