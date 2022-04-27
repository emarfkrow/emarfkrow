SELECT
      * 
FROM
    t_entity e 
WHERE
    e.sosen_id = :sosen_id 
    AND e.oya_sn = :oya_sn 
    AND e.entity_sn = :entity_sn

