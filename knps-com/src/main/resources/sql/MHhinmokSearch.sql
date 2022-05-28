SELECT
      a.*
FROM
    M_HHINMOK a 
WHERE
    1 = 1 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND TRIM (a.dltflg) = TRIM (:dltflg) 
    AND TRIM (a.setkbn) = TRIM (:setkbn) 
    AND a.hyojun_genka = :hyojun_genka 
    AND a.hyojun_baika = :hyojun_baika 
    AND a.zaikosu_h1 = :zaikosu_h1 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.HHINBAN
