SELECT
      a.*
FROM
    MST_SALES_HINBAN_MASTER a 
WHERE
    1 = 1 
    AND TRIM (a."SALES_HINBAN") = TRIM (:sales_hinban) 
    AND a."LOW_LEVEL_CODE" IN (:low_level_code) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
    AND a."HINBAN_CODE" IN (:hinban_code) 
    AND TRIM (a."ITEM") = TRIM (:item) 
    AND TRIM (a."SET_KBN") IN (:set_kbn) 
    AND TRIM (a."STRATEGY_PRO_KBN") IN (:strategy_pro_kbn) 
    AND TRIM (a."ORDER_BAN_KBN") IN (:order_ban_kbn) 
    AND TRIM (a."RESALE_BAN_KBN") IN (:resale_ban_kbn) 
    AND TRIM (a."WAREHOUSING_BAN_KBN") IN (:warehousing_ban_kbn) 
    AND TRIM (a."PRODUCT_KBN") IN (:product_kbn) 
    AND TRIM (a."SHIP_INSTRUCTIONS_KBN") IN (:ship_instructions_kbn) 
    AND a."PRODUCT_CLASS" = :product_class 
    AND a."STANDARD_STOCK" = :standard_stock 
    AND a."PRODUCT_WEIGHT" = :product_weight 
    AND a."LOCATION_NO" = :location_no 
    AND a."PACKAGE_CODE" IN (:package_code) 
    AND a."PACKAGE_UNIT" = :package_unit 
    AND a."PACKAGE_UNIT" >= :package_unit_1 
    AND a."PACKAGE_UNIT" <= :package_unit_2 
    AND TRIM (a."PACKAGE_SHORTAGE_KBN") IN (:package_shortage_kbn) 
    AND TRIM (a."PACKING_KBN") IN (:packing_kbn) 
    AND TRIM (a."KNBAN_LOT_KBN") IN (:knban_lot_kbn) 
    AND TRIM (a."JIS_KBN") IN (:jis_kbn) 
    AND a."SET_STANDARD_TIME" = :set_standard_time 
    AND a."END_PERIOD_COST" = :end_period_cost 
    AND a."STANDARD_COST" = :standard_cost 
    AND a."SECOND_EVAL_COST" = :second_eval_cost 
    AND a."STANDARD_PRICE" = :standard_price 
    AND a."MASTER_REGIST_DATE" = :master_regist_date 
    AND a."MASTER_REGIST_DATE" >= :master_regist_date_1 
    AND a."MASTER_REGIST_DATE" <= :master_regist_date_2 
    AND a."PRODUCT_SALE_DATE" = :product_sale_date 
    AND a."PRODUCT_SALE_DATE" >= :product_sale_date_1 
    AND a."PRODUCT_SALE_DATE" <= :product_sale_date_2 
    AND TRIM (a."SHIP_TARGET_KBN") IN (:ship_target_kbn) 
    AND a."NEW_PRODUCT_CLASS" = :new_product_class 
    AND TRIM (a."DIY_CLASSIC_KBN") IN (:diy_classic_kbn) 
    AND TRIM (a."STOCK_ORDER_KBN") IN (:stock_order_kbn) 
    AND a."PRODUCT_OPE_CODE" IN (:product_ope_code) 
    AND TRIM (a."DIRECT_DELIVERY_CANCEL_NG_KBN") IN (:direct_delivery_cancel_ng_kbn) 
    AND TRIM (a."PRODUCTION_STOP_KBN") IN (:production_stop_kbn) 
    AND a."VARIETY_CLASS4" = :variety_class4 
    AND TRIM (a."YOBI2") = TRIM (:yobi2) 
    AND a."BARCODE" = :barcode 
    AND TRIM (a."DATA_SEND_KBN") IN (:data_send_kbn) 
    AND TRIM (a."YOBI3") = TRIM (:yobi3) 
    AND TRIM (a."UPC_CODE") IN (:upc_code) 
    AND a."NORMAL_1_STOCK" = :normal_1_stock 
    AND a."NORMAL_2_STOCK" = :normal_2_stock 
    AND a."NORMAL_3_STOCK" = :normal_3_stock 
    AND a."NORMAL_4_STOCK" = :normal_4_stock 
    AND a."NORMAL_5_STOCK" = :normal_5_stock 
    AND a."NORMAL_1_INSTRUCTIONS" = :normal_1_instructions 
    AND a."NORMAL_2_INSTRUCTIONS" = :normal_2_instructions 
    AND a."NORMAL_3_INSTRUCTIONS" = :normal_3_instructions 
    AND a."NORMAL_4_INSTRUCTIONS" = :normal_4_instructions 
    AND a."NORMAL_1_PROVISION" = :normal_1_provision 
    AND a."NORMAL_2_PROVISION" = :normal_2_provision 
    AND a."NORMAL_3_PROVISION" = :normal_3_provision 
    AND a."NORMAL_4_PROVISION" = :normal_4_provision 
    AND a."COMM_THIS_MONTH_LEFTORCER" = :comm_this_month_leftorcer 
    AND a."COMM_NEXT_MONTH_LEFTORCER" = :comm_next_month_leftorcer 
    AND a."COMM_TWO_NEXT_MONTH_LEFTORCER" = :comm_two_next_month_leftorcer 
    AND a."EXP_THIS_MONTH_LEFTORCER" = :exp_this_month_leftorcer 
    AND a."EXP_NEXT_MONTH_LEFTORCER" = :exp_next_month_leftorcer 
    AND a."EXP_TWO_NEXT_MONTH_LEFTORCER" = :exp_two_next_month_leftorcer 
    AND a."DIY_THIS_MONTH_LEFTORCER" = :diy_this_month_leftorcer 
    AND a."DIY_NEXT_MONTH_LEFTORCER" = :diy_next_month_leftorcer 
    AND a."DIY_TWO_NEXT_MONTH_LEFTORCER" = :diy_two_next_month_leftorcer 
    AND a."NORMAL_1_WAREHOUSING_PLAN" = :normal_1_warehousing_plan 
    AND a."NORMAL_2_WAREHOUSING_PLAN" = :normal_2_warehousing_plan 
    AND a."NORMAL_3_WAREHOUSING_PLAN" = :normal_3_warehousing_plan 
    AND a."NORMAL_4_WAREHOUSING_PLAN" = :normal_4_warehousing_plan 
    AND a."SAPPORO_STOCK" = :sapporo_stock 
    AND a."SENDAI_STOCK" = :sendai_stock 
    AND a."TOKYO_STOCK" = :tokyo_stock 
    AND a."KANTOU_STOCK" = :kantou_stock 
    AND a."KANAZAWA_STOCK" = :kanazawa_stock 
    AND a."NAGOYA_STOCK" = :nagoya_stock 
    AND a."KINKI_STOCK" = :kinki_stock 
    AND a."HIROSHIMA_STOCK" = :hiroshima_stock 
    AND a."HUKUOKA_STOCK" = :hukuoka_stock 
    AND a."BUSINESS_STOCK" = :business_stock 
    AND a."TRADE_STOCK" = :trade_stock 
    AND a."HIGH_TECH_STOCK" = :high_tech_stock 
    AND a."TRADE_CONSIG_STOCK" = :trade_consig_stock 
    AND a."SHANGHAI_KTC_BONDED_STOCK" = :shanghai_ktc_bonded_stock 
    AND a."PACKAGE_MATERIAL_STOCK" = :package_material_stock 
    AND a."PRODUCT_END_PLAN_DATE" = :product_end_plan_date 
    AND a."PRODUCT_END_PLAN_DATE" >= :product_end_plan_date_1 
    AND a."PRODUCT_END_PLAN_DATE" <= :product_end_plan_date_2 
    AND a."PRODUCT_END_DATE" = :product_end_date 
    AND a."PRODUCT_END_DATE" >= :product_end_date_1 
    AND a."PRODUCT_END_DATE" <= :product_end_date_2 
    AND TRIM (a."ALTERNATIVE_HINBAN1") = TRIM (:alternative_hinban1) 
    AND TRIM (a."ALTERNATIVE_HINBAN2") = TRIM (:alternative_hinban2) 
    AND TRIM (a."NOUKI_ANSWER_NG_KBN") IN (:nouki_answer_ng_kbn) 
    AND TRIM (a."DIRECT_DELIVERY_TARGET_KBN") IN (:direct_delivery_target_kbn) 
    AND TRIM (a."YOBI") = TRIM (:yobi) 
ORDER BY
    a."SALES_HINBAN"
