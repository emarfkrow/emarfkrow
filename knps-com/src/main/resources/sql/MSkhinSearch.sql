SELECT
      a.*
FROM
    M_SKHIN a 
WHERE
    1 = 1 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND TRIM (a.skkbn) = TRIM (:skkbn) 
ORDER BY
    a.HHINBAN
