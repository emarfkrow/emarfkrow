SELECT
      a.*
FROM
    M_BARINDX a 
WHERE
    1 = 1 
    AND a."KEYCD" = :keycd 
    AND a."BAR-OIBAN1" = :bar_oiban1 
    AND a."BAR-OIBAN2" = :bar_oiban2 
    AND a."BAR-OIBAN3" = :bar_oiban3 
    AND a."BAR-OIBAN4" = :bar_oiban4 
    AND a."BAR-OIBAN5" = :bar_oiban5 
    AND a."BAR-OIBAN6" = :bar_oiban6 
    AND a."BAR-OIBAN7" = :bar_oiban7 
    AND a."BAR-OIBAN8" = :bar_oiban8 
    AND a."BAR-OIBAN9" = :bar_oiban9 
ORDER BY
    a."KEYCD"
