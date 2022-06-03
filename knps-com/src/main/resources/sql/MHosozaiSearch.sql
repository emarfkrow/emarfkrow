SELECT
      a.*
FROM
    M_HOSOZAI a 
WHERE
    1 = 1 
    AND TRIM (a.hoso_hinban) = TRIM (:hoso_hinban) 
    AND TRIM (a.hoso_hinmei) = TRIM (:hoso_hinmei) 
    AND TRIM (a.hoso_hinmei_ryaku) = TRIM (:hoso_hinmei_ryaku) 
    AND TRIM (a.hoso_size) = TRIM (:hoso_size) 
    AND a.hoso_tanka = :hoso_tanka 
    AND TRIM (a.hoso_zaicode) = TRIM (:hoso_zaicode) 
    AND a.hoso_weight = :hoso_weight 
    AND a.makedate = :makedate 
    AND a.upddate = :upddate 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.HOSO-HINBAN
