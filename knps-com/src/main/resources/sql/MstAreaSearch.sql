SELECT
      a.*
FROM
    MST_AREA a 
WHERE
    1 = 1 
    AND a."AREA_CD" = :area_cd 
    AND a."AREA_MEI" LIKE '%' || :area_mei || '%' 
    AND a."SUB_INV_CODE" IN (:sub_inv_code) 
    AND CASE WHEN a."DELETE_F" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_F") END IN (:delete_f) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."AREA_CD"
