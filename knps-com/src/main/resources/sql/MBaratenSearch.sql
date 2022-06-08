SELECT
      a.*
FROM
    M_BARATEN a 
WHERE
    1 = 1 
    AND a."OYA-HINBAN" = :oya_hinban 
    AND a."KO-HINBAN" = :ko_hinban 
    AND TRIM (a."OYA-HINC") = TRIM (:oya_hinc) 
    AND TRIM (a."KO-HINC") = TRIM (:ko_hinc) 
    AND a."INZU" = :inzu 
    AND a."OYA-BAIKA" = :oya_baika 
    AND a."OYA-GENKA" = :oya_genka 
    AND a."KO-TANKA" = :ko_tanka 
    AND a."KO-GENKA" = :ko_genka 
    AND a."KO-TANRITU" = :ko_tanritu 
    AND TRIM (a."KENSAKUM") = TRIM (:kensakum) 
    AND TRIM (a."CASEKBN") = TRIM (:casekbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."OYA-HINBAN", a."KO-HINBAN"
