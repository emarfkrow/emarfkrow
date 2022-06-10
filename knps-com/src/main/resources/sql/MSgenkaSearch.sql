SELECT
      a.*
    , (SELECT r1."HINMEI" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HINMEI"
FROM
    M_SGENKA a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND TRIM (a."HINCD") = TRIM (:hincd) 
    AND TRIM (a."SETKBN") IN (:setkbn) 
    AND a."GENKA" = :genka 
    AND a."GENKA" >= :genka_1 
    AND a."GENKA" <= :genka_2 
    AND a."SEIHIN-GENKA" = :seihin_genka 
    AND a."SEIHIN-GENKA" >= :seihin_genka_1 
    AND a."SEIHIN-GENKA" <= :seihin_genka_2 
    AND a."SHOHIN-GENKA" = :shohin_genka 
    AND a."SHOHIN-GENKA" >= :shohin_genka_1 
    AND a."SHOHIN-GENKA" <= :shohin_genka_2 
    AND a."BAIKA" = :baika 
    AND a."BAIKA" >= :baika_1 
    AND a."BAIKA" <= :baika_2 
    AND a."SEIHIN-BAIKA" = :seihin_baika 
    AND a."SEIHIN-BAIKA" >= :seihin_baika_1 
    AND a."SEIHIN-BAIKA" <= :seihin_baika_2 
    AND a."SHOHIN-BAIKA" = :shohin_baika 
    AND a."SHOHIN-BAIKA" >= :shohin_baika_1 
    AND a."SHOHIN-BAIKA" <= :shohin_baika_2 
ORDER BY
    a."HHINBAN"
