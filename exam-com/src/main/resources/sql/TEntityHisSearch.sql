SELECT
      * 
FROM
    t_entity_his a 
WHERE
    1 = 1 
    AND a.sosen_id = :sosen_id 
    AND a.oya_sn = :oya_sn 
    AND a.entity_sn = :entity_sn 
    AND a.history_sn = :history_sn 
    AND a.entity_mei LIKE CONCAT ('%', :entity_mei, '%') 
    AND a.sansho1_id = :sansho1_id 
    AND a.sansho1_mei LIKE CONCAT ('%', :sansho1_mei, '%') 
    AND a.sansho2_id = :sansho2_id 
    AND a.sansho2_mei LIKE CONCAT ('%', :sansho2_mei, '%') 
    AND a.betsu_sansho1_id = :betsu_sansho1_id 
    AND a.betsu_sansho1_mei LIKE CONCAT ('%', :betsu_sansho1_mei, '%') 
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
    a.SOSEN_ID, a.OYA_SN, a.ENTITY_SN, a.HISTORY_SN
