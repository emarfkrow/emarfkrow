SELECT
      a.*
FROM
    PRD_RACK_MAINTE a 
WHERE
    1 = 1 
    AND TRIM (a."YYYY") = TRIM (:yyyy) 
    AND TRIM (a."MM") = TRIM (:mm) 
    AND a."RACK_NAME" LIKE '%' || :rack_name || '%' 
    AND a."RACK_NES_COUNTS" = :rack_nes_counts 
    AND a."RACK_NES_COUNTS" >= :rack_nes_counts_1 
    AND a."RACK_NES_COUNTS" <= :rack_nes_counts_2 
    AND a."TIME_STAMP_CREATE" = :time_stamp_create 
    AND a."TIME_STAMP_CHANGE" = :time_stamp_change 
    AND TRIM (a."USER_ID_CREATE") = TRIM (:user_id_create) 
    AND TRIM (a."USER_ID_CHANGE") = TRIM (:user_id_change) 
ORDER BY
    a."YYYY", a."MM", a."RACK_NAME"
