SELECT
      a.*
FROM
    M_KUNIMEI a 
WHERE
    1 = 1 
    AND TRIM (a.kokusaicd) = TRIM (:kokusaicd) 
    AND TRIM (a.kunicd) = TRIM (:kunicd) 
    AND TRIM (a.gensankoku) = TRIM (:gensankoku) 
    AND TRIM (a.kunimei) = TRIM (:kunimei) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.KOKUSAICD, a.KUNICD
