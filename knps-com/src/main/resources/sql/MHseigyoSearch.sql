SELECT
      a.*
FROM
    M_HSEIGYO a 
WHERE
    1 = 1 
    AND a."KEYCD" = :keycd 
    AND a."KAISIBI" = :kaisibi 
    AND a."SHURYOBI" = :shuryobi 
    AND a."ZEIRITU" = :zeiritu 
    AND a."YUBOENT" = :yuboent 
    AND a."SHUSIJINO1" = :shusijino1 
    AND a."NOHINSHONO" = :nohinshono 
    AND a."SETKEINO" = :setkeino 
    AND a."GETUJI-YYMM" = :getuji_yymm 
    AND a."T-JUCCNT" = :t_juccnt 
    AND a."T-MAXCNT" = :t_maxcnt 
    AND a."CHOKUCNT" = :chokucnt 
    AND a."HYOTANKA" = :hyotanka 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."KEYCD"
