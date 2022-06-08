SELECT
      a.*
    , (SELECT r1."HITEM" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HITEM"
FROM
    M_BARCD a 
WHERE
    1 = 1 
    AND TRIM (a."HHINBAN") = TRIM (:hhinban) 
    AND TRIM (a."HINMEI") = TRIM (:hinmei) 
    AND a."BARCODE" = :barcode 
    AND TRIM (a."FREE1") = TRIM (:free1) 
    AND TRIM (a."FREE2") = TRIM (:free2) 
    AND TRIM (a."FREE3") = TRIM (:free3) 
    AND TRIM (a."FLLER") = TRIM (:fller) 
ORDER BY
    a."HHINBAN"
