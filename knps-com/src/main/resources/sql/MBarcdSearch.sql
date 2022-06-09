SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HHINBAN") AS "HITEM"
FROM
    M_BARCD a 
WHERE
    1 = 1 
    AND a."HHINBAN" = :hhinban 
    AND TRIM (a."HINMEI") = TRIM (:hinmei) 
    AND a."BARCODE" = :barcode 
    AND TRIM (a."FREE1") = TRIM (:free1) 
    AND TRIM (a."FREE2") = TRIM (:free2) 
    AND TRIM (a."FREE3") = TRIM (:free3) 
    AND TRIM (a."FLLER") = TRIM (:fller) 
ORDER BY
    a."HHINBAN"
