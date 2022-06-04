SELECT
      a.*
    , (SELECT r1."LOCATION_NAME" FROM MST_LOCATION r1 WHERE r1."LOCATION_CODE" = a."LOCATION_CODE") AS "LOCATION_NAME"
FROM
    MST_RESERVE_LOC a 
WHERE
    1 = 1 
    AND a."HINBAN" = :hinban 
    AND a."OPE_DETAIL" = :ope_detail 
    AND a."RESERVE_LOC_SEQ" = :reserve_loc_seq 
    AND a."LOCATION_CODE" IN (:location_code) 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."HINBAN", a."OPE_DETAIL", a."RESERVE_LOC_SEQ"
