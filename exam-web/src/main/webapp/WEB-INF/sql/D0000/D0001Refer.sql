SELECT
      e.* 
FROM
    t_entity e 
WHERE
    1 = 1 
    AND e.sosen_id = :sosen_id 
    AND e.oya_sn = :oya_sn 
    AND e.entity_sn = :entity_sn 
    AND e.entity_mei LIKE CONCAT ('%', :entity_mei, '%') 
ORDER BY
    e.sosen_id
    , e.oya_sn
    , e.entity_sn

