SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
    , (SELECT r2.UNIT_NAME FROM MST_UNIT r2 WHERE r2.UNIT_CODE = a.UNIT_CODE) AS UNIT_NAME
    , (SELECT r3.SUP_NAME FROM MST_SUPPLIER r3 WHERE r3.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    PCH_ORDER_INF a 
WHERE
    1 = 1 
    AND TRIM (a.order_no) = TRIM (:order_no) 
    AND a.order_kbn IN (:order_kbn) 
    AND TRIM (a.order_id) = TRIM (:order_id) 
    AND TRIM (a.arrange_kbn) IN (:arrange_kbn) 
    AND TRIM (a.kanban_id) = TRIM (:kanban_id) 
    AND a.serial_no = :serial_no 
    AND a.routing = :routing 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND a.comment1 = :comment1 
    AND a.comment2 = :comment2 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.order_counts = :order_counts 
    AND a.order_counts >= :order_counts_1 
    AND a.order_counts <= :order_counts_2 
    AND TRIM (a.unit_code) IN (:unit_code) 
    AND a.memo = :memo 
    AND a.period = :period 
    AND a.period_chg = :period_chg 
    AND a.order_lt = :order_lt 
    AND TRIM (a.sup_code) IN (:sup_code) 
    AND TRIM (a.subinv_code) IN (:subinv_code) 
    AND TRIM (a.ship_code) IN (:ship_code) 
    AND a.order_unit = :order_unit 
    AND a.order_unit >= :order_unit_1 
    AND a.order_unit <= :order_unit_2 
    AND a.accept_kbn IN (:accept_kbn) 
    AND a.inspect_lane = :inspect_lane 
    AND a.inspect_kbn IN (:inspect_kbn) 
    AND TRIM (a.request_regist) = TRIM (:request_regist) 
    AND a.request_date = :request_date 
    AND a.request_date >= :request_date_1 
    AND a.request_date <= :request_date_2 
    AND TRIM (a.order_regist) = TRIM (:order_regist) 
    AND a.order_date = :order_date 
    AND a.order_date >= :order_date_1 
    AND a.order_date <= :order_date_2 
    AND a.order_status = :order_status 
    AND a.accept_date = :accept_date 
    AND a.accept_date >= :accept_date_1 
    AND a.accept_date <= :accept_date_2 
    AND TRIM (a.accept_regist) = TRIM (:accept_regist) 
    AND a.accept_counts = :accept_counts 
    AND a.accept_counts >= :accept_counts_1 
    AND a.accept_counts <= :accept_counts_2 
    AND a.inspect_date = :inspect_date 
    AND a.inspect_date >= :inspect_date_1 
    AND a.inspect_date <= :inspect_date_2 
    AND TRIM (a.inspect_regist) = TRIM (:inspect_regist) 
    AND a.inspect_counts = :inspect_counts 
    AND a.inspect_counts >= :inspect_counts_1 
    AND a.inspect_counts <= :inspect_counts_2 
    AND a.good_counts = :good_counts 
    AND a.good_counts >= :good_counts_1 
    AND a.good_counts <= :good_counts_2 
    AND a.reject_counts = :reject_counts 
    AND a.reject_counts >= :reject_counts_1 
    AND a.reject_counts <= :reject_counts_2 
    AND a.inspect_unit = :inspect_unit 
    AND a.inspect_unit >= :inspect_unit_1 
    AND a.inspect_unit <= :inspect_unit_2 
    AND TRIM (a.reject_reason) = TRIM (:reject_reason) 
    AND TRIM (a.return_reason) = TRIM (:return_reason) 
    AND a.period_chg_counts = :period_chg_counts 
    AND a.period_chg_counts >= :period_chg_counts_1 
    AND a.period_chg_counts <= :period_chg_counts_2 
    AND a.output_status = :output_status 
    AND a.short_no = :short_no 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND a.org_order_unit = :org_order_unit 
    AND a.org_order_unit >= :org_order_unit_1 
    AND a.org_order_unit <= :org_order_unit_2 
    AND CASE WHEN a.musho_hacchu_f IS NULL THEN '0' ELSE TO_CHAR (a.musho_hacchu_f) END IN (:musho_hacchu_f) 
    AND a.sup_memo = :sup_memo 
    AND TRIM (a.shiharai_hoho_kbn) IN (:shiharai_hoho_kbn) 
    AND CASE WHEN a.order_isshiki_unit_f IS NULL THEN '0' ELSE TO_CHAR (a.order_isshiki_unit_f) END IN (:order_isshiki_unit_f) 
    AND a.order_isshiki_counts = :order_isshiki_counts 
    AND a.order_isshiki_counts >= :order_isshiki_counts_1 
    AND a.order_isshiki_counts <= :order_isshiki_counts_2 
    AND a.order_isshiki_unit = :order_isshiki_unit 
    AND a.order_isshiki_unit >= :order_isshiki_unit_1 
    AND a.order_isshiki_unit <= :order_isshiki_unit_2 
    AND CASE WHEN a.inspect_isshiki_unit_f IS NULL THEN '0' ELSE TO_CHAR (a.inspect_isshiki_unit_f) END IN (:inspect_isshiki_unit_f) 
    AND a.inspect_isshiki_counts = :inspect_isshiki_counts 
    AND a.inspect_isshiki_counts >= :inspect_isshiki_counts_1 
    AND a.inspect_isshiki_counts <= :inspect_isshiki_counts_2 
    AND a.inspect_isshiki_unit = :inspect_isshiki_unit 
    AND a.inspect_isshiki_unit >= :inspect_isshiki_unit_1 
    AND a.inspect_isshiki_unit <= :inspect_isshiki_unit_2 
    AND a.org_base_order_unit = :org_base_order_unit 
    AND a.org_base_order_unit >= :org_base_order_unit_1 
    AND a.org_base_order_unit <= :org_base_order_unit_2 
    AND a.org_min_order_amount = :org_min_order_amount 
    AND a.org_min_order_amount >= :org_min_order_amount_1 
    AND a.org_min_order_amount <= :org_min_order_amount_2 
ORDER BY
    a.ORDER_NO
