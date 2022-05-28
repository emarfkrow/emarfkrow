SELECT
      a.*
FROM
    M_CHOKU a 
WHERE
    1 = 1 
    AND a.chokucd = :chokucd 
    AND a.chokumei1 = :chokumei1 
    AND a.chokumei2 = :chokumei2 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.CHOKUCD
