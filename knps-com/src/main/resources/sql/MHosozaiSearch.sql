SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HOSO-HINBAN") AS "HOSO-ITEM"
FROM
    M_HOSOZAI a 
WHERE
    1 = 1 
    AND a."HOSO-HINBAN" = :hoso_hinban 
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
