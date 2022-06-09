SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."PHINBAN") AS "PITEM"
    , (SELECT r2."ITEM" FROM MST_HINBAN r2 WHERE r2."HINBAN" = a."HINBAN") AS "ITEM"
FROM
    M_PHINMOK a 
WHERE
    1 = 1 
    AND a."PHINBAN" = :phinban 
    AND TRIM (a."PHINMEI") = TRIM (:phinmei) 
    AND TRIM (a."PHINMEIK") = TRIM (:phinmeik) 
    AND a."HINBAN" = :hinban 
    AND a."P-KAKAKU" = :p_kakaku 
    AND a."P-GENKA" = :p_genka 
    AND a."P-GENKA" >= :p_genka_1 
    AND a."P-GENKA" <= :p_genka_2 
    AND TRIM (a."P-KBN") IN (:p_kbn) 
    AND a."KISHUZAN" = :kishuzan 
    AND a."KIJYUNZAIKO" = :kijyunzaiko 
    AND a."KIJYUNZAIKO" >= :kijyunzaiko_1 
    AND a."KIJYUNZAIKO" <= :kijyunzaiko_2 
    AND a."HACHUTEN" = :hachuten 
    AND TRIM (a."TOUROKUKBN") IN (:tourokukbn) 
    AND TRIM (a."DENPYOTKBN") IN (:denpyotkbn) 
    AND TRIM (a."JUKINKBN") IN (:jukinkbn) 
    AND a."DLTFLG" IN (:dltflg) 
    AND a."UPDDATE" = :upddate 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."PHINBAN"
