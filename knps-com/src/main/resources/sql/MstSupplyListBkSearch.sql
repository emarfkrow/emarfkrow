SELECT
      a.*
FROM
    MST_SUPPLY_LIST_BK a 
WHERE
    1 = 1 
    AND TRIM (a.yy) = TRIM (:yy) 
    AND a.routing_group = :routing_group 
    AND TRIM (a.man_hinban) = TRIM (:man_hinban) 
    AND a.routing = :routing 
    AND TRIM (a.supply_hinban) = TRIM (:supply_hinban) 
    AND a.counts = :counts 
    AND a.supply_kbn IN (:supply_kbn) 
    AND a.stan_counts = :stan_counts 
    AND a.stan_counts >= :stan_counts_1 
    AND a.stan_counts <= :stan_counts_2 
    AND a.unit_supply = :unit_supply 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.MAN_HINBAN, a.ROUTING_GROUP, a.ROUTING, a.SUPPLY_HINBAN, a.YY
