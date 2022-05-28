SELECT
      a.*
    , (SELECT r1.TEAM_NAME FROM MST_TEAM r1 WHERE r1.TEAM_CODE = a.TEAM_CODE) AS TEAM_NAME
    , (SELECT r2.SUP_NAME FROM MST_SUPPLIER r2 WHERE r2.SUP_CODE = a.SUP_CODE) AS SUP_NAME
FROM
    MST_WS a 
WHERE
    1 = 1 
    AND a.ws_code IN (:ws_code) 
    AND a.ws_name LIKE '%' || :ws_name || '%' 
    AND a.in_out_kbn IN (:in_out_kbn) 
    AND a.hum_norm_ability = :hum_norm_ability 
    AND a.hum_max_ability = :hum_max_ability 
    AND a.norm_member = :norm_member 
    AND a.admin_code IN (:admin_code) 
    AND a.team_code IN (:team_code) 
    AND a.sup_code IN (:sup_code) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
    AND CASE WHEN a.delete_flag IS NULL THEN '0' ELSE TO_CHAR (a.delete_flag) END IN (:delete_flag) 
ORDER BY
    a.WS_CODE
