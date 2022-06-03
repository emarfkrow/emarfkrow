SELECT
      a.*
FROM
    M_SETKARI a 
WHERE
    1 = 1 
    AND TRIM (a.set_hinban) = TRIM (:set_hinban) 
    AND TRIM (a.set_khinban) = TRIM (:set_khinban) 
    AND a.tokucd = :tokucd 
    AND TRIM (a.hinmei) = TRIM (:hinmei) 
    AND TRIM (a.ko_hinmei) = TRIM (:ko_hinmei) 
    AND TRIM (a.setkbn) = TRIM (:setkbn) 
    AND a.setinzu = :setinzu 
    AND a.ko_tanka = :ko_tanka 
    AND TRIM (a.mushokbn) = TRIM (:mushokbn) 
    AND TRIM (a.rtokumei) = TRIM (:rtokumei) 
ORDER BY
    a.SET-HINBAN, a.SET-KHINBAN
