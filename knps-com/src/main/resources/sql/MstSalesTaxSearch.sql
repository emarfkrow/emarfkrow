SELECT
      a.*
FROM
    MST_SALES_TAX a 
WHERE
    1 = 1 
    AND a."START_DATE" = :start_date 
    AND a."START_DATE" >= :start_date_1 
    AND a."START_DATE" <= :start_date_2 
    AND a."SALSE_TAX" = :salse_tax 
ORDER BY
    a."START_DATE"
