SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HHINBAN") AS "HITEM"
FROM
    M_SKHIN a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND TRIM (a."SKKBN") IN (:skkbn) 
ORDER BY
    a."HHINBAN"
