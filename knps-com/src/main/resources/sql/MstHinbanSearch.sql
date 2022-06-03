SELECT
      a.*
    , (SELECT r1.UNIT_NAME FROM MST_UNIT r1 WHERE r1.UNIT_CODE = a."UNIT_CODE") AS UNIT_NAME
    , (SELECT r2.ACCOUNT_NAME FROM MST_ACCOUNT_CODE r2 WHERE r2.ACCOUNT_CODE = a."ACCOUNT_CODE") AS ACCOUNT_NAME
    , (SELECT r3.HINBAN_OPE_NAME FROM MST_HINBAN_EMP r3 WHERE r3.HINBAN_OPE_CODE = a."HINBAN_OPE_CODE") AS HINBAN_OPE_NAME
FROM
    MST_HINBAN a 
WHERE
    1 = 1 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."HINBAN_CODE") IN (:hinban_code) 
    AND a."ITEM" = :item 
    AND a."ITEM_KBN" IN (:item_kbn) 
    AND TRIM (a."SHIKAKE_KBN") IN (:shikake_kbn) 
    AND a."LOT_SIZE" = :lot_size 
    AND a."COUNTS" = :counts 
    AND TRIM (a."UNIT_CODE") IN (:unit_code) 
    AND TRIM (a."ACCOUNT_CODE") IN (:account_code) 
    AND a."SUPPLY_CHANGE" = :supply_change 
    AND a."SUPPLY_PERMISSION" = :supply_permission 
    AND TRIM (a."OFF_POST_NO") = TRIM (:off_post_no) 
    AND TRIM (a."ISUUE_POST_NO") = TRIM (:isuue_post_no) 
    AND TRIM (a."STORE_NO") = TRIM (:store_no) 
    AND a."STOCKS_KIND_KBN" IN (:stocks_kind_kbn) 
    AND a."HINGUN_KBN" IN (:hingun_kbn) 
    AND a."ELEC_INV_CONTROL" = :elec_inv_control 
    AND a."REST_ARTICLE_KBN" IN (:rest_article_kbn) 
    AND a."REST_ARTICLE_MAX" = :rest_article_max 
    AND a."COST_AMOUNT_KBN" IN (:cost_amount_kbn) 
    AND a."F_COST_AMOUNT_KBN" IN (:f_cost_amount_kbn) 
    AND a."S_COST_AMOUNT_KBN" IN (:s_cost_amount_kbn) 
    AND TRIM (a."HINBAN_OPE_CODE") IN (:hinban_ope_code) 
    AND CASE WHEN a."PERMISSION_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.PERMISSION_FLAG) END IN (:permission_flag) 
    AND TRIM (a."VERSION") = TRIM (:version) 
    AND a."PLAN_CODE" IN (:plan_code) 
    AND a."POISON_KBN" IN (:poison_kbn) 
    AND TRIM (a."MATERIAL") = TRIM (:material) 
    AND a."MATERIAL_SIZE" = :material_size 
    AND a."MAKER" = :maker 
    AND TRIM (a."MATERIAL_RECYCLE") = TRIM (:material_recycle) 
    AND a."MAKER_SIMUKE" = :maker_simuke 
    AND a."MAKER_WEIGHT" = :maker_weight 
    AND a."ACT_INV_FIRST" = :act_inv_first 
    AND a."ACT_INV_LAST" = :act_inv_last 
    AND a."SUP_UNIT" = :sup_unit 
    AND a."SUP_UNIT" >= :sup_unit_1 
    AND a."SUP_UNIT" <= :sup_unit_2 
    AND a."ROUTING_DEF_GROUP" = :routing_def_group 
    AND a."COST_CALCULATE_GROUP" = :cost_calculate_group 
    AND TRIM (a."KBN1") = TRIM (:kbn1) 
    AND TRIM (a."KBN2") = TRIM (:kbn2) 
    AND TRIM (a."KBN3") = TRIM (:kbn3) 
    AND TRIM (a."STOCK_STATUS") = TRIM (:stock_status) 
    AND TRIM (a."STOCK_STATUS_DATE") = TRIM (:stock_status_date) 
    AND a."STOCK_STATUS_DATE" >= :stock_status_date_1 
    AND a."STOCK_STATUS_DATE" <= :stock_status_date_2 
    AND CASE WHEN a."PRINT_STRUCTURE_FLG" IS NULL THEN '0' ELSE TO_CHAR (a.PRINT_STRUCTURE_FLG) END IN (:print_structure_flg) 
    AND CASE WHEN a."PRINT_WORK_FLOW_FLG" IS NULL THEN '0' ELSE TO_CHAR (a.PRINT_WORK_FLOW_FLG) END IN (:print_work_flow_flg) 
    AND CASE WHEN a."PRINT_WORK_RESULT_FLG" IS NULL THEN '0' ELSE TO_CHAR (a.PRINT_WORK_RESULT_FLG) END IN (:print_work_result_flg) 
    AND CASE WHEN a."PRINT_SHIP_SHEET_FLG" IS NULL THEN '0' ELSE TO_CHAR (a.PRINT_SHIP_SHEET_FLG) END IN (:print_ship_sheet_flg) 
    AND CASE WHEN a."PRINT_INSPECT_FLG" IS NULL THEN '0' ELSE TO_CHAR (a.PRINT_INSPECT_FLG) END IN (:print_inspect_flg) 
    AND CASE WHEN a."PRINT_PRODUCT_BOX_FLG" IS NULL THEN '0' ELSE TO_CHAR (a.PRINT_PRODUCT_BOX_FLG) END IN (:print_product_box_flg) 
    AND CASE WHEN a."PRINT_HINBAN_STRUCT_FLG" IS NULL THEN '0' ELSE TO_CHAR (a.PRINT_HINBAN_STRUCT_FLG) END IN (:print_hinban_struct_flg) 
    AND CASE WHEN a."SEMI_PRODUCT_FLG" IS NULL THEN '0' ELSE TO_CHAR (a.SEMI_PRODUCT_FLG) END IN (:semi_product_flg) 
    AND a."STOCK_MANAGEMENT_SECTION" = :stock_management_section 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND a."TOTAL_LT" = :total_lt 
    AND TRIM (a."COMPANY_DIV_CODE") IN (:company_div_code) 
    AND a."KBN4" = :kbn4 
    AND a."KBN5" = :kbn5 
    AND a."KBN6" = :kbn6 
    AND a."ROHS" = :rohs 
    AND a."TANTAI_LT" = :tantai_lt 
    AND a."TSUKESU" = :tsukesu 
    AND a."EX_TAX_RATE" = :ex_tax_rate 
    AND a."MEMO" = :memo 
    AND TRIM (a."HAIBAN_KBN") IN (:haiban_kbn) 
    AND TRIM (a."HAIBAN_YM") = TRIM (:haiban_ym) 
    AND a."HAIBAN_YM" >= :haiban_ym_1 
    AND a."HAIBAN_YM" <= :haiban_ym_2 
ORDER BY
    a."HINBAN"
