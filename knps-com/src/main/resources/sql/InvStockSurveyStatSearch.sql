SELECT
      a.*
FROM
    INV_STOCK_SURVEY_STAT a 
WHERE
    1 = 1 
    AND TRIM (a.rec_no) = TRIM (:rec_no) 
    AND TRIM (a.yyyy) = TRIM (:yyyy) 
    AND TRIM (a.mm) = TRIM (:mm) 
    AND a.survey_stat = :survey_stat 
    AND a.develop_products_stat = :develop_products_stat 
    AND a.develop_parts_stat = :develop_parts_stat 
    AND a.time_stamp_create = :time_stamp_create 
    AND a.time_stamp_change = :time_stamp_change 
    AND TRIM (a.user_id_create) = TRIM (:user_id_create) 
    AND TRIM (a.user_id_change) = TRIM (:user_id_change) 
ORDER BY
    a.REC_NO
