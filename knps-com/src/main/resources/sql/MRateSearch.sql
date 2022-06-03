SELECT
      a.*
FROM
    M_RATE a 
WHERE
    1 = 1 
    AND a."YY" = :yy 
    AND a."MM" = :mm 
    AND a."DD" = :dd 
    AND TRIM (a."TUUKA") = TRIM (:tuuka) 
    AND a."TTM" = :ttm 
    AND a."TTS" = :tts 
    AND a."TTB" = :ttb 
    AND a."TTS-ORG" = :tts_org 
    AND a."TTB-ORG" = :ttb_org 
    AND a."LSTYMD" = :lstymd 
    AND a."LSTHM" = :lsthm 
    AND a."UPDDATE" = :upddate 
ORDER BY
    a."YY", a."MM", a."DD", a."TUUKA"
