SELECT
      a.*
FROM
    M_TANKA a 
WHERE
    1 = 1 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND a.dairi_tanka = :dairi_tanka 
    AND a.cdaiko_tanka = :cdaiko_tanka 
    AND a.jdaiko_tanka = :jdaiko_tanka 
    AND a.orosi_tanka = :orosi_tanka 
    AND a.kouri_kakaku = :kouri_kakaku 
    AND a.diy_kakaku = :diy_kakaku 
    AND a.yushutu1_kakaku = :yushutu1_kakaku 
    AND a.yushutu2_kakaku = :yushutu2_kakaku 
    AND a.yushutu3_kakaku = :yushutu3_kakaku 
    AND a.kakaku1 = :kakaku1 
    AND a.kakaku2 = :kakaku2 
    AND a.kakaku3 = :kakaku3 
    AND a.kakaku4 = :kakaku4 
    AND a.kakaku5 = :kakaku5 
    AND a.kakaku6 = :kakaku6 
    AND TRIM (a.shohinkbn) = TRIM (:shohinkbn) 
    AND TRIM (a.kakakukbn) = TRIM (:kakakukbn) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.HHINBAN
