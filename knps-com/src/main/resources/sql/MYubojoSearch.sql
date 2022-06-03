SELECT
      a.*
FROM
    M_YUBOJO a 
WHERE
    1 = 1 
    AND TRIM (a.yuryokukbn) = TRIM (:yuryokukbn) 
    AND a.yuryocd = :yuryocd 
    AND TRIM (a.ryuryokumei) = TRIM (:ryuryokumei) 
    AND a.konyu_min = :konyu_min 
    AND a.konyu_max = :konyu_max 
    AND a.yuboritu = :yuboritu 
    AND a.upddate = :upddate 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.YURYOKUKBN, a.YURYOCD
