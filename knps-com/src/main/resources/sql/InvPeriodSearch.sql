SELECT
      a.*
    , (SELECT r1.SUB_INV_NAME FROM MST_SUBINV r1 WHERE r1.SUB_INV_CODE = a.SUB_INV_CODE) AS SUB_INV_NAME
FROM
    INV_PERIOD a 
WHERE
    1 = 1 
    AND a.stock_management_section = :stock_management_section 
    AND a.inv_phase = :inv_phase 
    AND a.inv_phase_month = :inv_phase_month 
    AND a.sub_inv_code IN (:sub_inv_code) 
    AND a.inv_date_from = :inv_date_from 
    AND a.inv_date_to = :inv_date_to 
    AND a.inv_status = :inv_status 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.STOCK_MANAGEMENT_SECTION, a.INV_PHASE, a.INV_PHASE_MONTH, a.SUB_INV_CODE
