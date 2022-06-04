SELECT
      a.*
    , (SELECT r1."WC_NAME" FROM MST_WC r1 WHERE r1."WC_CODE" = a."WC_CODE") AS "WC_NAME"
    , (SELECT r2."UNIT_NAME" FROM MST_UNIT r2 WHERE r2."UNIT_CODE" = a."UNIT_CODE") AS "UNIT_NAME"
    , (SELECT r3."SUP_NAME" FROM MST_SUPPLIER r3 WHERE r3."SUP_CODE" = a."SUP_CODE") AS "SUP_NAME"
FROM
    PCH_ORDER_INF a 
WHERE
    1 = 1 
    AND TRIM (a."ORDER_NO") = TRIM (:order_no) 
    AND a."ORDER_KBN" IN (:order_kbn) 
    AND TRIM (a."ORDER_ID") = TRIM (:order_id) 
    AND TRIM (a."ARRANGE_KBN") IN (:arrange_kbn) 
    AND TRIM (a."KANBAN_ID") = TRIM (:kanban_id) 
    AND a."SERIAL_NO" = :serial_no 
    AND a."ROUTING" = :routing 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND a."COMMENT1" = :comment1 
    AND a."COMMENT2" = :comment2 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ORDER_COUNTS" = :order_counts 
    AND a."ORDER_COUNTS" >= :order_counts_1 
    AND a."ORDER_COUNTS" <= :order_counts_2 
    AND TRIM (a."UNIT_CODE") IN (:unit_code) 
    AND a."MEMO" = :memo 
    AND a."PERIOD" = :period 
    AND a."PERIOD_CHG" = :period_chg 
    AND a."ORDER_LT" = :order_lt 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND TRIM (a."SUBINV_CODE") IN (:subinv_code) 
    AND TRIM (a."SHIP_CODE") IN (:ship_code) 
    AND a."ORDER_UNIT" = :order_unit 
    AND a."ORDER_UNIT" >= :order_unit_1 
    AND a."ORDER_UNIT" <= :order_unit_2 
    AND a."ACCEPT_KBN" IN (:accept_kbn) 
    AND a."INSPECT_LANE" = :inspect_lane 
    AND a."INSPECT_KBN" IN (:inspect_kbn) 
    AND TRIM (a."REQUEST_REGIST") = TRIM (:request_regist) 
    AND a."REQUEST_DATE" = :request_date 
    AND a."REQUEST_DATE" >= :request_date_1 
    AND a."REQUEST_DATE" <= :request_date_2 
    AND TRIM (a."ORDER_REGIST") = TRIM (:order_regist) 
    AND a."ORDER_DATE" = :order_date 
    AND a."ORDER_DATE" >= :order_date_1 
    AND a."ORDER_DATE" <= :order_date_2 
    AND a."ORDER_STATUS" = :order_status 
    AND a."ACCEPT_DATE" = :accept_date 
    AND a."ACCEPT_DATE" >= :accept_date_1 
    AND a."ACCEPT_DATE" <= :accept_date_2 
    AND TRIM (a."ACCEPT_REGIST") = TRIM (:accept_regist) 
    AND a."ACCEPT_COUNTS" = :accept_counts 
    AND a."ACCEPT_COUNTS" >= :accept_counts_1 
    AND a."ACCEPT_COUNTS" <= :accept_counts_2 
    AND a."INSPECT_DATE" = :inspect_date 
    AND a."INSPECT_DATE" >= :inspect_date_1 
    AND a."INSPECT_DATE" <= :inspect_date_2 
    AND TRIM (a."INSPECT_REGIST") = TRIM (:inspect_regist) 
    AND a."INSPECT_COUNTS" = :inspect_counts 
    AND a."INSPECT_COUNTS" >= :inspect_counts_1 
    AND a."INSPECT_COUNTS" <= :inspect_counts_2 
    AND a."GOOD_COUNTS" = :good_counts 
    AND a."GOOD_COUNTS" >= :good_counts_1 
    AND a."GOOD_COUNTS" <= :good_counts_2 
    AND a."REJECT_COUNTS" = :reject_counts 
    AND a."REJECT_COUNTS" >= :reject_counts_1 
    AND a."REJECT_COUNTS" <= :reject_counts_2 
    AND a."INSPECT_UNIT" = :inspect_unit 
    AND a."INSPECT_UNIT" >= :inspect_unit_1 
    AND a."INSPECT_UNIT" <= :inspect_unit_2 
    AND TRIM (a."REJECT_REASON") = TRIM (:reject_reason) 
    AND TRIM (a."RETURN_REASON") = TRIM (:return_reason) 
    AND a."PERIOD_CHG_COUNTS" = :period_chg_counts 
    AND a."PERIOD_CHG_COUNTS" >= :period_chg_counts_1 
    AND a."PERIOD_CHG_COUNTS" <= :period_chg_counts_2 
    AND a."OUTPUT_STATUS" = :output_status 
    AND a."SHORT_NO" = :short_no 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND a."ORG_ORDER_UNIT" = :org_order_unit 
    AND a."ORG_ORDER_UNIT" >= :org_order_unit_1 
    AND a."ORG_ORDER_UNIT" <= :org_order_unit_2 
    AND CASE WHEN a."MUSHO_HACCHU_F" IS NULL THEN '0' ELSE TO_CHAR (a."MUSHO_HACCHU_F") END IN (:musho_hacchu_f) 
    AND a."SUP_MEMO" = :sup_memo 
    AND TRIM (a."SHIHARAI_HOHO_KBN") IN (:shiharai_hoho_kbn) 
    AND CASE WHEN a."ORDER_ISSHIKI_UNIT_F" IS NULL THEN '0' ELSE TO_CHAR (a."ORDER_ISSHIKI_UNIT_F") END IN (:order_isshiki_unit_f) 
    AND a."ORDER_ISSHIKI_COUNTS" = :order_isshiki_counts 
    AND a."ORDER_ISSHIKI_COUNTS" >= :order_isshiki_counts_1 
    AND a."ORDER_ISSHIKI_COUNTS" <= :order_isshiki_counts_2 
    AND a."ORDER_ISSHIKI_UNIT" = :order_isshiki_unit 
    AND a."ORDER_ISSHIKI_UNIT" >= :order_isshiki_unit_1 
    AND a."ORDER_ISSHIKI_UNIT" <= :order_isshiki_unit_2 
    AND CASE WHEN a."INSPECT_ISSHIKI_UNIT_F" IS NULL THEN '0' ELSE TO_CHAR (a."INSPECT_ISSHIKI_UNIT_F") END IN (:inspect_isshiki_unit_f) 
    AND a."INSPECT_ISSHIKI_COUNTS" = :inspect_isshiki_counts 
    AND a."INSPECT_ISSHIKI_COUNTS" >= :inspect_isshiki_counts_1 
    AND a."INSPECT_ISSHIKI_COUNTS" <= :inspect_isshiki_counts_2 
    AND a."INSPECT_ISSHIKI_UNIT" = :inspect_isshiki_unit 
    AND a."INSPECT_ISSHIKI_UNIT" >= :inspect_isshiki_unit_1 
    AND a."INSPECT_ISSHIKI_UNIT" <= :inspect_isshiki_unit_2 
    AND a."ORG_BASE_ORDER_UNIT" = :org_base_order_unit 
    AND a."ORG_BASE_ORDER_UNIT" >= :org_base_order_unit_1 
    AND a."ORG_BASE_ORDER_UNIT" <= :org_base_order_unit_2 
    AND a."ORG_MIN_ORDER_AMOUNT" = :org_min_order_amount 
    AND a."ORG_MIN_ORDER_AMOUNT" >= :org_min_order_amount_1 
    AND a."ORG_MIN_ORDER_AMOUNT" <= :org_min_order_amount_2 
ORDER BY
    a."ORDER_NO"
