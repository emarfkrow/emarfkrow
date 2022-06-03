SELECT
      a.*
FROM
    PRD_STORE_MAINTE_TEAM_HED a 
WHERE
    1 = 1 
    AND TRIM (a."MFG_TEAM_CODE") IN (:mfg_team_code) 
    AND a."MFG_TEAM_NAME" LIKE '%' || :mfg_team_name || '%' 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."MFG_TEAM_CODE"
