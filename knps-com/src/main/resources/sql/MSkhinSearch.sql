SELECT
      a.*
    , (SELECT r1."HITEM" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HITEM"
FROM
    M_SKHIN a 
WHERE
    1 = 1 
    AND TRIM (a."HHINBAN") = TRIM (:hhinban) 
    AND TRIM (a."SKKBN") = TRIM (:skkbn) 
ORDER BY
    a."HHINBAN"
