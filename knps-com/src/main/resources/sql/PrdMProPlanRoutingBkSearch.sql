SELECT
      a.*
    , (SELECT r1.WC_NAME FROM MST_WC r1 WHERE r1.WC_CODE = a."WC_CODE") AS WC_NAME
    , (SELECT r2.SUP_NAME FROM MST_SUPPLIER r2 WHERE r2.SUP_CODE = a."SUP_CODE") AS SUP_NAME
FROM
    PRD_M_PRO_PLAN_ROUTING_BK a 
WHERE
    1 = 1 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND TRIM (a."PRO_HINBAN") = TRIM (:pro_hinban) 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND a."ROUTING_GROUP" = :routing_group 
    AND a."ROUTING" = :routing 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND TRIM (a."WSCODE") = TRIM (:wscode) 
    AND a."IN_OUT_KBN" IN (:in_out_kbn) 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND a."NES_COUNTS" = :nes_counts 
    AND a."NES_COUNTS" >= :nes_counts_1 
    AND a."NES_COUNTS" <= :nes_counts_2 
    AND a."MAC_LOAD_KBN" IN (:mac_load_kbn) 
    AND a."HUM_PRE_TIME" = :hum_pre_time 
    AND a."HUM_ACT_TIME" = :hum_act_time 
    AND a."MAC_PRE_TIME" = :mac_pre_time 
    AND a."MAC_ACT_TIME" = :mac_act_time 
    AND a."COMMENT1" = :comment1 
    AND a."COMMENT2" = :comment2 
    AND a."UNIT_WEIGHT" = :unit_weight 
    AND a."ORDER_UNIT_PRICE" = :order_unit_price 
    AND a."PROC_LT" = :proc_lt 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    1
    , 2
    , 3
    , 4
    , 5
    , 6
    , 7
    , 8
    , 9
    , 10
    , 11
    , 12
    , 13
    , 14
    , 15
    , 16
    , 17
    , 18
    , 19
    , 20
    , 21
    , 22
    , 23
    , 24
    , 25
    , 26
