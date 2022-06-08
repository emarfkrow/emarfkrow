SELECT
      a.*
FROM
    M_GHINMOK a 
WHERE
    1 = 1 
    AND a."HINBAN" = :hinban 
    AND TRIM (a."HINCD") = TRIM (:hincd) 
    AND a."HINGENKA" = :hingenka 
    AND TRIM (a."RENKEIBI") = TRIM (:renkeibi) 
    AND TRIM (a."SHORIFLG") = TRIM (:shoriflg) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HINBAN"
