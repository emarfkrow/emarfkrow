SELECT
      a.*
FROM
    M_HCALEND a 
WHERE
    1 = 1 
    AND a."YYMM" = :yymm 
    AND TRIM (a."CALENDKBN") = TRIM (:calendkbn) 
    AND a."KADONITUSU" = :kadonitusu 
    AND a."DD" = :dd 
    AND TRIM (a."YOUBI") = TRIM (:youbi) 
    AND TRIM (a."KADOUKBN") = TRIM (:kadoukbn) 
    AND a."KADOURUI" = :kadourui 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."YYMM", a."CALENDKBN"
