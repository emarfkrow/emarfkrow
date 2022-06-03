SELECT
      a.*
FROM
    M_HOSOSET a 
WHERE
    1 = 1 
    AND TRIM (a."HHINBAN") = TRIM (:hhinban) 
    AND TRIM (a."HOSO-HINBAN") = TRIM (:hoso_hinban) 
    AND a."INZU" = :inzu 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HHINBAN", a."HOSO-HINBAN"
