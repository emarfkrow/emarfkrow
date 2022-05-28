SELECT
      a.*
    , (SELECT r1.MFG_TEAM_NAME FROM PRD_STORE_MAINTE_TEAM_HED r1 WHERE r1.MFG_TEAM_CODE = a.MFG_TEAM_CODE) AS MFG_TEAM_NAME
    , (SELECT r2.WS_NAME FROM MST_WS r2 WHERE r2.WS_CODE = a.WS_CODE) AS WS_NAME
FROM
    PRD_STORE_MAINTE_TEAM_DET a 
WHERE
    1 = 1 
    AND a.mfg_team_code IN (:mfg_team_code) 
    AND a.ws_code IN (:ws_code) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.MFG_TEAM_CODE, a.WS_CODE
