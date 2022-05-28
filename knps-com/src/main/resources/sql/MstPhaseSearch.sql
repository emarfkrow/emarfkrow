SELECT
      a.*
FROM
    MST_PHASE a 
WHERE
    1 = 1 
    AND a.phase = :phase 
    AND a.yy = :yy 
    AND a.phase_from = :phase_from 
    AND a.phase_to = :phase_to 
ORDER BY
    a.PHASE
