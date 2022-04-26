SELECT
      a.*
    , (SELECT r1.SOSEN_MEI FROM t_sosen r1 WHERE r1.SOSEN_ID = a.SOSEN_ID) AS SOSEN_MEI
FROM
    t_shison a 
WHERE
    1 = 1 
    AND a.sosen_id = :sosen_id 
    AND a.oya_sn = :oya_sn 
    AND a.entity_sn = :entity_sn 
    AND a.ko_sn = :ko_sn 
    AND a.shison_sn = :shison_sn 
    AND a.shison_mei LIKE CONCAT ('%', :shison_mei, '%') 
    AND a.insert_dt = :insert_dt 
    AND a.insert_dt >= :insert_dt_1 
    AND a.insert_dt <= :insert_dt_2 
    AND a.insert_by = :insert_by 
    AND a.update_dt = :update_dt 
    AND a.update_dt >= :update_dt_1 
    AND a.update_dt <= :update_dt_2 
    AND a.update_by = :update_by 
    AND CASE WHEN a.delete_f IS NULL THEN '0' ELSE a.delete_f END = :delete_f 
ORDER BY
    a.SOSEN_ID, a.OYA_SN, a.ENTITY_SN, a.KO_SN, a.SHISON_SN
