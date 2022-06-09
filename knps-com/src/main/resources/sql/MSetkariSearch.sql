SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."SET-HINBAN") AS "SET-ITEM"
    , (SELECT r2."ITEM" FROM MST_HINBAN r2 WHERE r2."HINBAN" = a."SET-KHINBAN") AS "SET-KITEM"
FROM
    M_SETKARI a 
WHERE
    1 = 1 
    AND a."SET-HINBAN" = :set_hinban 
    AND a."SET-KHINBAN" = :set_khinban 
    AND a."TOKUCD" = :tokucd 
    AND TRIM (a."HINMEI") = TRIM (:hinmei) 
    AND TRIM (a."KO-HINMEI") = TRIM (:ko_hinmei) 
    AND TRIM (a."SETKBN") IN (:setkbn) 
    AND a."SETINZU" = :setinzu 
    AND a."KO-TANKA" = :ko_tanka 
    AND TRIM (a."MUSHOKBN") IN (:mushokbn) 
    AND TRIM (a."RTOKUMEI") = TRIM (:rtokumei) 
ORDER BY
    a."SET-HINBAN", a."SET-KHINBAN"
