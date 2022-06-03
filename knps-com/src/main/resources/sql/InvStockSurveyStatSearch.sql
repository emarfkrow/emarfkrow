SELECT
      a.*
FROM
    INV_STOCK_SURVEY_STAT a 
WHERE
    1 = 1 
    AND TRIM (a."REC_NO") = TRIM (:rec_no) 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND a."SURVEY_STAT" = :survey_stat 
    AND a."DEVELOP_PRODUCTS_STAT" = :develop_products_stat 
    AND a."DEVELOP_PARTS_STAT" = :develop_parts_stat 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."REC_NO"
