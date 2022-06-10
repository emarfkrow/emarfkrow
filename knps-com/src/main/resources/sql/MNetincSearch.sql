SELECT
      a.*
FROM
    M_NETINC a 
WHERE
    1 = 1 
    AND a."HONSHACD" = :honshacd 
    AND a."TOKUCD" = :tokucd 
    AND TRIM (a."RTOKUMEI") = TRIM (:rtokumei) 
    AND a."NEBIKIRITU" = :nebikiritu 
    AND a."UPDDATE" = :upddate 
ORDER BY
    a."HONSHACD"
