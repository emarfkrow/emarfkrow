SELECT
      a.*
FROM
    M_HOSOZAI a 
WHERE
    1 = 1 
    AND TRIM (a."HOSO-HINBAN") = TRIM (:hoso_hinban) 
    AND TRIM (a."HOSO-HINMEI") = TRIM (:hoso_hinmei) 
    AND TRIM (a."HOSO-HINMEI-RYAKU") = TRIM (:hoso_hinmei_ryaku) 
    AND TRIM (a."HOSO-SIZE") = TRIM (:hoso_size) 
    AND a."HOSO-TANKA" = :hoso_tanka 
    AND TRIM (a."HOSO-ZAICODE") = TRIM (:hoso_zaicode) 
    AND a."HOSO-WEIGHT" = :hoso_weight 
    AND a."MAKEDATE" = :makedate 
    AND a."UPDDATE" = :upddate 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HOSO-HINBAN"
