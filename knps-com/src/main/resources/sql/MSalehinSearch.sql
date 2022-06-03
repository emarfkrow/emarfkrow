SELECT
      a.*
FROM
    M_SALEHIN a 
WHERE
    1 = 1 
    AND TRIM (a.salekbn) = TRIM (:salekbn) 
    AND TRIM (a.salemei) = TRIM (:salemei) 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND a.kaisi_yy = :kaisi_yy 
    AND a.kaisi_mm = :kaisi_mm 
    AND a.kaisi_dd = :kaisi_dd 
    AND a.shuryo_yy = :shuryo_yy 
    AND a.shuryo_mm = :shuryo_mm 
    AND a.shuryo_dd = :shuryo_dd 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.SALEKBN, a.HHINBAN, a.KAISI-YY, a.KAISI-MM, a.KAISI-DD, a.SHURYO-YY, a.SHURYO-MM, a.SHURYO-DD
