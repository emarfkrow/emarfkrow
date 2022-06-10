SELECT
      a.*
FROM
    MST_LOCATION a 
WHERE
    1 = 1 
    AND TRIM (a."LOCATION_CODE") IN (:location_code) 
    AND a."LOCATION_NAME" LIKE '%' || :location_name || '%' 
    AND a."LOC_KBN" IN (:loc_kbn) 
    AND a."LOC_STATUS" = :loc_status 
    AND a."LOC_ENABLE" = :loc_enable 
    AND TRIM (a."SUB_INV_CODE") IN (:sub_inv_code) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
    AND a."AREA_CD" = :area_cd 
    AND a."STORE_MAN_ID" = :store_man_id 
ORDER BY
    a."LOCATION_CODE"
