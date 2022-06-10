SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."SHAGAI-HINBAN") AS "SHAGAI-ITEM"
    , (SELECT r2."ITEM" FROM MST_HINBAN r2 WHERE r2."HINBAN" = a."HHINBAN") AS "HITEM"
FROM
    M_KTANKA a 
WHERE
    1 = 1 
    AND a."HONSHACD" = :honshacd 
    AND a."SHAGAI-HINBAN" = :shagai_hinban 
    AND a."KKAISIBI" = :kkaisibi 
    AND a."KKAISIBI" >= :kkaisibi_1 
    AND a."KKAISIBI" <= :kkaisibi_2 
    AND a."KSHURYOBI" = :kshuryobi 
    AND a."KSHURYOBI" >= :kshuryobi_1 
    AND a."KSHURYOBI" <= :kshuryobi_2 
    AND a."HHINBAN" = :hhinban 
    AND a."KEIYAKU-TANKA" = :keiyaku_tanka 
    AND TRIM (a."SHOHINKBN") IN (:shohinkbn) 
    AND TRIM (a."KAKAKUKBN") IN (:kakakukbn) 
ORDER BY
    a."HONSHACD", a."SHAGAI-HINBAN"
