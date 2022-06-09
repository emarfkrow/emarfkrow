SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HHINBAN") AS "HITEM"
FROM
    M_WEBKAN a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND TRIM (a."KIKAKU") = TRIM (:kikaku) 
    AND TRIM (a."DAICD") = TRIM (:daicd) 
    AND TRIM (a."CHUCD") = TRIM (:chucd) 
    AND TRIM (a."SHOCD") = TRIM (:shocd) 
    AND TRIM (a."ABUNCD") = TRIM (:abuncd) 
    AND TRIM (a."BBUNCD") = TRIM (:bbuncd) 
    AND TRIM (a."WHYOJIKBN") IN (:whyojikbn) 
    AND a."IRISU" = :irisu 
    AND a."ZAISIKII" = :zaisikii 
    AND a."NYUYOTEISIKII" = :nyuyoteisikii 
    AND TRIM (a."HANYOU1") = TRIM (:hanyou1) 
    AND TRIM (a."HANYOU2") = TRIM (:hanyou2) 
    AND TRIM (a."HANYOU3") = TRIM (:hanyou3) 
    AND TRIM (a."ZAIHENKBN") IN (:zaihenkbn) 
    AND TRIM (a."TEIDSPKBN") IN (:teidspkbn) 
    AND TRIM (a."UPDEXCDKBN") IN (:updexcdkbn) 
    AND a."TOUROKUBI" = :tourokubi 
    AND a."TOUROKUBI" >= :tourokubi_1 
    AND a."TOUROKUBI" <= :tourokubi_2 
    AND a."SHUSEIBI" = :shuseibi 
    AND a."SHUSEIBI" >= :shuseibi_1 
    AND a."SHUSEIBI" <= :shuseibi_2 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HHINBAN"
