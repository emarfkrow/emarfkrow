SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HHINBAN") AS "HITEM"
FROM
    M_SALEHIN a 
WHERE
    1 = 1 
    AND TRIM (a."SALEKBN") IN (:salekbn) 
    AND TRIM (a."SALEMEI") = TRIM (:salemei) 
    AND a."HHINBAN" = :hhinban 
    AND a."KAISI-YY" = :kaisi_yy 
    AND a."KAISI-MM" = :kaisi_mm 
    AND a."KAISI-DD" = :kaisi_dd 
    AND a."SHURYO-YY" = :shuryo_yy 
    AND a."SHURYO-MM" = :shuryo_mm 
    AND a."SHURYO-DD" = :shuryo_dd 
ORDER BY
    a."SALEKBN", a."HHINBAN", a."KAISI-YY", a."KAISI-MM", a."KAISI-DD", a."SHURYO-YY", a."SHURYO-MM", a."SHURYO-DD"
