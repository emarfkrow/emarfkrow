SELECT
      a.*
FROM
    M_JINJI a 
WHERE
    1 = 1 
    AND a."SHAIN-NO" = :shain_no 
    AND TRIM (a."SHAIN-MEI") = TRIM (:shain_mei) 
    AND a."JINJI-SHOZOKUCD" = :jinji_shozokucd 
ORDER BY
    a."SHAIN-NO"
