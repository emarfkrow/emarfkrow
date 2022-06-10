SELECT
      a.*
FROM
    M_WSEIGYO a 
WHERE
    1 = 1 
    AND a."WEB-DATAKBN" IN (:web_datakbn) 
    AND a."WEB-JUCHUNO1" = :web_juchuno1 
ORDER BY
    a."WEB-DATAKBN"
