SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."MAN_HINBAN") AS "MAN_ITEM"
    , (SELECT r2."ITEM" FROM MST_HINBAN r2 WHERE r2."HINBAN" = a."SUPPLY_HINBAN") AS "SUPPLY_ITEM"
FROM
    MST_SUPPLY_LIST_HS a 
WHERE
    1 = 1 
    AND TRIM (a."MAN_HINBAN") = TRIM (:man_hinban) 
    AND a."ROUTING_GROUP" = :routing_group 
    AND a."ROUTING" = :routing 
    AND TRIM (a."SUPPLY_HINBAN") = TRIM (:supply_hinban) 
    AND a."COUNTS" = :counts 
    AND a."SUPPLY_KBN" IN (:supply_kbn) 
    AND a."STAN_COUNTS" = :stan_counts 
    AND a."STAN_COUNTS" >= :stan_counts_1 
    AND a."STAN_COUNTS" <= :stan_counts_2 
    AND a."UNIT_SUPPLY" = :unit_supply 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
ORDER BY
    a."MAN_HINBAN", a."ROUTING_GROUP", a."ROUTING", a."SUPPLY_HINBAN", a."TIME_STAMP_CHANGE"
