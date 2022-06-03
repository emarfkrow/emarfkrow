SELECT
      a.*
FROM
    M_HINCCVT a 
WHERE
    1 = 1 
    AND TRIM (a.cvthinban) = TRIM (:cvthinban) 
    AND TRIM (a.hhinban) = TRIM (:hhinban) 
    AND TRIM (a.chokuhinkbn) = TRIM (:chokuhinkbn) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.CVTHINBAN, a.CHOKUHINKBN
