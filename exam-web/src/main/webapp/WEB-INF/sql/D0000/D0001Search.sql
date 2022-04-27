SELECT
      a.sosen_id
    , a.sosen_mei
    , b.oya_sn
    , b.oya_mei
    , c.entity_sn
    , c.entity_mei
    , c.sansho1_id
    , c.sansho1_mei
    , c.sansho2_id
    , c.sansho2_mei
    , c.betsu_sansho1_id
    , c.betsu_sansho1_mei
FROM
    t_sosen a 
    LEFT OUTER JOIN t_oya b 
        ON b.sosen_id = a.sosen_id 
    LEFT OUTER JOIN t_entity c 
        ON c.sosen_id = b.sosen_id 
        AND c.oya_sn = b.oya_sn 
    LEFT OUTER JOIN t_entity2 d 
        ON d.sosen_id = c.sosen_id 
        AND d.oya_sn = c.oya_sn 
        AND d.entity_sn = c.entity_sn 
    LEFT OUTER JOIN t_ko e 
        ON e.sosen_id = c.sosen_id 
        AND e.oya_sn = c.oya_sn 
        AND e.entity_sn = c.entity_sn 
    LEFT OUTER JOIN t_shison f 
        ON f.sosen_id = e.sosen_id 
        AND f.oya_sn = e.oya_sn 
        AND f.entity_sn = e.entity_sn 
        AND f.ko_sn = e.ko_sn 
WHERE
    1 = 1 
    AND c.sosen_id = :sosen_id 
    AND c.oya_sn = :oya_sn 
    AND c.entity_sn = :entity_sn 
    AND c.entity_mei LIKE CONCAT ('%', :entity_mei, '%') 
    AND c.sansho1_id = :sansho1_id 
    AND c.sansho1_mei LIKE CONCAT ('%', :sansho1_mei, '%') 
    AND c.sansho2_id = :sansho2_id 
    AND c.sansho2_mei LIKE CONCAT ('%', :sansho2_mei, '%') 
    AND c.betsu_sansho1_id = :betsu_sansho1_id 
    AND c.betsu_sansho1_mei LIKE CONCAT ('%', :betsu_sansho1_mei, '%') 
    AND c.insert_dt = :insert_dt 
    AND c.insert_dt >= :insert_dt_1 
    AND c.insert_dt <= :insert_dt_2 
    AND c.insert_by = :insert_by 
    AND c.update_dt = :update_dt 
    AND c.update_dt >= :update_dt_1 
    AND c.update_dt <= :update_dt_2 
    AND c.update_by = :update_by 
    AND CASE WHEN c.delete_f IS NULL THEN '0' ELSE c.delete_f END = :delete_f 
ORDER BY
    a.sosen_id
    , b.oya_sn
    , c.entity_sn
    , e.ko_sn
    , f.shison_sn


