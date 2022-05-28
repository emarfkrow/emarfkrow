SELECT
      a.*
    , (SELECT r1.SUB_INV_NAME FROM MST_SUBINV r1 WHERE r1.SUB_INV_CODE = a.SUB_INV_CODE) AS SUB_INV_NAME
    , (SELECT r2.STORE_MAN_MEI FROM MST_STORE_MAN r2 WHERE r2.STORE_MAN_ID = a.STORE_MAN_ID) AS STORE_MAN_MEI
FROM
    MST_LOCATION a 
WHERE
    1 = 1 
    AND a.location_code IN (:location_code) 
    AND a.location_name LIKE '%' || :location_name || '%' 
    AND a.loc_kbn IN (:loc_kbn) 
    AND a.loc_status = :loc_status 
    AND a.loc_enable = :loc_enable 
    AND a.sub_inv_code IN (:sub_inv_code) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND a.area_cd = :area_cd 
    AND a.store_man_id = :store_man_id 
ORDER BY
    a.LOCATION_CODE
