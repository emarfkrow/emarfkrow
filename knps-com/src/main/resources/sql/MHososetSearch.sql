SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HHINBAN") AS "HITEM"
    , (SELECT r2."ITEM" FROM MST_HINBAN r2 WHERE r2."HINBAN" = a."HOSO-HINBAN") AS "HOSO-ITEM"
FROM
    M_HOSOSET a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND a."HOSO-HINBAN" = :hoso_hinban 
    AND a."INZU" = :inzu 
ORDER BY
    a."HHINBAN", a."HOSO-HINBAN"
