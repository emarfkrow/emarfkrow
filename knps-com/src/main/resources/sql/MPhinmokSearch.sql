SELECT
      a.*
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
    AND TRIM (a."P-KBN") IN (:p_kbn) 
    AND a."KISHUZAN" = :kishuzan 
    AND a."KIJYUNZAIKO" = :kijyunzaiko 
    AND a."HACHUTEN" = :hachuten 
    AND TRIM (a."TOUROKUKBN") = TRIM (:tourokukbn) 
    AND TRIM (a."DENPYOTKBN") = TRIM (:denpyotkbn) 
    AND TRIM (a."JUKINKBN") = TRIM (:jukinkbn) 
    AND a."DLTFLG" = :dltflg 
    AND a."UPDDATE" = :upddate 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."PHINBAN"
