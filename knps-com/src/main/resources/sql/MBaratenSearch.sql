SELECT
      a.*
FROM
    M_BARATEN a 
WHERE
    1 = 1 
    AND TRIM (a.oya_hinban) = TRIM (:oya_hinban) 
    AND TRIM (a.ko_hinban) = TRIM (:ko_hinban) 
    AND TRIM (a.oya_hinc) = TRIM (:oya_hinc) 
    AND TRIM (a.ko_hinc) = TRIM (:ko_hinc) 
    AND a.inzu = :inzu 
    AND a.oya_baika = :oya_baika 
    AND a.oya_genka = :oya_genka 
    AND a.ko_tanka = :ko_tanka 
    AND a.ko_genka = :ko_genka 
    AND a.ko_tanritu = :ko_tanritu 
    AND TRIM (a.kensakum) = TRIM (:kensakum) 
    AND TRIM (a.casekbn) = TRIM (:casekbn) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.OYA-HINBAN, a.KO-HINBAN
