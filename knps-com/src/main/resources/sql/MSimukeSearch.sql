SELECT
      a.*
FROM
    M_SIMUKE a 
WHERE
    1 = 1 
    AND TRIM (a."SIMUKECD") = TRIM (:simukecd) 
    AND TRIM (a."SIMUKEMEI") = TRIM (:simukemei) 
ORDER BY
    a."SIMUKECD"
