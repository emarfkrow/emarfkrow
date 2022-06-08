SELECT
      a.*
    , (SELECT r1."HHINMEI" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HHINMEI"
FROM
    M_TANKA a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND a."DAIRI-TANKA" = :dairi_tanka 
    AND a."CDAIKO-TANKA" = :cdaiko_tanka 
    AND a."JDAIKO-TANKA" = :jdaiko_tanka 
    AND a."OROSI-TANKA" = :orosi_tanka 
    AND a."KOURI-KAKAKU" = :kouri_kakaku 
    AND a."DIY-KAKAKU" = :diy_kakaku 
    AND a."YUSHUTU1-KAKAKU" = :yushutu1_kakaku 
    AND a."YUSHUTU2-KAKAKU" = :yushutu2_kakaku 
    AND a."YUSHUTU3-KAKAKU" = :yushutu3_kakaku 
    AND a."KAKAKU1" = :kakaku1 
    AND a."KAKAKU2" = :kakaku2 
    AND a."KAKAKU3" = :kakaku3 
    AND a."KAKAKU4" = :kakaku4 
    AND a."KAKAKU5" = :kakaku5 
    AND a."KAKAKU6" = :kakaku6 
    AND TRIM (a."SHOHINKBN") = TRIM (:shohinkbn) 
    AND TRIM (a."KAKAKUKBN") = TRIM (:kakakukbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HHINBAN"
