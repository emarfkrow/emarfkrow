SELECT
      a.*
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
    AND CASE WHEN a."SHORIFLG" IS NULL THEN '0' ELSE TO_CHAR (a."SHORIFLG") END IN (:shoriflg) 
ORDER BY
    a."HINBAN"
