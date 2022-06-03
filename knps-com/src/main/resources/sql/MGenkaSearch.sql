SELECT
      a.*
FROM
    M_GENKA a 
WHERE
    1 = 1 
    AND TRIM (a."HHINBAN") = TRIM (:hhinban) 
    AND TRIM (a."HINCD") = TRIM (:hincd) 
    AND TRIM (a."SETKBN") = TRIM (:setkbn) 
    AND a."GENKA" = :genka 
    AND a."SEIHIN-GENKA" = :seihin_genka 
    AND a."SHOHIN-GENKA" = :shohin_genka 
    AND a."BAIKA" = :baika 
    AND a."SEIHIN-BAIKA" = :seihin_baika 
    AND a."SHOHIN-BAIKA" = :shohin_baika 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HHINBAN"
