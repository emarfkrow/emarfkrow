SELECT
      a.*
    , (SELECT r1.LOCATION_NAME FROM MST_LOCATION r1 WHERE r1.LOCATION_CODE = a.LOCATION_CODE) AS LOCATION_NAME
FROM
    INV_SALES_INVENTORY a 
WHERE
    1 = 1 
    AND TRIM (a.sales_hinban) = TRIM (:sales_hinban) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.inventory = :inventory 
    AND TRIM (a.location_code) IN (:location_code) 
    AND a.last_download_date = :last_download_date 
    AND a.last_download_date >= :last_download_date_1 
    AND a.last_download_date <= :last_download_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.SALES_HINBAN, a.HINBAN
