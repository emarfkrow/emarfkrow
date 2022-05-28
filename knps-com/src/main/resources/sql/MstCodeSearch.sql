SELECT
      a.*
FROM
    MST_CODE a 
WHERE
    1 = 1 
    AND a.code_nm = :code_nm 
    AND a.code_mei LIKE '%' || :code_mei || '%' 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.CODE_NM
