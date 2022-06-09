SELECT
      a.*
FROM
    M_YUBOJO a 
WHERE
    1 = 1 
    AND TRIM (a."YURYOKUKBN") IN (:yuryokukbn) 
    AND a."YURYOCD" = :yuryocd 
    AND TRIM (a."RYURYOKUMEI") = TRIM (:ryuryokumei) 
    AND a."KONYU-MIN" = :konyu_min 
    AND a."KONYU-MAX" = :konyu_max 
    AND a."YUBORITU" = :yuboritu 
    AND a."UPDDATE" = :upddate 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."YURYOKUKBN", a."YURYOCD"
