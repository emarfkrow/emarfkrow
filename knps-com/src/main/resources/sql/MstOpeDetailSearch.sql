SELECT
      a.*
FROM
    MST_OPE_DETAIL a 
WHERE
    1 = 1 
    AND TRIM (a.ope_detail) = TRIM (:ope_detail) 
    AND a.ope_detail_name LIKE '%' || :ope_detail_name || '%' 
    AND a.ope_detail_comment = :ope_detail_comment 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.OPE_DETAIL
