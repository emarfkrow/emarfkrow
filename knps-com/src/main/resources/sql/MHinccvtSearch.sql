SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."CVTHINBAN") AS "CVTITEM"
    , (SELECT r2."ITEM" FROM MST_HINBAN r2 WHERE r2."HINBAN" = a."HHINBAN") AS "HITEM"
FROM
    M_HINCCVT a 
WHERE
    1 = 1 
    AND a."CVTHINBAN" = :cvthinban 
    AND a."HHINBAN" = :hhinban 
    AND TRIM (a."CHOKUHINKBN") IN (:chokuhinkbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."CVTHINBAN", a."CHOKUHINKBN"
