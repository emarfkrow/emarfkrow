SELECT
      a.*
FROM
    MST_SALES_TAX a 
WHERE
    1 = 1 
    AND a.start_date = :start_date 
    AND a.start_date >= :start_date_1 
    AND a.start_date <= :start_date_2 
    AND a.salse_tax = :salse_tax 
ORDER BY
    a.START_DATE
