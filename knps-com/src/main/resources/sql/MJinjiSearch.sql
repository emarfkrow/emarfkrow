SELECT
      a.*
FROM
    M_JINJI a 
WHERE
    1 = 1 
    AND a."SHAIN-NO" = :shain_no 
    AND a."SHAIN-MEI" LIKE '%' || :shain_mei || '%' 
    AND a."JINJI-SHOZOKUCD" = :jinji_shozokucd 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."SHAIN-NO"
