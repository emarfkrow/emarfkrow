SELECT
      a.*
FROM
    M_WEBKAN a 
WHERE
    1 = 1 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND TRIM (a.kikaku) = TRIM (:kikaku) 
    AND TRIM (a.daicd) = TRIM (:daicd) 
    AND TRIM (a.chucd) = TRIM (:chucd) 
    AND TRIM (a.shocd) = TRIM (:shocd) 
    AND TRIM (a.abuncd) = TRIM (:abuncd) 
    AND TRIM (a.bbuncd) = TRIM (:bbuncd) 
    AND TRIM (a.whyojikbn) = TRIM (:whyojikbn) 
    AND a.irisu = :irisu 
    AND a.zaisikii = :zaisikii 
    AND a.nyuyoteisikii = :nyuyoteisikii 
    AND TRIM (a.hanyou1) = TRIM (:hanyou1) 
    AND TRIM (a.hanyou2) = TRIM (:hanyou2) 
    AND TRIM (a.hanyou3) = TRIM (:hanyou3) 
    AND TRIM (a.zaihenkbn) = TRIM (:zaihenkbn) 
    AND TRIM (a.teidspkbn) = TRIM (:teidspkbn) 
    AND TRIM (a.updexcdkbn) = TRIM (:updexcdkbn) 
    AND a.tourokubi = :tourokubi 
    AND a.shuseibi = :shuseibi 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.HHINBAN
