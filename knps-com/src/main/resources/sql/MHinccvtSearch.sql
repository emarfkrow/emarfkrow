SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."CVTHINBAN") AS "CVTITEM"
    , (SELECT r2."HINMEI" FROM M_HHINMOK r2 WHERE r2."HHINBAN" = a."HHINBAN") AS "HINMEI"
FROM
    M_HINCCVT a 
WHERE
    1 = 1 
    AND a."CVTHINBAN" = :cvthinban 
    AND a."HHINBAN" = :hhinban 
    AND TRIM (a."CHOKUHINKBN") IN (:chokuhinkbn) 
ORDER BY
    a."CVTHINBAN", a."CHOKUHINKBN"
