SELECT
      a.*
FROM
    INV_SALES_INVENTORY a 
WHERE
    1 = 1 
    AND TRIM (a."SALES_HINBAN") = TRIM (:sales_hinban) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."INVENTORY" = :inventory 
    AND TRIM (a."LOCATION_CODE") IN (:location_code) 
    AND a."LAST_DOWNLOAD_DATE" = :last_download_date 
    AND a."LAST_DOWNLOAD_DATE" >= :last_download_date_1 
    AND a."LAST_DOWNLOAD_DATE" <= :last_download_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."SALES_HINBAN", a."HINBAN"
