SELECT
      a.*
FROM
    M_HSEIGYO a 
WHERE
    1 = 1 
    AND a.keycd = :keycd 
    AND a.kaisibi = :kaisibi 
    AND a.shuryobi = :shuryobi 
    AND a.zeiritu = :zeiritu 
    AND a.yuboent = :yuboent 
    AND a.shusijino1 = :shusijino1 
    AND a.nohinshono = :nohinshono 
    AND a.setkeino = :setkeino 
    AND a.getuji_yymm = :getuji_yymm 
    AND a.t_juccnt = :t_juccnt 
    AND a.t_maxcnt = :t_maxcnt 
    AND a.chokucnt = :chokucnt 
    AND a.hyotanka = :hyotanka 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.KEYCD
