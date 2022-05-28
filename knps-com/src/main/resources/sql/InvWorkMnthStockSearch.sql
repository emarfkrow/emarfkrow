SELECT
      a.*
FROM
    INV_WORK_MNTH_STOCK a 
WHERE
    1 = 1 
    AND TRIM (a.data_id) = TRIM (:data_id) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.routing_group = :routing_group 
    AND a.routing = :routing 
    AND a.sum_lot_size = :sum_lot_size 
ORDER BY
    a.DATA_ID, a.HINBAN, a.ROUTING_GROUP, a.ROUTING
