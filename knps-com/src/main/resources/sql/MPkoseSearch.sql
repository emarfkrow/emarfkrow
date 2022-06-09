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
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HHINBAN", a."PHINBAN"
