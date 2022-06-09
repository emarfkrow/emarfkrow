SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
FROM
    M_GHINMOK a 
WHERE
    1 = 1 
    AND a."HINBAN" = :hinban 
    AND TRIM (a."HINCD") = TRIM (:hincd) 
    AND a."HINGENKA" = :hingenka 
    AND a."HINGENKA" >= :hingenka_1 
    AND a."HINGENKA" <= :hingenka_2 
    AND TRIM (a."RENKEIBI") = TRIM (:renkeibi) 
    AND a."RENKEIBI" >= :renkeibi_1 
    AND a."RENKEIBI" <= :renkeibi_2 
    AND TRIM (a."SHORIFLG") IN (:shoriflg) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."HINBAN"
