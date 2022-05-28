SELECT
      a.*
    , (SELECT r1.LOCATION_NAME FROM MST_LOCATION r1 WHERE r1.LOCATION_CODE = a.LOCATION_CODE) AS LOCATION_NAME
FROM
    MST_RESERVE_LOC a 
WHERE
    1 = 1 
    AND a.hinban = :hinban 
    AND a.ope_detail = :ope_detail 
    AND a.reserve_loc_seq = :reserve_loc_seq 
    AND a.location_code IN (:location_code) 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.HINBAN, a.OPE_DETAIL, a.RESERVE_LOC_SEQ
