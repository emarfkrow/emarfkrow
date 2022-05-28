SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a.WC_CODE) AS WC_NAME
FROM
    PCH_PROD_UNIT_COST a 
WHERE
    1 = 1 
    AND TRIM (a.close_date) = TRIM (:close_date) 
    AND a.close_date >= :close_date_1 
    AND a.close_date <= :close_date_2 
    AND a.pro_group_no = :pro_group_no 
    AND TRIM (a.hinban) = TRIM (:hinban) 
    AND a.routing = :routing 
    AND TRIM (a.wc_code) IN (:wc_code) 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND a.proprietary_total_counts = :proprietary_total_counts 
    AND a.proprietary_total_counts >= :proprietary_total_counts_1 
    AND a.proprietary_total_counts <= :proprietary_total_counts_2 
    AND a.proprietary_total_cost = :proprietary_total_cost 
    AND a.last_prch_unit_cost = :last_prch_unit_cost 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.CLOSE_DATE, a.PRO_GROUP_NO, a.HINBAN, a.ROUTING
