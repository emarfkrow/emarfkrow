SELECT
      a.*
    , (SELECT r1.SUB_INV_NAME FROM MST_SUBINV r1 WHERE r1.SUB_INV_CODE = a.SUB_INV_CODE) AS SUB_INV_NAME
FROM
    MST_AREA a 
WHERE
    1 = 1 
    AND a.area_cd = :area_cd 
    AND a.area_mei LIKE '%' || :area_mei || '%' 
    AND a.sub_inv_code IN (:sub_inv_code) 
    AND CASE WHEN a.delete_f IS NULL THEN '0' ELSE TO_CHAR (a.delete_f) END IN (:delete_f) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.AREA_CD
