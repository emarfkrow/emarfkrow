SELECT
      a.*
FROM
    M_HSEIGYO a 
WHERE
    1 = 1 
    AND a."KEYCD" = :keycd 
    AND a."KAISIBI" = :kaisibi 
    AND a."KAISIBI" >= :kaisibi_1 
    AND a."KAISIBI" <= :kaisibi_2 
    AND a."SHURYOBI" = :shuryobi 
    AND a."SHURYOBI" >= :shuryobi_1 
    AND a."SHURYOBI" <= :shuryobi_2 
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
ORDER BY
    a."KEYCD"
