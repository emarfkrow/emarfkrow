SELECT
      a.*
    , (SELECT r1."HITEM" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HITEM"
FROM
    M_NTANKA a 
WHERE
    1 = 1 
    AND TRIM (a."HHINBAN") = TRIM (:hhinban) 
    AND TRIM (a."NISSAN-HINBAN") = TRIM (:nissan_hinban) 
    AND a."NISSAN-TANKA" = :nissan_tanka 
    AND a."KOURI-KAKAKU" = :kouri_kakaku 
    AND TRIM (a."SHOHINKBN") = TRIM (:shohinkbn) 
    AND TRIM (a."PERSOKBN") = TRIM (:persokbn) 
    AND TRIM (a."KAKAKUKBN") = TRIM (:kakakukbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HHINBAN"
