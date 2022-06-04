SELECT
      a.*
    , (SELECT r1."CODE_MEI" FROM MST_CODE r1 WHERE r1."CODE_NM" = a."CODE_NM") AS "CODE_MEI"
FROM
    MST_CODE_VALUE a 
WHERE
    1 = 1 
    AND a."CODE_NM" = :code_nm 
    AND a."CODE_VALUE" = :code_value 
    AND a."CODE_VALUE_MEI" LIKE '%' || :code_value_mei || '%' 
    AND a."HYOJI_JUN" = :hyoji_jun 
    AND a."CRITERIA" = :criteria 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."CODE_NM", a."CODE_VALUE"
