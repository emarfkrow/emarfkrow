SELECT
      a.*
FROM
    F_JUCHUZ a 
WHERE
    1 = 1 
    AND a.tokucd = :tokucd 
    AND a.chokucd = :chokucd 
    AND a.hhinban = :hhinban 
    AND a.chuban = :chuban 
    AND a.juchusu = :juchusu 
    AND a.juchuno = :juchuno 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.TOKUCD, a.HHINBAN, a.JUCHUNO
