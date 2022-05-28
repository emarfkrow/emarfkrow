SELECT
      a.*
FROM
    MST_SALES_HINBAN_MASTER a 
WHERE
    1 = 1 
    AND TRIM (a.sales_hinban) = TRIM (:sales_hinban) 
    AND a.low_level_code IN (:low_level_code) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
    AND a.hinban_code IN (:hinban_code) 
    AND TRIM (a.item) = TRIM (:item) 
    AND TRIM (a.set_kbn) IN (:set_kbn) 
    AND TRIM (a.strategy_pro_kbn) IN (:strategy_pro_kbn) 
    AND TRIM (a.order_ban_kbn) IN (:order_ban_kbn) 
    AND TRIM (a.resale_ban_kbn) IN (:resale_ban_kbn) 
    AND TRIM (a.warehousing_ban_kbn) IN (:warehousing_ban_kbn) 
    AND TRIM (a.product_kbn) IN (:product_kbn) 
    AND TRIM (a.ship_instructions_kbn) IN (:ship_instructions_kbn) 
    AND a.product_class = :product_class 
    AND a.standard_stock = :standard_stock 
    AND a.product_weight = :product_weight 
    AND a.location_no = :location_no 
    AND a.package_code IN (:package_code) 
    AND a.package_unit = :package_unit 
    AND a.package_unit >= :package_unit_1 
    AND a.package_unit <= :package_unit_2 
    AND TRIM (a.package_shortage_kbn) IN (:package_shortage_kbn) 
    AND TRIM (a.packing_kbn) IN (:packing_kbn) 
    AND TRIM (a.knban_lot_kbn) IN (:knban_lot_kbn) 
    AND TRIM (a.jis_kbn) IN (:jis_kbn) 
    AND a.set_standard_time = :set_standard_time 
    AND a.end_period_cost = :end_period_cost 
    AND a.standard_cost = :standard_cost 
    AND a.second_eval_cost = :second_eval_cost 
    AND a.standard_price = :standard_price 
    AND a.master_regist_date = :master_regist_date 
    AND a.master_regist_date >= :master_regist_date_1 
    AND a.master_regist_date <= :master_regist_date_2 
    AND a.product_sale_date = :product_sale_date 
    AND a.product_sale_date >= :product_sale_date_1 
    AND a.product_sale_date <= :product_sale_date_2 
    AND TRIM (a.ship_target_kbn) IN (:ship_target_kbn) 
    AND a.new_product_class = :new_product_class 
    AND TRIM (a.diy_classic_kbn) IN (:diy_classic_kbn) 
    AND TRIM (a.stock_order_kbn) IN (:stock_order_kbn) 
    AND a.product_ope_code IN (:product_ope_code) 
    AND TRIM (a.direct_delivery_cancel_ng_kbn) IN (:direct_delivery_cancel_ng_kbn) 
    AND TRIM (a.production_stop_kbn) IN (:production_stop_kbn) 
    AND a.variety_class4 = :variety_class4 
    AND TRIM (a.yobi2) = TRIM (:yobi2) 
    AND a.barcode = :barcode 
    AND TRIM (a.data_send_kbn) IN (:data_send_kbn) 
    AND TRIM (a.yobi3) = TRIM (:yobi3) 
    AND TRIM (a.upc_code) IN (:upc_code) 
    AND a.normal_1_stock = :normal_1_stock 
    AND a.normal_2_stock = :normal_2_stock 
    AND a.normal_3_stock = :normal_3_stock 
    AND a.normal_4_stock = :normal_4_stock 
    AND a.normal_5_stock = :normal_5_stock 
    AND a.normal_1_instructions = :normal_1_instructions 
    AND a.normal_2_instructions = :normal_2_instructions 
    AND a.normal_3_instructions = :normal_3_instructions 
    AND a.normal_4_instructions = :normal_4_instructions 
    AND a.normal_1_provision = :normal_1_provision 
    AND a.normal_2_provision = :normal_2_provision 
    AND a.normal_3_provision = :normal_3_provision 
    AND a.normal_4_provision = :normal_4_provision 
    AND a.comm_this_month_leftorcer = :comm_this_month_leftorcer 
    AND a.comm_next_month_leftorcer = :comm_next_month_leftorcer 
    AND a.comm_two_next_month_leftorcer = :comm_two_next_month_leftorcer 
    AND a.exp_this_month_leftorcer = :exp_this_month_leftorcer 
    AND a.exp_next_month_leftorcer = :exp_next_month_leftorcer 
    AND a.exp_two_next_month_leftorcer = :exp_two_next_month_leftorcer 
    AND a.diy_this_month_leftorcer = :diy_this_month_leftorcer 
    AND a.diy_next_month_leftorcer = :diy_next_month_leftorcer 
    AND a.diy_two_next_month_leftorcer = :diy_two_next_month_leftorcer 
    AND a.normal_1_warehousing_plan = :normal_1_warehousing_plan 
    AND a.normal_2_warehousing_plan = :normal_2_warehousing_plan 
    AND a.normal_3_warehousing_plan = :normal_3_warehousing_plan 
    AND a.normal_4_warehousing_plan = :normal_4_warehousing_plan 
    AND a.sapporo_stock = :sapporo_stock 
    AND a.sendai_stock = :sendai_stock 
    AND a.tokyo_stock = :tokyo_stock 
    AND a.kantou_stock = :kantou_stock 
    AND a.kanazawa_stock = :kanazawa_stock 
    AND a.nagoya_stock = :nagoya_stock 
    AND a.kinki_stock = :kinki_stock 
    AND a.hiroshima_stock = :hiroshima_stock 
    AND a.hukuoka_stock = :hukuoka_stock 
    AND a.business_stock = :business_stock 
    AND a.trade_stock = :trade_stock 
    AND a.high_tech_stock = :high_tech_stock 
    AND a.trade_consig_stock = :trade_consig_stock 
    AND a.shanghai_ktc_bonded_stock = :shanghai_ktc_bonded_stock 
    AND a.package_material_stock = :package_material_stock 
    AND a.product_end_plan_date = :product_end_plan_date 
    AND a.product_end_plan_date >= :product_end_plan_date_1 
    AND a.product_end_plan_date <= :product_end_plan_date_2 
    AND a.product_end_date = :product_end_date 
    AND a.product_end_date >= :product_end_date_1 
    AND a.product_end_date <= :product_end_date_2 
    AND TRIM (a.alternative_hinban1) = TRIM (:alternative_hinban1) 
    AND TRIM (a.alternative_hinban2) = TRIM (:alternative_hinban2) 
    AND TRIM (a.nouki_answer_ng_kbn) IN (:nouki_answer_ng_kbn) 
    AND TRIM (a.direct_delivery_target_kbn) IN (:direct_delivery_target_kbn) 
    AND TRIM (a.yobi) = TRIM (:yobi) 
ORDER BY
    a.SALES_HINBAN
