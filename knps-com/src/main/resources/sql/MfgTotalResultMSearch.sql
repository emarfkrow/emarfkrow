SELECT
      a.*
    , (SELECT r1."WC_NAME" FROM MST_WC r1 WHERE r1."WC_CODE" = a."WC_CODE") AS "WC_NAME"
    , (SELECT r2."UNIT_NAME" FROM MST_UNIT r2 WHERE r2."UNIT_CODE" = a."UNIT_CODE") AS "UNIT_NAME"
FROM
    MFG_TOTAL_RESULT_M a 
WHERE
    1 = 1 
    AND TRIM (a."RESULT_DATE") = TRIM (:result_date) 
    AND a."RESULT_DATE" >= :result_date_1 
    AND a."RESULT_DATE" <= :result_date_2 
    AND a."PRO_GROUP_NO" = :pro_group_no 
    AND TRIM (a."HINBAN") = TRIM (:hinban) 
    AND TRIM (a."ROUTING") = TRIM (:routing) 
    AND TRIM (a."WC_CODE") IN (:wc_code) 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND a."HUM_PRE_TIME" = :hum_pre_time 
    AND a."HUM_ACT_TIME" = :hum_act_time 
    AND a."MAC_PRE_TIME" = :mac_pre_time 
    AND a."MAC_ACT_TIME" = :mac_act_time 
    AND a."GOOD_COUNTS" = :good_counts 
    AND a."GOOD_COUNTS" >= :good_counts_1 
    AND a."GOOD_COUNTS" <= :good_counts_2 
    AND a."REJECT_COUNTS" = :reject_counts 
    AND a."REJECT_COUNTS" >= :reject_counts_1 
    AND a."REJECT_COUNTS" <= :reject_counts_2 
    AND TRIM (a."UNIT_CODE") IN (:unit_code) 
    AND a."ACT_LT" = :act_lt 
    AND a."EXP_PRE_TIME" = :exp_pre_time 
    AND a."EXP_PRO_TIME" = :exp_pro_time 
    AND a."EXP_REST_TIME" = :exp_rest_time 
    AND a."EXP_CHOKO_TIME" = :exp_choko_time 
    AND a."EXP_TROUB_TIME" = :exp_troub_time 
    AND a."EXP_SELF_MOD_TIME" = :exp_self_mod_time 
    AND a."EXP_OTHR_MOD_TIME" = :exp_othr_mod_time 
    AND a."EXP_ETC_TIME" = :exp_etc_time 
    AND a."VOLUME_WEIGHT" = :volume_weight 
    AND a."UNIT_WEIGHT" = :unit_weight 
    AND a."END_MATERIAL_WEIGHT" = :end_material_weight 
    AND a."PRO_COUNTS" = :pro_counts 
    AND a."PRO_COUNTS" >= :pro_counts_1 
    AND a."PRO_COUNTS" <= :pro_counts_2 
    AND a."LAST_ROUTING" = :last_routing 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."HINBAN", a."PRO_GROUP_NO", a."ROUTING", a."WC_CODE", a."OPE_DETAIL", a."RESULT_DATE"
