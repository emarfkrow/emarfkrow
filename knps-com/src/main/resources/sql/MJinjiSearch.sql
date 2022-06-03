SELECT
      a.*
FROM
    M_JINJI a 
WHERE
    1 = 1 
    AND a.shain_no = :shain_no 
    AND a.shain_mei LIKE '%' || :shain_mei || '%' 
    AND a.jinji_shozokucd = :jinji_shozokucd 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.SHAIN-NO
