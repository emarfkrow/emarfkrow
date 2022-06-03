SELECT
      a.*
FROM
    M_KUNIMEI a 
WHERE
    1 = 1 
    AND TRIM (a."KOKUSAICD") = TRIM (:kokusaicd) 
    AND TRIM (a."KUNICD") = TRIM (:kunicd) 
    AND TRIM (a."GENSANKOKU") = TRIM (:gensankoku) 
    AND TRIM (a."KUNIMEI") = TRIM (:kunimei) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."KOKUSAICD", a."KUNICD"
