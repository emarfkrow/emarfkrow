SELECT
      a.*
    , (SELECT r1."TEAM_NAME" FROM MST_TEAM r1 WHERE r1."TEAM_CODE" = a."MFG_TEAM_CODE") AS "MFG_TEAM_NAME"
    , (SELECT r2."WS_NAME" FROM MST_WS r2 WHERE r2."WS_CODE" = a."WS_CODE") AS "WS_NAME"
FROM
    PRD_STORE_MAINTE_TEAM_DET a 
WHERE
    1 = 1 
    AND TRIM (a."MFG_TEAM_CODE") IN (:mfg_team_code) 
    AND TRIM (a."WS_CODE") IN (:ws_code) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."MFG_TEAM_CODE", a."WS_CODE"
