SELECT
      a.*
FROM
    M_BARCD a 
WHERE
    1 = 1 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND TRIM (a.hinmei) = TRIM (:hinmei) 
    AND a.barcode = :barcode 
    AND TRIM (a.free1) = TRIM (:free1) 
    AND TRIM (a.free2) = TRIM (:free2) 
    AND TRIM (a.free3) = TRIM (:free3) 
    AND TRIM (a.fller) = TRIM (:fller) 
ORDER BY
    a.HHINBAN
