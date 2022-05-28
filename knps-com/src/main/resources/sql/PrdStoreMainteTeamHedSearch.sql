SELECT
      a.*
FROM
    PRD_STORE_MAINTE_TEAM_HED a 
WHERE
    1 = 1 
    AND a.mfg_team_code IN (:mfg_team_code) 
    AND a.mfg_team_name LIKE '%' || :mfg_team_name || '%' 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.MFG_TEAM_CODE
