SELECT
      a.*
FROM
    PRD_M_PRO_NES_COUNTS a 
WHERE
    1 = 1 
    AND TRIM (a.pro_hinban) = TRIM (:pro_hinban) 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND a.pro_nes_counts = :pro_nes_counts 
    AND a.pro_nes_counts >= :pro_nes_counts_1 
    AND a.pro_nes_counts <= :pro_nes_counts_2 
    AND a.pro_adj_counts = :pro_adj_counts 
    AND a.pro_adj_counts >= :pro_adj_counts_1 
    AND a.pro_adj_counts <= :pro_adj_counts_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.PRO_HINBAN, a.YYYY, a.MM
