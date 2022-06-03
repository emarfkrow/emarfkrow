SELECT
      a.*
FROM
    MST_STORE_MAN a 
WHERE
    1 = 1 
    AND a."STORE_MAN_ID" = :store_man_id 
    AND a."STORE_MAN_MEI" LIKE '%' || :store_man_mei || '%' 
    AND a."MEMO" = :memo 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND a."USER_ID_CREATE" = :user_id_create 
    AND a."USER_ID_CHANGE" = :user_id_change 
ORDER BY
    a."STORE_MAN_ID"
