SELECT
      a.*
FROM
    M_BARINDX a 
WHERE
    1 = 1 
    AND a.keycd = :keycd 
    AND a.bar_oiban1 = :bar_oiban1 
    AND a.bar_oiban2 = :bar_oiban2 
    AND a.bar_oiban3 = :bar_oiban3 
    AND a.bar_oiban4 = :bar_oiban4 
    AND a.bar_oiban5 = :bar_oiban5 
    AND a.bar_oiban6 = :bar_oiban6 
    AND a.bar_oiban7 = :bar_oiban7 
    AND a.bar_oiban8 = :bar_oiban8 
    AND a.bar_oiban9 = :bar_oiban9 
ORDER BY
    a.KEYCD
