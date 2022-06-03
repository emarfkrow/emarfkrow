SELECT
      a.*
FROM
    M_SIMUKE a 
WHERE
    1 = 1 
    AND TRIM (a."SIMUKECD") = TRIM (:simukecd) 
    AND TRIM (a."SIMUKEMEI") = TRIM (:simukemei) 
    AND TRIM (a."FILLER") = TRIM (:filler) 
ORDER BY
    a."SIMUKECD"
