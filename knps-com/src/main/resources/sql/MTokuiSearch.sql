SELECT
      a.*
FROM
    M_TOKUI a 
WHERE
    1 = 1 
    AND a.tokucd = :tokucd 
    AND a.tokumei1 = :tokumei1 
    AND a.tokumei2 = :tokumei2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.TOKUCD
