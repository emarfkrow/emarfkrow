SELECT
      a.*
FROM
    MST_STORE_MAN a 
WHERE
    1 = 1 
    AND a.store_man_id = :store_man_id 
    AND a.store_man_mei LIKE '%' || :store_man_mei || '%' 
    AND a.memo = :memo 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.STORE_MAN_ID
