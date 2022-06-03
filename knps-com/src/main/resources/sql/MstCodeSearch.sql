SELECT
      a.*
FROM
    MST_CODE a 
WHERE
    1 = 1 
    AND a."CODE_NM" = :code_nm 
    AND a."CODE_MEI" LIKE '%' || :code_mei || '%' 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."CODE_NM"
