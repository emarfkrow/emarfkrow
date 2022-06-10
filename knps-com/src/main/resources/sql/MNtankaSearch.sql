SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HHINBAN") AS "HITEM"
    , (SELECT r2."ITEM" FROM MST_HINBAN r2 WHERE r2."HINBAN" = a."NISSAN-HINBAN") AS "NISSAN-ITEM"
FROM
    M_NTANKA a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND a."NISSAN-HINBAN" = :nissan_hinban 
    AND a."NISSAN-TANKA" = :nissan_tanka 
    AND a."KOURI-KAKAKU" = :kouri_kakaku 
    AND TRIM (a."SHOHINKBN") IN (:shohinkbn) 
    AND TRIM (a."PERSOKBN") IN (:persokbn) 
    AND TRIM (a."KAKAKUKBN") IN (:kakakukbn) 
ORDER BY
    a."HHINBAN"
