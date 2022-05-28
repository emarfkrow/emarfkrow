SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    MST_SUBINV a 
WHERE
    1 = 1 
    AND a.sub_inv_code IN (:sub_inv_code) 
    AND a.sub_inv_name LIKE '%' || :sub_inv_name || '%' 
    AND a.manage_kbn IN (:manage_kbn) 
    AND a.in_out_kbn IN (:in_out_kbn) 
    AND a.sup_code IN (:sup_code) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.SUB_INV_CODE
