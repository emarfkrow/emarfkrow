SELECT
      a.*
FROM
    M_GHINMOK a 
WHERE
    1 = 1 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND TRIM (a.hincd) = TRIM (:hincd) 
    AND a.hingenka = :hingenka 
    AND TRIM (a.renkeibi) = TRIM (:renkeibi) 
    AND TRIM (a.shoriflg) = TRIM (:shoriflg) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.HINBAN
