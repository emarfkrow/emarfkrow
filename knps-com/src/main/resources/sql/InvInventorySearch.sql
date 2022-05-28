SELECT
      a.*
    , (SELECT r1.LOCATION_NAME FROM MST_LOCATION r1 WHERE r1.LOCATION_CODE = a.LOCATION_CODE) AS LOCATION_NAME
    , (SELECT r2.REASON_NAME FROM MST_REASON r2 WHERE r2.REASON_CODE = a.REASON_CODE) AS REASON_NAME
FROM
    INV_INVENTORY a 
WHERE
    1 = 1 
    AND a.location_code IN (:location_code) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.good_stock = :good_stock 
    AND a.bad_stock = :bad_stock 
    AND a.latest_in_date = :latest_in_date 
    AND a.latest_in_date >= :latest_in_date_1 
    AND a.latest_in_date <= :latest_in_date_2 
    AND a.latest_out_date = :latest_out_date 
    AND a.latest_out_date >= :latest_out_date_1 
    AND a.latest_out_date <= :latest_out_date_2 
    AND a.remains_kbn IN (:remains_kbn) 
    AND a.reason_code IN (:reason_code) 
    AND a.note = :note 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.LOCATION_CODE, a.HINBAN
