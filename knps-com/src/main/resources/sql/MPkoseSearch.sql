SELECT
      a.*
FROM
    M_PKOSE a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND TRIM (a."HINMEI") = TRIM (:hinmei) 
    AND a."PHINBAN" = :phinban 
    AND TRIM (a."PHINMEI") = TRIM (:phinmei) 
    AND a."TOUROKUBI" = :tourokubi 
    AND a."TOUROKUBI" >= :tourokubi_1 
    AND a."TOUROKUBI" <= :tourokubi_2 
ORDER BY
    a."HHINBAN", a."PHINBAN"
