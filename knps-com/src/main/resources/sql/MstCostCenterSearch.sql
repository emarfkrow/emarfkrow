SELECT
      a.*
    , (SELECT r1.SUP_NAME FROM MST_SUPPLIER r1 WHERE r1.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    MST_COST_CENTER a 
WHERE
    1 = 1 
    AND a.cost_center_code IN (:cost_center_code) 
    AND a.cost_center_name LIKE '%' || :cost_center_name || '%' 
    AND a.in_out_kbn IN (:in_out_kbn) 
    AND a.sup_code IN (:sup_code) 
    AND a.cost_rate_kbn IN (:cost_rate_kbn) 
    AND a.cost_rate_code IN (:cost_rate_code) 
    AND a.cost_collect = :cost_collect 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.COST_CENTER_CODE
