SELECT
      a.*
FROM
    PRD_Y_PRO_PLAN_HINBAN a 
WHERE
    1 = 1 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND TRIM (a.pro_hinban) = TRIM (:pro_hinban) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.item_kbn IN (:item_kbn) 
    AND TRIM (a.shikake_kbn) IN (:shikake_kbn) 
    AND a.nes_counts = :nes_counts 
    AND a.nes_counts >= :nes_counts_1 
    AND a.nes_counts <= :nes_counts_2 
    AND TRIM (a.parent_hinban) = TRIM (:parent_hinban) 
    AND a.pro_lt = :pro_lt 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.YYYY, a.MM, a.PRO_HINBAN, a.HINBAN
