SELECT
      a.*
FROM
    M_KTANKA a 
WHERE
    1 = 1 
    AND a."HONSHACD" = :honshacd 
    AND TRIM (a."SHAGAI-HINBAN") = TRIM (:shagai_hinban) 
    AND a."KKAISIBI" = :kkaisibi 
    AND a."KSHURYOBI" = :kshuryobi 
    AND TRIM (a."HHINBAN") = TRIM (:hhinban) 
    AND a."KEIYAKU-TANKA" = :keiyaku_tanka 
    AND TRIM (a."SHOHINKBN") = TRIM (:shohinkbn) 
    AND TRIM (a."KAKAKUKBN") = TRIM (:kakakukbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HONSHACD", a."SHAGAI-HINBAN"
