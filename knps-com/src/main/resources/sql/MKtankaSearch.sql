SELECT
      a.*
FROM
    M_KTANKA a 
WHERE
    1 = 1 
    AND a.honshacd = :honshacd 
    AND TRIM (a.shagai_hinban) = TRIM (:shagai_hinban) 
    AND a.kkaisibi = :kkaisibi 
    AND a.kshuryobi = :kshuryobi 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND a.keiyaku_tanka = :keiyaku_tanka 
    AND TRIM (a.shohinkbn) = TRIM (:shohinkbn) 
    AND TRIM (a.kakakukbn) = TRIM (:kakakukbn) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.HONSHACD, a.SHAGAI-HINBAN
