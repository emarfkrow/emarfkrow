SELECT
      a.*
    , (SELECT r1."HHINMEI" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HHINMEI"
FROM
    M_SALEHIN a 
WHERE
    1 = 1 
    AND TRIM (a."SALEKBN") = TRIM (:salekbn) 
    AND TRIM (a."SALEMEI") = TRIM (:salemei) 
    AND TRIM (a."HHINBAN") = TRIM (:hhinban) 
    AND a."KAISI-YY" = :kaisi_yy 
    AND a."KAISI-MM" = :kaisi_mm 
    AND a."KAISI-DD" = :kaisi_dd 
    AND a."SHURYO-YY" = :shuryo_yy 
    AND a."SHURYO-MM" = :shuryo_mm 
    AND a."SHURYO-DD" = :shuryo_dd 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."SALEKBN", a."HHINBAN", a."KAISI-YY", a."KAISI-MM", a."KAISI-DD", a."SHURYO-YY", a."SHURYO-MM", a."SHURYO-DD"
