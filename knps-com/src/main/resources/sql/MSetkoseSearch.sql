SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."SET-HINBAN") AS "SET-ITEM"
    , (SELECT r2."ITEM" FROM MST_HINBAN r2 WHERE r2."HINBAN" = a."SET-KHINBAN") AS "SET-KITEM"
FROM
    M_SETKOSE a 
WHERE
    1 = 1 
    AND a."SET-HINBAN" = :set_hinban 
    AND a."SET-KHINBAN" = :set_khinban 
    AND a."DLTFLG" IN (:dltflg) 
    AND TRIM (a."BOTM") = TRIM (:botm) 
    AND a."SETINZU" = :setinzu 
    AND TRIM (a."MUSHOKBN") IN (:mushokbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."SET-HINBAN", a."SET-KHINBAN"
