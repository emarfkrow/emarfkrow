SELECT
      a.*
FROM
    INV_WORK_MNTH_STOCK a 
WHERE
    1 = 1 
    AND TRIM (a."DATA_ID") = TRIM (:data_id) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ROUTING_GROUP" = :routing_group 
    AND a."ROUTING" = :routing 
    AND a."SUM_LOT_SIZE" = :sum_lot_size 
ORDER BY
    a."DATA_ID", a."HINBAN", a."ROUTING_GROUP", a."ROUTING"
