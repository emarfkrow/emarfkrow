SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."MAN_HINBAN") AS "MAN_ITEM"
    , (SELECT r2."WC_NAME" FROM MST_WC r2 WHERE r2."WC_CODE" = a."WC_CODE") AS "WC_NAME"
FROM
    MST_ROUTING_BK a 
WHERE
    1 = 1 
    AND TRIM (a."YY") = TRIM (:yy) 
    AND TRIM (a."MAN_HINBAN") = TRIM (:man_hinban) 
    AND a."ROUTING_GROUP" = :routing_group 
    AND a."ROUTING" = :routing 
    AND a."NECK_ROUTING" = :neck_routing 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND a."HUM_PRE_TIME" = :hum_pre_time 
    AND a."HUM_ACT_TIME" = :hum_act_time 
    AND a."MAC_PRE_TIME" = :mac_pre_time 
    AND a."MAC_ACT_TIME" = :mac_act_time 
    AND a."COMMENT1" = :comment1 
    AND a."COMMENT2" = :comment2 
    AND a."LOT_SIZE" = :lot_size 
    AND a."ACC_COUNTS" = :acc_counts 
    AND a."ACC_COUNTS" >= :acc_counts_1 
    AND a."ACC_COUNTS" <= :acc_counts_2 
    AND a."UNIT_WEIGHT" = :unit_weight 
    AND a."STORE_KBN" IN (:store_kbn) 
    AND TRIM (a."STORE_NO") = TRIM (:store_no) 
    AND a."INSPECT_LANE_KBN" IN (:inspect_lane_kbn) 
    AND a."INSPECT_KBN" IN (:inspect_kbn) 
    AND TRIM (a."SUBINV_CODE") IN (:subinv_code) 
    AND a."HUM_PRE_TIME_KBN" IN (:hum_pre_time_kbn) 
    AND a."HUM_ACT_TIME_KBN" IN (:hum_act_time_kbn) 
    AND a."MAC_PRE_TIME_KBN" IN (:mac_pre_time_kbn) 
    AND a."MAC_ACT_TIME_KBN" IN (:mac_act_time_kbn) 
    AND CASE WHEN a."SUPPLY_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a."SUPPLY_FLAG") END IN (:supply_flag) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."MUSHO_HACCHU_F" IS NULL THEN '0' ELSE TO_CHAR (a."MUSHO_HACCHU_F") END IN (:musho_hacchu_f) 
ORDER BY
    a."MAN_HINBAN", a."ROUTING_GROUP", a."ROUTING", a."YY"
