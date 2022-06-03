SELECT
      a.*
FROM
    M_PKOSE a 
WHERE
    1 = 1 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND TRIM (a.hinmei) = TRIM (:hinmei) 
    AND TRIM (a.phinban) = TRIM (:phinban) 
    AND TRIM (a.phinmei) = TRIM (:phinmei) 
    AND a.tourokubi = :tourokubi 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.HHINBAN, a.PHINBAN
