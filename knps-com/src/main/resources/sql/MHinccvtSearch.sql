SELECT
      a.*
FROM
    M_HINCCVT a 
WHERE
    1 = 1 
    AND TRIM (a."CVTHINBAN") = TRIM (:cvthinban) 
    AND TRIM (a."HHINBAN") = TRIM (:hhinban) 
    AND TRIM (a."CHOKUHINKBN") = TRIM (:chokuhinkbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."CVTHINBAN", a."CHOKUHINKBN"
