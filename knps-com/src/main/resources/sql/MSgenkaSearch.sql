SELECT
      a.*
FROM
    M_SGENKA a 
WHERE
    1 = 1 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND TRIM (a.hincd) = TRIM (:hincd) 
    AND TRIM (a.setkbn) = TRIM (:setkbn) 
    AND a.genka = :genka 
    AND a.seihin_genka = :seihin_genka 
    AND a.shohin_genka = :shohin_genka 
    AND a.baika = :baika 
    AND a.seihin_baika = :seihin_baika 
    AND a.shohin_baika = :shohin_baika 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.HHINBAN
