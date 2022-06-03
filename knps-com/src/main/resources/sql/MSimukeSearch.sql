SELECT
      a.*
FROM
    M_SIMUKE a 
WHERE
    1 = 1 
    AND TRIM (a.simukecd) = TRIM (:simukecd) 
    AND TRIM (a.simukemei) = TRIM (:simukemei) 
    AND TRIM (a.filler) = TRIM (:filler) 
ORDER BY
    a.SIMUKECD
