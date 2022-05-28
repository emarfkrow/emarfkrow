SELECT
      a.*
FROM
    PCH_PROD_TOTAL_INF a 
WHERE
    1 = 1 
    AND TRIM (a.close_date) = TRIM (:close_date) 
    AND a.close_date >= :close_date_1 
    AND a.close_date <= :close_date_2 
    AND a.routing_group = :routing_group 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.routing = :routing 
    AND a.total_counts = :total_counts 
    AND a.total_counts >= :total_counts_1 
    AND a.total_counts <= :total_counts_2 
    AND a.total_amount = :total_amount 
    AND a.total_amount >= :total_amount_1 
    AND a.total_amount <= :total_amount_2 
    AND a.sum_supply = :sum_supply 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.HINBAN, a.ROUTING_GROUP, a.ROUTING, a.CLOSE_DATE
