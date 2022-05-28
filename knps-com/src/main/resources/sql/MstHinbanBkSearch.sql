SELECT
      a.*
    , (SELECT r1.UNIT_NAME FROM MST_UNIT r1 WHERE r1.UNIT_CODE = a.UNIT_CODE) AS UNIT_NAME
    , (SELECT r2.ACCOUNT_NAME FROM MST_ACCOUNT_CODE r2 WHERE r2.ACCOUNT_CODE = a.ACCOUNT_CODE) AS ACCOUNT_NAME
    , (SELECT r3.HINBAN_OPE_NAME FROM MST_HINBAN_EMP r3 WHERE r3.HINBAN_OPE_CODE = a.HINBAN_OPE_CODE) AS HINBAN_OPE_NAME
FROM
    MST_HINBAN_BK a 
WHERE
    1 = 1 
    AND TRIM (a.yy) = TRIM (:yy) 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.hinban_code IN (:hinban_code) 
    AND a.item = :item 
    AND a.item_kbn IN (:item_kbn) 
    AND a.shikake_kbn IN (:shikake_kbn) 
    AND a.lot_size = :lot_size 
    AND a.counts = :counts 
    AND a.unit_code IN (:unit_code) 
    AND a.account_code IN (:account_code) 
    AND a.supply_change = :supply_change 
    AND a.supply_permission = :supply_permission 
    AND TRIM (a.off_post_no) = TRIM (:off_post_no) 
    AND TRIM (a.isuue_post_no) = TRIM (:isuue_post_no) 
    AND TRIM (a.store_no) = TRIM (:store_no) 
    AND a.stocks_kind_kbn IN (:stocks_kind_kbn) 
    AND a.hingun_kbn IN (:hingun_kbn) 
    AND a.elec_inv_control = :elec_inv_control 
    AND a.rest_article_kbn IN (:rest_article_kbn) 
    AND a.rest_article_max = :rest_article_max 
    AND a.cost_amount_kbn IN (:cost_amount_kbn) 
    AND a.f_cost_amount_kbn IN (:f_cost_amount_kbn) 
    AND a.s_cost_amount_kbn IN (:s_cost_amount_kbn) 
    AND a.hinban_ope_code IN (:hinban_ope_code) 
    AND CASE WHEN a.permission_flag IS NULL THEN '0' ELSE TO_CHAR (a.permission_flag) END IN (:permission_flag) 
    AND TRIM (a.version) = TRIM (:version) 
    AND a.plan_code IN (:plan_code) 
    AND a.poison_kbn IN (:poison_kbn) 
    AND TRIM (a.material) = TRIM (:material) 
    AND a.material_size = :material_size 
    AND a.maker = :maker 
    AND TRIM (a.material_recycle) = TRIM (:material_recycle) 
    AND a.maker_simuke = :maker_simuke 
    AND a.maker_weight = :maker_weight 
    AND a.act_inv_first = :act_inv_first 
    AND a.act_inv_last = :act_inv_last 
    AND a.sup_unit = :sup_unit 
    AND a.sup_unit >= :sup_unit_1 
    AND a.sup_unit <= :sup_unit_2 
    AND a.routing_def_group = :routing_def_group 
    AND a.cost_calculate_group = :cost_calculate_group 
    AND TRIM (a.kbn1) = TRIM (:kbn1) 
    AND TRIM (a.kbn2) = TRIM (:kbn2) 
    AND TRIM (a.kbn3) = TRIM (:kbn3) 
    AND TRIM (a.stock_status) = TRIM (:stock_status) 
    AND TRIM (a.stock_status_date) = TRIM (:stock_status_date) 
    AND a.stock_status_date >= :stock_status_date_1 
    AND a.stock_status_date <= :stock_status_date_2 
    AND CASE WHEN a.print_structure_flg IS NULL THEN '0' ELSE TO_CHAR (a.print_structure_flg) END IN (:print_structure_flg) 
    AND CASE WHEN a.print_work_flow_flg IS NULL THEN '0' ELSE TO_CHAR (a.print_work_flow_flg) END IN (:print_work_flow_flg) 
    AND CASE WHEN a.print_work_result_flg IS NULL THEN '0' ELSE TO_CHAR (a.print_work_result_flg) END IN (:print_work_result_flg) 
    AND CASE WHEN a.print_ship_sheet_flg IS NULL THEN '0' ELSE TO_CHAR (a.print_ship_sheet_flg) END IN (:print_ship_sheet_flg) 
    AND CASE WHEN a.print_inspect_flg IS NULL THEN '0' ELSE TO_CHAR (a.print_inspect_flg) END IN (:print_inspect_flg) 
    AND CASE WHEN a.print_product_box_flg IS NULL THEN '0' ELSE TO_CHAR (a.print_product_box_flg) END IN (:print_product_box_flg) 
    AND CASE WHEN a.print_hinban_struct_flg IS NULL THEN '0' ELSE TO_CHAR (a.print_hinban_struct_flg) END IN (:print_hinban_struct_flg) 
    AND CASE WHEN a.semi_product_flg IS NULL THEN '0' ELSE TO_CHAR (a.semi_product_flg) END IN (:semi_product_flg) 
    AND a.stock_management_section = :stock_management_section 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND a.total_lt = :total_lt 
    AND a.company_div_code IN (:company_div_code) 
    AND a.kbn4 = :kbn4 
    AND a.kbn5 = :kbn5 
    AND a.kbn6 = :kbn6 
    AND a.rohs = :rohs 
    AND a.tantai_lt = :tantai_lt 
    AND a.tsukesu = :tsukesu 
    AND a.ex_tax_rate = :ex_tax_rate 
    AND a.memo = :memo 
    AND a.haiban_kbn IN (:haiban_kbn) 
    AND TRIM (a.haiban_ym) = TRIM (:haiban_ym) 
    AND a.haiban_ym >= :haiban_ym_1 
    AND a.haiban_ym <= :haiban_ym_2 
ORDER BY
    a.HINBAN, a.YY
