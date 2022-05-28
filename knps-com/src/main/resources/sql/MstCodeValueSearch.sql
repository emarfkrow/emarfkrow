SELECT
      a.*
    , (SELECT r1.CODE_MEI FROM MST_CODE r1 WHERE r1.CODE_NM = a.CODE_NM) AS CODE_MEI
FROM
    MST_CODE_VALUE a 
WHERE
    1 = 1 
    AND a.code_nm = :code_nm 
    AND a.code_value = :code_value 
    AND a.code_value_mei LIKE '%' || :code_value_mei || '%' 
    AND a.hyoji_jun = :hyoji_jun 
    AND a.criteria = :criteria 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND a.user_id_create = :user_id_create 
    AND a.user_id_change = :user_id_change 
ORDER BY
    a.CODE_NM, a.CODE_VALUE
