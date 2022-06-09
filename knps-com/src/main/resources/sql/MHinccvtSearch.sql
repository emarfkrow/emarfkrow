SELECT
      a.*
    , (SELECT r1."HINMEI" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HINMEI"
FROM
    M_HINCCVT a 
WHERE
    1 = 1 
    AND a."CVTHINBAN" = :cvthinban 
    AND a."HHINBAN" = :hhinban 
    AND TRIM (a."CHOKUHINKBN") = TRIM (:chokuhinkbn) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."CVTHINBAN", a."CHOKUHINKBN"
