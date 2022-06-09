SELECT
      a.*
    , (SELECT r1."HINMEI" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HINMEI"
FROM
    M_NTANKA a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND a."NISSAN-HINBAN" = :nissan_hinban 
    AND a."NISSAN-TANKA" = :nissan_tanka 
    AND a."KOURI-KAKAKU" = :kouri_kakaku 
    AND TRIM (a."SHOHINKBN") = TRIM (:shohinkbn) 
    AND TRIM (a."PERSOKBN") = TRIM (:persokbn) 
    AND TRIM (a."KAKAKUKBN") = TRIM (:kakakukbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HHINBAN"
