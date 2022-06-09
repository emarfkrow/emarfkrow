SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HINBAN") AS "ITEM"
    , (SELECT r2."SUP_NAME" FROM MST_SUPPLIER r2 WHERE r2."SUP_CODE" = a."SUP_CODE") AS "SUP_NAME"
FROM
    PCH_SUPPLY_SCH a 
WHERE
    1 = 1 
    AND TRIM (a."SUPPLY_NO") = TRIM (:supply_no) 
    AND TRIM (a."SUPPLY_ORDER_NO") = TRIM (:supply_order_no) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."SUPPLY_KBN" IN (:supply_kbn) 
    AND a."SUPPLY_UNIT" = :supply_unit 
    AND a."SUPPLY_UNIT" >= :supply_unit_1 
    AND a."SUPPLY_UNIT" <= :supply_unit_2 
    AND a."SUPPLY_COUNTS" = :supply_counts 
    AND a."SUPPLY_COUNTS" >= :supply_counts_1 
    AND a."SUPPLY_COUNTS" <= :supply_counts_2 
    AND a."ACT_SUPPLY_COUNTS" = :act_supply_counts 
    AND a."ACT_SUPPLY_COUNTS" >= :act_supply_counts_1 
    AND a."ACT_SUPPLY_COUNTS" <= :act_supply_counts_2 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND a."SUPPLY_DATE" = :supply_date 
    AND a."SUPPLY_DATE" >= :supply_date_1 
    AND a."SUPPLY_DATE" <= :supply_date_2 
    AND a."SUPPLY_VERIFY_STAT" = :supply_verify_stat 
    AND TRIM (a."USER_ID_VERIFY") = TRIM (:user_id_verify) 
    AND a."SUPPLY_ISSUE_STAT" = :supply_issue_stat 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."SUPPLY_NO"
