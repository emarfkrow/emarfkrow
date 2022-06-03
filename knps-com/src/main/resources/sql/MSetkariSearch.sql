SELECT
      a.*
FROM
    M_SETKARI a 
WHERE
    1 = 1 
    AND TRIM (a."SET-HINBAN") = TRIM (:set_hinban) 
    AND TRIM (a."SET-KHINBAN") = TRIM (:set_khinban) 
    AND a."TOKUCD" = :tokucd 
    AND TRIM (a."HINMEI") = TRIM (:hinmei) 
    AND TRIM (a."KO-HINMEI") = TRIM (:ko_hinmei) 
    AND TRIM (a."SETKBN") = TRIM (:setkbn) 
    AND a."SETINZU" = :setinzu 
    AND a."KO-TANKA" = :ko_tanka 
    AND TRIM (a."MUSHOKBN") = TRIM (:mushokbn) 
    AND TRIM (a."RTOKUMEI") = TRIM (:rtokumei) 
ORDER BY
    a."SET-HINBAN", a."SET-KHINBAN"
