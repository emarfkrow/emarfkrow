SELECT
      a.*
    , (SELECT r1.SUB_INV_NAME FROM MST_SUBINV r1 WHERE r1.SUB_INV_CODE = a."SUB_INV_CODE") AS SUB_INV_NAME
FROM
    INV_PERIOD a 
WHERE
    1 = 1 
    AND a."STOCK_MANAGEMENT_SECTION" = :stock_management_section 
    AND a."INV_PHASE" = :inv_phase 
    AND a."INV_PHASE_MONTH" = :inv_phase_month 
    AND TRIM (a."SUB_INV_CODE") IN (:sub_inv_code) 
    AND a."INV_DATE_FROM" = :inv_date_from 
    AND a."INV_DATE_TO" = :inv_date_to 
    AND a."INV_STATUS" = :inv_status 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."STOCK_MANAGEMENT_SECTION", a."INV_PHASE", a."INV_PHASE_MONTH", a."SUB_INV_CODE"
