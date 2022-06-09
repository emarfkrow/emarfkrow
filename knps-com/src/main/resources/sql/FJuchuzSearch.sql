SELECT
      a.*
    , (SELECT r1."ITEM" FROM MST_HINBAN r1 WHERE r1."HINBAN" = a."HHINBAN") AS "HITEM"
FROM
    F_JUCHUZ a 
WHERE
    1 = 1 
    AND a."TOKUCD" = :tokucd 
    AND a."CHOKUCD" = :chokucd 
    AND a."HHINBAN" = :hhinban 
    AND a."CHUBAN" = :chuban 
    AND a."JUCHUSU" = :juchusu 
    AND a."JUCHUNO" = :juchuno 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."TOKUCD", a."HHINBAN", a."JUCHUNO"
