SELECT
      * 
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
ORDER BY
    a.sosen_id
    , b.oya_sn
    , c.entity_sn
    , e.ko_sn
    , f.shison_sn

