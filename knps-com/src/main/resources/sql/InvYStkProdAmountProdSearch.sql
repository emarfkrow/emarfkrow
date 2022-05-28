SELECT
      a.*
FROM
    INV_Y_STK_PROD_AMOUNT_PROD a 
WHERE
    1 = 1 
    AND TRIM (a.pro_hinban) = TRIM (:pro_hinban) 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND a.nes_counts = :nes_counts 
    AND a.nes_counts >= :nes_counts_1 
    AND a.nes_counts <= :nes_counts_2 
    AND a.stan_costs = :stan_costs 
    AND TRIM (a.shikake_kbn) IN (:shikake_kbn) 
    AND a.pro_lt = :pro_lt 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.PRO_HINBAN, a.YYYY, a.MM
