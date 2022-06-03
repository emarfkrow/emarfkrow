SELECT
      a.*
FROM
    M_SKHIN a 
WHERE
    1 = 1 
    AND TRIM (a."HHINBAN") = TRIM (:hhinban) 
    AND TRIM (a."SKKBN") = TRIM (:skkbn) 
ORDER BY
    a."HHINBAN"
