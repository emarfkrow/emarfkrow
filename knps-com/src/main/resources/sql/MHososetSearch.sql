SELECT
      a.*
FROM
    M_HOSOSET a 
WHERE
    1 = 1 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND TRIM (a.hoso_hinban) = TRIM (:hoso_hinban) 
    AND a.inzu = :inzu 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.HHINBAN, a.HOSO-HINBAN
