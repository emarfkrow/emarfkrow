SELECT
      a.*
FROM
    M_PHINMOK a 
WHERE
    1 = 1 
    AND TRIM (a.phinban) = TRIM (:phinban) 
    AND TRIM (a.phinmei) = TRIM (:phinmei) 
    AND TRIM (a.phinmeik) = TRIM (:phinmeik) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.p_kakaku = :p_kakaku 
    AND a.p_genka = :p_genka 
    AND TRIM (a.p_kbn) IN (:p_kbn) 
    AND a.kishuzan = :kishuzan 
    AND a.kijyunzaiko = :kijyunzaiko 
    AND a.hachuten = :hachuten 
    AND TRIM (a.tourokukbn) = TRIM (:tourokukbn) 
    AND TRIM (a.denpyotkbn) = TRIM (:denpyotkbn) 
    AND TRIM (a.jukinkbn) = TRIM (:jukinkbn) 
    AND a.dltflg = :dltflg 
    AND a.upddate = :upddate 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.PHINBAN
