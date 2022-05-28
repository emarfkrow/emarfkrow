SELECT
      a.*
    , (SELECT r1.SUB_INV_NAME FROM MST_SUBINV r1 WHERE r1.SUB_INV_CODE = a.SUB_INV_CODE) AS SUB_INV_NAME
FROM
    INV_STOCK_MTRL_MNG a 
WHERE
    1 = 1 
    AND a.stock_management_section = :stock_management_section 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND TRIM (a.sub_inv_code) IN (:sub_inv_code) 
    AND a.stock = :stock 
    AND TRIM (a.main_stock_code) IN (:main_stock_code) 
    AND a.last_in_out_date = :last_in_out_date 
    AND a.last_in_out_date >= :last_in_out_date_1 
    AND a.last_in_out_date <= :last_in_out_date_2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.HINBAN, a.SUB_INV_CODE, a.STOCK_MANAGEMENT_SECTION
