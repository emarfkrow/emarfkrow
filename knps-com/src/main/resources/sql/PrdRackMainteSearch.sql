SELECT
      a.*
FROM
    PRD_RACK_MAINTE a 
WHERE
    1 = 1 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND a.rack_name LIKE '%' || :rack_name || '%' 
    AND a.rack_nes_counts = :rack_nes_counts 
    AND a.rack_nes_counts >= :rack_nes_counts_1 
    AND a.rack_nes_counts <= :rack_nes_counts_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.YYYY, a.MM, a.RACK_NAME
