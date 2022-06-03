SELECT
      a.*
FROM
    M_RATE a 
WHERE
    1 = 1 
    AND a.yy = :yy 
    AND a.mm = :mm 
    AND a.dd = :dd 
    AND TRIM (a.tuuka) = TRIM (:tuuka) 
    AND a.ttm = :ttm 
    AND a.tts = :tts 
    AND a.ttb = :ttb 
    AND a.tts_org = :tts_org 
    AND a.ttb_org = :ttb_org 
    AND a.lstymd = :lstymd 
    AND a.lsthm = :lsthm 
    AND a.upddate = :upddate 
ORDER BY
    a.YY, a.MM, a.DD, a.TUUKA
