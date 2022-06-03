SELECT
      a.*
FROM
    MST_OPE_DETAIL a 
WHERE
    1 = 1 
    AND TRIM (a."OPE_DETAIL") = TRIM (:ope_detail) 
    AND a."OPE_DETAIL_NAME" LIKE '%' || :ope_detail_name || '%' 
    AND a."OPE_DETAIL_COMMENT" = :ope_detail_comment 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."OPE_DETAIL"
