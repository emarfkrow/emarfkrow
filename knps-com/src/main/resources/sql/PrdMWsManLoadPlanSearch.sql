SELECT
      a.*
    , (SELECT r1.WS_NAME FROM MST_WS r1 WHERE r1.WS_CODE = a."WS_CODE") AS WS_NAME
FROM
    PRD_M_WS_MAN_LOAD_PLAN a 
WHERE
    1 = 1 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND TRIM (a."MAN_HINBAN") = TRIM (:man_hinban) 
    AND TRIM (a."WS_CODE") IN (:ws_code) 
    AND a."PRO_NES_COUNTS" = :pro_nes_counts 
    AND a."PRO_NES_COUNTS" >= :pro_nes_counts_1 
    AND a."PRO_NES_COUNTS" <= :pro_nes_counts_2 
    AND a."HUM_PRE_TIME" = :hum_pre_time 
    AND a."HUM_ACT_TIME" = :hum_act_time 
    AND a."MAC_PRE_TIME_IN" = :mac_pre_time_in 
    AND a."MAC_ACT_TIME_IN" = :mac_act_time_in 
    AND a."MAC_PRE_TIME_OUT" = :mac_pre_time_out 
    AND a."MAC_ACT_TIME_OUT" = :mac_act_time_out 
    AND a."MAC_PRE_TIME_KANBAN" = :mac_pre_time_kanban 
    AND a."MAC_ACT_TIME_KANBAN" = :mac_act_time_kanban 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."YYYY", a."MM", a."MAN_HINBAN", a."WS_CODE"
