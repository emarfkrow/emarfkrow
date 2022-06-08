SELECT
      a.*
    , (SELECT r1."HITEM" FROM M_HHINMOK r1 WHERE r1."HHINBAN" = a."HHINBAN") AS "HITEM"
FROM
    F_CHUMONX a 
WHERE
    1 = 1 
    AND a."TOKUCD" = :tokucd 
    AND a."HHINBAN" = :hhinban 
    AND a."SHUKKASU-RUI" = :shukkasu_rui 
    AND a."JUCHUNO" = :juchuno 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."TOKUCD", a."HHINBAN", a."JUCHUNO"
