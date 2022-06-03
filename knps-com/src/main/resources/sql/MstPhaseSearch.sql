SELECT
      a.*
FROM
    MST_PHASE a 
WHERE
    1 = 1 
    AND a."PHASE" = :phase 
    AND a."YY" = :yy 
    AND a."PHASE_FROM" = :phase_from 
    AND a."PHASE_TO" = :phase_to 
ORDER BY
    a."PHASE"
