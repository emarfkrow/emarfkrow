SELECT
      a.*
    , (SELECT r1.TEAM_NAME FROM MST_TEAM r1 WHERE r1.TEAM_CODE = a."TEAM_CODE") AS TEAM_NAME
    , (SELECT r2.SUP_NAME FROM MST_SUPPLIER r2 WHERE r2.SUP_CODE = a."SUP_CODE") AS SUP_NAME
FROM
    MST_WS a 
WHERE
    1 = 1 
    AND TRIM (a."WS_CODE") IN (:ws_code) 
    AND a."WS_NAME" LIKE '%' || :ws_name || '%' 
    AND a."IN_OUT_KBN" IN (:in_out_kbn) 
    AND a."HUM_NORM_ABILITY" = :hum_norm_ability 
    AND a."HUM_MAX_ABILITY" = :hum_max_ability 
    AND a."NORM_MEMBER" = :norm_member 
    AND TRIM (a."ADMIN_CODE") IN (:admin_code) 
    AND TRIM (a."TEAM_CODE") IN (:team_code) 
    AND TRIM (a."SUP_CODE") IN (:sup_code) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
    AND CASE WHEN a."DELETE_FLAG" IS NULL THEN '0' ELSE TO_CHAR (a.DELETE_FLAG) END IN (:delete_flag) 
ORDER BY
    a."WS_CODE"
