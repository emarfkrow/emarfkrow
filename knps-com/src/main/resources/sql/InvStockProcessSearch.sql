SELECT
      a.*
    , (SELECT r1.LOCATION_NAME FROM MST_LOCATION r1 WHERE r1.LOCATION_CODE = a.LOCATION_CODE) AS LOCATION_NAME
FROM
    INV_STOCK_PROCESS a 
WHERE
    1 = 1 
    AND a.location_code IN (:location_code) 
    AND a.hinban = :hinban 
    AND a.stock = :stock 
    AND a.last_in_out_date = :last_in_out_date 
    AND a.last_in_out_date >= :last_in_out_date_1 
    AND a.last_in_out_date <= :last_in_out_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.LOCATION_CODE, a.HINBAN
