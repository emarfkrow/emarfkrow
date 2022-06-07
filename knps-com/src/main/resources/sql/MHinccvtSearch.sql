SELECT
      a.*
    , (SELECT r1."HHINMEI" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HHINMEI"
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
