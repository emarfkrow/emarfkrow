SELECT
      a.*
FROM
    M_HCALEND a 
WHERE
    1 = 1 
    AND a.yymm = :yymm 
    AND TRIM (a.calendkbn) = TRIM (:calendkbn) 
    AND a.kadonitusu = :kadonitusu 
    AND a.dd = :dd 
    AND TRIM (a.youbi) = TRIM (:youbi) 
    AND TRIM (a.kadoukbn) = TRIM (:kadoukbn) 
    AND a.kadourui = :kadourui 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.YYMM, a.CALENDKBN
