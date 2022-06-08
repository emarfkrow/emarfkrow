SELECT
      a.*
    , (SELECT r1."HHINMEI" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HHINMEI"
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
    AND TRIM (a."WHYOJIKBN") = TRIM (:whyojikbn) 
    AND a."IRISU" = :irisu 
    AND a."ZAISIKII" = :zaisikii 
    AND a."NYUYOTEISIKII" = :nyuyoteisikii 
    AND TRIM (a."HANYOU1") = TRIM (:hanyou1) 
    AND TRIM (a."HANYOU2") = TRIM (:hanyou2) 
    AND TRIM (a."HANYOU3") = TRIM (:hanyou3) 
    AND TRIM (a."ZAIHENKBN") = TRIM (:zaihenkbn) 
    AND TRIM (a."TEIDSPKBN") = TRIM (:teidspkbn) 
    AND TRIM (a."UPDEXCDKBN") = TRIM (:updexcdkbn) 
    AND a."TOUROKUBI" = :tourokubi 
    AND a."SHUSEIBI" = :shuseibi 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HHINBAN"
