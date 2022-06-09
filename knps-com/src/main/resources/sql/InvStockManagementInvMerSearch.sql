SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
    , (SELECT r2."SUB_INV_NAME" FROM MST_SUBINV r2 WHERE r2."SUB_INV_CODE" = a."SUB_INV_CODE") AS "SUB_INV_NAME"
FROM
    INV_STOCK_MANAGEMENT_INV_MER a 
WHERE
    1 = 1 
    AND a."INV_PHASE" = :inv_phase 
    AND a."INV_PHASE_MONTH" = :inv_phase_month 
    AND a."STOCK_MANAGEMENT_SECTION" = :stock_management_section 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."SUB_INV_CODE") IN (:sub_inv_code) 
    AND a."INV_STOCK" = :inv_stock 
    AND a."STOCK" = :stock 
    AND a."UNIT_COST" = :unit_cost 
    AND a."LAST_IN_OUT_DATE" = :last_in_out_date 
    AND a."LAST_IN_OUT_DATE" >= :last_in_out_date_1 
    AND a."LAST_IN_OUT_DATE" <= :last_in_out_date_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_FLAG") END IN (:delete_flag) 
ORDER BY
    a."HINBAN", a."SUB_INV_CODE", a."STOCK_MANAGEMENT_SECTION", a."INV_PHASE", a."INV_PHASE_MONTH"
