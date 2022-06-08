SELECT
      a.*
    , (SELECT r1."HHINMEI" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HHINMEI"
FROM
    M_KTANKA a 
WHERE
    1 = 1 
    AND a."HONSHACD" = :honshacd 
    AND a."SHAGAI-HINBAN" = :shagai_hinban 
    AND a."KKAISIBI" = :kkaisibi 
    AND a."KSHURYOBI" = :kshuryobi 
    AND a."HHINBAN" = :hhinban 
    AND a."KEIYAKU-TANKA" = :keiyaku_tanka 
    AND TRIM (a."SHOHINKBN") = TRIM (:shohinkbn) 
    AND TRIM (a."KAKAKUKBN") = TRIM (:kakakukbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HONSHACD", a."SHAGAI-HINBAN"
