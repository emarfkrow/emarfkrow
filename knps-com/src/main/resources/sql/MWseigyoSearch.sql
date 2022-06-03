SELECT
      a.*
FROM
    M_WSEIGYO a 
WHERE
    1 = 1 
    AND a.web_datakbn = :web_datakbn 
    AND a.web_juchuno1 = :web_juchuno1 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.WEB-DATAKBN
