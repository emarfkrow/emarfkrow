SELECT
      a.*
FROM
    M_NETINC a 
WHERE
    1 = 1 
    AND a.honshacd = :honshacd 
    AND a.tokucd = :tokucd 
    AND TRIM (a.rtokumei) = TRIM (:rtokumei) 
    AND a.nebikiritu = :nebikiritu 
    AND a.upddate = :upddate 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.HONSHACD
