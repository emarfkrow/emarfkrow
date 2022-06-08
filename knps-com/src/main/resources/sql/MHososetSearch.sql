SELECT
      a.*
    , (SELECT r1."HITEM" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HITEM"
FROM
    M_HOSOSET a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND a."HOSO-HINBAN" = :hoso_hinban 
    AND a."INZU" = :inzu 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HHINBAN", a."HOSO-HINBAN"
