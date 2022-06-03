SELECT
      a.*
FROM
    M_NTANKA a 
WHERE
    1 = 1 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND TRIM (a.nissan_hinban) = TRIM (:nissan_hinban) 
    AND a.nissan_tanka = :nissan_tanka 
    AND a.kouri_kakaku = :kouri_kakaku 
    AND TRIM (a.shohinkbn) = TRIM (:shohinkbn) 
    AND TRIM (a.persokbn) = TRIM (:persokbn) 
    AND TRIM (a.kakakukbn) = TRIM (:kakakukbn) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.HHINBAN
